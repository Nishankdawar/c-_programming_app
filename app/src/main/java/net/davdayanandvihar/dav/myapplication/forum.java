package net.davdayanandvihar.dav.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class forum  extends AppCompatActivity

{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        WebView mYWeb;
         mYWeb = (WebView) findViewById(R.id.webView2);
        mYWeb.getSettings().setJavaScriptEnabled(true);

        mYWeb.setWebViewClient(new WebViewClient());
        mYWeb.clearHistory();
        mYWeb.clearCache(true);
        mYWeb.loadUrl("http://www.edutechforums.com");



    }


}

