package com.example.landtanin.spaceship;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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

        resources();

        myAdapter adapter = new myAdapter(this, shipName, shipImages);
        shipListView.setAdapter(adapter);

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

    private void bindWidget() {

        shipListView = (ListView) findViewById(R.id.shiplistView);
    }
}

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
