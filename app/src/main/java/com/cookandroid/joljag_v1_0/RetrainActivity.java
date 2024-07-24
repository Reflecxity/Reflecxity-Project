package com.cookandroid.joljag_v1_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class RetrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrain);

        findViewById(R.id.button_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 초기화 로직 구현
                Intent intent = new Intent(RetrainActivity.this, com.cookandroid.joljag_v1_0.DataLearningActivity.class);
                startActivity(intent);
            }
        });
    }
}
