package com.example.petbutler.ui.Login;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.ui.Classes.Global.Global;
import com.example.petbutler.ui.MenuLateral.MenuLateralActivity;
import com.example.petbutler.R;
import com.example.petbutler.ui.Cadastro.CadastroActivity;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = findViewById(R.id.etUsername);
        final EditText etPassword = findViewById(R.id.etPassword);
        final TextView tvRegisterLink = findViewById(R.id.tvRegisterHere);
        final Button bLogin = findViewById(R.id.bLogin);
        final Button bCadastro = findViewById(R.id.bCadastro);
        final TextView tvBDPass = findViewById(R.id.tvBDPass);
        final TextView tvBDName = findViewById(R.id.tvBDName);


        String password1 = "admin", username1 = "admin", username2 = "lucas", password2 = "1234", password5 = "winter", password6 = "gold";
        String username3 = "professor", password3 = "professor", username4 = "adminprofessor", password4 = "adminprofessor";
        String username5 = "luiz", username6 = "leandro", username7 = "rafael", username8 = "jonsnow", username9 = "jaime";

        final ArrayList<String> alUsername = new ArrayList<String>();
        final ArrayList<String> alPassword = new ArrayList<String>();
        alPassword.add(password1);
        alPassword.add(password2);
        alPassword.add(password3);
        alPassword.add(password4);
        alPassword.add(password5);
        alPassword.add(password6);
        alUsername.add(username1);
        alUsername.add(username2);
        alUsername.add(username3);
        alUsername.add(username4);
        alUsername.add(username5);
        alUsername.add(username6);
        alUsername.add(username7);
        alUsername.add(username8);
        alUsername.add(username9);


        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String LoginFailed1 = "Nome de usuário não encontrado", LoginFailed2 = "Senha incorreta", LoginSucess = "Login realizado com sucesso";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                final Toast toastLoginFailed1 = Toast.makeText(context, LoginFailed1, duration);
                final Toast toastLoginFailed2 = Toast.makeText(context, LoginFailed2, duration);
                final Toast toastLoginSuccess = Toast.makeText(context, LoginSucess, duration);
                final Toast toastLoginFailed = Toast.makeText(context, "Falha no login", duration);
                final Toast toastBlankLogin = Toast.makeText(context, "Login em branco", duration);
                final Toast toastBlankPassword = Toast.makeText(context, "Senha em branco", duration);

                boolean foundusername = false, foundpassword = false;
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();


                for (int i = 0; i < alUsername.size(); i++){
                    if(username.compareTo(alUsername.get(i)) == 0){
                        foundusername = true;
                        for(int j = 0; j < alPassword.size(); j++){
                            if(password.compareTo(alPassword.get(j)) == 0){
                                foundpassword = true;
                            }
                        }
                    }
                }
                if(foundusername && foundpassword) {

                    //apenas para testes -> pegar do BD
                    if(username.compareTo("jaime") == 0){ //butler
                        Global.isCliente = false;
                    } else { //cliente
                        Global.isCliente = true;
                    }
                    toastLoginSuccess.show();
                    Intent mainIntent = new Intent(LoginActivity.this, MenuLateralActivity.class);
                    startActivity(mainIntent);
                }else if(foundusername && !foundpassword){
                    //senha incorreta
                    toastLoginFailed2.show();
                }else if (username.isEmpty()) {
                    //campo do login em branco
                    toastBlankLogin.show();
                }else if (password.isEmpty()){
                    //campo da senha em branco
                    toastBlankPassword.show();
                }else{
                    //usuario nao existe
                    toastLoginFailed1.show();
                }
            }
        });


        bCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int duration = Toast.LENGTH_SHORT;
                Context context = getApplicationContext();
                final Toast toastCadastro = Toast.makeText(context, "Cadastro", duration);
                toastCadastro.show();

                Intent cadastroIntent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(cadastroIntent);
            }
        });


    }
}
