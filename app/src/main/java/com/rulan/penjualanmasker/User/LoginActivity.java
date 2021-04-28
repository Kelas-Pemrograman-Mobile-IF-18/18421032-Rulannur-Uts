package com.rulan.penjualanmasker.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.rulan.penjualanmasker.Admin.HomeActivity;
import com.rulan.penjualanmasker.R;

public class LoginActivity extends AppCompatActivity {
        Button btnRegistrasi;
        NoboButton btnLogin;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            getSupportActionBar().hide();

            btnRegistrasi = (Button) findViewById(R.id.btnregistrasi);
            btnLogin = (NoboButton) findViewById(R.id.btnlogin);

            btnRegistrasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(LoginActivity.this, registrasi.class);
                    startActivity(i);
                    finish();
                }
            });
           btnLogin.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                   startActivity(i);
                   finish();
               }
           });
        }
    }