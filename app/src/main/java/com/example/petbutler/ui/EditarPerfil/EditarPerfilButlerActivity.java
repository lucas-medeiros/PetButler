package com.example.petbutler.ui.EditarPerfil;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.petbutler.PerfilButlerActivity;
import com.example.petbutler.R;
import com.example.petbutler.ui.MenuLateral.MenuLateralActivity;

public class EditarPerfilButlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil_butler);

        getSupportActionBar().setTitle("Editar Perfil");

        final ImageButton imageButton_fotoPerfilEP = findViewById(R.id.imageButton_fotoPerfilEPB);
        final Button bConfimar = findViewById(R.id.button_confirmarEPB);
        final EditText etNome = findViewById(R.id.et_nomeEPButler);
        final EditText etSobrenome = findViewById(R.id.et_sobrenomeEPB);
        final EditText etEmail = findViewById(R.id.et_emailEPB);
        final EditText etTelefone = findViewById(R.id.et_telefoneEPB);
        final EditText etSenha = findViewById(R.id.et_senhaEPB);
        final EditText etConfirmaSenha = findViewById(R.id.et_confirmarEPB);
        final EditText etResumo = findViewById(R.id.et_resumoEPB);

        //puxar info do BD e colocar nos et -> etNome.setText()...

        bConfimar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etSenha.getText().toString().compareTo(etConfirmaSenha.getText().toString()) == 0) {

                    if (etNome.getText().toString().isEmpty() || etSenha.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty() || etSobrenome.getText().toString().isEmpty()) { //verifica se algum dos campos está em branco

                        final Toast toastCampoBranco = Toast.makeText(getApplicationContext(), "Campo obrigatório não preenchido", Toast.LENGTH_SHORT);
                        toastCampoBranco.show();

                    } else {

                        //pegar as info nova e salvar no BD

                        final Toast toastEditado = Toast.makeText(getApplicationContext(), "Edições salvas com sucesso", Toast.LENGTH_SHORT);
                        toastEditado.show();

                        Intent perfilIntent = new Intent(EditarPerfilButlerActivity.this, MenuLateralActivity.class);
                        startActivity(perfilIntent);
                    }
                } else {

                    final Toast toastSenhaDiferente = Toast.makeText(getApplicationContext(), "Campo de confirmar senha diferente da senha original", Toast.LENGTH_SHORT);
                    toastSenhaDiferente.show();

                }
            }
        });
    }
}
