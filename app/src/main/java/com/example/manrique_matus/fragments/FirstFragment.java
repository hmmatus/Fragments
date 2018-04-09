package com.example.manrique_matus.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;

/**
 * Created by Manrique_Matus on 008/8/4/2018.
 */

public class FirstFragment extends Fragment implements OnClickListener {

    private static final String TAG = "Error";
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_first,container,false);

        button=(Button)view.findViewById(R.id.button);
        button.setOnClickListener(this);
        //Log.d(TAG, "onCreateView: "+fragmentManager.toString());
        return view;

    }

    public void FirstFragment(){

    }


    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SecondFragment secondFragment=new SecondFragment();
        fragmentTransaction.replace(R.id.fragment,secondFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
