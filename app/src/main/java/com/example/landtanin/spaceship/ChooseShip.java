package com.example.landtanin.spaceship;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseShip extends AppCompatActivity {

    private int[] shipImages;
    private ImageView shipView;
    private Button previousButton, nextButton, shipSelectButton;
    private int shipCount; // form 0-9
    private TextView shipNo;
    private String[] shipName;
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ship);

        // Bind Widget
        bindWidget();

        resources();

        changePicButton();


        //myAdapter adapter = new myAdapter(this, shipName, shipImages);
        //shipListView.setAdapter(adapter);

    }

    private void changePicButton() {

        shipCount = 1;

        userName = getIntent().getExtras().getString("user");

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer nextButtonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
                nextButtonMediaPlayer.start();

                if (shipCount<10) {

                    shipView.setImageResource(shipImages[shipCount]);
                    shipNo.setText(shipName[shipCount]);

                } else if (shipCount == 10) {

                    shipCount = 0;
                    shipView.setImageResource(shipImages[shipCount]);
                    shipNo.setText(shipName[shipCount]);

                }


                shipCount++;

            }



        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer previousButtonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
                previousButtonMediaPlayer.start();

                if (shipCount>=0) {

                    shipView.setImageResource(shipImages[shipCount]);
                    shipNo.setText(shipName[shipCount]);

                } else if (shipCount == -1) {

                    shipCount = 9;
                    shipView.setImageResource(shipImages[shipCount]);
                    shipNo.setText(shipName[shipCount]);

                }

                shipCount--;


            }



        });

        shipSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer shipSelectButtonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.phonton1);
                shipSelectButtonMediaPlayer.start();

                Intent objIntent = new Intent(ChooseShip.this, GameControlActivity.class);
                objIntent.putExtra("userToShow", userName);
                startActivity(objIntent);
                finish();

            }



        });


    }

    private void resources() {

        Resources res = getResources();

        shipImages = new int[]{

                R.drawable.ship1,R.drawable.ship2,
                R.drawable.ship3,R.drawable.ship4,
                R.drawable.ship5,R.drawable.ship6,
                R.drawable.ship7,R.drawable.ship8,
                R.drawable.ship9,R.drawable.ship10

        };

        shipName = res.getStringArray(R.array.Titles);

    }

    private void bindWidget() {

        shipView = (ImageView) findViewById(R.id.shipView);
        previousButton = (Button) findViewById(R.id.previousButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        shipSelectButton = (Button) findViewById(R.id.selectShipButton);
        shipNo = (TextView) findViewById(R.id.shipNameText);

    }
}


/*
class myAdapter extends ArrayAdapter<String> {

    Context context;
    int[] images;
    String[] titleArray;
    myAdapter(Context c, String[] titles, int imgs[]) {

        super(c, R.layout.single_row, R.id.textView, titles);
        this.context=c;
        this.images = imgs;
        this.titleArray=titles;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row, parent, false);
            ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
            TextView myTitle = (TextView) row.findViewById(R.id.textView);

            myImage.setImageResource(images[position]);
            myTitle.setText(titleArray[position]);



            return row;
        }
}
*/





