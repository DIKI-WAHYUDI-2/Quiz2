package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton15max,radioButton15pro,radioButton14max,radioButton14pro,radioButton13max;
    private RadioButton radioButtonAirPods, radioButtonCassing;
    private EditText editText1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton15max = findViewById(R.id.promax15);
        radioButton15pro = findViewById(R.id.pro15);
        radioButton14max = findViewById(R.id.promax14);
        radioButton14pro = findViewById(R.id.pro14);
        radioButton13max = findViewById(R.id.promax13);
        radioButtonAirPods = findViewById(R.id.airpod);
        radioButtonCassing = findViewById(R.id.cassing);
        editText1 = findViewById(R.id.etHari);
        button1 = findViewById(R.id.btnpesan);

        button1.setOnClickListener(click -> {

            int hargaIphone = 0;
            String namaIphone = "";
            int hari = Integer.parseInt(editText1.getText().toString());

            if (radioButton15max.isChecked()) {
                hargaIphone = 300000;
                namaIphone = "Iphone 15 pro max";
            } else if (radioButton15pro.isChecked()) {
                hargaIphone = 280000;
                namaIphone = "Iphone 15 pro";
            } else if (radioButton14max.isChecked()) {
                hargaIphone = 250000;
                namaIphone = "Iphone 14 pro max";
            } else if (radioButton14pro.isChecked()) {
                hargaIphone = 200000;
                namaIphone = "Iphone 14 pro";
            } else if (radioButton13max.isChecked()) {
                hargaIphone = 100000;
                namaIphone = "Iphone 13 pro max";
            }

            int tambahan = 0;
            String namaTambahan = "";
            if (radioButtonAirPods.isChecked()) {
                tambahan += 20000;
                namaTambahan = "Air pods";


            }
            if (radioButtonCassing.isChecked()) {
                tambahan += 10000;
                namaTambahan = "Cassing";
            }

            int totalHarga = (hargaIphone + tambahan) * hari;

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.iphone1, namaIphone);
            intent.putExtra(DetailActivity.tambahan1, namaTambahan);
            intent.putExtra("lamaRental", hari);
            intent.putExtra("totalHarga", totalHarga);
            startActivity(intent);
        });

    }
}