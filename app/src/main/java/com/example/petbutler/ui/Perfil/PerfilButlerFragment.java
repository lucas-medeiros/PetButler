package com.example.petbutler.ui.Perfil;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.EditarPerfil.EditarPerfilButlerActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilButlerFragment extends Fragment {


    public PerfilButlerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_perfil_butler, container, false);


        final ImageButton imageButton_editarPerfilButler = root.findViewById(R.id.imageButton_editarPerfilButler);
        final ImageView fotoPerfil = root.findViewById(R.id.imageView_fotoPerfilButler);
        final EditText etNome = root.findViewById(R.id.et_nomeButler);
        final EditText etSobrenome = root.findViewById(R.id.et_sobrenomeButler);
        final EditText etEmail = root.findViewById(R.id.et_emailButler);
        final EditText etUsuario = root.findViewById(R.id.et_usuarioButler);
        final EditText etTelefone = root.findViewById(R.id.et_telefoneButler);
        final EditText etResumo = root.findViewById(R.id.et_resumoButler);
        final EditText etCRMV = root.findViewById(R.id.et_crmv);
        final TextView tv_notaButler = root.findViewById(R.id.tv_notaButler);
        final ListView ServicoList = root.findViewById(R.id.listView_servicolist);


        final ArrayList<String> a1serv = new ArrayList<>();
        String serv1 = "Hotel Pássaros Felizes", serv2 = "Clínica Pet Saudável", serv3 = "Petshop Nekomamushi";
        a1serv.add(serv1);
        a1serv.add(serv2);
        a1serv.add(serv3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, a1serv);
        ServicoList.setAdapter(adapter);

        //EditText SETUP:
        etNome.setClickable(false);
        etNome.setEnabled(false);
        //etNome.setText(""); PEGAR DADOS DO BD?

        etSobrenome.setClickable(false);
        etSobrenome.setEnabled(false);

        etCRMV.setClickable(false);
        etCRMV.setEnabled(false);

        etEmail.setClickable(false);
        etEmail.setEnabled(false);


        etUsuario.setClickable(false);
        etUsuario.setEnabled(false);

        etTelefone.setClickable(false);
        etTelefone.setEnabled(false);

        etResumo.setClickable(false);
        etResumo.setEnabled(false);

        tv_notaButler.setText("4.97"); //exemplo, pegar nota no BD

        imageButton_editarPerfilButler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editarPerfilBIntent = new Intent(getActivity(), EditarPerfilButlerActivity.class);
                startActivity(editarPerfilBIntent);
            }
        });

        return root;
    }

}
