package com.example.petbutler.ui.Emergencia;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.petbutler.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmergenciaFragment extends Fragment {


    public EmergenciaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_emergencia, container, false);

        final EditText animal = root.findViewById(R.id.et_animalEmergencia);
        final EditText descricao = root.findViewById(R.id.et_descricaoEmergencia);
        final EditText enderecoEmergencia = root.findViewById(R.id.et_endercoEmergencia);
        final Button bEmergencia = root.findViewById(R.id.bEmergencia);

        bEmergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(animal.getText().toString().isEmpty() || descricao.getText().toString().isEmpty() || enderecoEmergencia.getText().toString().isEmpty()){

                    final Toast toastCampoBranco = Toast.makeText(getContext(), "Por favor, preencha todos os campos", Toast.LENGTH_SHORT);
                    toastCampoBranco.show();

                } else {

                    //SALVAR INFO NO BD + NOTIFICAR OS BUTLERS PERTO

                    final Toast emergenciaRegistrada = Toast.makeText(getContext(), "Sua emergência foi registrada com sucesso", Toast.LENGTH_SHORT);
                    emergenciaRegistrada.show();

                    //mandar a pessoa pra home ? fragment intent
                }

            }
        });

        return root;
    }

}
