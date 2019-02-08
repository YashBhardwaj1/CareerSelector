package com.example.vishnukant.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mGrade = (TextView) findViewById(R.id.grade);
        mFinalScore = (TextView) findViewById(R.id.outOf);
        mRetryButton = (Button) findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mGrade.setText("The most important quality is not the skill but the personality you posses");

        if (score == 7) {
            mFinalScore.setText("No body is perfect..but you definately are the closest.You have a perfect view of society and the people.");
        } else if (score == 6) {
            mFinalScore.setText("No body is perfect..but you definately are the closest.You have a perfect view of society and the people.");
        } else if (score == 5) {
            mFinalScore.setText("You have a good look on the society work slightly on your personality for a better future..Look for answers below");
        } else if (score == 4) {
            mFinalScore.setText("You know how things work but don't know how to make them work... Do work on your personality for a better future look answers below");
        } else if (score == 3){
            mFinalScore.setText("In a world where you need to give 100%..you answered just 50% of them right view answers for correct guidance.");
        } else {
            mFinalScore.setText("Sorry you need to work alot on your personality..do revisit the questions as most you answered were incorrect");
        }


        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, ComQuiz.class));
                ResultActivity.this.finish();
            }
        });

    }
}