//Main menu
//Author: Rafael Resnauer

package com.example.petbutler;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.petbutler.ui.ProcuraServico.SearchHotelActivity;
import com.example.petbutler.ui.ProcuraServico.SearchProductActivity;
import com.example.petbutler.ui.ProcuraServico.SearchTransportActivity;
import com.example.petbutler.ui.ProcuraServico.SearchWalkerActivity;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        //Declaring widgets
        final TextView textViewTitle = findViewById(R.id.textViewTitle);
        final Button buttonWalking = findViewById(R.id.buttonWalking);
        final Button buttonHotel = findViewById(R.id.buttonHotel);
        final Button buttonProducts = findViewById(R.id.buttonProducts);
        final Button buttonTransport = findViewById(R.id.buttonTransport);
        final ImageButton imageEmergency = findViewById(R.id.imageEmergency);

        //Finding walker
        buttonWalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent walking = new Intent(MainScreenActivity.this, SearchWalkerActivity.class);
                MainScreenActivity.this.startActivity(walking);

            }
        });
        //Finding hotel
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainScreenActivity.this, SearchHotelActivity.class);
                MainScreenActivity.this.startActivity(hotel);

            }
        });
        //Finding product
        buttonProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent products = new Intent(MainScreenActivity.this, SearchProductActivity.class);
                MainScreenActivity.this.startActivity(products);

            }
        });
        //Finding transport
        buttonTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transport = new Intent(MainScreenActivity.this, SearchTransportActivity.class);
                MainScreenActivity.this.startActivity(transport);

            }
        });
        //emergency button
        imageEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Implement emergency actions

            }
        });
    }
}
