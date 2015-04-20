package com.juanathan.button;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ButtonMainActivity extends ActionBarActivity {

    boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_button_main, menu);
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

    public void buttonOnClick(View v) {
        // do something when the button is clicked
        Button button=(Button) v;
        CheckBox cBox = (CheckBox) findViewById(R.id.theCheckBox);
        //((Button) v).setText("clicked");
        if (clicked == false) {
            TextView t = (TextView) findViewById(R.id.theText);
            t.setText("You clicked the button.");
            button.setText("Exit");
            clicked = true;
            cBox.setEnabled(false);
            cBox.setVisibility(View.INVISIBLE);
        } else {
            finish();
        }
    }

    public void onCheckBoxClick(View v) {
        CheckBox cBox = (CheckBox) v;
        Button button = (Button) findViewById(R.id.theButton);
        if (cBox.isChecked()) {
            button.setClickable(true);
            button.setEnabled(true);
        } else {
            button.setClickable(false);
            button.setEnabled(false);
        }
    }
}
