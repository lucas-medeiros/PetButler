package com.example.petbutler.ui.Options;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.petbutler.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("Sobre");

        final TextView tv_about = findViewById(R.id.tv_about);

        String about = "\n\nO app PetButler foi desenvolvido totalmente em Android Studio " +
                "e foi criado para a disciplina de Engenharia de Software - 2019 Engenharia de Computação PUCPR\n\n" +
                "Desenvolvedores:\n" +
                "Lucas Medeiros\n" +
                "Leandro Kurashiki\n" +
                "Luiz Eduardo\n" +
                "Rafael Resnauer\n";

        tv_about.setText(about);
    }
}
