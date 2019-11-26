package com.example.petbutler.ui.ProcuraServico;

/*In progress*/
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.Classes.Pessoa.Telefone;
import com.example.petbutler.ui.Classes.Servicos.Endereco;
import com.example.petbutler.ui.Classes.Servicos.Transporte;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class TransporteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte);

        getSupportActionBar().setTitle("Pesquisar entregador");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText etEnderecoTransporte = findViewById(R.id.editTextEnderecoTransporte);
        final EditText etTempoTransporte = findViewById(R.id.editTextTempoTransporte);
        final RadioGroup etRadioGroupTransporte = findViewById(R.id.radioGroupPets);
        final RadioButton radioButtonCachorroTransporte = findViewById(R.id.radioButtonCachorroTransporte);
        final RadioButton radioButtonPassaroTransporte = findViewById(R.id.radioButtonPassaroTransporte);
        final RadioButton radioButtonGatoTransporte = findViewById(R.id.radioButtonGatoTransporte);
        final ListView ListViewTransporte = findViewById(R.id.transporteList);
        final Button buttonConfirmaTransporte = findViewById(R.id.buttonConfirmTransporte);

        final ArrayList<String> a1transporte = new ArrayList<>();
        String transportador1 = "Jaime Lannister", transportador2 = "Sandor Clagane", transportador3 = "Eddard Stark";
        a1transporte.add(transportador1);
        a1transporte.add(transportador2);
        a1transporte.add(transportador3);

        Endereco endereco = new Endereco("80045355",330,null, "PR","Curitiba",null);
        GregorianCalendar data = new GregorianCalendar(1998,12,27);
        Animal ghost = new Animal("Ghost", "matador de white-walers", "Cachorro", "48.3", "grande",5.0,data,null);
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Lord Commander of the Night's Watch",4.6,null,new Telefone("041","123456789"));
        Butler Jaime = new Butler("Jaime Lannister","jaime","lovemysister","000000001", "ringslayer@lannister.com",
                "Kingslayer",3.7,null,null);
        final Transporte trans = new Transporte(0,data,4.8,5.0,4.9,endereco,"não concluído",JonSnow,Jaime,ghost);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1transporte);
        ListViewTransporte.setAdapter(adapter);

        ListViewTransporte.setVisibility(View.INVISIBLE);

        buttonConfirmaTransporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etRadioGroupTransporte.getCheckedRadioButtonId() == -1 || etEnderecoTransporte.getText().toString().isEmpty() ||
                        etTempoTransporte.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Pesquisa concluída", Toast.LENGTH_SHORT).show();
                    ListViewTransporte.setVisibility(View.VISIBLE);
                }
            }
        });

        ListViewTransporte.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seu pedido foi enviado para o butler " + a1transporte.get(i) + "\nPor favor espere a resposta do butler",Toast.LENGTH_LONG).show();
                if(i == 0){
                    Intent intentConsultaTransporte = new Intent(getApplicationContext(),ConsultaTransporteActivity.class);
                    intentConsultaTransporte.putExtra("HOTEL_ID",trans.getId());
                    startActivity(intentConsultaTransporte);
                }
            }
        });


    }

}
