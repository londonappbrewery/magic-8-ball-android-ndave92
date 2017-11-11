package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1,R.drawable.ball2, R.drawable.ball3,
                R.drawable.ball4, R.drawable.ball5};
    
        Button askButton = findViewById(R.id.button_ask);
        askButton.setOnClickListener(v -> {
            Log.d("AskBall", "Ask button has been pressed.");
            Random randomNumberGenerator = new Random();
            
            int num = randomNumberGenerator.nextInt(5);
            ballDisplay.setImageResource(ballArray[num]);
        });
    }
}
