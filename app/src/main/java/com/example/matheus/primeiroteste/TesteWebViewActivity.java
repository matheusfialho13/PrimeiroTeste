package com.example.matheus.primeiroteste;

import android.os.Bundle;
import android.webkit.WebView;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class TesteWebViewActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_testewebview);

        myWebView = (WebView) findViewById(R.id.WebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://www.devmobilebrasil.com.br");
        //myWebView.loadUrl("www.google.com");
    }
}
