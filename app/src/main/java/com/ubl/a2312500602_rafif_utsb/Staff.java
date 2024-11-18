package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_stff);

        showAlertBox();
    }
    private void showAlertBox() {
        new AlertDialog.Builder(Staff.this)
                .setTitle("MAAF")
                .setMessage("SAAT INI DATA BELUM TERSEDIA")
                .setPositiveButton("Kembali", (dialog, which) -> {
                    dialog.dismiss();
                    finish();
                })
                .show();
    }
}