package com.nOOtepad.mikedmor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class nOOtepadActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.tut_titles, R.layout.list_files));
    }

	private void setListAdapter(ArrayAdapter<CharSequence> createFromResource) {
		// TODO Auto-generated method stub
		
	}
}