package com.example.activityicerisindefragmentgosterim;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KayitFragment extends Fragment {
    View view; //layout icerisindeki view'larin tanimlanmasi icin.
    EditText kullaniciAdi;
    TextView kullaniciAdiText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_kayit, container, false);
        tanimla();
        action();
        return view;
    }

    public void tanimla() {
        kullaniciAdi = view.findViewById(R.id.kullaniciAdi);
        kullaniciAdiText = view.findViewById(R.id.kullaniciAdiText);
        button = view.findViewById(R.id.button);
    }

    public void action(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullaniciAdiText.setText(kullaniciAdi.getText().toString());
                kullaniciAdi.setText("");
            }
        });
    }
}
