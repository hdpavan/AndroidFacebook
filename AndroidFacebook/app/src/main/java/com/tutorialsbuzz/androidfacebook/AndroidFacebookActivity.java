package com.tutorialsbuzz.androidfacebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookSdk;

public class AndroidFacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
    }
}
