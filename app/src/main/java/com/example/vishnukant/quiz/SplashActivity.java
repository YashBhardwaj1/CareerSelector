package com.example.vishnukant.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.vishnukant.quiz.R;

public class SplashActivity extends AppCompatActivity {

        private ImageView iv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            iv=(ImageView)findViewById(R.id.iv);
            //Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
            //iv.startAnimation(myanim);
            Thread timer = new Thread(){
                public void run(){
                    try{
                        sleep(5000)  ;
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    finally {
                        startActivity(new Intent(getApplicationContext(),home_activity.class));
                        finish();
                    }
                }
            };
            timer.start();
        }
    }

