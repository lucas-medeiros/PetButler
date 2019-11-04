package com.example.petbutler.ui.ProcuraServico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.petbutler.R;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        getSupportActionBar().setTitle("Pesquisar hotel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText editTextEstadoHotel = findViewById(R.id.editTextEstadoHotel);
        final EditText editTextCidadeHotel = findViewById(R.id.editTextCidadeHotel);
        final EditText editTextBairroHotel = findViewById(R.id.editTextBairroHotel);
        final RadioGroup radioGroupHotel = findViewById(R.id.radioGroupHotel);
        final RadioButton radioButtonCachorroHotel = findViewById(R.id.radioButtonCachorroHotel);
        final RadioButton radioButtonPassaroHotel = findViewById(R.id.radioButtonPassaroHotel);
        final RadioButton radioButtonGatoHotel = findViewById(R.id.radioButtonGatoHotel);
        final ListView listViewHotel = findViewById(R.id.listViewHotel);
        final Button buttonConfirmHotel = findViewById(R.id.buttonConfirmHotel);

        final ArrayList<String> a1hotel = new ArrayList<>();
        String hotel1 = "Grand Plaza", hotel2 = "Mon Calamari", hotel3 = "Knowhere";
        a1hotel.add(hotel1);
        a1hotel.add(hotel2);
        a1hotel.add(hotel3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1hotel);
        listViewHotel.setAdapter(adapter);

        buttonConfirmHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
