package com.example.aceres14.coba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka1, angka2;
    TextView hasil;
    Button tambah, kurang, kali, bagi, hapus;

    int angka01, angka02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = (EditText) findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        hasil = (TextView) findViewById(R.id.hasil);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        hapus = (Button) findViewById(R.id.hapus);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilTambah();
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilKurang();
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilKali();
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilBagi();
            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hapus();
            }
        });
    }

    public void HasilTambah() {
        if (angka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else if (angka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else {
            angka01 = Integer.parseInt(angka1.getText().toString());
            angka02 = Integer.parseInt(angka2.getText().toString());

            int samadengan = angka01 + angka02;
            hasil.setText(String.valueOf(samadengan));
        }
    }

    public void HasilKurang() {
        if (angka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else if (angka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else {
            angka01 = Integer.parseInt(angka1.getText().toString());
            angka02 = Integer.parseInt(angka2.getText().toString());
        }
        Integer samadengan = angka01 - angka02;
        hasil.setText(String.valueOf(samadengan));
    }

    public void HasilKali() {
        if (angka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else if (angka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else {
            angka01 = Integer.parseInt(angka1.getText().toString());
            angka02 = Integer.parseInt(angka2.getText().toString());
            Integer samadengan = angka01 * angka02;
            hasil.setText(String.valueOf(samadengan));
        }
    }

    public void HasilBagi() {
        if (angka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else if (angka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Angka 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else {
            angka01 = Integer.parseInt(angka1.getText().toString());
            angka02 = Integer.parseInt(angka2.getText().toString());
            Integer samadengan = angka01 / angka02;
            hasil.setText(String.valueOf(samadengan));
        }
    }

    public void hapus() {
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        this.finish();
    }
}