package com.example.petbutler.ui.Options;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.R;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        getSupportActionBar().setTitle("Relatar um problema");

        TextView tvFeedback = findViewById(R.id.tv_feedback);
        final EditText etFeedback = findViewById(R.id.et_feedback);
        Button bEnviarFeedback = findViewById(R.id.b_enviarFeedback);

        final String text = "Esta com dificuldades?\nSe sinta a vontade para nos enviar dúvidas ou reportar problemas do aplicativo\n" +
                "\nObrigado por nos ajudar a melhorar!";
        tvFeedback.setText(text);

        bEnviarFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Comentário enviado com sucesso\nObrigado!",Toast.LENGTH_SHORT).show();
                String feedback = etFeedback.getText().toString();
                //salvar feedback no BD
            }
        });


    }
}
