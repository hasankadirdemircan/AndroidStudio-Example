package com.example.fragment_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BirinciFragment extends Fragment {

    //fragment direkt calismaz.
    //activity'ler icerisinde calisir.

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_birinci, container, false);
         tanimla();
         return view;
    }

    public void tanimla(){
        //fragment icerisindkei tanimlama.
        Button button = view.findViewById(R.id.fragment1);
    }
}
