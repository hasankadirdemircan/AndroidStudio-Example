package com.example.fragment_fragmentverigonderimi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fm1 extends Fragment {

    View view;
    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view  = inflater.inflate(R.layout.fragment_fm1, container, false);

        tanimla();

        return view;
    }

    public void tanimla(){
        editText = view.findViewById(R.id.editText);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment changeFragment = new ChangeFragment(getContext());
                //hangi fragmente, hangi veriyi gondreceğimizi yaızoyruz.
                changeFragment.sendToData(new Fm2(), editText.getText().toString());
            }
        });
    }
}
