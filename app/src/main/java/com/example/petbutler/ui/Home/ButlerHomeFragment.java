package com.example.petbutler.ui.Home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petbutler.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButlerHomeFragment extends Fragment {


    public ButlerHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_butler_home, container, false);

        return root;
    }

}
