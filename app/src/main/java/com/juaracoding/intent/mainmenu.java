package com.juaracoding.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mainmenu extends AppCompatActivity {

    EditText nama, alamat, telepon;
    Button tambah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        telepon = findViewById(R.id.telepon);
        tambah = findViewById(R.id.button);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainmenu.this, fromtambah.class);
                intent.putExtra("nama", nama.getText().toString());
                intent.putExtra("alamat", alamat.getText().toString());
                intent.putExtra("telepon", telepon.getText().toString());
                startActivity(intent);
            }
        });
    }
}
