package com.nOOtepad.mikedmor;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class nOOtepadActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	final String[] links = getResources().getStringArray(R.array.tut_links);
    	 
        setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.tut_titles, R.layout.list_files));
        
        getListView().setOnItemClickListener(new OnItemClickListener() {
        	 public void onItemClick(AdapterView<?> parent, View view,
        	            int position, long id) {
            	    String content = links[position];
            	    Intent showContent = new Intent(getApplicationContext(),
            	            ViewActivity.class);
            	    showContent.setData(Uri.parse(content));
            	    startActivity(showContent);
				
			}
        });
    }
}