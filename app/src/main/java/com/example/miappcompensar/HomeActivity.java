package com.example.miappcompensar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnUsuario = findViewById(R.id.btnUsuario);
        Button btnAdministrador = findViewById(R.id.btnAdministrador);


        btnUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iniciarLoginActivity();
            }
        });


        btnAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iniciarLoginActivityAdmin();
            }
        });
    }


    private void iniciarLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    private void iniciarLoginActivityAdmin() {
        Intent intent = new Intent(this, LoginAdminActivity.class);
        startActivity(intent);
    }
}
