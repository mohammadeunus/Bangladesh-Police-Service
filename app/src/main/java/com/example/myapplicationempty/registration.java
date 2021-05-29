package com.example.myapplicationempty;

import androidx.annotation.NonNull;
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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registration extends AppCompatActivity {
    public static final String TAG="registration";
    private FirebaseAuth mAuth;
    TextView ReEmail,RePass;
    ProgressBar ReProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mAuth = FirebaseAuth.getInstance();
        ReEmail = findViewById(R.id.ActReEmail);
        RePass=findViewById(R.id.ActRePass);
        ReProgressbar=findViewById(R.id.ActReProgressBar);
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
        String StrRePass = RePass.getText().toString();
        String StrReEmail= ReEmail.getText().toString();

        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        if(StrRePass.length() <6)
        {
            RePass.setError("password has to be at least 7char");
        }
        if(!TextUtils.isEmpty(StrReEmail) && StrRePass.length() >5)
        {
            firebaseSignUP();
        }
    }
    private void firebaseSignUP()
    {
        String StrRePassCP = RePass.getText().toString();
        String StrReEmailCP= ReEmail.getText().toString();
        ReProgressbar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(StrReEmailCP,StrRePassCP)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        ReProgressbar.setVisibility(View.INVISIBLE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Registration successful.", Toast.LENGTH_SHORT).show();// NOT SHOWING
                            startActivity(new Intent(getApplicationContext(),CrimeReportOptions.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Registration failed.\n"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();// NOT SHOWING
                        }
                    }
                });

    }
}



