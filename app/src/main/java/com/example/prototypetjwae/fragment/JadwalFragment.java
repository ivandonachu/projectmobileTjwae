package com.example.prototypetjwae.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;


import com.example.prototypetjwae.R;
import com.example.prototypetjwae.catatan.MainActivitynotes;
import com.example.prototypetjwae.halte.AlunAlunUtara;
import com.example.prototypetjwae.halte.AmbarukmoMall;
import com.example.prototypetjwae.halte.HartonoMall;
import com.example.prototypetjwae.halte.Kraton;
import com.example.prototypetjwae.halte.Malioboro;
import com.example.prototypetjwae.halte.SinduKusumaEdupark;
import com.example.prototypetjwae.halte.UPNBabarsari;
import com.example.prototypetjwae.halte.UPNCondongcatur;
import com.example.prototypetjwae.login.LogoutActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class JadwalFragment extends Fragment {

    private Button btnLihat;
    private Spinner spNamaHalte;
    private Button cat;




    public JadwalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jadwal, container, false);

        spNamaHalte = view.findViewById(R.id.sp_halte_name);
        btnLihat = view.findViewById(R.id.bt_lihat_jadwal);
        cat = view.findViewById(R.id.catatan);

        final String upnCongcat = "UPN Condongcatur";
        final String hartonoMall = "Hartono Mall";
        final String sinduKusumaEdupark = "Sindu Kusuma Edupark";
        final String malioboro = "Malioboro";
        final String alunUtara = "Alun - Alun Utara";
        final String kraton = "Kraton";
        final String ambarukmoMall = "Ambarukmo Mall";
        final String upnBB = "UPN Babarsari";


        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pembanding = spNamaHalte.getSelectedItem().toString();
                if (pembanding.equals(upnCongcat)  ) {
                    Intent UPNcongcatINTENT = new Intent(getActivity().getApplication(), UPNCondongcatur.class);
                    startActivity(UPNcongcatINTENT);
                }
                else if (pembanding.equals(hartonoMall)){
                    Intent hartonoINTENT = new Intent(getActivity().getApplication(), HartonoMall.class);
                    startActivity(hartonoINTENT);
                }
                else if (pembanding.equals(sinduKusumaEdupark)){
                    Intent sindueduparkINTENT = new Intent(getActivity().getApplication(), SinduKusumaEdupark.class);
                    startActivity(sindueduparkINTENT);
                }
                else if (pembanding.equals(malioboro)){
                    Intent malioINTENT = new Intent(getActivity().getApplication(), Malioboro.class);
                    startActivity(malioINTENT);
                }
                else if (pembanding.equals(alunUtara)){
                    Intent alunINTENT = new Intent(getActivity().getApplication(), AlunAlunUtara.class);
                    startActivity(alunINTENT);
                }
                else if (pembanding.equals(kraton)){
                    Intent kratonINTENT = new Intent(getActivity().getApplication(), Kraton.class);
                    startActivity(kratonINTENT);
                }
                else if (pembanding.equals(ambarukmoMall)){
                    Intent amplasINTENT = new Intent(getActivity().getApplication(), AmbarukmoMall.class);
                    startActivity(amplasINTENT);
                }
                else if (pembanding.equals(upnBB)){
                    Intent upnbbINTENT = new Intent(getActivity().getApplication(), UPNBabarsari.class);
                    startActivity(upnbbINTENT);
                }
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tampil = new Intent(getActivity(), MainActivitynotes.class);
                startActivity(tampil);
            }
        });



        return view;

    }

}
