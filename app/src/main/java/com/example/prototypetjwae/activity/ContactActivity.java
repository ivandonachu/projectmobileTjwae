package com.example.prototypetjwae.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.login.LogoutActivity;

public class ContactActivity extends AppCompatActivity {
    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        kembali = findViewById(R.id.back_utama);

        //buton kembali
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(ContactActivity.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });
    }
}
