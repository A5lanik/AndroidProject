package com.example.dota2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Home extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  intent = new Intent(getApplicationContext(), MainActivity.class);
                  startActivity(intent);
              }
          }
        );

    }
        public void Change(View view){
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.button4:
                fragment = new fragmentone();

                break;
            case R.id.button3:
                fragment = new fragmenttwo();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.LinearLayout, fragment);
        ft.commit();


    }

}
