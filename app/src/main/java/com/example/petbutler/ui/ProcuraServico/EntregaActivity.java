package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.petbutler.R;

public class EntregaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrega);

        getSupportActionBar().setTitle("Pesquisar produto");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText editTextComprar = findViewById(R.id.editTextComprar);
        final EditText editTextProduto = findViewById(R.id.editTextProduto);
        final EditText editTextEntrega = findViewById(R.id.editTextEntrega);
        final Button buttonConfirmEntrega = findViewById(R.id.buttonConfirmEntrega);

        buttonConfirmEntrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
