package org.alljoyn.bus.samples.basicclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class SettingActivity extends Activity {

	EditText ed_key; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        

        final String key = extras.getString(MainActivity.key);
        ed_key = (EditText)findViewById(R.id.editText_key);
        ed_key.setText(key);        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		MainActivity.keyValue = ed_key.getText().toString();
		super.onBackPressed();
	}
	
	
}
