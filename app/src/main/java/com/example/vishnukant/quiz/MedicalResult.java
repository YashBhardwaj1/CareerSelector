package com.example.vishnukant.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MedicalResult extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_result);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + QuizBook.questions.length);

        if (score == 6){
            mGrade.setText("You are made for this carrer");
        }else if (score == 5){
            mGrade.setText("Slight improvement and you are ready for this field");
        }else if (score == 4) {
            mGrade.setText("There is a risk in this carrer still some hardwork can make it for you.");
        }else {
            mGrade.setText("No you are not made for this field");
        }
        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MedicalResult.this, AptiQuiz.class));
                MedicalResult.this.finish();
            }
        });
    }
}