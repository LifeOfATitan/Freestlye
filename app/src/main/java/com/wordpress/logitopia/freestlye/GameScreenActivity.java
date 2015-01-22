package com.wordpress.logitopia.freestlye;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;


public class GameScreenActivity extends ActionBarActivity implements View.OnClickListener {

	Button zero, one, two, three, four, five, six, seven, eight, nine, cls, ent;

	int num1, num2;

	EditText answerDisplay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_screen);
	}


	public void hideSoftKeyboard(View view2){

		InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(view2.getWindowToken(), 0);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_game_screen, menu);
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

	public void number_7_button_click(View view) {

//		seven = (Button)findViewById(R.id.number_7_button_id);
//
//		seven.setOnClickListener(this);
//		answerDisplay.setText((CharSequence) seven);

//		view.findViewById(R.id.number_7_button_id);
//		seven.setOnClickListener(this.number_7_button_click());
	}

	@Override
	public void onClick(View v) {
		seven = (Button)findViewById(R.id.number_7_button_id);

		seven.setOnClickListener(this);
		answerDisplay.setText((CharSequence) seven);


	}
}
