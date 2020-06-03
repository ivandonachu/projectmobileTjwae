package com.example.prototypetjwae.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prototypetjwae.R;

public class AboutActivity extends AppCompatActivity {
    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        kembali = findViewById(R.id.back_utama);

        //buton kembali
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });
    }
}
