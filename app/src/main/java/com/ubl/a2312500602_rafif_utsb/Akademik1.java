package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Akademik1 extends Fragment {

    public Akademik1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_akademik1, container, false);

        // Contoh menambahkan TextView di dalam fragment
        TextView textView = view.findViewById(R.id.text_view1);


        return view;
    }
}