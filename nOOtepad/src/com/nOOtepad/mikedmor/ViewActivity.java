package com.nOOtepad.mikedmor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class ViewActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
 
        Intent launchingIntent = getIntent();
        String content = launchingIntent.getData().toString();
 
        WebView viewer = (WebView) findViewById(R.id.webview);
        viewer.loadUrl(content);
    }
}
