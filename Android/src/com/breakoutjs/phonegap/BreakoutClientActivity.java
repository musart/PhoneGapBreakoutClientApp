package com.breakoutjs.phonegap;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

import com.strumsoft.websocket.phonegap.WebSocketFactory;
//import com.freakdev.phonegap.WebSocketFactory;


public class BreakoutClientActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");

        //WebSocketFactory wsFactory = new WebSocketFactory(appView);
        //appView.addJavascriptInterface(wsFactory, "WebSocketFactory");
        appView.addJavascriptInterface(new WebSocketFactory(appView), "WebSocketFactory");
    }
}