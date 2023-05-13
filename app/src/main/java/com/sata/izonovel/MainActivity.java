package com.lp3i.fizonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class activity_main extends AppCompatActivity {
    TextView morefavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        morefavorite = findViewById(R.id.morefavorite);
        morefavorite.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(activity_main.this, activity_menu_favorite.class);
                startActivity(intent);
                return false;
            }
        });

    }
}