package com.example.siskanti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Next(View view) {
        Intent next2 = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(next2);
    }

    public void Prev(View view) {
        Intent prev2 = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(prev2);
    }
}