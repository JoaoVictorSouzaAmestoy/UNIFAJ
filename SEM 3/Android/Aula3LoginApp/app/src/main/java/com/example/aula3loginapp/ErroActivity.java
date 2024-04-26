package com.example.aula3loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ErroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro);

        Button voltarButton = findViewById(R.id.voltarButton);
        voltarButton.setOnClickListener(v -> {
            finish();
        });
    }
}
