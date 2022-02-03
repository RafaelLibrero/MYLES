package com.enrashe.myles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    private Button bregister, bsignin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        bregister = findViewById(R.id.bregister);
        bsignin2 = findViewById(R.id.bsignin2);

        bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, Eventos.class);
                startActivity(intent);
            }
        });

        bsignin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);
            }
        });
    }
}