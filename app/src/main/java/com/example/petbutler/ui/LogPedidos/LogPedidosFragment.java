package com.example.petbutler.ui.LogPedidos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.petbutler.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogPedidosFragment extends Fragment {


    public LogPedidosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_log_pedidos, container, false);

        ListView logPedidos = root.findViewById(R.id.listView_logPedidos);

        final ArrayList<String> alLog = new ArrayList<>();
        String serv1 = "Entrega de ração para cachorro\n12/10/2019", serv2 = "Passeio\n07/10/2019", serv3 = "Atendimento de emergência\n03/10/2019",
            serv4 = "Hospedagem\n17/09/2019 - 1/10/2019", serv5 = "Transporte até o veterinário\n11/09/2019";

        alLog.add(serv1);
        alLog.add(serv2);
        alLog.add(serv3);
        alLog.add(serv4);
        alLog.add(serv5);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, alLog);
        logPedidos.setAdapter(adapter);



        return root;
    }

}
