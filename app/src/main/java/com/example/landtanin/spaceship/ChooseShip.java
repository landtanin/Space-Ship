package com.example.landtanin.spaceship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ChooseShip extends AppCompatActivity {

    private ListView shipListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ship);

        // Bind Widget
        bindWidget();

        createListView();

    }

    private void createListView() {



    }

    private void bindWidget() {

        shipListView = (ListView) findViewById(R.id.shiplistView);
    }
}
