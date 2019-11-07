package com.example.petbutler.ui.Perfil;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.petbutler.R;
import com.example.petbutler.ui.Classes.Animal.Animal;

public class PerfilAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_animal);

        final TextView tvNomePet = findViewById(R.id.tv_nomePet);
        final TextView tvPesoPet = findViewById(R.id.tv_pesoPet);
        final TextView tvTamanhoPet = findViewById(R.id.tv_tamanhoPet);
        final TextView tvTipoPet = findViewById(R.id.tv_tipoPet);
        final TextView tvDataPet = findViewById(R.id.tv_dataPet);
        final TextView tvDescPet = findViewById(R.id.tv_descPet);

        final ImageButton ibEditarPet = findViewById(R.id.ib_editarPet);
        final TextView tvNotaPet = findViewById(R.id.tv_notaPet);
        final ImageView ivPerfilPet = findViewById(R.id.iv_fotoPerfilPet);
        final ImageView ivFotoPet1  = findViewById(R.id.iv_fotoPet1);
        final ImageView ivFotoPet2  = findViewById(R.id.iv_fotoPet2);

        Animal Ghost = new Animal("Ghost","Leal","Cachorro","20","1",4.8,null,null);

        tvNomePet.setText(Ghost.getNome());
        tvPesoPet.setText(Ghost.getPeso()+"kg");
        tvTamanhoPet.setText(Ghost.getTamanho()+"m");
        tvTipoPet.setText(Ghost.getTipo());
        tvDataPet.setText("17/04/2011");
        tvDescPet.setText(Ghost.getResumo());
        tvNotaPet.setText("" + Ghost.getNota());



    }
}
