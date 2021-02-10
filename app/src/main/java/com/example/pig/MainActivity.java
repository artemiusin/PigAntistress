package com.example.pig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AppCompatButton vizg,hruk ;
    TextView feedBack;
    private MediaPlayer vizgSound,hrukSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vizg = (AppCompatButton)findViewById(R.id.vizg);
        hruk = (AppCompatButton)findViewById(R.id.hruk);
        feedBack = findViewById(R.id.feedBack);


        vizgSound = MediaPlayer.create(this,R.raw.pig);
        hrukSound = MediaPlayer.create(this,R.raw.piggy);

        vizg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(vizgSound);
            }
        });

        hruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(hrukSound);
            }
        });

        feedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });

    }
        public void soundPlay(MediaPlayer sound){
            sound.start();
}
}