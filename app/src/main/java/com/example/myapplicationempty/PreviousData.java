package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SearchEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PreviousData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_data);

        String Dummytitle = "Title";
        String DummyText = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa " +
                "quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit.";

        TextView[] title = { findViewById(R.id.dummyTitle1), findViewById(R.id.dummyTitle2), findViewById(R.id.dummyTitle3), findViewById(R.id.dummyTitle4) };
        TextView[] description = { findViewById(R.id.description1), findViewById(R.id.description2), findViewById(R.id.description3), findViewById(R.id.description4) };
        EditText searchText = findViewById(R.id.searchText);
        Button searchButton = findViewById(R.id.button7);

        for(int i = 0; i < title.length; i++) {
            title[i].setText(Dummytitle + i);
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

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searched_text = searchText.getText().toString().trim();
                if(searched_text.equals("")) {
                    for(int i = 0; i < title.length; i++) {
                        title[i].setVisibility(View.VISIBLE);
                        description[i].setVisibility(View.VISIBLE);
                        title[i].setText(Dummytitle + i);
                        description[i].setText(DummyText);
                    }
                } else {
                    for(int i = 0; i < title.length; i++) {
                        title[i].setVisibility(View.GONE);
                        description[i].setVisibility(View.GONE);
                        if(searched_text.toLowerCase().trim().equals((Dummytitle + i).toLowerCase())) {
                            title[i].setVisibility(View.VISIBLE);
                            description[i].setVisibility(View.VISIBLE);
                            title[i].setText(searched_text);
                            description[i].setText(DummyText);
                        }
                    }
                }
            }
        });
    }
}