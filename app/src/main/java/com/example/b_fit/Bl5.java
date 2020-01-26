package com.example.b_fit;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bl5 extends Blogs {

    TextView tv1;
    String s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog5);
        Intent getbintent = getIntent();
        tv1=(TextView)findViewById(R.id.tv1);
        s1="Eating and drinking the right things\n" +
                "\n" +
                "It can be hard to keep a healthy diet. Especially when there's a temptation to eat sweets and junk food." +
                " But it's important to get a balance in your diet of the right amount of each food group.\n" +
                "\n" +
                "A balanced diet also includes drinks. Your body needs to stay hydrated to keep healthy." +
                " But think about what you drink. Caffeine and sugary drinks:\n" +
                "\n" +
                "can cause mood swings\n" +
                "affect your energy levels, feeling full of energy before a \"sugar low\" where you may feel tired and grumpy\n" +
                "can make you put on weight if you have too much sugar\n" +
                "can give you trouble sleeping if you have them at night.\n" +
                "It's best to drink water and natural juices which don't have loads of sugar. ";



        tv1.setText(s1);
        tv1.setMovementMethod(new ScrollingMovementMethod());
    }
}
