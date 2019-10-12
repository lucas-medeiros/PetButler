package com.example.petbutler.ui.home;

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


        //Finding walker
        buttonWalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent walking = new Intent(MainScreenActivity.this, SearchWalkerActivity.class);
                //MainScreenActivity.this.startActivity(walking);

            }
        });
        //Finding hotel
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent hotel = new Intent(MainScreenActivity.this, SearchHotelActivity.class);
                //MainScreenActivity.this.startActivity(hotel);

            }
        });
        //Finding product
        buttonProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent products = new Intent(MainScreenActivity.this, SearchProductActivity.class);
                //MainScreenActivity.this.startActivity(products);

            }
        });
        //Finding transport
        buttonTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent transport = new Intent(MainScreenActivity.this, SearchTransportActivity.class);
                //MainScreenActivity.this.startActivity(transport);

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