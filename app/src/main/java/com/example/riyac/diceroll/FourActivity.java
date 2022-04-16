package com.example.riyac.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class FourActivity extends AppCompatActivity {

    Button b4;
    private Random rng = new Random();
    ImageView four1, four2, four3, four4;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        b4=(Button)findViewById(R.id.b4);
        four1=(ImageView)findViewById(R.id.four1);
        four2=(ImageView)findViewById(R.id.four2);
        four3=(ImageView)findViewById(R.id.four3);
        four4=(ImageView)findViewById(R.id.four4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(getApplicationContext(), "tjhbk", Toast.LENGTH_LONG).show();
                int r41 = rng.nextInt(6) + 1;
                switch (r41) {
                    case 1:
                        four1.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        four1.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        four1.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        four1.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        four1.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        four1.setImageResource(R.drawable.six);
                        break;
                }

                int r42 = rng.nextInt(6) + 1;
                switch (r42) {
                    case 1:
                        four2.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        four2.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        four2.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        four2.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        four2.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        four2.setImageResource(R.drawable.six);
                        break;
                }

                int r43 = rng.nextInt(6) + 1;
                switch (r43) {
                    case 1:
                        four3.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        four3.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        four3.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        four3.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        four3.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        four3.setImageResource(R.drawable.six);
                        break;
                }

                int r44 = rng.nextInt(6) + 1;
                switch (r44) {
                    case 1:
                        four4.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        four4.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        four4.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        four4.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        four4.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        four4.setImageResource(R.drawable.six);
                        break;
                }
            }
        });
        
    }
}
