package com.cookandroid.joljag_v1_0;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AiTranslationActivity extends AppCompatActivity {

    private TextView translatedText;
    private TextView inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_translation);

        translatedText = findViewById(R.id.text_translated_text);
        inputText = findViewById(R.id.text_input_text);

        findViewById(R.id.button_voice_input).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 음성 입력 및 서버 전송 로직 구현
                // 번역된 텍스트 및 입력된 텍스트 업데이트
            }
        });

        findViewById(R.id.button_play_translated_audio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 번역된 음성 출력 로직 구현
            }
        });
    }
}
