package com.example.miappcompensar;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        Button btnIniciarSesionAdmin = findViewById(R.id.btnIniciarSesionAdmin);

        btnIniciarSesionAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText etUsuarioAdmin = findViewById(R.id.etUsuarioAdmin);
                EditText etContrasenaAdmin = findViewById(R.id.etContrasenaAdmin);


                String usuarioAdmin = etUsuarioAdmin.getText().toString();
                String contrasenaAdmin = etContrasenaAdmin.getText().toString();


                if (TextUtils.isEmpty(usuarioAdmin) || TextUtils.isEmpty(contrasenaAdmin)) {
                    Toast.makeText(LoginAdminActivity.this, "Por favor, ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(LoginAdminActivity.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
    public void iniciarSesionGoogle (View view){
    }
}