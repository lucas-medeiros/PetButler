package com.example.petbutler;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {


    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final EditText etNome = (EditText) findViewById(R.id.et_nome);
        final EditText etSobrenome = (EditText) findViewById(R.id.et_sobrenome);
        final EditText etEmail = (EditText) findViewById(R.id.et_email);
        final EditText etUsuario = (EditText) findViewById(R.id.et_usuario);
        final EditText etSenha = (EditText) findViewById(R.id.et_senha);
        final EditText etConfirmaSenha = (EditText) findViewById(R.id.et_confirmasenha);
        final EditText etCPF = (EditText) findViewById(R.id.et_CPF);
        final EditText etTelefone = (EditText) findViewById(R.id.et_telefone);
        final Button bConfirmar = (Button) findViewById(R.id.button_Confirmar);
        final TextView tvCadastro = (TextView) findViewById(R.id.textView_cadastro);
        final TextView tvWho = (TextView) findViewById(R.id.tv_who);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton radioButton_Cliente = (RadioButton) findViewById(R.id.radioButton_Cliente);
        final RadioButton radioButton_Butler = (RadioButton) findViewById(R.id.radioButton_Butler);



        bConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(etSenha.getText().toString().compareTo(etConfirmaSenha.getText().toString()) == 0){

                        if(etNome.getText().toString().isEmpty() || etSenha.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty() || etUsuario.getText().toString().isEmpty() ||
                            etCPF.getText().toString().isEmpty() || etSobrenome.getText().toString().isEmpty() || (radioGroup.getCheckedRadioButtonId() == -1)){ //verifica se algum dos campos está em branco

                            final Toast toastCampoBranco = Toast.makeText(getApplicationContext(), "Campo obrigatório não preenchido", Toast.LENGTH_SHORT);
                            toastCampoBranco.show();


                        } else {
                            if (isValidCPF(etCPF.getText().toString())) {

                                //SALVAR NO BD

                                final Toast toastCadastroSuceso = Toast.makeText(getApplicationContext(), "Cadastro realizado com sucesso", Toast.LENGTH_SHORT);
                                toastCadastroSuceso.show();
                            } else {
                                final Toast toastCPFinvalido = Toast.makeText(getApplicationContext(), "CPF inválido", Toast.LENGTH_SHORT);
                                toastCPFinvalido.show();
                            }
                        }

                    } else {

                        final Toast toastSenhaDiferente = Toast.makeText(getApplicationContext(), "Campo de confirmar senha diferente da senha original", Toast.LENGTH_SHORT);
                        toastSenhaDiferente.show();
                    }
            }
        });

    }

    static public int calcularDigito(String str, int[] peso){
        int soma = 0;
        for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
            digito = Integer.parseInt(str.substring(indice,indice+1));
            soma += digito*peso[peso.length-str.length()+indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    public static boolean isValidCPF(String cpf) {
        if ((cpf==null) || (cpf.length()!=11)) return false;

        Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
        return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
    }
}
