package com.example.riyac.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class SixActivity extends AppCompatActivity {

    Button b6;
    private Random rng = new Random();
    ImageView six1, six2, six3, six4, six5, six6;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        b6=(Button)findViewById(R.id.b6);
        six1=(ImageView)findViewById(R.id.six1);
        six2=(ImageView)findViewById(R.id.six2);
        six3=(ImageView)findViewById(R.id.six3);
        six4=(ImageView)findViewById(R.id.six4);
        six5=(ImageView)findViewById(R.id.six5);
        six6=(ImageView)findViewById(R.id.six6);
        
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r61 = rng.nextInt(6) + 1;
                switch (r61) {
                    case 1:
                        six1.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        six1.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        six1.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        six1.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        six1.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        six1.setImageResource(R.drawable.six);
                        break;
                }

                int r62 = rng.nextInt(6) + 1;
                switch (r62) {
                    case 1:
                        six2.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        six2.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        six2.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        six2.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        six2.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        six2.setImageResource(R.drawable.six);
                        break;
                }

                int r63 = rng.nextInt(6) + 1;
                switch (r63) {
                    case 1:
                        six3.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        six3.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        six3.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        six3.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        six3.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        six3.setImageResource(R.drawable.six);
                        break;
                }

                int r64 = rng.nextInt(6) + 1;
                switch (r64) {
                    case 1:
                        six4.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        six4.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        six4.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        six4.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        six4.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        six4.setImageResource(R.drawable.six);
                        break;
                }

                int r65 = rng.nextInt(6) + 1;
                switch (r65) {
                    case 1:
                        six5.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        six5.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        six5.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        six5.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        six5.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        six5.setImageResource(R.drawable.six);
                        break;
                }

                int r66 = rng.nextInt(6) + 1;
                switch (r66) {
                    case 1:
                        six6.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        six6.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        six6.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        six6.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        six6.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        six6.setImageResource(R.drawable.six);
                        break;
                }
            }
        });
    }
}
