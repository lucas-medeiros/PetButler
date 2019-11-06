package com.example.petbutler.ui.Pagamento;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Global.Global;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

/**
 * A simple {@link Fragment} subclass.
 */
public class PagamentoClienteFragment extends Fragment {


    public PagamentoClienteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_pagamento_cliente, container, false);

        final TextView tvCartao = root.findViewById(R.id.tv_cartao);
        final RadioGroup radioGroupPagamentoCliente = root.findViewById(R.id.radioGroupPagamentoCliente);
        final RadioButton radioButton_Dinheiro = root.findViewById(R.id.radioButton_Dinheiro);
        final RadioButton radioButton_Cartao = root.findViewById(R.id.radioButton_Cartao);
        final Button button_addCartao = root.findViewById(R.id.button_addCartao);

        Cliente cliente = (Cliente) Global.usuario;
        if(cliente.getCartao() == null){
            tvCartao.setText("Você não possui nenhum \ncartão cadastrado");
        } else {
            tvCartao.setText(cliente.getCartao().toString());
        }

        button_addCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para tela de adicionar cartão (ou nessa tela mesmo?)
            }
        });


        return root;
    }

}
