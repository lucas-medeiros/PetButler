package com.example.petbutler.ui.Pagamento;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Global.Global;
import com.example.petbutler.ui.Classes.Pessoa.Butler;

/**
 * A simple {@link Fragment} subclass.
 */
public class PagamentoButlerFragment extends Fragment {


    public PagamentoButlerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_pagamento_butler, container, false);

        TextView tvConta = root.findViewById(R.id.tv_conta);
        Button button_addConta = root.findViewById(R.id.button_addConta);

        Butler butler = (Butler) Global.usuario;
        if(butler.getConta() == null){
            tvConta.setText("Você não possui nenhuma \nconta cadastrada");
        } else {
            tvConta.setText(butler.getCPF() + "\n" + butler.getConta().toString());
        }

        button_addConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para tela de adicionar conta
                Intent addContaIntent = new Intent(getActivity(), AddContaActivity.class);
                startActivity(addContaIntent);
            }
        });

        return root;
    }

}
