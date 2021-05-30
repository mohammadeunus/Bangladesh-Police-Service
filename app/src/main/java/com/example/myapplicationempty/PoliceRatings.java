package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class PoliceRatings extends AppCompatActivity {

    public static float officer_rating = 0;

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
        CheckBox checkBox = findViewById(R.id.checkBox);


        changedRatingBar.setEnabled(false);
        ratingBar2.setEnabled(false);
        ratingBar3.setEnabled(false);
        ratingBar4.setEnabled(false);
        ratingBar5.setEnabled(false);
        ratingBar6.setEnabled(false);

        LinearLayout activeLayout = findViewById(R.id.linearLayout);
        LinearLayout changedLayout = findViewById(R.id.layout1);
        TextView submitButton = findViewById(R.id.ratingSubmit);


        if(officer_rating == 0) {
            changedLayout.setVisibility(View.GONE);
            checkBox.setVisibility(View.GONE);
        } else {
            activeLayout.setVisibility(View.GONE);
            checkBox.setVisibility(View.VISIBLE);
            changedLayout.setVisibility(View.VISIBLE);
            changedRatingBar.setRating(officer_rating);
        }

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    ratingBar2.setVisibility(View.GONE);
                    ratingBar3.setVisibility(View.GONE);
                    ratingBar4.setVisibility(View.GONE);
                    ratingBar5.setVisibility(View.GONE);
                    ratingBar6.setVisibility(View.GONE);
                } else {
                    ratingBar2.setVisibility(View.VISIBLE);
                    ratingBar3.setVisibility(View.VISIBLE);
                    ratingBar4.setVisibility(View.VISIBLE);
                    ratingBar5.setVisibility(View.VISIBLE);
                    ratingBar6.setVisibility(View.VISIBLE);
                }
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ratingBarStatus = String.valueOf(ratingBarSelect.getRating());
                Toast.makeText(getApplicationContext(), ratingBarStatus + " rating submitted", Toast.LENGTH_SHORT).show();
                officer_rating = Float.parseFloat(ratingBarStatus);
                checkBox.setVisibility(View.VISIBLE);
                changedRatingBar.setRating(ratingBarSelect.getRating());
                activeLayout.setVisibility(View.GONE);
                changedLayout.setVisibility(View.VISIBLE);
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