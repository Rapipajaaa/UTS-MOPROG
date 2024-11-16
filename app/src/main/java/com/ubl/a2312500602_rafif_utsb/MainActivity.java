package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isAlertShownForTab2 = false; // Untuk melacak apakah dialog sudah ditampilkan di Tab 2

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


}