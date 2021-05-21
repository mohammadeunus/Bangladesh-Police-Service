package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class registration<mobileNumber> extends AppCompatActivity {
    public static final String TAG = "registration";
    FirebaseAuth fAuth;
    ProgressBar progressBar;
    EditText fNidNumber = findViewById(R.id.NidNumber);
    EditText fEditTextTextPersonName3 = findViewById(R.id.NidNumber);
    EditText fEditTextPhone = findViewById(R.id.NidNumber);
    EditText fEditTextTextEmailAddress = findViewById(R.id.NidNumber);
    EditText fEditTextTextPassword = findViewById(R.id.NidNumber);
    String MobileNumber = fEditTextPhone.getText().toString();
    String password = fEditTextTextPassword.getText().toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar2);

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
        EditText editTextNumberForViewById = findViewById(R.id.editTextNumber);
        String nidNumberForViewById = editTextNumberForViewById.getText().toString();
        TextView textviewError2 = findViewById(R.id.textviewError2);
        if (nidNumberForViewById.length() == 17) {
            textviewError2.setTextColor(Color.GREEN);
            textviewError2.setText("Registration Successful");
            Intent MainActivityScreen = new Intent(registration.this, MainActivity.class);
            startActivity(MainActivityScreen);
        } else {
            textviewError2.setTextColor(Color.RED);
            textviewError2.setText("Incorrect");
        }
    }

/*
     if(MobileNumber.length() <=6)

    {
        fEditTextPhone.setError("mobile number Required.");

    }
     if(password.length() <=6)

    {
        fEditTextTextPassword.setError("Password Must be >= 6 Characters");

    }*/

}