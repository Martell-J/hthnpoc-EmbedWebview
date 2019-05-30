package com.example.proofofconcepthackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;



public class MainActivity extends AppCompatActivity {

    private static String BASE_URL = "www.google.ca";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView myWebView = new WebView(this);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(myWebView);
        myWebView.loadUrl(BASE_URL);



    }
}
