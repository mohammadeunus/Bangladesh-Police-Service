package com.example.myapplicationempty;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.content.ComponentName;
import android.net.Uri;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CrimeReportOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_report_options);

        Button ComplainButton =findViewById(R.id.button2);
        ComplainButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Complain.class));
            }
        });

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

    public void gallery(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        startActivity(intent);
    }

    public void Camera(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("android.media.action.IMAGE_CAPTURE"));
        startActivity(intent);
    }
    public void Maps(View view) {
        Uri uri = Uri.parse("geo://47.4925,19.0513");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void profile(View view) {
        Intent user_profiles = new Intent(CrimeReportOptions.this, user_profile.class);
        startActivity(user_profiles);
    }

}