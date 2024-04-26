package com.example.aula3loginapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BemVindoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        TextView welcomeMessage = findViewById(R.id.welcomeMessage);
        welcomeMessage.setText(getString(R.string.welcome_text, "aluno"));

        Button RetornarButton = findViewById(R.id.retornarButton);
        RetornarButton.setOnClickListener(v -> {
            finish();
        });
    }
}


