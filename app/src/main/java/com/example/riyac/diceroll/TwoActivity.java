package com.example.riyac.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class TwoActivity extends AppCompatActivity {

    ImageView two1, two2;
    Button b2;
    private Random rng = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        two1=(ImageView)findViewById(R.id.two1);
        two2=(ImageView)findViewById(R.id.two2);
        b2=(Button)findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r21 = rng.nextInt(6) + 1;
                switch (r21) {
                    case 1:
                        two1.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        two1.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        two1.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        two1.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        two1.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        two1.setImageResource(R.drawable.six);
                        break;
                }

                int r22 = rng.nextInt(6) + 1;
                switch (r22) {
                    case 1:
                        two2.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        two2.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        two2.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        two2.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        two2.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        two2.setImageResource(R.drawable.six);
                        break;
                }

            }
        });


    }
}
