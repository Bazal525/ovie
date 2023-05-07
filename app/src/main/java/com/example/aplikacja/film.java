package com.example.aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class film extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
    }

    public void back(View view) {
        // Zakończ bieżącą aktywność i wróć do poprzedniej aktywności
        finish();
    }
}