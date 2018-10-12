package com.example.test.bangundatarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_sgt(View view) {
        Intent sgt = new Intent(MainActivity.this, Segitiga.class);
        startActivity(sgt);
    }

    public void btn_psg(View view) {
        Intent psg = new Intent(MainActivity.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_jjg(View view) {
        Intent jjg = new Intent(MainActivity.this, jajargenjang.class);
        startActivity(jjg);
    }

    public void btn_bbk(View view) {
        Intent bbk = new Intent(MainActivity.this, belahketupat.class);
        startActivity(bbk);
    }
}
