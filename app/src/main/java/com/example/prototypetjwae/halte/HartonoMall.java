package com.example.prototypetjwae.halte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.activity.MainActivity;

public class HartonoMall extends AppCompatActivity {
    private Button btnLihat,btnBack;
    private Spinner spNamaHalte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hartono_mall);
        spNamaHalte = findViewById(R.id.sp_halte_name);
        btnLihat = findViewById(R.id.bt_lihat_jadwal);
        btnBack = findViewById(R.id.bt_back_fragment);

        final String upnCongcat = "UPN Condongcatur";
        final String sinduKusumaEdupark = "Sindu Kusuma Edupark";
        final String malioboro = "Malioboro";
        final String alunUtara = "Alun - Alun Utara";
        final String kraton = "Kraton";
        final String ambarukmoMall = "Ambarukmo Mall";
        final String upnBB = "UPN Babarsari";

        //buton liat jadwal
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pembanding = spNamaHalte.getSelectedItem().toString();
                if (pembanding.equals(upnCongcat)){
                    Intent hartonoINTENT = new Intent(HartonoMall.this, UPNCondongcatur.class);
                    startActivity(hartonoINTENT);
                }
                if (pembanding.equals(sinduKusumaEdupark)){
                    Intent sindueduparkINTENT = new Intent(HartonoMall.this, SinduKusumaEdupark.class);
                    startActivity(sindueduparkINTENT);
                }
                else if (pembanding.equals(malioboro)){
                    Intent malioINTENT = new Intent(HartonoMall.this, Malioboro.class);
                    startActivity(malioINTENT);
                }
                else if (pembanding.equals(alunUtara)){
                    Intent alunUtaraINTENT = new Intent(HartonoMall.this, AlunAlunUtara.class);
                    startActivity(alunUtaraINTENT);
                }
                else if (pembanding.equals(kraton)){
                    Intent kratonINTENT = new Intent(HartonoMall.this, Kraton.class);
                    startActivity(kratonINTENT);
                }
                else if (pembanding.equals(ambarukmoMall)){
                    Intent amplasINTENT = new Intent(HartonoMall.this, AmbarukmoMall.class);
                    startActivity(amplasINTENT);
                }
                else if (pembanding.equals(upnBB)){
                    Intent bbINTENT = new Intent(HartonoMall.this, UPNBabarsari.class);
                    startActivity(bbINTENT);
                }

            }
        });


        //buton kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(HartonoMall.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });
    }
}
