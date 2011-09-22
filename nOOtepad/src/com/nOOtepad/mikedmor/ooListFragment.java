package com.nOOtepad.mikedmor;

import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ooListFragment extends ListFragment{
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
	    String[] links = getResources().getStringArray(R.array.list_links);
	 
	    String content = links[position];
	    Intent showContent = new Intent(getActivity().getApplicationContext(),
	            ViewerActivity.class);
	    showContent.setData(Uri.parse(content));
	    startActivity(showContent);
	}
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setListAdapter(ArrayAdapter.createFromResource(getActivity()
	            .getApplicationContext(), R.array.list_titles,
	            R.layout.list_item));
	}
}
