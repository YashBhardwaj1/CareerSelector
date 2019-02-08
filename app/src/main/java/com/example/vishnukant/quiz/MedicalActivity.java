package com.example.vishnukant.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicalActivity extends AppCompatActivity {

    Button mmedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        mmedButton = (Button)findViewById(R.id.medbutton);
        mmedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MedicalActivity.this, MedicalQuiz.class));
            }
        });
    }
}