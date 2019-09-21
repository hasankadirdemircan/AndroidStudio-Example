package com.example.fragment_fragmentverigonderimi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fm2 extends Fragment {

    View view;
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_fm2, container, false);

        //veri gelmişse
        if(getArguments() != null){
            String data = getArguments().getString("msg").toString();
            textView = view.findViewById(R.id.textView);
            textView.setText(data);
        }

        return view;

    }

}
