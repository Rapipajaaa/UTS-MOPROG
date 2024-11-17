package com.ubl.a2312500602_rafif_utsb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PerpusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perpus);

    }
    public void showMhs(View view) {
        Intent intent = new Intent(this, Mahasiswa.class);
        startActivity(intent);
    }
    public void showDosen(View view) {
        Intent intent = new Intent(this, Mahasiswa.class);
        startActivity(intent);
    }
    public void showStaff(View view) {
        Intent intent = new Intent(this, Mahasiswa.class);
        startActivity(intent);
    }
}