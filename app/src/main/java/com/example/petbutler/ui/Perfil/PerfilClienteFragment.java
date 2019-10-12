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
import com.example.petbutler.ui.EditarPerfil.EditarPerfilClienteActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilClienteFragment extends Fragment {


    public PerfilClienteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_perfil_cliente, container, false);

        final ImageButton imageButton_editarPerfil = root.findViewById(R.id.imageButton_editarPerfil);
        final ImageButton imageButton_addPet = root.findViewById(R.id.imageButton_addPet);
        final TextView tv_notaCliente = root.findViewById(R.id.tv_nota);
        final EditText etNome = root.findViewById(R.id.et_nome);
        final EditText etSobrenome = root.findViewById(R.id.et_sobrenome);
        final EditText etEmail = root.findViewById(R.id.et_email);
        final EditText etUsuario = root.findViewById(R.id.et_usuario);
        final EditText etTelefone = root.findViewById(R.id.et_telefone);
        final EditText etResumo = root.findViewById(R.id.et_resumo);
        final ListView PetList = root.findViewById(R.id.listView_petlist);
        final ImageView fotoPerfil = root.findViewById(R.id.imageView_fotoPerfil);

        //para teste de visualização:
        final ArrayList<String> alPets = new ArrayList<>();
        String pet1 = "Ghost", pet2 = "Summer", pet3 = "Nymeria", pet4 = "Lady";
        alPets.add(pet1);
        alPets.add(pet2);
        alPets.add(pet3);
        alPets.add(pet4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, alPets);
        PetList.setAdapter(adapter);

        //EditText SETUP:
        etNome.setClickable(false);
        etNome.setEnabled(false);
        //etNome.setText(""); PEGAR DADOS DO BD?

        etSobrenome.setClickable(false);
        etSobrenome.setEnabled(false);


        etEmail.setClickable(false);
        etEmail.setEnabled(false);


        etUsuario.setClickable(false);
        etUsuario.setEnabled(false);

        etTelefone.setClickable(false);
        etTelefone.setEnabled(false);

        etResumo.setClickable(false);
        etResumo.setEnabled(false);


        tv_notaCliente.setText("4.97"); //exemplo, pegar nota no BD


        imageButton_editarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent editarPerfilIntent = new Intent(getActivity(), EditarPerfilClienteActivity.class);
                startActivity(editarPerfilIntent);

            }
        });


        imageButton_addPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return root;
    }

}
