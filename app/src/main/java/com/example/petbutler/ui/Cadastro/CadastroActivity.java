package com.example.petbutler.ui.Cadastro;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.MainScreenActivity;
import com.example.petbutler.PerfilButlerActivity;
import com.example.petbutler.PerfilClienteActivity;
import com.example.petbutler.R;

public class CadastroActivity extends AppCompatActivity {

    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final EditText etNome = findViewById(R.id.et_nome);
        final EditText etSobrenome = findViewById(R.id.et_sobrenome);
        final EditText etEmail = findViewById(R.id.et_email);
        final EditText etUsuario = findViewById(R.id.et_usuario);
        final EditText etSenha = findViewById(R.id.et_senha);
        final EditText etConfirmaSenha = findViewById(R.id.et_confirmasenha);
        final EditText etCPF = findViewById(R.id.et_CPF);
        final EditText etTelefone = findViewById(R.id.et_telefone);
        final Button bConfirmar = findViewById(R.id.button_Confirmar);
        final TextView tvWho = findViewById(R.id.tv_who);
        final RadioGroup radioGroup = findViewById(R.id.radioGroup);
        final RadioButton radioButton_Cliente = findViewById(R.id.radioButton_Cliente);
        final RadioButton radioButton_Butler = findViewById(R.id.radioButton_Butler);



        bConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //apenas para testes:
                if((etSenha.getText().toString().compareTo("admin") == 0) && (etUsuario.getText().toString().compareTo("a") == 0)){
                    Intent perfilClienteIntent = new Intent(CadastroActivity.this, PerfilClienteActivity.class);
                    startActivity(perfilClienteIntent);
                }
                else if((etSenha.getText().toString().compareTo("admin") == 0) && (etUsuario.getText().toString().compareTo("b") == 0)) {
                    Intent mainIntent = new Intent(CadastroActivity.this, MainScreenActivity.class);
                    startActivity(mainIntent);
                }
                else if ((etSenha.getText().toString().compareTo("admin") == 0) && (etUsuario.getText().toString().compareTo("p") == 0)) {
                     Intent perfilButlerIntent = new Intent(CadastroActivity.this, PerfilButlerActivity.class);
                     startActivity(perfilButlerIntent);
                }

                //fim dos testes - verificação para validar perfil:
                else if (etSenha.getText().toString().compareTo(etConfirmaSenha.getText().toString()) != 0) {
                    final Toast toastSenhaDiferente = Toast.makeText(getApplicationContext(), "Campo de confirmar senha diferente da senha original", Toast.LENGTH_SHORT);
                    toastSenhaDiferente.show();
                }

                 else if (etNome.getText().toString().isEmpty() || etSenha.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty() || etUsuario.getText().toString().isEmpty() ||
                                etCPF.getText().toString().isEmpty() || etSobrenome.getText().toString().isEmpty() || (radioGroup.getCheckedRadioButtonId() == -1)) { //verifica se algum dos campos está em branco
                    final Toast toastCampoBranco = Toast.makeText(getApplicationContext(), "Campo obrigatório não preenchido", Toast.LENGTH_SHORT);
                    toastCampoBranco.show();
                }

                 else if (!isValidCPF(etCPF.getText().toString())) {
                    final Toast toastCPFinvalido = Toast.makeText(getApplicationContext(), "CPF inválido", Toast.LENGTH_SHORT);
                    toastCPFinvalido.show();
                }

                 else{
                    final Toast toastCadastroSuceso = Toast.makeText(getApplicationContext(), "Cadastro realizado com sucesso", Toast.LENGTH_SHORT);
                    toastCadastroSuceso.show();

                    //SALVAR NO BD

                    //Intent perfilClienteIntent = new Intent(CadastroActivity.this, PerfilClienteActivity.class);
                    //startActivity(perfilClienteIntent);

                    Intent menuIntent = new Intent(CadastroActivity.this, MainScreenActivity.class);
                    startActivity(menuIntent);

                    //intent teste, apagar dps
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
