package india.history;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class HistoryActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.mmain);
	// Set up click listeners for all the buttons
	View chronology_button = findViewById(R.id.chronology_button);
	chronology_button.setOnClickListener(this);
	chronology_button.getBackground().setAlpha(200);
	
	View alphabet_button = findViewById(R.id.alphabet_button);
	alphabet_button.setOnClickListener(this);
	alphabet_button.getBackground().setAlpha(200);
	
	View about_button = findViewById(R.id.about_button);
	about_button.setOnClickListener(this);
	about_button.getBackground().setAlpha(200);
	
	View exit_button = findViewById(R.id.exit_button);
	exit_button.setOnClickListener(this);
	exit_button.getBackground().setAlpha(200);
	
	}
	
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.about_button:
		     Intent i = new Intent(this, About.class);
		     startActivity(i);
		     break;
		case R.id.exit_button:
			 finish();
			 break;
		case R.id.chronology_button:
			 Intent i1 = new Intent(this, chronoList.class);
			 startActivity(i1);
			 break;
		case R.id.alphabet_button:
			 Intent i2= new Intent(this, alphaList.class);
			 startActivity(i2);
			 break;
		
		}
    }
}