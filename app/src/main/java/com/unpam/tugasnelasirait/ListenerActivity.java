package com.unpam.tugasnelasirait;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListenerActivity extends AppCompatActivity implements MakananAdapter.OnClikShowListener{

    RecyclerView recMakanan;
    List<MakananSunda> makanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        initMakanan();

        recMakanan = findViewById(R.id.list_item);
        MakananAdapter makananAdapter = new MakananAdapter(this, makanan, this);

        recMakanan.setAdapter(makananAdapter);
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initMakanan() {
        makanan = new ArrayList<>();
        makanan.add(new MakananSunda(1,"Nasi Goreng"));
        makanan.add(new MakananSunda(1,"Ayam Goreng"));
        makanan.add(new MakananSunda(1,"Nasi Bakar"));
        makanan.add(new MakananSunda(1,"Roti Goreng"));
    }

    @Override
    public void onClickShowListener(int positon) {
    }
}