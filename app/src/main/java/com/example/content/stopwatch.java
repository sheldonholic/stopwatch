package com.example.content;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        btnstart=(Button)findViewById(R.id.btnBegin);
        ivtick=(ImageView)findViewById(R.id.ivtick);
        timer=(Chronometer)findViewById(R.id.timerhere);



        roundalone= AnimationUtils.loadAnimation(this,R.anim.roundalone);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivtick.startAnimation(roundalone);

                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();

            }
        });

    }

}
