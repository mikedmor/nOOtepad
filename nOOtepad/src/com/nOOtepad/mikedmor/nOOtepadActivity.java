package com.nOOtepad.mikedmor;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nOOtepadActivity extends Activity implements OnItemClickListener {
	
    //Creates a top menu for save buttons and other options
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return true;
    }
	
    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Creates a ListView object then populates it with a string
        ListView l = (ListView) findViewById(R.id.number_list);
        ArrayAdapter<String> numbers = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, 
                        new String [] {
                "one", "two", "three", "four", "five", "six"
        });
        l.setAdapter(numbers);
        l.setOnItemClickListener(this);
    }

    public void onGroupItemClick(MenuItem item) {
        // One of the group items (using the onClick attribute) was clicked
        // The item parameter passed here indicates which item it is
        // All other menu item clicks are handled by onOptionsItemSelected()
    }

    
    //Add a Fragment to our stack with n Androids in it
    private void stackAFragment(int nAndroids) {
        Fragment f = new FragView(nAndroids);
        
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.the_frag, f);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(null);
        ft.commit();
    }

        //Called when a number gets clicked
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                stackAFragment(position + 1);
        }
    
        
        //Adds an action to the app icon
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    //app icon in Action Bar clicked; go home
                    Intent intent = new Intent(this, nOOtepadActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
}