package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

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
import com.example.petbutler.ui.Classes.Servicos.Hotel;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        getSupportActionBar().setTitle("Pesquisar hotel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText etEstadoHotel = findViewById(R.id.editTextEstadoHotel);
        final EditText etCidadeHotel = findViewById(R.id.editTextCidadeHotel);
        final EditText etBairroHotel = findViewById(R.id.editTextBairroHotel);
        final RadioGroup radioGroupHotel = findViewById(R.id.radioGroupHotel);
        final RadioButton radioButtonCachorroHotel = findViewById(R.id.radioButtonCachorroHotel);
        final RadioButton radioButtonPassaroHotel = findViewById(R.id.radioButtonPassaroHotel);
        final RadioButton radioButtonGatoHotel = findViewById(R.id.radioButtonGatoHotel);
        final ListView listViewHotel = findViewById(R.id.listViewHotel);
        final Button buttonConfirmHotel = findViewById(R.id.buttonConfirmHotel);

        final ArrayList<String> a1hotel = new ArrayList<>();
        String hotel1 = "Grand Plaza", hotel2 = "Mon Calamari", hotel3 = "Knowhere";
        a1hotel.add(hotel1);
        a1hotel.add(hotel2);
        a1hotel.add(hotel3);

        Endereco end1 = new Endereco("80045355",330,null, "PR","Curitiba",null);
        GregorianCalendar data = new GregorianCalendar(1998,12,27);
        Animal ghost = new Animal("Ghost", "matador de white-walers", "Cachorro", "48.3", "grande",5.0,data,null);
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Lord Commander of the Night's Watch",4.6,null,new Telefone("041","123456789"));
        Butler Jaime = new Butler("Jaime Lannister","jaime","lovemysister","000000001", "ringslayer@lannister.com",
                "Kingslayer",3.7,null,null);

        final Hotel grandPlaza = new Hotel(0,data,4.8,5.0,4.9,end1,"não concluído",JonSnow,Jaime,ghost,10);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1hotel);
        listViewHotel.setAdapter(adapter);

        listViewHotel.setVisibility(View.INVISIBLE);

        buttonConfirmHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioGroupHotel.getCheckedRadioButtonId() == -1 || etEstadoHotel.getText().toString().isEmpty() ||
                        etCidadeHotel.getText().toString().isEmpty() || etBairroHotel.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Pesquisa concluída", Toast.LENGTH_SHORT).show();
                    listViewHotel.setVisibility(View.VISIBLE);
                }
            }
        });

        listViewHotel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intentConsultaHotel = new Intent(getApplicationContext(),ConsultaHotelActivity.class);
                    intentConsultaHotel.putExtra("HOTEL_ID",grandPlaza.getId());
                    startActivity(intentConsultaHotel);
                }
            }
        });

    }
}
