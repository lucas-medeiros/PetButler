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
import com.example.petbutler.ui.Classes.Servicos.Transporte;

import java.util.GregorianCalendar;

public class ConsultaTransporteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_transporte);

        getSupportActionBar().setTitle("Consultar Transporte");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final TextView tvConsultaTransporte = findViewById(R.id.tv_ConsultaTransporte);

        Endereco end1 = new Endereco("80045355",330,null, "PR","Curitiba",null);
        GregorianCalendar data = new GregorianCalendar(1998,12,27);
        Animal ghost = new Animal("Ghost", "matador de white-walers", "Cachorro", "48.3", "grande",5.0,data,null);
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Lord Commander of the Night's Watch",4.6,null,new Telefone("041","123456789"));
        Butler Jaime = new Butler("Jaime Lannister","jaime","lovemysister","000000001", "ringslayer@lannister.com",
                "Kingslayer",3.7,null,null);

        final Transporte trans = new Transporte(0,data,4.8,5.0,4.9,end1,"não concluído",JonSnow,Jaime,ghost);

        String text = "Transportador\n\nButler responsável: " + Jaime.getNome() + " (" + Jaime.getNota() + ")\n"
                + "Status do transporte: " + trans.getStatus();
        tvConsultaTransporte.setText(text);
    }
}
