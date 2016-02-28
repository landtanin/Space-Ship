package com.example.landtanin.spaceship;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class gameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }

    public void clickPlay(View view) { //Link with android onclick in activity show score
        Intent objIntent = new Intent(gameOverActivity.this, MainActivity.class);
        startActivity(objIntent);
        finish();


    }
    public void clickExit(View view) { //Link with android onclick in activity show score

        //close the application
        finish();

    }
}
