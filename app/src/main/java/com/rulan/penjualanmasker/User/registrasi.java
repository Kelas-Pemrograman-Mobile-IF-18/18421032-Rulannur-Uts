package com.rulan.penjualanmasker.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.rulan.penjualanmasker.R;

public class registrasi extends AppCompatActivity {
    Button btnlogin;
    NoboButton btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnRegistrasi = (NoboButton) findViewById(R.id.btnRegistrasi);
        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}