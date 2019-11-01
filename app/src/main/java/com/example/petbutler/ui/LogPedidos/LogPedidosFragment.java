package com.example.petbutler.ui.LogPedidos;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.Classes.Servicos.Endereco;
import com.example.petbutler.ui.Classes.Servicos.Entrega;
import com.example.petbutler.ui.Classes.Servicos.Servico;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogPedidosFragment extends Fragment implements Serializable {


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

        //objetos criados para testes (pegar valore reais do BD)
        Endereco end1 = new Endereco("80045355",330,null, "PR","Curitiba",null);
        GregorianCalendar data = new GregorianCalendar(1998,12,27);
        Animal ghost = new Animal("Ghost", "matador de white-walers", "Cachorro", 48.1, "grande",data,null);
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Não sabe de nada",4.6,null,null);
        Butler jayme = new Butler("Jayme Lannister","JLannister","lovemysister","000000001", "ringslayer@lannister.com",
                "Não tem a mão direita",3.7,null,null);

        final ArrayList<Servico> alServicos = new ArrayList<>();
        final Entrega serv6 = new Entrega(5,new GregorianCalendar(2019,9,25),4.7,4.7,4.7,end1,"concluído",
                JonSnow,jayme,ghost,"Entrega","Entrega de osso comprado no PetShop","Osso");

        alLog.add(serv1);
        alLog.add(serv2);
        alLog.add(serv3);
        alLog.add(serv4);
        alLog.add(serv5);
        alLog.add(serv6.toString());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, alLog);
        logPedidos.setAdapter(adapter);


        logPedidos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "" + i, Toast.LENGTH_SHORT).show();

                if(i == 5){ //para testes -> trocar if por get pelo id (fazer um array de serviços)
                    Intent consultaServicoIntent = new Intent(getActivity(), ConsultaServicoActivity.class);
                    consultaServicoIntent.putExtra("SERVICO_ID",serv6.getId());
                    startActivity(consultaServicoIntent);
                }

            }
        });


        return root;
    }

}
