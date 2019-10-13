package com.example.petbutler.ui.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.petbutler.R;
import com.example.petbutler.ui.Emergencia.EmergenciaFragment;
import com.example.petbutler.ui.ProcuraServico.EntregaActivity;
import com.example.petbutler.ui.ProcuraServico.HotelActivity;
import com.example.petbutler.ui.ProcuraServico.PasseadorActivity;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        //Declaring widgets
        final TextView textViewTitle = root.findViewById(R.id.textViewTitle);
        final Button buttonWalking = root.findViewById(R.id.buttonWalking);
        final Button buttonHotel = root.findViewById(R.id.buttonHotel);
        final Button buttonProducts = root.findViewById(R.id.buttonProducts);
        final Button buttonTransport = root.findViewById(R.id.buttonTransport);
        final ImageButton imageEmergency = root.findViewById(R.id.imageEmergency);


        // colocar os intents pros fragments de serviço

        //Finding walker
        buttonWalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passeadorIntent = new Intent(getActivity(), PasseadorActivity.class);
                startActivity(passeadorIntent);

            }
        });
        //Finding hotel
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelIntent = new Intent(getActivity(), HotelActivity.class);
                startActivity(hotelIntent);

            }
        });
        //Finding product
        buttonProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entregaIntent = new Intent(getActivity(), EntregaActivity.class);
                startActivity(entregaIntent);

            }
        });
        //Finding transport
        buttonTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        //emergency button
        imageEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmergenciaFragment emergenciaFragment = new EmergenciaFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment, emergenciaFragment, emergenciaFragment.getTag()).commit();

            }
        });

        return root;
    }
}