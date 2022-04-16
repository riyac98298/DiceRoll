package com.example.riyac.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class FiveActivity extends AppCompatActivity {

    Button b5;
    private Random rng = new Random();
    ImageView five1, five2, five3, five4, five5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        b5=(Button) findViewById(R.id.b5);
        five1=(ImageView)findViewById(R.id.five1);
        five2=(ImageView)findViewById(R.id.five2);
        five3=(ImageView)findViewById(R.id.five3);
        five4=(ImageView)findViewById(R.id.five4);
        five5=(ImageView)findViewById(R.id.five5); 

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r51 = rng.nextInt(6) + 1;
                switch (r51) {
                    case 1:
                        five1.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        five1.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        five1.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        five1.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        five1.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        five1.setImageResource(R.drawable.six);
                        break;
                }

                int r52 = rng.nextInt(6) + 1;
                switch (r52) {
                    case 1:
                        five2.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        five2.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        five2.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        five2.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        five2.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        five2.setImageResource(R.drawable.six);
                        break;
                }

                int r53 = rng.nextInt(6) + 1;
                switch (r53) {
                    case 1:
                        five3.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        five3.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        five3.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        five3.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        five3.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        five3.setImageResource(R.drawable.six);
                        break;
                }

                int r54 = rng.nextInt(6) + 1;
                switch (r54) {
                    case 1:
                        five4.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        five4.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        five4.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        five4.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        five4.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        five4.setImageResource(R.drawable.six);
                        break;
                }

                int r55 = rng.nextInt(6) + 1;
                switch (r55) {
                    case 1:
                        five5.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        five5.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        five5.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        five5.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        five5.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        five5.setImageResource(R.drawable.six);
                        break;
                }
            }
        });
        
    }
}
