package com.example.prototypetjwae.halte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.activity.MainActivity;

public class SinduKusumaEdupark extends AppCompatActivity {
    private Button btnLihat,btnBack;
    private Spinner spNamaHalte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sindu_kusuma_edupark);
        spNamaHalte = findViewById(R.id.sp_halte_name);
        btnLihat = findViewById(R.id.bt_lihat_jadwal);
        btnBack = findViewById(R.id.bt_back_fragment);

        final String upnCongcat = "UPN Condongcatur";
        final String hartonoMall = "Hartono Mall";
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
                if (pembanding.equals(hartonoMall)){
                    Intent hartonoINTENT = new Intent(SinduKusumaEdupark.this, HartonoMall.class);
                    startActivity(hartonoINTENT);
                }
                else if (pembanding.equals(upnCongcat)){
                    Intent upncongcatINTENT = new Intent(SinduKusumaEdupark.this, UPNCondongcatur.class);
                    startActivity(upncongcatINTENT);
                }
                else if (pembanding.equals(malioboro)){
                    Intent malioINTENT = new Intent(SinduKusumaEdupark.this, Malioboro.class);
                    startActivity(malioINTENT);
                }
                else if (pembanding.equals(alunUtara)){
                    Intent alunUtaraINTENT = new Intent(SinduKusumaEdupark.this, AlunAlunUtara.class);
                    startActivity(alunUtaraINTENT);
                }
                else if (pembanding.equals(kraton)){
                    Intent kratonINTENT = new Intent(SinduKusumaEdupark.this, Kraton.class);
                    startActivity(kratonINTENT);
                }
                else if (pembanding.equals(ambarukmoMall)){
                    Intent amplasINTENT = new Intent(SinduKusumaEdupark.this, AmbarukmoMall.class);
                    startActivity(amplasINTENT);
                }
                else if (pembanding.equals(upnBB)){
                    Intent bbINTENT = new Intent(SinduKusumaEdupark.this, UPNBabarsari.class);
                    startActivity(bbINTENT);
                }



            }
        });


        //buton kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(SinduKusumaEdupark.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });

    }
}
