package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


public class registration extends AppCompatActivity {
    public static final String TAG="registration";
    EditText mNidNumber,mUserName,mMobileNumber,mEmail,mPassword;
    FirebaseFirestore fStore;
    FirebaseAuth fAuth;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        progressBar = findViewById(R.id.progressBar);
        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(registration.this,MainActivity.class));
            finish();
        }

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
        String maEmail= mEmail.getText().toString();
        String maPassword=mPassword.getText().toString();
        String maMobileNumber=mMobileNumber.getText().toString();
        String maUserName=mUserName.getText().toString();

        if(nidNumberForViewById.length() != 7)
        {

        }
        else
        {
            mNidNumber.setError("incorrect, provide at least 7digit");
        }
        if(TextUtils.isEmpty(maEmail))
        {
            mEmail.setError("email required");
        }
        if(maMobileNumber.length() <11)
        {
            mMobileNumber.setError("invalid mobile number");
        }
        if(maPassword.length() <6)
        {
            mPassword.setError("password has to be at least 7char");
        }
        if(maUserName.length() <5)
        {
            mUserName.setError("invalid username");
        }
    }
}
