package com.example.petbutler.ui.EditarPerfil;

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

public class EditarPetActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_pet);

        getSupportActionBar().setTitle("Editar Pet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText etNomePet = findViewById(R.id.et_nomeAnimal);
        final EditText etPesoPet = findViewById(R.id.et_pesoAnimal);
        final EditText etDataNasc = findViewById(R.id.et_dataNascPet);
        final EditText etTamanhoPet = findViewById(R.id.et_tamanhoAnimal);
        final EditText etResumoPet = findViewById(R.id.et_resumoAnimal);
        final ImageButton imgButtonPet = findViewById(R.id.ib_trocarFoto);
        final Button bConfirmarPet = findViewById(R.id.buttonConfirmarAnimal);
        final TextView tvAnimal = findViewById(R.id.tv_tipoDePet);
        final Spinner spinnerPet = findViewById(R.id.spinnerTipoPet);

        tvAnimal.setText("Tipo Animal");

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
                    final Toast toastCampoBranco = Toast.makeText(getApplicationContext(), "Perfil editado!", Toast.LENGTH_SHORT);
                    toastCampoBranco.show();
                    // salvar no BD

                    Intent mainIntent = new Intent(EditarPetActivity.this, MenuLateralActivity.class);
                    startActivity(mainIntent);
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        //Toast.makeText(adapterView.getContext(),text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
