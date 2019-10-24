package com.juaracoding.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fromtambah extends AppCompatActivity {
    Button button;
    TextView Nama, Alamat, Telepon;
    String nama, alamat, telepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fromtambah);

        button = findViewById(R.id.button);
        Nama = findViewById(R.id.nama);
        Alamat = findViewById(R.id.alamat);
        Telepon = findViewById(R.id.telepon);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

                  Intent intent = new Intent(fromtambah.this, mainmenu.class);
                  startActivity(intent);
          }
      });

        Nama.setText(getIntent().getStringExtra("nama"));
        Alamat.setText(getIntent().getStringExtra("alamat"));
        Telepon.setText(getIntent().getStringExtra("telepon"));
    }
}
