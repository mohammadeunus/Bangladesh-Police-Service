package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void ans2reg(View view) {
        EditText editTextNumberForViewById = findViewById(R.id.editTextNumber);
        String nidNumberForViewById =editTextNumberForViewById.getText().toString();
        TextView textviewError2 =findViewById(R.id.textviewError2);
        if(nidNumberForViewById.length() == 17)
        {
            textviewError2.setTextColor(Color.GREEN);
            textviewError2.setText("Registration Successful");
            Intent MainActivityScreen = new Intent(registration.this, MainActivity.class);
            startActivity(MainActivityScreen);
        }
        else
        {
            textviewError2.setTextColor(Color.RED);
            textviewError2.setText("incorrect");
        }
    }
}