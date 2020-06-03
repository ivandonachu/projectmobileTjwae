package com.example.prototypetjwae.catatan.database;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DataDiriDAO {
    @Insert
    Long insertData(DataDiri dataDiri);

    @Query("Select*from datadiri_db")
    DataDiri[] getData();

}
