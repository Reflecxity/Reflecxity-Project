package com.cookandroid.joljag_v1_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.button_translate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 통역 기능 구현
            }
        });

        findViewById(R.id.button_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, com.cookandroid.joljag_v1_0.MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
