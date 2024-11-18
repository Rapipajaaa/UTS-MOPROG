package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

public class Mahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_y);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> showAlert("Dibuat oleh Andi Saputra"));
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> showAlert("Dibuat oleh Rina Wijayanti"));

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> showAlert("Dibuat oleh Dimas Pratama"));
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> showAlert("Dibuat oleh Lia Puspitasari"));
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> showAlert("Dibuat oleh Rizky Kurniawan"));
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> showAlert("Dibuat oleh Sarah Putri"));
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(v -> showAlert("Dibuat oleh Firman Hidayat"));

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(v -> showAlert("Dibuat oleh Nurul Aulia"));
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(v -> showAlert("Dibuat oleh Yudha Prasetyo"));
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(v -> showAlert("Dibuat oleh Siti Maemunah"));

        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(v -> showAlert("Dibuat oleh Budi Santoso"));
        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(v -> showAlert("Dibuat oleh Intan Permata"));

        Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(v -> showAlert("Dibuat oleh Adi Nugroho"));

        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(v -> showAlert("Dibuat oleh Rina Wijayanti"));

        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(v -> showAlert("Dibuat oleh Eko Purnomo"));
    }
    private void showAlert(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Perpustakaan Khusus Mahasiswa")
                .setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}