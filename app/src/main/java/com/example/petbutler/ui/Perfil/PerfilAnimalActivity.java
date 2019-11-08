package com.example.petbutler.ui.Perfil;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

        getSupportActionBar().setTitle("Perfil Pet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

        GregorianCalendar data = new GregorianCalendar(2011,3,17);
        Animal Ghost = new Animal("Ghost", "Matador de white-walkers", "Cachorro", "48.1", "Grande",5.0,data,null);

        tvNomePet.setText(Ghost.getNome());
        tvPesoPet.setText(Ghost.getPeso()+" kg");
        tvTamanhoPet.setText(Ghost.getTamanho());
        tvTipoPet.setText(Ghost.getTipo());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        tvDataPet.setText(dateFormat.format(Ghost.getDataNascimento().getTime()));
        tvDescPet.setText(Ghost.getResumo());
        tvNotaPet.setText("" + Ghost.getNota());

        ivPerfilPet.setImageResource(R.mipmap.ic_ghost_round);
        ivFotoPet1.setImageResource(R.mipmap.ic_ghost1);
        ivFotoPet2.setImageResource(R.mipmap.ic_ghost2);




    }
}
