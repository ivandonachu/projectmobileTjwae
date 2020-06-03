package com.example.prototypetjwae.halte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.activity.MainActivity;

public class Kraton extends AppCompatActivity {
    private Button btnLihat,btnBack;
    private Spinner spNamaHalte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kraton);


        spNamaHalte = findViewById(R.id.sp_halte_name);
        btnLihat = findViewById(R.id.bt_lihat_jadwal);
        btnBack = findViewById(R.id.bt_back_fragment);

        final String upnCongcat = "UPN Condongcatur";
        final String hartonoMall = "Hartono Mall";
        final String sinduKusumaEdupark = "Sindu Kusuma Edupark";
        final String alunUtara = "Alun - Alun Utara";
        final String malioboro = "Malioboro";
        final String ambarukmoMall = "Ambarukmo Mall";
        final String upnBB = "UPN Babarsari";


        //buton liat jadwal
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pembanding = spNamaHalte.getSelectedItem().toString();
                if (pembanding.equals(hartonoMall)){
                    Intent hartonoINTENT = new Intent(Kraton.this, HartonoMall.class);
                    startActivity(hartonoINTENT);
                }
                else if (pembanding.equals(upnCongcat)){
                    Intent upncongcatINTENT = new Intent(Kraton.this, UPNCondongcatur.class);
                    startActivity(upncongcatINTENT);
                }
                else if (pembanding.equals(sinduKusumaEdupark)){
                    Intent sinduINTENT = new Intent(Kraton.this, SinduKusumaEdupark.class);
                    startActivity(sinduINTENT);
                }
                else if (pembanding.equals(alunUtara)){
                    Intent alunUtaraINTENT = new Intent(Kraton.this, AlunAlunUtara.class);
                    startActivity(alunUtaraINTENT);
                }
                else if (pembanding.equals(malioboro)){
                    Intent malioINTENT = new Intent(Kraton.this, Malioboro.class);
                    startActivity(malioINTENT);
                }
                else if (pembanding.equals(ambarukmoMall)){
                    Intent amplasINTENT = new Intent(Kraton.this, AlunAlunUtara.class);
                    startActivity(amplasINTENT);
                }
                else if (pembanding.equals(upnBB)){
                    Intent bbINTENT = new Intent(Kraton.this, UPNBabarsari.class);
                    startActivity(bbINTENT);
                }



            }
        });


        //buton kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(Kraton.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });

    }
}
