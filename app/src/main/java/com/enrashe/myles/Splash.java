package com.enrashe.myles;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView fan2 = (TextView) findViewById(R.id.tv_anim);
        Animation myanim2= AnimationUtils.loadAnimation(this, R.anim.splash_animation2);
        fan2.startAnimation(myanim2);

    }
}