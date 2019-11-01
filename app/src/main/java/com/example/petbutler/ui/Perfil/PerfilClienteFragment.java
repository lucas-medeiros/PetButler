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
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.Classes.Pessoa.Telefone;
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
        final TextView tvNome = root.findViewById(R.id.et_nome);
        final TextView tvSobrenome = root.findViewById(R.id.et_sobrenome);
        final TextView tvEmail = root.findViewById(R.id.et_email);
        final TextView tvUsuario = root.findViewById(R.id.et_usuario);
        final TextView tvTelefone = root.findViewById(R.id.et_telefone);
        final TextView tvResumo = root.findViewById(R.id.et_resumo);
        final ListView PetList = root.findViewById(R.id.listView_petlist);
        final ImageView fotoPerfil = root.findViewById(R.id.imageView_fotoPerfil);

        //para teste de visualização:
        final ArrayList<String> alPets = new ArrayList<>();
        String pet1 = "Ghost", pet2 = "Summer", pet3 = "Nymeria", pet4 = "Lady";
        alPets.add(pet1);
        alPets.add(pet2);
        alPets.add(pet3);
        alPets.add(pet4);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, alPets);
        PetList.setAdapter(adapter);

        tv_notaCliente.setText("4.97"); //exemplo, pegar nota no BD

        //teste:
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Lord Commander of the Night's Watch",4.6,null,new Telefone("041","123456789"));
        Cliente lucas = new Cliente("Lucas Medeiros","lucas","1234","06376186963", "lucascarmed@gmail.com",
                "Eu gosto muito de churros!",4.7,null,new Telefone("041","998390804"));

        tvNome.setText(JonSnow.getNome().substring(0,JonSnow.getNome().indexOf(" ")+1));
        tvSobrenome.setText(JonSnow.getNome().substring(JonSnow.getNome().indexOf(" ")+1));
        tvEmail.setText(JonSnow.getEmail());
        tvUsuario.setText(JonSnow.getLogin());
        tvTelefone.setText(JonSnow.getTelefone().toString());
        tvResumo.setText(JonSnow.getResumo());
        //fotoPerfil... colocar foto de perfil

        /*
        tvNome.setText(lucas.getNome().substring(0,lucas.getNome().indexOf(" ")+1));
        tvSobrenome.setText(lucas.getNome().substring(lucas.getNome().indexOf(" ")+1));
        tvEmail.setText(lucas.getEmail());
        tvUsuario.setText(lucas.getLogin());
        tvTelefone.setText(lucas.getTelefone().toString());
        tvResumo.setText(lucas.getResumo());
        */



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
