package com.example.aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rejestracja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestracja);

        Button buttonNext2 = findViewById(R.id.registerbtn);
        buttonNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rejestracja.this, stronaglowna.class);
                startActivity(intent);
            }
        });

    }
}