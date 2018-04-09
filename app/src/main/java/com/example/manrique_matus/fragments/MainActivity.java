package com.example.manrique_matus.fragments;

import android.support.v4.app.FragmentActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    FragmentManager fragmentManager =getFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment=new FirstFragment();
        fragmentTransaction.add(R.id.fragment,firstFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
