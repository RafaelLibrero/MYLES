package com.enrashe.myles;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp(true);

        TextView fan2 = findViewById(R.id.tv_anim);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.splash_animation2);
        fan2.startAnimation(myanim2);

    }

    private void openApp(boolean locationPermission) {
        //Handler: hace que se retrase una accion
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class);
                startActivity(intent);
            }
        }, 3100);
    }
}