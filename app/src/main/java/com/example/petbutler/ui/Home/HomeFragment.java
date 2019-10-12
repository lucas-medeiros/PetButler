package com.example.petbutler.ui.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.petbutler.R;

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


            }
        });
        //Finding hotel
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        //Finding product
        buttonProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
                //Implement emergency actions

            }
        });

        return root;
    }
}