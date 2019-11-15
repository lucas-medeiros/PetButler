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
import com.example.petbutler.ui.Classes.Pessoa.Butler;

public class AvaliacaoButlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_butler);

        getSupportActionBar().setTitle("Avaliação do Butler");

        final TextView tvNomeButler = findViewById(R.id.tvNomeButler);
        final RatingBar ratingBarNotaButler = findViewById(R.id.ratingBar_notaButler);
        final EditText etComentarioButler = findViewById(R.id.etComentarioButler);
        final Button bAvaliar = findViewById(R.id.button_AvaliarButler);

        ratingBarNotaButler.setRating(5);

        //só pra teste - pegar do BD
        Butler Jaime = new Butler("Jaime Lannister","Jaime","lovemysister","000000001", "ringslayer@lannister.com",
                "Kingslayer",3.7,null,null);

        tvNomeButler.setText(Jaime.getNome());

        bAvaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etComentarioButler.getText().toString().isEmpty() && ratingBarNotaButler.getRating() < 1){
                    Toast.makeText(getApplicationContext(),"Por favor, nos deixe um comentário nos contando um pouco sobre sua experiência",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Avaliação registrada com sucesso",Toast.LENGTH_SHORT).show();
                    //salvar as info no BD
                }
            }
        });
    }
}
