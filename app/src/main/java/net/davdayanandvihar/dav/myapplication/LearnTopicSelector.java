package net.davdayanandvihar.dav.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.dav.myapplication.R;

public class LearnTopicSelector extends AppCompatActivity {
    Intent learnIntent;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_topic_selector);
        learnIntent = new Intent(this, learn.class);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b10=(Button) findViewById(R.id.button10);
        b11=(Button) findViewById(R.id.button11);
        b12=(Button) findViewById(R.id.button12);
        b13=(Button) findViewById(R.id.button13);
        b14=(Button) findViewById(R.id.button14);
        b15=(Button) findViewById(R.id.button15);
        b16=(Button) findViewById(R.id.button16);
        b17=(Button) findViewById(R.id.button17);
        b18=(Button) findViewById(R.id.button18);
        b19=(Button) findViewById(R.id.button19);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                learnIntent.putExtra("identifier",1);
                startActivity(learnIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",2);
                startActivity(learnIntent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",3);
                startActivity(learnIntent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",4);
                startActivity(learnIntent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",5);
                startActivity(learnIntent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",6);
                startActivity(learnIntent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",7);
                startActivity(learnIntent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",8);
                startActivity(learnIntent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",9);
                startActivity(learnIntent);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 10);
                startActivity(learnIntent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier",11);
                startActivity(learnIntent);
            }

        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 12);
                startActivity(learnIntent);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 13);
                startActivity(learnIntent);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 14);
                startActivity(learnIntent);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 15);
                startActivity(learnIntent);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 16);
                startActivity(learnIntent);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 17);
                startActivity(learnIntent);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 18);
                startActivity(learnIntent);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent.putExtra("identifier", 19);
                startActivity(learnIntent);
            }
        });

    }





}


