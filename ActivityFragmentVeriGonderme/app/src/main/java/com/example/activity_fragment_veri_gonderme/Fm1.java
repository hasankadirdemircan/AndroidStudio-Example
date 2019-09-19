package com.example.activity_fragment_veri_gonderme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fm1 extends Fragment {

    TextView textView;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fm1, container, false);
        textView = view.findViewById(R.id.textView);
        //activity'den gelen veriyi almak.
        if(getArguments() != null){
            String isimDeger = getArguments().getString("isim").toString();

            textView.setText(isimDeger);
        }

        return view;
    }

}
