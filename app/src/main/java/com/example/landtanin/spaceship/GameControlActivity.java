package com.example.landtanin.spaceship;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameControlActivity extends AppCompatActivity {

    private ImageButton arrowRight, arrowLeft;
    private String userName;
    private TextView userShow;
    private ImageView userShip;
    private int[] shipImages;
    private int shipCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_control);

        //bind widget
        bindWidget();

        //Controller Button
        controllerButton();

        userName = getIntent().getExtras().getString("userToShow");
        shipCount = getIntent().getExtras().getInt("shipCount");

        String showString = "PILOT : " + userName;

        userShow.setText(showString);

        shipImages = new int[]{

                R.drawable.ship1,R.drawable.ship2,
                R.drawable.ship3,R.drawable.ship4,
                R.drawable.ship5,R.drawable.ship6,
                R.drawable.ship7,R.drawable.ship8,
                R.drawable.ship9,R.drawable.ship10

        };

        userShip.setImageResource(shipImages[shipCount+1]);

    }

    private void controllerButton() {

        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Move space ship to left


            }
        });

        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Move space ship to right


            }
        });

    }

    private void bindWidget() {

        arrowLeft = (ImageButton) findViewById(R.id.buttonLeft);
        arrowRight = (ImageButton) findViewById(R.id.buttonRight);
        userShow = (TextView) findViewById(R.id.userShow);
        userShip = (ImageView) findViewById(R.id.userShip);

    }
}
