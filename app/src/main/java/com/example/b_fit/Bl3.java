package com.example.b_fit;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bl3 extends Blogs {
    TextView tv1;
    String s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog3);
        Intent getbintent = getIntent();
        tv1=(TextView)findViewById(R.id.tv1);
        s1="Things that harm your health Smoking, drinking alcohol and taking drugs can harm your health and cancel out the effects of a good diet and exercise.\n" +
                "\n" +
                "Doing these things can:\n" +
                "\n" +
                "lower your immune system, which protects you from getting ill\n" +
                "cause mental health problems\n" +
                "cause depression.";



        tv1.setText(s1);
        tv1.setMovementMethod(new ScrollingMovementMethod());
    }


}



