package com.example.landtanin.spaceship;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameControlActivity extends AppCompatActivity {

    private ImageButton arrowRight, arrowLeft;
    private String userName;
    private TextView userShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_control);

        //bind widget
        bindWidget();

        //Controller Button
        controllerButton();

        userName = getIntent().getExtras().getString("userToShow");

        String showString = "PILOT : " + userName;

        userShow.setText(showString);

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

    }
}
