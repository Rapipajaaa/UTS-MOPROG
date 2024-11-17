package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;

import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }
    // Metode untuk membuka Instagram
    public void showIG(View view) {
        String url = "https://www.instagram.com/kampusbudiluhur"; // Ganti dengan URL Instagram Anda
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    // Metode untuk membuka Facebook
    public void showFB(View view) {
        String url = "https://www.facebook.com/Rama"; // Ganti dengan URL Facebook Anda
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    // Metode untuk membuka Twitter
    public void showTWT(View view) {
        String url = "https://www.twitter.com/rapipajaa"; // Ganti dengan URL Twitter Anda
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
    public void showAkademik(View view) {
        Intent intent = new Intent(this, AkademikActivity.class);
        startActivity(intent);
    }

    public void showPerpus(View view) {
        Intent intent = new Intent(this, PerpusActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        // Buat AlertDialog untuk konfirmasi keluar
        new AlertDialog.Builder(this)
                .setTitle("Konfirmasi Keluar")
                .setMessage("Apakah Anda yakin ingin keluar dari aplikasi?")
                .setPositiveButton("Ya", (dialog, which) -> {
                    // Keluar dari aplikasi jika pengguna memilih "Ya"
                    super.onBackPressed();
                })
                .setNegativeButton("Tidak", (dialog, which) -> {
                    // Tutup dialog jika pengguna memilih "Tidak"
                    dialog.dismiss();
                })
                .show();
    }

}