package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;

import android.text.Html;


public class Akademik3 extends Fragment {

    public Akademik3() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aka3, container, false);


        Button button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 90<br>UAS: 90")));


        Button button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 79<br>UAS: 90")));


        Button button4= view.findViewById(R.id.button4);
        button4.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 71<br>UAS: 90")));


        Button button5 = view.findViewById(R.id.button5);
        button5.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));


        Button button6 = view.findViewById(R.id.button6);
        button6.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));


        Button button7 = view.findViewById(R.id.button7);
        button7.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));


        Button button8 = view.findViewById(R.id.button8);
        button8.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));


        Button button9 = view.findViewById(R.id.button9);
        button9.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));


        Button button10 = view.findViewById(R.id.button10);
        button10.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        Button button11 = view.findViewById(R.id.button11);
        button11.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        Button button12 = view.findViewById(R.id.button12);
        button12.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        Button button13 = view.findViewById(R.id.button13);
        button13.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));

        Button button14 = view.findViewById(R.id.button14);
        button14.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));


        Button button15 = view.findViewById(R.id.button15);
        button15.setOnClickListener(v -> showAlert(Html.fromHtml("Absensi: 80 %<br>UTS: 70<br>UAS: 90")));
        return view;
    }

    private void showAlert(Spanned message) {
        new AlertDialog.Builder(requireContext())
                .setTitle("Nilai")
                .setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
