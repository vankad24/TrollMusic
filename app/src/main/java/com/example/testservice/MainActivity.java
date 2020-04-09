package com.example.testservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        if (!start){
            start=true;
            Intent i = new Intent(MainActivity.this,MyService.class);
            startService(i);
            ImageView imageView = findViewById(R.id.troll);
            imageView.setVisibility(View.VISIBLE);
        }
    }

}
