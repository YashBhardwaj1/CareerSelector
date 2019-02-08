package com.example.vishnukant.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComActivity extends AppCompatActivity {

    Button mcomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);

        mcomButton = (Button)findViewById(R.id.combutton);
        mcomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ComActivity.this, ComQuiz.class));
            }
        });
    }
}