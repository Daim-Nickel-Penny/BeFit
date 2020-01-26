package com.example.b_fit;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bl1 extends Blogs {

    TextView tv1;
    String s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog1);
        Intent getbintent = getIntent();
        tv1=(TextView)findViewById(R.id.tv1);
        s1="Being fit means that you are able to push the limits of your body and not face \n " +
                "any serious consequences as a result. \n" +
                "It improves your mood \n" +
                "It improves your looks "+"Plenty of ways to keep fit\n" +
                "Exercise doesn't have to mean taking part in a team sport or spending lots of money on expensive equipment. " +
                "Try doing something you enjoy. It could be:\n"+"1 walking\n" +
                "2 swimming\n" +
                "3 jogging\n" +
                "4 ice skating\n" +
                "5 skipping\n" +
                "6 dancing\n" +
                "7 yoga.";



        tv1.setText(s1);
        tv1.setMovementMethod(new ScrollingMovementMethod());
    }
}
