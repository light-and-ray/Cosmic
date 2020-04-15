package com.example.cosmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//android:icon="@mipmap/ic_launcher"
//android:roundIcon="@mipmap/ic_launcher_round"
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (ImageButton) findViewById(R.id.play);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play:
                Intent intent = new Intent(this, SelectLevelActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}

