package india.history;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class alphaList extends ListActivity
{
	
    
	protected EditText searchText;
	protected SQLiteDatabase db;
	protected Cursor cursor;
	protected ListAdapter adapter;
	
    /** Called when the activity is first created. */
	@Override
	@SuppressWarnings("deprecation")
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.datelist);
	db = (new DatabaseHelper(this)).getWritableDatabase();
	searchText = (EditText) findViewById (R.id.searchText);
    
	
	
	String[] st={"_id","year","event"};
	cursor=db.query("history", st, null, null, null, null, "event ASC");
	
adapter = new SimpleCursorAdapter(
	this, 
	R.layout.eventlist_alpha, 
	cursor, 
	new String[] {"event", "year"}, 
	new int[] {R.id.event, R.id.year});
setListAdapter(adapter);
	}
	@SuppressWarnings("deprecation")
	public void search(View view) {
    	// || is the concatenation operation in SQLite

		String[] st={"_id","year","event"};
		cursor=db.query("history", st, "event LIKE ?", 
				new String[]{"%" + searchText.getText().toString() + "%"}, null, null, "event ASC");
		
		
		if(cursor.getCount()!=0)
		{
			
			adapter = new SimpleCursorAdapter(
				this, 
				R.layout.eventlist_alpha, 
				cursor, 
				new String[] {"event", "year"}, 
				new int[] {R.id.event, R.id.year});
		setListAdapter(adapter);
		}
		else
			 Toast.makeText(getApplicationContext(), "\t\tNo results found\t\t", Toast.LENGTH_SHORT).show();
		}

	@SuppressWarnings("deprecation")
	 public void onListItemClick(ListView parent, View view, int position, long id) {
	    	Intent intent = new Intent(this, EventDetails.class);
	    	Cursor cursor = (Cursor) adapter.getItem(position);
	    	intent.putExtra("EVENT_ID", cursor.getInt(cursor.getColumnIndex("_id")));
	    	startActivity(intent);
	    }
}