    package com.geek.reandroid1_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private NavController navController;
    private BottomNavigationView botNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNavigation();
    }

    private void initNavigation() {
        botNav = findViewById(R.id.botNav);

        AppBarConfiguration appBar = new AppBarConfiguration.Builder(
            R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment).build();

        navController = Navigation.findNavController(this, R.id.mainCont);
        NavigationUI.setupWithNavController(botNav, navController);
        NavigationUI.setupActionBarWithNavController(this, navController, appBar);

    }
}