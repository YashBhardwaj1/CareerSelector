package com.example.vishnukant.quiz;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.vishnukant.quiz.R;

public class user_dashboard extends AppCompatActivity implements View.OnClickListener{

    private CardView GeneralQuiz;
    private CardView TextDetector ;
    private CardView Dailynews;
    private CardView Smilemeter;
    private CardView BarcodeScanner;

    //firebase auth object


    //progress dialog
    private ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        //initializing views
        GeneralQuiz =(CardView)findViewById(R.id.Generalquiz);
        TextDetector=(CardView)findViewById(R.id.Text_Detector);
        Dailynews=(CardView)findViewById(R.id.news);
        Smilemeter=(CardView)findViewById(R.id.smilemeter);
        BarcodeScanner=(CardView)findViewById(R.id.barcodescanner);


        //attaching click listener
        GeneralQuiz.setOnClickListener(this);
        TextDetector.setOnClickListener(this);
        Dailynews.setOnClickListener(this);
        Smilemeter.setOnClickListener(this);
        BarcodeScanner.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == GeneralQuiz) {
            startActivity(new Intent(this,MainActivity.class));
        }
        if (view == TextDetector) {
            //startActivity(new Intent(this, com.example.abhishek.TextDetector.class));
        }
        if(view == Dailynews){
            startActivity(new Intent(this,Enews.class));
        }
        if(view ==Smilemeter ){
            startActivity(new Intent(this,ChooserActivity.class));
        }
        if(view==BarcodeScanner){
            startActivity(new Intent(this,Barcode.class));
        }

    }
}
