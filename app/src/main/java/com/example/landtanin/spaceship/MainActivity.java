package com.example.landtanin.spaceship;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText playerName;
    private Button joinButton;
    private String pilotName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    }

    private void bindWidget() {

        playerName = (EditText) findViewById(R.id.playerName);
        joinButton = (Button) findViewById(R.id.joinButton);

    }

    private void buttonController() {

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer joinButtonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.phonton1);
                joinButtonMediaPlayer.start();

                //check zero
                //checkZero()

                String strPlayer = playerName.getText().toString().trim();

                // Use String PlayerName    ****

                if(strPlayer.equals("")){

                    Toast.makeText(MainActivity.this,"PLEASE ENTER PILOT NAME", Toast.LENGTH_SHORT).show();

                }
                else {

                    pilotName = playerName.getText().toString().trim();
                    IntentToGameControl();

                }


            }



        });

    }

    private void IntentToGameControl() {

        Intent objIntent = new Intent(MainActivity.this, ChooseShip.class);
        objIntent.putExtra("user", pilotName);
        startActivity(objIntent);
        finish();

    }


}
