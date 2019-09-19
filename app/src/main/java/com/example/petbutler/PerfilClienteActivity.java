package com.example.petbutler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PerfilClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cliente);

        final ImageButton imageButton_editarPerfil = findViewById(R.id.imageButton_editarPerfil);
        final TextView tv_notaCliente = findViewById(R.id.tv_nota);
        final EditText etNome = findViewById(R.id.et_nome);
        final EditText etSobrenome = findViewById(R.id.et_sobrenome);
        final EditText etEmail = findViewById(R.id.et_email);
        final EditText etUsuario = findViewById(R.id.et_usuario);
        final EditText etSenha = findViewById(R.id.et_senha);
        final EditText etTelefone = findViewById(R.id.et_telefone);
        final EditText etResumo = findViewById(R.id.et_resumo);
        final ListView PetList = findViewById(R.id.listView_petlist);
        final ImageView fotoPerfil = findViewById(R.id.imageView_fotoPerfil);


        //EditText SETUP:
        etNome.setClickable(false);
        etNome.setEnabled(false);
        //etNome.setText(""); PEGAR DADOS DO BD?

        etSobrenome.setClickable(false);
        etSobrenome.setEnabled(false);


        etEmail.setClickable(false);
        etEmail.setEnabled(false);


        etUsuario.setClickable(false);
        etUsuario.setEnabled(false);

        etSenha.setClickable(false);
        etSenha.setEnabled(false);

        etTelefone.setClickable(false);
        etTelefone.setEnabled(false);

        etResumo.setClickable(false);
        etResumo.setEnabled(false);

        etSenha.setVisibility(View.INVISIBLE);
        etSenha.setEnabled(false);

        tv_notaCliente.setText("4.97"); //exemplo, pegar nota no BD


    }


}
