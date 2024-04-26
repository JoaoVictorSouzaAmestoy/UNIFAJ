package com.example.aula3loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText loginInput = findViewById(R.id.login);
        EditText passwordInput = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(v -> {
            String login = loginInput.getText().toString();
            String password = passwordInput.getText().toString();
            if ("aluno".equals(login) && "123456".equals(password)) {
                Intent intent = new Intent(MainActivity.this, BemVindoActivity.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(MainActivity.this, ErroActivity.class);
                startActivity(intent);
            }

        });
    }
}
