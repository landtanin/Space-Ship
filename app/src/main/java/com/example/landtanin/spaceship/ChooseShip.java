package com.example.landtanin.spaceship;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChooseShip extends AppCompatActivity {

    int[] shipImages;
    private ImageView shipView;
    private Button previousButton, nextButton, shipSelectButton;
    private int shipCount; // form 0-9

    //String[] shipDetail;

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

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (shipCount < 10) {

                    shipView.setImageResource(shipImages[shipCount]);

                } else {

                    shipCount = 0;
                    shipView.setImageResource(shipImages[shipCount]);

                }

                shipCount++;

            }



        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (shipCount>=0) {

                    shipView.setImageResource(shipImages[shipCount]);

                } else {

                    shipCount = 9;
                    shipView.setImageResource(shipImages[shipCount]);

                }

                shipCount--;


            }



        });

        shipSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent objIntent = new Intent(ChooseShip.this, GameControlActivity.class);
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

    }

    private void bindWidget() {

        shipView = (ImageView) findViewById(R.id.shipView);
        previousButton = (Button) findViewById(R.id.previousButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        shipSelectButton = (Button) findViewById(R.id.selectShipButton);

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





