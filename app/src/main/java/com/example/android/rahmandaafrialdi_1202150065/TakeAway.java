package com.example.android.rahmandaafrialdi_1202150065;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void onPilihPesanan(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
