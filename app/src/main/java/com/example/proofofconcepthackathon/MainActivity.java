package com.example.proofofconcepthackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;



public class MainActivity extends AppCompatActivity {

    private static String BASE_URL = "https://my-day-planner.herokuapp.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView myWebView = new WebView(this);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        myWebView.setInitialScale(1);
        webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDisplayZoomControls(false);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(false);
        setContentView(myWebView);
        myWebView.loadUrl(BASE_URL);



    }
}
