package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView iphone, tambahan, lamarental, totalHarga;
    public static String iphone1 = "IPHONE";
    public static String tambahan1 = "TAMBAHAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iphone = findViewById(R.id.detailIphone);
        tambahan = findViewById(R.id.detailTambahan);
        lamarental = findViewById(R.id.detailRental);
        totalHarga = findViewById(R.id.detailTotalHarga);

        Intent intent = getIntent();
        String hargaIphone = String.valueOf(intent.getIntExtra("namaIphone",0));
        int tambahanHarga = intent.getIntExtra("tambahan", 0);
        int lamaRental = intent.getIntExtra("lamaRental", 0);
        int totalHargaFinal = intent.getIntExtra("totalHarga", 0);

        iphone.setText( "Iphone : " + getIntent().getStringExtra(iphone1));
        tambahan.setText("Tambahan: " + getIntent().getStringExtra(tambahan1));
        lamarental.setText("Lama Rental: " + lamaRental + " hari");
        totalHarga.setText("Total Harga: " + totalHargaFinal);
    }

}