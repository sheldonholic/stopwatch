package com.example.content;

import androidx.appcompat.app.AppCompatActivity;


import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;

import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.Button;

import android.widget.Chronometer;
import android.widget.ImageView;

public class stopwatch extends AppCompatActivity {

    Button btnstart,btnstop;
    ImageView ivtick;
    Animation roundalone;
   Chronometer timer;
    long pauseOffset;

   boolean running;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        btnstart=findViewById(R.id.btnBegin);
        ivtick=findViewById(R.id.ivtick);
        timer=(Chronometer)findViewById(R.id.timer);
        btnstop=findViewById(R.id.btnstop);

        roundalone= AnimationUtils.loadAnimation(this,R.anim.roundalone);

    }

    public void startTimer(View v){
        if (!running){
            timer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            timer.start();
            running=true;
            ivtick.startAnimation(roundalone);

        }
    }
    public void pauseTimer(View v){
        if(running){
            timer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - timer.getBase();
            running=false;
            ivtick.clearAnimation();


        }
    }

    public void stopTimer(View v){
        timer.setBase(SystemClock.elapsedRealtime());
        pauseOffset=0;
        ivtick.clearAnimation();

    }


}
