package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import android.widget.TextView;
import android.text.Html;


public class Akademik3 extends Fragment {

    public Akademik3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_akademik3, container, false);

        // Inisialisasi semua button dan set OnClickListener dengan AlertDialog
        Button button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button4= view.findViewById(R.id.button4);
        button4.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button5 = view.findViewById(R.id.button5);
        button5.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button6 = view.findViewById(R.id.button6);
        button6.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button7 = view.findViewById(R.id.button7);
        button7.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button8 = view.findViewById(R.id.button8);
        button8.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button9 = view.findViewById(R.id.button9);
        button9.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button10 = view.findViewById(R.id.button10);
        button10.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Tambahkan listener untuk button lainnya
        Button button11 = view.findViewById(R.id.button11);
        button11.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));
        // Tambahkan listener untuk button lainnya
        Button button12 = view.findViewById(R.id.button12);
        button12.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));
        // Tambahkan listener untuk button lainnya
        Button button13 = view.findViewById(R.id.button13);
        button13.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));
        // Tambahkan listener untuk button lainnya
        Button button14 = view.findViewById(R.id.button14);
        button14.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        // Lanjutkan untuk setiap button hingga button15
        Button button15 = view.findViewById(R.id.button15);
        button15.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));
        return view;
    }
    // Metode untuk menampilkan AlertDialog
    private void showAlert(Spanned message) {
        new AlertDialog.Builder(requireContext())
                .setTitle("Nilai")
                .setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
