package com.nOOtepad.mikedmor;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class ViewFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {
	    Intent launchingIntent = getActivity().getIntent();
	    String content = launchingIntent.getData().toString();
	 
	    WebView viewer = (WebView) inflater.inflate(R.layout.view_item, container, false);
	    viewer.loadUrl(content);
	 
	    return viewer;
	}
}
