package com.example.riyac.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ThreeActivity extends AppCompatActivity {

    Button b3;
    private Random rng = new Random();
    ImageView three1, three2, three3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        b3=(Button)findViewById(R.id.b3);
        three1=(ImageView)findViewById(R.id.three1);
        three2=(ImageView)findViewById(R.id.three2);
        three3=(ImageView)findViewById(R.id.three3); 

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r31 = rng.nextInt(6) + 1;
                switch (r31) {
                    case 1:
                        three1.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        three1.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        three1.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        three1.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        three1.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        three1.setImageResource(R.drawable.six);
                        break;
                }

                int r32 = rng.nextInt(6) + 1;
                switch (r32) {
                    case 1:
                        three2.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        three2.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        three2.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        three2.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        three2.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        three2.setImageResource(R.drawable.six);
                        break;
                }

                int r33 = rng.nextInt(6) + 1;
                switch (r33) {
                    case 1:
                        three3.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        three3.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        three3.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        three3.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        three3.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        three3.setImageResource(R.drawable.six);
                        break;
                }
            }
        });
    }
}
