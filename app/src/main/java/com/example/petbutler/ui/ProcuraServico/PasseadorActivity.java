package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.petbutler.R;

import java.util.ArrayList;

public class PasseadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passeador);

        getSupportActionBar().setTitle("Pesquisar passeador");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText editTextEstadoPasseador = findViewById(R.id.editTextEstadoPasseador);
        final EditText editTextCidadePasseador = findViewById(R.id.editTextCidadePasseador);
        final EditText editTextBairroPasseador = findViewById(R.id.editTextBairroPasseador);
        final RadioGroup radioGroupPasseador = findViewById(R.id.radioGroupPasseador);
        final RadioButton radioButtonCachorroPasseador = findViewById(R.id.radioButtonCachorroPasseador);
        final RadioButton radioButtonPassaroPasseador = findViewById(R.id.radioButtonPassaroPasseador);
        final RadioButton radioButtonGatoPasseador = findViewById(R.id.radioButtonGatoPasseador);
        final ListView listViewPasseador = findViewById(R.id.listViewPasseador);
        final Button buttonConfirmPasseador = findViewById(R.id.buttonConfirmPasseador);

        final ArrayList<String> alpasseador = new ArrayList<>();
        String passeador1 = "Goku", passeador2 = "Vegeta", passeador3 = "Gohan";
        alpasseador.add(passeador1);
        alpasseador.add(passeador2);
        alpasseador.add(passeador3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alpasseador);
        listViewPasseador.setAdapter(adapter);

        buttonConfirmPasseador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
