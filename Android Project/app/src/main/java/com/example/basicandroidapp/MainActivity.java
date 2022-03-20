package com.example.basicandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Fields for the views in the layout
    private Button changeColorButton;
    private LinearLayout mainLayout;

    // None view based fields
    private final int[] colors = {
            Color.GRAY,
            Color.GREEN,
            Color.RED,
            Color.BLUE,
            Color.YELLOW,
            Color.MAGENTA
    };

    // The only required method in an Activity class that you must implement
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the view that we will be rendering on this screen
        setContentView(R.layout.activity_main);

        // Initialize each of your views from the layout so you can work with them
        changeColorButton = findViewById(R.id.change_color_button);
        mainLayout = findViewById(R.id.main_linearLayout);

        // A utility method that sets up our button
        setUpChangeColorButton();
    }

    // A basic method that puts an onClickListener on our button so that it knows what to do
    // when pressed
    private void setUpChangeColorButton() {
        changeColorButton.setOnClickListener(view -> {
            // Change the background color of the layout to a random color
            Random r = new Random();
            mainLayout.setBackgroundColor(colors[r.nextInt(colors.length)]);
        });
    }
}