package com.juaracoding.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    Button button;
    EditText nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        button = findViewById(R.id.button);
        nama = findViewById(R.id.username);
        password = findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().equalsIgnoreCase("dwisamsari")&& password.getText().toString().equalsIgnoreCase("dwisamsari16")){
                    Intent intent = new Intent(login.this, fromtambah.class);
                    startActivity(intent);
                }
            }
        });

    }
}
