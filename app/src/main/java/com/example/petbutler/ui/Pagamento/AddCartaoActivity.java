package com.example.petbutler.ui.Pagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Global.Global;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cartao;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;
import com.example.petbutler.ui.MenuLateral.MenuLateralActivity;

public class AddCartaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cartao);

        getSupportActionBar().setTitle("Adicionar cartão");

        final EditText etNomeTitular = findViewById(R.id.et_NomeTitular);
        final EditText etNumCartao = findViewById(R.id.et_NumCartao);
        final EditText etValidade = findViewById(R.id.et_ValidadeCartao);
        final EditText etCodSeguranca= findViewById(R.id.et_CodSeguranca);
        final RadioGroup rgTipoCartao = findViewById(R.id.radioGroupTipoCartao);
        final RadioButton rbCredito = findViewById(R.id.radioButton_Credito);
        final RadioButton rbDebito = findViewById(R.id.radioButton_Debito);
        final Button bAddCartao = findViewById(R.id.button_ConfirmaAddCartao);

        bAddCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNomeTitular.getText().toString().isEmpty() || etNumCartao.getText().toString().isEmpty() || etValidade.getText().toString().isEmpty() ||
                        etCodSeguranca.getText().toString().isEmpty() || rgTipoCartao.getCheckedRadioButtonId() == -1){
                    Toast.makeText(getApplicationContext(),"Campos obrigatórios não preenchidos",Toast.LENGTH_SHORT).show();
                } else if (etValidade.getText().toString().length() != 5 || etValidade.getText().toString().charAt(2) != '/'){
                    Toast.makeText(getApplicationContext(),"Data de validade do cartão com formatação incorreta",Toast.LENGTH_SHORT).show();
                } else if(etNumCartao.getText().toString().length() != 16){
                    Toast.makeText(getApplicationContext(),"Cartão inválido",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Cartão adicionado com sucesso",Toast.LENGTH_SHORT).show();
                    //salvar as info do cartão no BD
                    char tipo;
                    if(rbCredito.isChecked())
                        tipo = 'c';
                    else
                        tipo = 'd';
                    Cartao cartao = new Cartao(etNumCartao.getText().toString(),etCodSeguranca.getText().toString(),
                            Integer.parseInt(etValidade.getText().toString().substring(0,2)),Integer.parseInt(etValidade.getText().toString().substring(3)),
                            etNomeTitular.getText().toString(),tipo);
                    ((Cliente) Global.usuario).setCartao(cartao);

                    Intent mainIntent = new Intent(getApplicationContext(), MenuLateralActivity.class);
                    startActivity(mainIntent);
                }
            }
        });

    }
}
