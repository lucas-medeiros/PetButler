package com.example.petbutler.ui.Options;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.R;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        getSupportActionBar().setTitle("Feedback");

        final TextView tvFeedback = findViewById(R.id.tv_feedback);
        final EditText etFeedback = findViewById(R.id.et_feedback);
        final TextView tvAvaliacao = findViewById(R.id.tv_avaliacao);
        Button bEnviarFeedback = findViewById(R.id.b_enviarFeedback);
        final RatingBar ratingBar_AvaliacaoApp = findViewById(R.id.ratingBar_avaliacaoApp);
        final TextView tvAvaliacaoEscala = findViewById(R.id.tv_AvaliacaoEscala);

        final String text1 = "Está com dificuldades?\nSe sinta a vontade para nos enviar dúvidas ou reportar problemas do aplicativo\n" +
                "\nObrigado por nos ajudar a melhorar!", text2 = "Você também avaliar sua experiência com o aplicativo:";
        tvFeedback.setText(text1);
        tvAvaliacao.setText(text2);
        etFeedback.setLines(3);
        ratingBar_AvaliacaoApp.setRating(5);
        tvAvaliacaoEscala.setText("Incrível, adorei!");

        ratingBar_AvaliacaoApp.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tvAvaliacaoEscala.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        tvAvaliacaoEscala.setText("Muito ruim");
                        break;
                    case 2:
                        tvAvaliacaoEscala.setText("Precisa de melhorias");
                        break;
                    case 3:
                        tvAvaliacaoEscala.setText("Boa");
                        break;
                    case 4:
                        tvAvaliacaoEscala.setText("Ótima");
                        break;
                    case 5:
                        tvAvaliacaoEscala.setText("Incrível, adorei!");
                        break;
                    default:
                        tvAvaliacaoEscala.setText("");
                        break;
                }
            }
        });

        bEnviarFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Comentário enviado com sucesso\nObrigado!",Toast.LENGTH_SHORT).show();
                String feedback = etFeedback.getText().toString();
                float nota = ratingBar_AvaliacaoApp.getRating();
                //salvar feedback no BD


                etFeedback.setText("");
                ratingBar_AvaliacaoApp.setRating(5);
                tvAvaliacaoEscala.setText("Incrível, adorei!");

            }
        });


    }
}
