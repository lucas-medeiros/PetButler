package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.petbutler.R;

public class PasseadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passeador);

        getSupportActionBar().setTitle("Pesquisar passeador");
    }
}
