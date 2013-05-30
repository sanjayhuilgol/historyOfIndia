package india.history;

import india.history.DatabaseHelper;
import india.history.R;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class EventDetails extends Activity {

	protected TextView hday;
	protected TextView hmonth;
	protected TextView hyear;
	protected TextView hevent;
	protected TextView hdescription;
    protected int eventId;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventdetails);
        
        eventId = getIntent().getIntExtra("EVENT_ID", 0);
        SQLiteDatabase db = (new DatabaseHelper(this)).getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT ev._id, ev.day, ev.month, ev.year, ev.event, ev.description FROM history ev WHERE ev._id = ?", 
				new String[]{""+eventId});

        if (cursor.getCount() == 1)
        {
        	cursor.moveToFirst();
        
	        hday = (TextView) findViewById(R.id.day);
	        hday.setText(cursor.getString(cursor.getColumnIndex("day")));
	
	        hmonth = (TextView) findViewById(R.id.month);
	        hmonth.setText(cursor.getString(cursor.getColumnIndex("month")));

	        hyear = (TextView) findViewById(R.id.year);
	        hyear.setText(cursor.getString(cursor.getColumnIndex("year")));

	        hevent = (TextView) findViewById(R.id.event);
	        hevent.setText(cursor.getString(cursor.getColumnIndex("event")));

	        hdescription = (TextView) findViewById(R.id.description);
	        hdescription.setText(cursor.getString(cursor.getColumnIndex("description")));
	        
        }
 
    }
	
}
