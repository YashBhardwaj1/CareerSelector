package com.example.vishnukant.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aptitude extends AppCompatActivity {

    Button maptiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);

        maptiButton = (Button)findViewById(R.id.aptibutton);
        maptiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Aptitude.this, AptiQuiz.class));
            }
        });
    }
}