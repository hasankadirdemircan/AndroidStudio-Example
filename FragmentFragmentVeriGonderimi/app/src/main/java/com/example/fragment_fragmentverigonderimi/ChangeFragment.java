package com.example.fragment_fragmentverigonderimi;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

//activity icerisnde yazdigimiz framelayout tanimlamalari.
//Fragmentler arasi gecis icin bu class kullanilir.
public class ChangeFragment {

    private Context context;

    //hangi fragmentte ise onun contex'i verilir.
    public ChangeFragment(Context context) {
        this.context = context;
    }


    public void change(Fragment fragment) {
        // fragment id ve hangi fragment calisagi bilgilerini verecegiz.
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()

                .replace(R.id.frameLayout1, fragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    //hangi fragmenti calistirmak istiyorsak onu veriyoruz.
    public void change(Fragment fragment, String isim) {
        Bundle bundle = new Bundle();
        bundle.putString("isim", isim);
        fragment.setArguments(bundle);
        // fragment id ve hangi fragment calisagi bilgilerini verecegiz.
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()

                .replace(R.id.frameLayout1, fragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    public void showToFragment2(Fragment fragment) {

        // fragment id ve hangi fragment calisagi bilgilerini verecegiz.
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()

                .replace(R.id.frameLayout2, fragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    public void sendToData(Fragment fragment, String msg) {
        Bundle bundle = new Bundle();
        bundle.putString("msg", msg);
        fragment.setArguments(bundle);
        // fragment id ve hangi fragment calisagi bilgilerini verecegiz.
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()

                .replace(R.id.frameLayout2, fragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}