package com.example.myapplication_indi_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BreadMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread_menu);

        Button breadButton1 = findViewById(R.id.bread_button1);
        Button backButton = findViewById(R.id.back_button1);
        breadButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Выводим сообщение с помощью Toast
                Toast.makeText(BreadMenu.this, "К - 166, Б - 4, Ж - 1, У - 34", Toast.LENGTH_SHORT).show();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BreadMenu.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}