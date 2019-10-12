package com.example.petbutler;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.petbutler.ui.EditarPerfil.EditarPerfilButlerActivity;

import java.util.ArrayList;

public class PerfilButlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_butler);

        final ImageButton imageButton_editarPerfilButler = findViewById(R.id.imageButton_editarPerfilButler);
        final ImageView fotoPerfil = findViewById(R.id.imageView_fotoPerfilButler);
        final EditText etNome = findViewById(R.id.et_nomeButler);
        final EditText etSobrenome = findViewById(R.id.et_sobrenomeButler);
        final EditText etEmail = findViewById(R.id.et_emailButler);
        final EditText etUsuario = findViewById(R.id.et_usuarioButler);
        final EditText etTelefone = findViewById(R.id.et_telefoneButler);
        final EditText etResumo = findViewById(R.id.et_resumoButler);
        final EditText etCRMV = findViewById(R.id.et_crmv);
        final TextView tv_notaButler = findViewById(R.id.tv_notaButler);
        final ListView ServicoList = findViewById(R.id.listView_servicolist);


        final ArrayList<String> a1serv = new ArrayList<>();
        String serv1 = "Hotel Pássaros Felizes", serv2 = "Clínica Pet Saudável", serv3 = "Petshop Nekomamushi";
        a1serv.add(serv1);
        a1serv.add(serv2);
        a1serv.add(serv3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1serv);
        ServicoList.setAdapter(adapter);

        //EditText SETUP:
        etNome.setClickable(false);
        etNome.setEnabled(false);
        //etNome.setText(""); PEGAR DADOS DO BD?

        etSobrenome.setClickable(false);
        etSobrenome.setEnabled(false);

        etCRMV.setClickable(false);
        etCRMV.setEnabled(false);

        etEmail.setClickable(false);
        etEmail.setEnabled(false);


        etUsuario.setClickable(false);
        etUsuario.setEnabled(false);

        etTelefone.setClickable(false);
        etTelefone.setEnabled(false);

        etResumo.setClickable(false);
        etResumo.setEnabled(false);

        tv_notaButler.setText("4.97"); //exemplo, pegar nota no BD

        imageButton_editarPerfilButler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editarPerfilBIntent = new Intent(PerfilButlerActivity.this, EditarPerfilButlerActivity.class);
                startActivity(editarPerfilBIntent);
            }
        });
    }
}
