package com.wordpress.logitopia.freestlye;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//import android.widget.ArrayAdapter;
import android.widget.Button;
//import android.widget.ListAdapter;
//import android.widget.ListView;
import android.widget.Toast;


public class HomepageActivity extends ActionBarActivity {

	private  Button answerYesButton, answerNoButton;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);


		answerNoButton = (Button)findViewById(R.id.no_button);
		answerYesButton = (Button)findViewById(R.id.yes_button);





	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_homepage, menu);
		return true;


	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}


	public void yesButtonClick(View view) {

		String yourResponse = "That's Great";


//		Toast.makeText(this, yourResponse, Toast.LENGTH_SHORT).show();

	}

	public void noButtonClick(View view) {

		String yourNoResponse = "Well GoodBye Soldier";

//		Toast.makeText(this, yourNoResponse, Toast.LENGTH_SHORT).show();

		Intent noButtonIntent = new Intent(this, ExitScreenActivity.class);

		startActivity(noButtonIntent);


	}
}
