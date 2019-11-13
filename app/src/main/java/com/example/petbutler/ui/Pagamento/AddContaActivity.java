package com.example.petbutler.ui.Pagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Global.Global;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Conta;
import com.example.petbutler.ui.MenuLateral.MenuLateralActivity;

public class AddContaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_conta);

        getSupportActionBar().setTitle("Adicionar Conta");

        final EditText etNumConta = findViewById(R.id.et_NumConta);
        final EditText etDigitoConta = findViewById(R.id.et_ContaDigito);
        final EditText etNumAgencia = findViewById(R.id.et_NumAgencia);
        final EditText etDigitoAgencia = findViewById(R.id.et_AgenciaDigito);
        final Button bAddConta = findViewById(R.id.button_ConfirmaAddConta);

        bAddConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumConta.getText().toString().isEmpty() || etNumAgencia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Campos obrigatórios não preenchidos",Toast.LENGTH_SHORT).show();
                } else if (etDigitoConta.getText().toString().length() > 1 || etDigitoAgencia.getText().toString().length() > 1){
                    Toast.makeText(getApplicationContext(),"Conta inválida",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Conta adicionada com sucesso",Toast.LENGTH_SHORT).show();

                    Conta conta = new Conta(Integer.parseInt(etNumConta.getText().toString()),Integer.parseInt(etNumAgencia.getText().toString()),
                            Integer.parseInt(etDigitoConta.getText().toString()),Integer.parseInt(etDigitoAgencia.getText().toString()));
                    ((Butler) Global.usuario).setConta(conta);

                    Intent mainIntent = new Intent(getApplicationContext(), MenuLateralActivity.class);
                    startActivity(mainIntent);
                }
            }
        });
    }
}
