package com.example.activityicerisindefragmentdegistirme_1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment1 extends Fragment {

    View view;
    Button fragment1Button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_fragment1, container, false);
        tanimla();
        return view;
    }
    //button tanim
    public void tanimla(){
        fragment1Button = view.findViewById(R.id.fragment1Button);
        fragment1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFm();
            }
        });
    }
    //change fragment
    public void changeFm(){
        //fragment icerisinde listview olusturacaksak -> getContext().getActivity() gondermeliyiz.
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new Fragment2());
    }
}
