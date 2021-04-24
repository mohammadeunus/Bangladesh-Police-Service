 package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ans2signIn(View view) {
        //read text from editText file
        TextView usernameField = findViewById(R.id.insertname);
        TextView passwordField = findViewById(R.id.TxtPassword);
        String usernameText =usernameField.getText().toString();
        String usernamePass =passwordField.getText().toString();



        //pass word checker
        //dummy
        String dummypass="test";
        String dummyName = "test";
        TextView errorLabel =findViewById(R.id.textView3);

        if(usernameText.equals(dummyName) && usernamePass.equals(dummypass))
        {

            errorLabel.setTextColor(Color.GREEN);
            errorLabel.setText("Successful");
        }
        else
        {
            errorLabel.setTextColor(Color.RED);
            errorLabel.setText("incorrect");
        }
    }

    public void clickReg(View view) {
        Intent registrationScreen =new Intent(MainActivity.this, registration.class);
        startActivity(registrationScreen);
    }
}
