package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.petbutler.R;

public class EntregaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrega);

        getSupportActionBar().setTitle("Pesquisar produto");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText etComprar = findViewById(R.id.editTextComprar);
        final EditText etProduto = findViewById(R.id.editTextProduto);
        final EditText etEntrega = findViewById(R.id.editTextEntrega);
        final Button buttonConfirmEntrega = findViewById(R.id.buttonConfirmEntrega);

        buttonConfirmEntrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etEntrega.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(),"Insira o endereço de entrega",Toast.LENGTH_SHORT).show();
                else if(etComprar.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(),"Insira o produto que deseja comprar",Toast.LENGTH_SHORT).show();
                else{
                    //fazer chamado no BD dps
                    //apenas para teste:
                    if (etProduto.getText().toString().compareTo("ração") == 0){
                        Toast.makeText(getApplicationContext(),"Pedido realizado com sucesso, aguarde enquanto um butler aceita seu pedido",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(),"Não foi possível encontrar o produto que deseja comprar",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}
