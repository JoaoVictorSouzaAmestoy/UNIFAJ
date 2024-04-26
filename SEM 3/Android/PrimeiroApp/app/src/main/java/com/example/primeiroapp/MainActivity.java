package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v) {
        EditText nomeET = findViewById(R.id.EditTextNome);
        EditText RAET = findViewById(R.id.EditTextRA);

        String nome = nomeET.getText().toString();
        String RA = RAET.getText().toString();

        Toast.makeText(this, nome + " " + RA, Toast.LENGTH_SHORT).show();

    }

}



