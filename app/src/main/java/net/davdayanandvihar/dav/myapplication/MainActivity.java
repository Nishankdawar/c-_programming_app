package net.davdayanandvihar.dav.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.dav.myapplication.R;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;

    Intent a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.learn);
        b2 = (Button) findViewById(R.id.quiz10);
        b3 = (Button) findViewById(R.id.settings);
        b4 = (Button) findViewById(R.id.share);
        a = new Intent(this, LearnTopicSelector.class);
        b = new Intent(this, QuizTopicSelector.class);
        c = new Intent(this, forum.class);
        d= new Intent(this, Game.class);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(a);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.putExtra("identifier",500);
                startActivity(c);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(b);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(d);
            }
        });

    }
    void abcd() {



    }

}
