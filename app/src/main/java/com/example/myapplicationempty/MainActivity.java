 package com.example.myapplicationempty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

 public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity";
     private FirebaseAuth mAuth;
    ProgressBar progressBar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        progressBar2 = findViewById(R.id.progressBar2);

    }


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
        TextView usernameField0 = findViewById(R.id.insertname);
        TextView passwordField0 = findViewById(R.id.TxtPassword);


        String usernameText =usernameField0.getText().toString();
        String usernamePass =passwordField0.getText().toString();

        if(usernamePass.length() <6)
        {
            passwordField0.setError("password has to be at least 7char");
        }
        if(!TextUtils.isEmpty(usernameText) && usernamePass.length() >5)
        {
            firebaseSignIN();
        }

    }
    private void firebaseSignIN()
    {
        TextView usernameField = findViewById(R.id.insertname);
        TextView passwordField = findViewById(R.id.TxtPassword);

        String usernameText =usernameField.getText().toString();
        String usernamePass =passwordField.getText().toString();

        progressBar2.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(usernameText,usernamePass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task)
            {
                progressBar2.setVisibility(View.INVISIBLE);
                if(task.isSuccessful())
                {
                    startActivity(new Intent(getApplicationContext(),CrimeReportOptions.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "login failed.\n"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void clickReg(View view) {
        Intent registrationScreen =new Intent(getApplicationContext(), registration.class);
        startActivity(registrationScreen);
    }
}
