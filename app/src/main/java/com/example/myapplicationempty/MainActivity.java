 package com.example.myapplicationempty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity";

    //password checker
    //dummy
    String dummyPass="test";
    String dummyName = "test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
        {
            setContentView(R.layout.activity_main_land);
        }
        else
        {
            setContentView(R.layout.activity_main);
        }
    }

    /*
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

            if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            {
                setContentView(R.layout.activity_main_land);
            }
            else
            {
                setContentView(R.layout.activity_main);
            }
    }*/

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "onSaveInstanceState called");
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

    public void ans2signIn(View view) {
        //read text from editText file
        TextView usernameField = findViewById(R.id.insertname);
        TextView passwordField = findViewById(R.id.TxtPassword);

        String usernameText =usernameField.getText().toString();
        String usernamePass =passwordField.getText().toString();



        TextView errorLabel =findViewById(R.id.textView3);
        if(usernameText.equals(dummyName) && usernamePass.equals(dummyPass))
        {
            errorLabel.setTextColor(Color.GREEN);
            errorLabel.setText("Successful");
            Intent CrimeReportOptionsScreen = new Intent(MainActivity.this, CrimeReportOptions.class);
            startActivity(CrimeReportOptionsScreen);
        }
        else
        {
            errorLabel.setTextColor(Color.RED);
            errorLabel.setText("incorrect");
        }
    }

    public void clickReg(View view) {
        Intent registrationScreen =new Intent(MainActivity.this, registration.class);
        startActivity(registrationScreen);
    }
}
