package com.example.petbutler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final TextView tvRegisterLink = (TextView) findViewById(R.id.tvRegisterHere);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final Button bCadastro = (Button) findViewById(R.id.bCadastro);
        final TextView tvBDPass = (TextView) findViewById(R.id.tvBDPass);
        final TextView tvBDName = (TextView) findViewById(R.id.tvBDName);


        String password1 = "admin", username1 = "admin", username2 = "lucas", password2 = "1234";
        String username3 = "professor", password3 = "professor", username4 = "adminprofessor", password4 = "adminprofessor";
        String username5 = "luiz", username6 = "leandro", username7 = "rafael";

        final ArrayList<String> alUsername = new ArrayList<String>();
        final ArrayList<String> alPassword = new ArrayList<String>();
        alPassword.add(password1);
        alPassword.add(password2);
        alPassword.add(password3);
        alPassword.add(password4);
        alUsername.add(username1);
        alUsername.add(username2);
        alUsername.add(username3);
        alUsername.add(username4);
        alUsername.add(username5);
        alUsername.add(username6);
        alUsername.add(username7);


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
                if(foundusername && foundpassword){
                    //login
                    toastLoginSuccess.show();

                }else if(foundusername && (foundpassword == false)){
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

                Intent cadastroIntent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(cadastroIntent);
            }
        });

        //mudança teste1
    }
}
