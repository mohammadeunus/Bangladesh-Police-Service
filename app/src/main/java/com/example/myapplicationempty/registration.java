package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class registration extends AppCompatActivity {
    public static final String TAG="registration";
    EditText mNidNumber,mUserName,mMobileNumber,mEmail,mPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    public void ans2reg(View view) {
        mUserName   = findViewById(R.id.editTextTextPersonName3);
        mNidNumber = findViewById(R.id.editTextNumber);
        mEmail      = findViewById(R.id.editTextTextEmailAddress);
        mPassword   = findViewById(R.id.editTextTextPassword);
        mMobileNumber = findViewById(R.id.editTextPhone);

        String nidNumberForViewById =mNidNumber.getText().toString();

        if(nidNumberForViewById.length() == 7)
        {
            Intent MainActivityScreen = new Intent(registration.this, MainActivity.class);
            startActivity(MainActivityScreen);
        }
        else
        {
            mNidNumber.setError("incorrect, provide at least 7digit");
        }
    }
}