package com.example.siskanti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Prev(View view) {
        Intent prev1 = new Intent(MainActivity.this, MainActivity3.class );
        startActivity(prev1);
    }

    public void Next(View view) {
        Intent next1 = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(next1);
    }
}