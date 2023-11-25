package com.example.miappcompensar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnIniciarSesion = findViewById(R.id.btnIniciarSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText etUsuario = findViewById(R.id.etUsuario);
                EditText etContrasena = findViewById(R.id.etContrasena);

                String usuario = etUsuario.getText().toString();
                String contrasena = etContrasena.getText().toString();

                if (TextUtils.isEmpty(usuario) || TextUtils.isEmpty(contrasena)) {
                    Toast.makeText(LoginActivity.this, "Por favor, ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }


    public void iniciarSesionGoogle(View view) {
     
    }
}
