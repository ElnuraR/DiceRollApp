package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber1;
    int randomNumber2;

    ImageView imageView1;
    ImageView imageView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.first_image);
        imageView2 = findViewById(R.id.second_image);

        // recovering the instance state
        if (savedInstanceState != null) {
            randomNumber1 = savedInstanceState.getInt("key1");
            randomNumber2 = savedInstanceState.getInt("key2");

            setImage1(randomNumber1);
            setImage2(randomNumber2);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("key1", randomNumber1);
        outState.putInt("key2", randomNumber2);
    }

    public void rollDice(View view) {
        final Random rand = new Random();

        randomNumber1 = rand.nextInt(6) + 1; // uniformly distributed int from 1 to 6
        randomNumber2 = rand.nextInt(6) + 1; // uniformly distributed int from 1 to 6

        setImage1(randomNumber1);
        setImage2(randomNumber2);
    }

    private void setImage1(int randomNumber) {
        switch (randomNumber) {
            case 1:
                imageView1.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.two);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.three);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.four);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.five);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.six);
                break;
        }
    }

    private void setImage2(int randomNumber) {
        switch (randomNumber) {
            case 1:
                imageView2.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.two);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.three);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.four);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.five);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.six);
                break;
        }
    }
}