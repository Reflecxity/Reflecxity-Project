package com.cookandroid.joljag_v1_0;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DataTransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

        findViewById(R.id.button_qr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // QR 코드 변환 및 데이터 이전 로직 구현
            }
        });
    }
}
