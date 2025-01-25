package com.example.myapplication_indi_v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Обработка нажатия кнопки "Хлеб"
        Button buttonBread = findViewById(R.id.button_bread);
        ImageButton buttonGift = findViewById(R.id.button_busket1);


        buttonBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Запуск Activity BreadMenuActivity
                Intent intent = new Intent(MainActivity.this, BreadMenu.class);
                startActivity(intent);
            }
        });
        buttonGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gift.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Show confirmation dialog before exiting
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Вы действительно хотите выйти?")
                .setPositiveButton("Да", (dialog, id) -> {
                    // Exit the app
//                    MainActivity.this.finish();
                    moveTaskToBack(true);
                })
                .setNegativeButton("Нет", (dialog, id) -> {
                    // Dismiss the dialog without exiting
                    dialog.dismiss();

                })
                .setIcon(R.mipmap.myicon)  // Add an icon (optional)
                .setTitle("Выход")
                .show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about){
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            try {
                dialog.setMessage(getTitle().toString()+ " версия "+
                        getPackageManager().getPackageInfo(getPackageName(),0).versionName +
                        "\r\n\nПриложение для пекарни \r\n\n " +
                        "Автор - Братчикова Полина Викторовна, гр. 3-ТИД-7");
            }
            catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            dialog.setTitle("О программе");
            dialog.setNeutralButton("OK",
                    (dialog1, which) -> dialog1.dismiss());
            dialog.setIcon(R.mipmap.myicon);
            AlertDialog alertDialog = dialog.create();
            alertDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}