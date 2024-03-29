package com.example.petbutler.ui.Perfil;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Telefone;
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
        final TextView tvNome = root.findViewById(R.id.et_nomeButler);
        final TextView tvSobrenome = root.findViewById(R.id.et_sobrenomeButler);
        final TextView tvEmail = root.findViewById(R.id.et_emailButler);
        final TextView tvUsuario = root.findViewById(R.id.et_usuarioButler);
        final TextView tvTelefone = root.findViewById(R.id.et_telefoneButler);
        final TextView tvResumo = root.findViewById(R.id.et_resumoButler);
        final TextView tvCRMV = root.findViewById(R.id.et_crmv);
        final TextView tv_notaButler = root.findViewById(R.id.tv_notaButler);
        final ListView ServicoList = root.findViewById(R.id.listView_servicolist);


        final ArrayList<String> a1serv = new ArrayList<>();
        String serv1 = "Hotel Pássaros Felizes", serv2 = "Clínica Pet Saudável", serv3 = "Petshop Nekomamushi";
        a1serv.add(serv1);
        a1serv.add(serv2);
        a1serv.add(serv3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, a1serv);
        ServicoList.setAdapter(adapter);

        //teste:
        Butler jaime = new Butler("Jaime Lannister","jaime","lovemysister","000000001", "ringslayer@lannister.com",
                "Kingslayer",3.7,null,new Telefone("041","987654321"));
        jaime.setCRMV("1234-PR");
        tvNome.setText(jaime.getNome().substring(0,jaime.getNome().indexOf(" ")+1));
        tvSobrenome.setText(jaime.getNome().substring(jaime.getNome().indexOf(" ")+1));
        tvEmail.setText(jaime.getEmail());
        tvUsuario.setText(jaime.getLogin());
        tvTelefone.setText(jaime.getTelefone().toString());
        tvResumo.setText(jaime.getResumo());
        tvCRMV.setText(jaime.getCRMV());
        //fotoPerfil... colocar foto de perfil

        tv_notaButler.setText(""+jaime.getNota());

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
