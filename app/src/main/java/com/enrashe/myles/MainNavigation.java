package com.enrashe.myles;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.enrashe.myles.databinding.ActivityMainNavigationBinding;
import com.enrashe.myles.ui.main.SectionsPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainNavigation extends AppCompatActivity {

    private ActivityMainNavigationBinding binding;
    private MenuItem prevMenuItem;

    private TextView bienvenidos, textoDescriptivo;
    private Bundle nUser;

    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);

        binding = ActivityMainNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);

        BottomNavigationView mybottomNavView = findViewById(R.id.bottom_navigation);

        nUser = getIntent().getExtras();
        username = nUser.getString("usernamelog");
        textoDescriptivo = findViewById(R.id.guiapp);
        bienvenidos = findViewById(R.id.bienvenida);

        bienvenidos.setText("Bienvenido/a " + username + " a Myles");

        textoDescriptivo.setText("Descubre nuestra forma sana de ocio y tiempo libre para realizar nuestras actividades");

        bienvenidos = findViewById(R.id.bienvenida);
        Animation mylesAnimation = AnimationUtils.loadAnimation(this, R.anim.parpadeoinfinito);
        bienvenidos.startAnimation(mylesAnimation);

        mybottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.add:
                        Intent intent = new Intent(MainNavigation.this, Publicaciones.class);
                        startActivity(intent);
                        viewPager.setCurrentItem(0);
                        break;

                    case R.id.eventos:
                        item.setChecked(true);
                        Intent intent1 = new Intent(MainNavigation.this, Eventos.class);
                        startActivity(intent1);
                        viewPager.setCurrentItem(1);
                        break;

                    case R.id.browse:
                        item.setChecked(true);
                        Intent intent2 = new Intent(MainNavigation.this, MapsActivity.class);
                        startActivity(intent2);
                        viewPager.setCurrentItem(2);
                        break;

                    case R.id.personal:
                        item.setChecked(true);
                        Intent intent3 = new Intent(MainNavigation.this, Chat.class);
                        startActivity(intent3);
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null)
                    prevMenuItem.setChecked(false);

                else
                    mybottomNavView.getMenu().getItem(0).setChecked(false);

                mybottomNavView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = mybottomNavView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}