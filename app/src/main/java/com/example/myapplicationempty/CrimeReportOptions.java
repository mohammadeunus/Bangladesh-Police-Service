package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CrimeReportOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_report_options);

        Button previousDataClick = findViewById(R.id.previousDataButton);
        previousDataClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent previousDataPage = new Intent(CrimeReportOptions.this, PreviousData.class);
                startActivity(previousDataPage);
            }
        });

        Button policeRatingsClick = findViewById(R.id.policeRatingsButton);
        policeRatingsClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent policeRatingPage = new Intent(CrimeReportOptions.this, PoliceRatings.class);
                startActivity(policeRatingPage);
            }
        });
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