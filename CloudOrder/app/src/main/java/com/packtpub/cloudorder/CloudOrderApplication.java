package com.packtpub.cloudorder;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class CloudOrderApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(CloudOrder.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("YOUR_APP_ID")
                        .server("http://localhost:1337/parse/")
                        .build()
        );
    }
}