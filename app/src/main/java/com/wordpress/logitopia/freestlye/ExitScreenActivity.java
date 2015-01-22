package com.wordpress.logitopia.freestlye;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ExitScreenActivity extends ActionBarActivity {

	private Button exitYesButton, exitNoButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exit_screen);

//		exitNoButton = (Button)findViewById(R.id.exit_no_button_id);
//		exitYesButton = (Button)findViewById(R.id.exit_yes_button_id);



	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_exit_screen, menu);
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

	public void exit_yes_button_click(View view) {

		Intent exitYesButton = new Intent(this, ExitScreenActivity.class);

//		finishActivity(0);
		System.exit(0);



	}

	public void exit_no_button_click(View view) {

		Intent exitNoButton = new Intent (this, HomepageActivity.class);

		startActivity(exitNoButton);
	}
}
