package com.example.activity_fragment_veri_gonderme;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

//Fragmentler arasi gecis icin bu class kullanilir.
public class ChangeFragment {

    private Context context;

    //hangi fragmentte ise onun contex'i verilir.
    public ChangeFragment(Context context) {
        this.context = context;
    }

    //hangi fragmenti calistirmak istiyorsak onu veriyoruz.
    public void change(Fragment fragment, String isim) {
        Bundle bundle = new Bundle();
        bundle.putString("isim", isim);
        fragment.setArguments(bundle);
        // fragment id ve hangi fragment calisagi bilgilerini verecegiz.
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()

                .replace(R.id.frameLayout, fragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}