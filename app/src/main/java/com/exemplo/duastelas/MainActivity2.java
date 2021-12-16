package com.exemplo.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(" Activity 2", "on create");
        setContentView(R.layout.activity_main2);

        buttonVoltar = findViewById(R.id.buttonVoltar);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(" Activity 2", "on destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(" Activity 2", "on pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(" Activity 2", "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(" Activity 2", "on resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(" Activity 2", "on stop");
    }


        public void onClickBotaoVoltar(View v) {
        finish();
    }
}