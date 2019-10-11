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

import java.util.ArrayList;

public class PerfilClienteActivity extends AppCompatActivity {

    //transformar em fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cliente);

        final ImageButton imageButton_editarPerfil = findViewById(R.id.imageButton_editarPerfil);
        final ImageButton imageButton_addPet = findViewById(R.id.imageButton_addPet);
        final TextView tv_notaCliente = findViewById(R.id.tv_nota);
        final EditText etNome = findViewById(R.id.et_nome);
        final EditText etSobrenome = findViewById(R.id.et_sobrenome);
        final EditText etEmail = findViewById(R.id.et_email);
        final EditText etUsuario = findViewById(R.id.et_usuario);
        final EditText etTelefone = findViewById(R.id.et_telefone);
        final EditText etResumo = findViewById(R.id.et_resumo);
        final ListView PetList = findViewById(R.id.listView_petlist);
        final ImageView fotoPerfil = findViewById(R.id.imageView_fotoPerfil);

        //para teste de visualização:
        final ArrayList<String> alPets = new ArrayList<>();
        String pet1 = "Ghost", pet2 = "Summer", pet3 = "Nymeria", pet4 = "Lady";
        alPets.add(pet1);
        alPets.add(pet2);
        alPets.add(pet3);
        alPets.add(pet4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alPets);
        PetList.setAdapter(adapter);

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

        etTelefone.setClickable(false);
        etTelefone.setEnabled(false);

        etResumo.setClickable(false);
        etResumo.setEnabled(false);


        tv_notaCliente.setText("4.97"); //exemplo, pegar nota no BD


        imageButton_editarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent editarPerfilIntent = new Intent(PerfilClienteActivity.this, EditarPerfilCliente.class);
                startActivity(editarPerfilIntent);

            }
        });


        imageButton_addPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


}
