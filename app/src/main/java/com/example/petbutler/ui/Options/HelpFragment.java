package com.example.petbutler.ui.Options;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.petbutler.R;
import com.example.petbutler.ui.LogPedidos.ConsultaServicoActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelpFragment extends Fragment {


    public HelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_help, container, false);

        ListView listView_help = root.findViewById(R.id.listView_help);

        final ArrayList<String> alHelp = new ArrayList<>();

        String sobre = "Sobre", version = "Versão\n1.0.0", feedback = "Relatar um problema";
        alHelp.add(sobre);
        alHelp.add(version);
        alHelp.add(feedback);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, alHelp);
        listView_help.setAdapter(adapter);


        listView_help.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "" + i, Toast.LENGTH_SHORT).show();

                if(i == 0){
                    Intent aboutIntent = new Intent(getActivity(), AboutActivity.class);
                    startActivity(aboutIntent);
                }

            }
        });

        return root;
    }

}
