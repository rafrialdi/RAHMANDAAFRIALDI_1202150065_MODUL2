package com.example.android.rahmandaafrialdi_1202150065;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

/**
 * Created by Rahmanda on 18-Feb-18.
 */

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Indomie Rebus");
            foods.add("Soto Padang");
            foods.add("Soto Madura");
            foods.add("Soto Betawi");
            foods.add("Mie Ayam");
            foods.add("Nasi Goreng");
            foods.add("Ayam Geprek");
            foods.add("Ayam Gulai");
            foods.add("Seblak");


            // mamanggil harga
            priceses.add(10000);
            priceses.add(22000);
            priceses.add(15000);
            priceses.add(20000);
            priceses.add(12000);
            priceses.add(15000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(15000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.indomi_rebus);
            photos.add(R.drawable.soto_padang);
            photos.add(R.drawable.soto_madura);
            photos.add(R.drawable.soto_betawi);
            photos.add(R.drawable.mie_ayam);
            photos.add(R.drawable.nasi_goreng);
            photos.add(R.drawable.ayam_geprek);
            photos.add(R.drawable.ayam_gulai);
            photos.add(R.drawable.seblak);
        }
    }
}