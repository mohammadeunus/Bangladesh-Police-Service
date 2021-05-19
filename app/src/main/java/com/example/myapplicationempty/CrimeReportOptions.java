package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CrimeReportOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_report_options);
    }

    public void profile(View view) {

        TextView usernameField = findViewById(R.id.verifiedUser);
        Intent user_profiles = new Intent(CrimeReportOptions.this, user_profile.class);
        startActivity(user_profiles);

    }

    public void ButtonComplain(View view) {
        Intent ComplainPage = new Intent(CrimeReportOptions.this, Complain.class);
        startActivity(ComplainPage);
    }
}