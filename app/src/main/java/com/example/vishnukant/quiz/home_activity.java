package com.example.vishnukant.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.example.vishnukant.quiz.R;

    public class home_activity extends AppCompatActivity  implements View.OnClickListener{

        //defining views
        private CardView Login;
        private CardView Register ;
        private CardView AboutUs;

        //firebase auth object


        //progress dialog
        private ProgressDialog progressDialog;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home_activity);

            //initializing views
            Login =(CardView)findViewById(R.id.login_card);
            Register=(CardView)findViewById(R.id.register_card);
            AboutUs=(CardView)findViewById(R.id.about_us_card);


            //attaching click listener
            Login.setOnClickListener(this);
            Register.setOnClickListener(this);
            AboutUs.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view == Login) {
                startActivity(new Intent(this,Login.class));
            }
            if (view == Register) {
                startActivity(new Intent(this, Registration_Activity.class));
            }
            if(view == AboutUs){
                Toast.makeText(this,"About Us",Toast.LENGTH_LONG).show();
            }

        }
    }