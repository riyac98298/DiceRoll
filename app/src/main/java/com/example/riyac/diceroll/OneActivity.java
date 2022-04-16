package com.example.riyac.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class OneActivity extends AppCompatActivity {
    Button b1;
    ImageView one1;
    private Random rng = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        b1=(Button)findViewById(R.id.b1);
        one1=(ImageView)findViewById(R.id.one1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r11 = rng.nextInt(6) + 1;
                switch (r11) {
                    case 1:
                        one1.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        one1.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        one1.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        one1.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        one1.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        one1.setImageResource(R.drawable.six);
                        break;
                }

            }
        });

    }
}
