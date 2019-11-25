package com.example.petbutler.ui.Cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petbutler.R;
import com.example.petbutler.ui.MenuLateral.MenuLateralActivity;

public class AdicionarPetActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_pet);

        getSupportActionBar().setTitle("Adicionar Pet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText etNomePet = findViewById(R.id.et_nomePet);
        final EditText etPesoPet = findViewById(R.id.et_pesoPet);
        final EditText etTamanhoPet = findViewById(R.id.et_tamanhoPet);
        final EditText etResumoPet = findViewById(R.id.et_resumoPet);
        final ImageButton imgButtonPet = findViewById(R.id.ib_pet);
        final Button bConfirmarPet = findViewById(R.id.button_confirmarPet);
        final TextView tvAnimal = findViewById(R.id.tv_tipoAnimal);
        final TextView tvFotos = findViewById(R.id.tv_addFoto);
        final Spinner spinnerPet = findViewById(R.id.spinnerPet);

        tvAnimal.setText("Tipo Animal");
        tvFotos.setText("Adicionar Fotos");

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Pets, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPet.setAdapter(adapter);
        spinnerPet.setOnItemSelectedListener(this);

        bConfirmarPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNomePet.getText().toString().isEmpty() || etPesoPet.getText().toString().isEmpty()
                        || etTamanhoPet.getText().toString().isEmpty() ||etResumoPet.getText().toString().isEmpty()) {
                    final Toast toastCampoBranco = Toast.makeText(getApplicationContext(), "Campo obrigatório não preenchido", Toast.LENGTH_SHORT);
                    toastCampoBranco.show();
                }
                else{
                    final Toast toastCampoBranco = Toast.makeText(getApplicationContext(), "Animal Adicionado", Toast.LENGTH_SHORT);
                    toastCampoBranco.show();
                    // salvar no BD

                    Intent mainIntent = new Intent(AdicionarPetActivity.this, MenuLateralActivity.class);
                    startActivity(mainIntent);
                }
            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
