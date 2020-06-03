package com.example.prototypetjwae.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.activity.MainActivity;

public class LogoutActivity extends AppCompatActivity {
    private DatabaseHelper db;
    private Button logout, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        db = new DatabaseHelper(this);
        logout = (Button)findViewById(R.id.logout);
        kembali = findViewById(R.id.back_jadwal);

        // logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean updtSession = db.upgradeSession("kosong", 1);
                if (updtSession == true) {
                    Toast.makeText(getApplicationContext(), "Berhasil Keluar", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(LogoutActivity.this, LoginActivity.class);
                    startActivity(loginIntent);
                    finish();
                }
            }
        });

        //buton kembali
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(LogoutActivity.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });


    }
}
