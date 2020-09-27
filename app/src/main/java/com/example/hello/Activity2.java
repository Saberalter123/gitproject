package com.example.hello;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Log.d("mainac","oncreate");

        Button button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mainac","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mainac","onstart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mainac","onstop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mainac","onpause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mainac","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mainac","ondestory");
    }
}