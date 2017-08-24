package net.davdayanandvihar.dav.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.dav.myapplication.R;

public class Game extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Intent learnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        b1=(Button) findViewById(R.id.buttongame1);
        b2=(Button) findViewById(R.id.buttongame2);
        b3=(Button) findViewById(R.id.buttongame3);
        b4=(Button) findViewById(R.id.buttongame4);
        b5=(Button) findViewById(R.id.buttongame5);
        b6=(Button) findViewById(R.id.buttongame6);
        b7=(Button) findViewById(R.id.buttongame7);
        b8=(Button) findViewById(R.id.buttongame8);


        learnIntent= new Intent(this,learn.class);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                learnIntent.putExtra("identifier",20);
                startActivity(learnIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",21);
                startActivity(learnIntent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",22);
                startActivity(learnIntent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",23);
                startActivity(learnIntent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",24);
                startActivity(learnIntent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",25);
                startActivity(learnIntent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",26);
                startActivity(learnIntent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",27);
                startActivity(learnIntent);
            }
        });

    }
}

