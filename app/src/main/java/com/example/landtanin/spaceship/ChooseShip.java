package com.example.landtanin.spaceship;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ChooseShip extends AppCompatActivity {

    private ListView shipListView;
    String[] shipName;
    int[] shipImages;
    //String[] shipDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ship);

        // Bind Widget
        bindWidget();

        createListView();

        resources();

    }

    private void resources() {

        Resources res = getResources();
        shipName = res.getStringArray(R.array.Titles);

        shipImages = new int[]{

                R.drawable.ship1,R.drawable.ship2,
                R.drawable.ship3,R.drawable.ship4,
                R.drawable.ship5,R.drawable.ship6,
                R.drawable.ship7,R.drawable.ship8,
                R.drawable.ship9,R.drawable.ship10

        };

    }

    private void createListView() {



    }

    private void bindWidget() {

        shipListView = (ListView) findViewById(R.id.shiplistView);
    }
}
