package com.example.petbutler.ui.Pagamento;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Global.Global;

/**
 * A simple {@link Fragment} subclass.
 */
public class PagamentoFragment extends Fragment {


    public PagamentoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_pagamento, container, false);

        if(isCliente()){ //se for cliente
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.nav_host_fragment,new PagamentoClienteFragment()).commit();

        } else { //se for butler
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.nav_host_fragment,new PagamentoButlerFragment()).commit();
        }

        return root;
    }

    public boolean isCliente(){ //retorna TRUE se for um cliente e FALSE se for um butler
        //pegar tag no BD
        return Global.usuario.isCliente();
    }

}
