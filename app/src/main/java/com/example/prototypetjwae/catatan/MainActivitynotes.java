package com.example.prototypetjwae.catatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.activity.MainActivity;
import com.example.prototypetjwae.catatan.database.AppDatabase;
import com.example.prototypetjwae.catatan.database.DataDiri;
import com.example.prototypetjwae.login.LogoutActivity;

public class MainActivitynotes extends AppCompatActivity {

    private TextView etJenkel;
    private AppCompatRatingBar RatingBar;

    private EditText etNama, etAlamat;
    private Button etInsert, kembali;

    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitynotes);
        RatingBar = findViewById(R.id.penilaian);

        appDatabase = AppDatabase.intDB(getApplicationContext());

        etNama = findViewById(R.id.etNama);
        etAlamat = findViewById(R.id.etAlamat);
        etJenkel = findViewById(R.id.rate);
        etInsert = findViewById(R.id.etInsert);
        kembali = findViewById(R.id.back_menu);

        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                etJenkel.setText("Rating: "+nilai);
            }
        });


        etInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertData();
                Toast.makeText(getApplicationContext(), "Terima Kasih! Review Anda telah Masuk ke Database kami", Toast.LENGTH_SHORT).show();
            }
        });

        //buton kembali
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backINTENT = new Intent(MainActivitynotes.this, MainActivity.class);
                startActivity(backINTENT);
            }
        });
    }

        private void insertData() {
            String nama = etNama.getText().toString();
            String alamat = etAlamat.getText().toString();
            String kelamin = etJenkel.getText().toString();



    DataDiri item = new DataDiri();
            item.setNama(nama);
            item.setAlamat(alamat);
            item.setJkelamin(kelamin);

            //setelah itu, kirim ke database
            appDatabase.dao().insertData(item);

            etNama.setText("");
            etAlamat.setText("");
            etJenkel.setText(" ");

        }

}