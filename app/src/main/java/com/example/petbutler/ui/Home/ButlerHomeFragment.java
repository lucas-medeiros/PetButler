package com.example.petbutler.ui.Home;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Servicos.Entrega;
import com.example.petbutler.ui.Classes.Servicos.Servico;
import com.example.petbutler.ui.Perfil.PerfilAnimalActivity;

import java.util.ArrayList;

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

        final ArrayList<String> alServ = new ArrayList<>();
        String serv1 = "Entrega Ração", serv2 = "Passeio", serv3 = "Hospedagem", serv4 = "Entrega Coleira";
        alServ.add(serv1);
        alServ.add(serv2);
        alServ.add(serv3);
        alServ.add(serv4);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, alServ);



        final ListView ServList= root.findViewById(R.id.listView_servlist);
        ServList.setAdapter(adapter);
        //ServList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

         //   @Override
           // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //   Intent intent = new Intent(getActivity(), PerfilAnimalActivity.class);
               // startActivity(intent);
            //}
        //});
        return root;
    }

}
