package com.example.petbutler.ui.LogPedidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.Classes.Servicos.Endereco;
import com.example.petbutler.ui.Classes.Servicos.Entrega;
import com.example.petbutler.ui.Classes.Servicos.Servico;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ConsultaServicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_servico);

        getSupportActionBar().setTitle("Consultar Serviço");

        final TextView tvCliente = findViewById(R.id.et_ClienteNome);
        final TextView tvButler = findViewById(R.id.et_ButlerNome);
        final TextView tvAnimal = findViewById(R.id.et_AnimalNome);
        final TextView tvTipo = findViewById(R.id.et_Tipo);
        final TextView tvEndereco = findViewById(R.id.et_Endereco);
        final TextView tvValor = findViewById(R.id.et_Valor);


        Intent logPedidosIntent = getIntent();
        int ServicoID = (int) logPedidosIntent.getSerializableExtra("SERVICO_ID");
        //puxar do BD objeto com mesmo ID

        //para testes:
        if (ServicoID == 5){
            Endereco end1 = new Endereco("80045355",330,null, "PR","Curitiba",null);
            GregorianCalendar data = new GregorianCalendar(1998,12,27);
            Animal ghost = new Animal("Ghost", "matador de white-walers", "Cachorro", 48.1, "grande",data,null);
            Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                    "Não sabe de nada",4.6,null,null);
            Butler jayme = new Butler("Jaime Lannister","JLannister","lovemysister","000000001", "ringslayer@lannister.com",
                    "Não tem a mão direita",3.7,null,null);
            final Entrega servico = new Entrega(5,new GregorianCalendar(2019,9,25),4.7,4.7,4.7,end1,"concluído",
                    JonSnow,jayme,ghost,"Entrega","Entrega de osso comprado no PetShop","Osso");

            tvCliente.setText(servico.getCliente().getNome());
            tvButler.setText(servico.getButler().getNome());
            tvAnimal.setText(servico.getAnimal().getNome());
            tvTipo.setText(servico.getDescricao());
            tvEndereco.setText(servico.getEndereco().toString());
            //tvValor.setText("" + servico.getPreco());
            tvValor.setText("R$15,00"); //apenas exemplo

        }




    }
}
