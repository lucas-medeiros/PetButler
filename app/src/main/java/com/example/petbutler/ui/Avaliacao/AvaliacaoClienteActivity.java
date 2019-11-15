package com.example.petbutler.ui.Avaliacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.Classes.Pessoa.Telefone;

import java.util.GregorianCalendar;

public class AvaliacaoClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_cliente);

        getSupportActionBar().setTitle("Avaliação do Cliente");

        final TextView tvNomeCliente = findViewById(R.id.tvNomeCliente);
        final RatingBar ratingBarNotaCliente = findViewById(R.id.ratingBar_notaCliente);
        final EditText etComentarioCliente = findViewById(R.id.etComentarioCliente);
        final TextView tvNomePet = findViewById(R.id.tvNomePet);
        final RatingBar ratingBarNotaPet = findViewById(R.id.ratingBar_notaPet);
        final EditText etComentarioPet = findViewById(R.id.etComentarioPet);
        final Button bAvaliar = findViewById(R.id.button_AvaliarCliente);

        ratingBarNotaCliente.setRating(5);
        ratingBarNotaPet.setRating(5);

        //só pra teste - pegar do BD
        GregorianCalendar data = new GregorianCalendar(2011,3,17);
        Animal Ghost = new Animal("Ghost", "Matador de white-walkers", "Cachorro", "48.1", "Grande",5.0,data,null);
        Cliente JonSnow = new Cliente("Jon Snow","jonsnow","winter","000000000", "jonsnow@nigthswatch.com",
                "Lord Commander of the Night's Watch",4.9,null,new Telefone("041","123456789"));

        tvNomeCliente.setText(JonSnow.getNome());
        tvNomePet.setText(Ghost.getNome());

        bAvaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((etComentarioCliente.getText().toString().isEmpty() && ratingBarNotaCliente.getRating() < 1) ||
                        (etComentarioPet.getText().toString().isEmpty() && ratingBarNotaPet.getRating() < 1)){
                    Toast.makeText(getApplicationContext(),"Por favor, nos deixe um comentário nos contando um pouco sobre sua experiência",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Avaliação registrada com sucesso",Toast.LENGTH_SHORT).show();
                    //salvar as info no BD
                }
            }
        });
    }
}
