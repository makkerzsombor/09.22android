package com.example.oraimunka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private EditText szoveg;
    private Button nagyb;
    private Button kisb;
    private Button random;
    private TextView kesz;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        nagyb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kesz.setText(szoveg.getText().toString().toUpperCase());
            }
        });
        kisb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kesz.setText(szoveg.getText().toString().toLowerCase());
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                kesz.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
    }
    private void init(){
        layout = findViewById(R.id.layout);
        szoveg = findViewById(R.id.szoveg);
        nagyb = findViewById(R.id.nagyb);
        kisb = findViewById(R.id.kisb);
        random = findViewById(R.id.random);
        kesz = findViewById(R.id.kesz);
        rnd = new Random();
    }
}