package com.example.prototypetjwae.halte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.activity.MainActivity;

public class UPNBabarsari extends AppCompatActivity {
    private Button btnLihat,btnBack;
    private Spinner spNamaHalte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_p_n_babarsari);


        spNamaHalte = findViewById(R.id.sp_halte_name);
        btnLihat = findViewById(R.id.bt_lihat_jadwal);
        btnBack = findViewById(R.id.bt_back_fragment);

        final String upnCongcat = "UPN Condongcatur";
        final String hartonoMall = "Hartono Mall";
        final String sinduKusumaEdupark = "Sindu Kusuma Edupark";
        final String alunUtara = "Alun - Alun Utara";
        final String kraton = "Kraton";
        final String Malio = "Malioboro";
        final String Amplas = "Ambarukmo Mall";


        //buton liat jadwal
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pembanding = spNamaHalte.getSelectedItem().toString();
                if (pembanding.equals(hartonoMall)){
                    Intent hartonoINTENT = new Intent(UPNBabarsari.this, HartonoMall.class);
                    startActivity(hartonoINTENT);
                }
                else if (pembanding.equals(upnCongcat)){
                    Intent upncongcatINTENT = new Intent(UPNBabarsari.this, UPNCondongcatur.class);
                    startActivity(upncongcatINTENT);
                }
                else if (pembanding.equals(sinduKusumaEdupark)){
                    Intent sinduINTENT = new Intent(UPNBabarsari.this, SinduKusumaEdupark.class);
                    startActivity(sinduINTENT);
                }
                else if (pembanding.equals(alunUtara)){
                    Intent alunUtaraINTENT = new Intent(UPNBabarsari.this, AlunAlunUtara.class);
                    startActivity(alunUtaraINTENT);
                }
                else if (pembanding.equals(kraton)){
                    Intent kratonINTENT = new Intent(UPNBabarsari.this, Kraton.class);
                    startActivity(kratonINTENT);
                }
                else if (pembanding.equals(Malio)){
                    Intent malioINTENT = new Intent(UPNBabarsari.this, Malioboro.class);
                    startActivity(malioINTENT);
                }
                else if (pembanding.equals(Amplas)){
                    Intent bbINTENT = new Intent(UPNBabarsari.this, AmbarukmoMall.class);
                    startActivity(bbINTENT);
                }



            }
        });


        //buton kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(UPNBabarsari.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });



    }
}
