package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.Classes.Pessoa.Telefone;
import com.example.petbutler.ui.Classes.Servicos.Endereco;
import com.example.petbutler.ui.Classes.Servicos.Hotel;

import java.util.GregorianCalendar;

public class ConsultaHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_hotel);

        getSupportActionBar().setTitle("Consultar Hotel");

        final TextView tvConsultaHotel = findViewById(R.id.tv_ConsultaHotel);

        Endereco end1 = new Endereco("80045355",330,null, "PR","Curitiba",null);
        GregorianCalendar data = new GregorianCalendar(1998,12,27);
        Animal ghost = new Animal("Ghost", "matador de white-walers", "Cachorro", "48.3", "grande",5.0,data,null);
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Lord Commander of the Night's Watch",4.6,null,new Telefone("041","123456789"));
        Butler Jaime = new Butler("Jaime Lannister","jaime","lovemysister","000000001", "ringslayer@lannister.com",
                "Kingslayer",3.7,null,null);

        final Hotel grandPlaza = new Hotel(0,data,4.8,5.0,4.9,end1,"não concluído",JonSnow,Jaime,ghost,10);

        String text = "Grand Plaza Hotel\n\nButler responsável: " + Jaime.getNome() + " (" + Jaime.getNota() + ")\n"
                + "Tempo de estadia máxima: " + grandPlaza.getEstadia() + " dias" + "\nAceita todos os tipos de animais" + "\n";
        tvConsultaHotel.setText(text);


    }
}
