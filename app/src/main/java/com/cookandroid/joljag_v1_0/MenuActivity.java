package com.cookandroid.joljag_v1_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.joljag_v1_0.AiTranslationActivity;
import com.cookandroid.joljag_v1_0.DataTransferActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.button_retrain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, com.cookandroid.joljag_v1_0.RetrainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_ai_translate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AiTranslationActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_data_transfer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, DataTransferActivity.class);
                startActivity(intent);
            }
        });
    }
}
