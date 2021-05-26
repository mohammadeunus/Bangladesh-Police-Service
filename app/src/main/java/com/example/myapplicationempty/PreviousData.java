package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PreviousData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_data);

        String Dummytitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod.";
        String DummyText = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa " +
                "quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit.";

        TextView[] title = { findViewById(R.id.dummyTitle1), findViewById(R.id.dummyTitle2), findViewById(R.id.dummyTitle3), findViewById(R.id.dummyTitle4) };
        TextView[] description = { findViewById(R.id.description1), findViewById(R.id.description2), findViewById(R.id.description3), findViewById(R.id.description4) };

        for(int i = 0; i < title.length; i++) {
            title[i].setText(Dummytitle);
            description[i].setText(DummyText);
        }

        TextView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crimeReportOptionsPage = new Intent(PreviousData.this, CrimeReportOptions.class);
                startActivity(crimeReportOptionsPage);
            }
        });
    }
}