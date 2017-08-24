package net.davdayanandvihar.dav.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.dav.myapplication.R;


public class QuizTopicSelector extends AppCompatActivity {
    Button one, two, three,four, five, six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone,twentytwo,twentythree;
    Intent intent,a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_topic_selector);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);

        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        twelve=(Button) findViewById(R.id.tewlve);
        ten = (Button) findViewById(R.id.ten);
        eleven = (Button) findViewById(R.id.eleven);
        thirteen=(Button) findViewById(R.id.thirteen);
        fourteen=(Button) findViewById(R.id.fourteen);
        fifteen=(Button) findViewById(R.id.fifteen);
        sixteen=(Button) findViewById(R.id.sixteen);
        seventeen=(Button) findViewById(R.id.seventeen);
        eighteen=(Button) findViewById(R.id.eighteen);
        nineteen=(Button) findViewById(R.id.nineteen);
        twenty=(Button) findViewById(R.id.twenty);
        twentyone=(Button) findViewById(R.id.twentyone);
        twentytwo=(Button) findViewById(R.id.twentytwo);
        twentythree=(Button) findViewById(R.id.twentythree);



        intent = new Intent(this, learn.class);
        a=new Intent(this,learn.class);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("identifier",201);
                finish();
                startActivity(intent);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("identifier", 202);
                finish();
                startActivity(intent);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("identifier", 203);
                finish();
                startActivity(intent);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("identifier", 204);
                finish();
                startActivity(intent);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("identifier", 205);
                finish();
                startActivity(intent);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier", 207);
                finish();
                startActivity(a);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("identifier", 208);
                finish();
                startActivity(intent);
            }
        });


        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier", 210);
                finish();
                startActivity(a);
            }
        });eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier", 211);
                finish();
                startActivity(a);
            }
        });twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",212);
                startActivity(a);

            }
        });
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",213);
                startActivity(a);

            }
        });fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",214);
                startActivity(a);

            }
        });
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",215);
                startActivity(a);

            }
        });
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",216);
                startActivity(a);

            }
        });
        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",217);
                startActivity(a);

            }
        });
        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",218);
                startActivity(a);

            }
        });
        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",219);
                startActivity(a);

            }
        });
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",220);
                startActivity(a);

            }
        });
        twentyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",221);
                startActivity(a);

            }
        });
        twentytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",222);
                startActivity(a);

            }
        });
        twentythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.putExtra("identifier",223);
                startActivity(a);

            }
        });

    }



}

