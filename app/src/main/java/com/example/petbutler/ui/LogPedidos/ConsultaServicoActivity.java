package com.example.petbutler.ui.LogPedidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

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

        final EditText etCliente = findViewById(R.id.et_ClienteNome);
        final EditText etButler = findViewById(R.id.et_ButlerNome);
        final EditText etAnimal = findViewById(R.id.et_AnimalNome);
        final EditText etTipo = findViewById(R.id.et_Tipo);
        final EditText etEndereco = findViewById(R.id.et_Endereco);
        final EditText etValor = findViewById(R.id.et_Valor);

        //Bloqueia os Edit texts:
        etCliente.setEnabled(false);
        etCliente.setClickable(false);

        etButler.setEnabled(false);
        etButler.setClickable(false);

        etAnimal.setEnabled(false);
        etAnimal.setClickable(false);

        etTipo.setEnabled(false);
        etTipo.setClickable(false);

        etEndereco.setEnabled(false);
        etEndereco.setClickable(false);

        etValor.setEnabled(false);
        etValor.setClickable(false);

        Intent logPedidosIntent = getIntent();
        int ServicoID = (int) logPedidosIntent.getSerializableExtra("SERVICO_ID");
        //puxar do BD objeto com mesmo ID

        //para testes:
        if (ServicoID == 5){
            Endereco end1 = new Endereco("80045355",330,null, "PR","Curitiba",null);
            GregorianCalendar data = new GregorianCalendar(1998,12,27);
            Animal ghost = new Animal("Ghost", "good boy", "Cachorro", 48.1, "grande", "matador de white-walers",data,null);
            Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000","Não sabe de nada",4,null,null);
            Butler jayme = new Butler("Jayme Lannister","JLannister","lovemysister","000000001","Não tem a mão direita",2,null,null);
            final Entrega servico = new Entrega(5,new GregorianCalendar(2019,9,25),4.7,4.7,4.7,end1,"concluído",
                    JonSnow,jayme,ghost,"Entrega","Entrega de osso comprado no PetShop","Osso");

            etCliente.setText(servico.getCliente().getNome());
            etButler.setText(servico.getButler().getNome());
            etAnimal.setText(servico.getAnimal().getNome());
            etTipo.setText(servico.getDescricao());
            etEndereco.setText(servico.getEndereco().toString());
            //etValor.setText("" + servico.getPreco());
            etValor.setText("R$15,00"); //apenas exemplo

        }




    }
}
