package com.example.content;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvname;
    Button btnstart;
    Animation atg;
    ImageView ivpic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname=(TextView)findViewById(R.id.tvname);

        ivpic=(ImageView)findViewById(R.id.ivpic);
        btnstart=(Button)findViewById(R.id.btnstart);

        atg= AnimationUtils.loadAnimation(this,R.anim.atg);

        ivpic.startAnimation(atg);

        btnstart.startAnimation(atg);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,stopwatch.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);

            }
        });
    }}
