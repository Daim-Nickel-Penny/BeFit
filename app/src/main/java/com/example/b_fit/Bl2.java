package com.example.b_fit;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bl2 extends Blogs {

    TextView tv1;
    String s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog2);
        Intent getbintent = getIntent();
        tv1=(TextView)findViewById(R.id.tv1);
        s1="If you're worried you might be overweight or underweight, it's best to to speak to a doctor for advice before you do anything.\n" +
                "\n" +
                "A doctor can:\n" +
                "\n" +
                "advise you about how much weight you might need to lose or gain\n" +
                "give you a sensible eating and exercise plan to help you lose or gain weight\n" +
                "help you plan what food and exercise is right for you.\n" +
                "If you're worried about anything to do with staying healthy you can talk to us anytime.";
        tv1.setText(s1);
        tv1.setMovementMethod(new ScrollingMovementMethod());
    }
}
