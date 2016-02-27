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

                R.drawable.falcon_topview,R.drawable.falcon_topview,
                R.drawable.falcon_topview,R.drawable.falcon_topview,
                R.drawable.falcon_topview,R.drawable.falcon_topview,
                R.drawable.falcon_topview,R.drawable.falcon_topview,
                R.drawable.falcon_topview,R.drawable.falcon_topview

        };

    }

    private void createListView() {



    }

    private void bindWidget() {

        shipListView = (ListView) findViewById(R.id.shiplistView);
    }
}
