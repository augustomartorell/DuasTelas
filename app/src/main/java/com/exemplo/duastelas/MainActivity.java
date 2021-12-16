package com.exemplo.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonActivity2;
    private Button buttonFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(" Activity 1", "on create");
        setContentView(R.layout.activity_main);
        buttonActivity2 = findViewById(R.id.buttonActivity2);
        buttonFechar = findViewById(R.id.buttonFechar);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(" Activity 1", "on destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(" Activity 1", "on pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(" Activity 1", "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(" Activity 1", "on resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(" Activity 1", "on stop");
    }

    public void onClickBotaoActivity2(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }
}