package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class PoliceRatings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_ratings);

        RatingBar ratingBarSelect = findViewById(R.id.ratingBar);
        RatingBar changedRatingBar = findViewById(R.id.ratingBar1);
        RatingBar ratingBar3 = findViewById(R.id.ratingBar3);
        RatingBar ratingBar2 = findViewById(R.id.ratingBar2);
        RatingBar ratingBar4 = findViewById(R.id.ratingBar4);
        RatingBar ratingBar5 = findViewById(R.id.ratingBar5);
        RatingBar ratingBar6 = findViewById(R.id.ratingBar6);

        LinearLayout activeLayout = findViewById(R.id.linearLayout);
        LinearLayout changedLayout = findViewById(R.id.layout1);
        changedLayout.setVisibility(View.GONE);
        TextView submitButton = findViewById(R.id.ratingSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ratingBarStatus = String.valueOf(ratingBarSelect.getRating());
                Toast.makeText(getApplicationContext(), ratingBarStatus + " rating submitted", Toast.LENGTH_SHORT).show();
                changedRatingBar.setRating(ratingBarSelect.getRating());
                activeLayout.setVisibility(View.GONE);
                changedLayout.setVisibility(View.VISIBLE);
                changedRatingBar.setEnabled(false);
                ratingBar2.setEnabled(false);
                ratingBar3.setEnabled(false);
                ratingBar4.setEnabled(false);
                ratingBar5.setEnabled(false);
                ratingBar6.setEnabled(false);
            }
        });

        TextView backButton = findViewById(R.id.backButton2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoliceRatings.this, CrimeReportOptions.class));
            }
        });
    }
}