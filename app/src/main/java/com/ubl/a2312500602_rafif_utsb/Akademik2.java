package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Akademik2 extends Fragment {

    public Akademik2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_akademik2, container, false);

        // Sambungkan TextView dengan ID yang sesuai
        TextView nimText = view.findViewById(R.id.nimText);
        TextView studyProgramText = view.findViewById(R.id.studyProgramText);
        TextView nameText = view.findViewById(R.id.nameText);


        return view;
    }
}
