package com.example.manrique_matus.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Manrique_Matus on 008/8/4/2018.
 */

public class SecondFragment extends Fragment implements OnClickListener{
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_second,container,false);

        button=(Button)view.findViewById(R.id.button);
        button.setOnClickListener(this);
        return view;
    }

    public void SecondFragment(){

    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment=new FirstFragment();
        fragmentTransaction.replace(R.id.fragment,firstFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
