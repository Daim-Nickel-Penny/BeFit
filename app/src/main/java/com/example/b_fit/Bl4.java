package com.example.b_fit;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bl4 extends Blogs {

    TextView tv1;
    String s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog4);
        Intent getbintent = getIntent();
        tv1=(TextView)findViewById(R.id.tv1);
        s1="One portion should include:\n" +
                "\n" +
                "carbohydrates - like potatoes, pasta, rice and bread. " +
                "A portion should be about the size of a fist.\n" +
                "protein from non dairy sources – like meat, fish, beans, soya and tofu. " +
                "A portion should be about the size of a deck of cards.\n" +
                "dairy – like milk and cheese. A portion should be about a 200ml of milk, " +
                "a matchbox size piece of cheese or an average pot (125ml) of yoghurt.\n" +
                "fruit and vegetables - at least five portions of per day. " +
                "For fresh fruit and vegetables, a portion should be about a cupped hand. For dried fruit, " +
                "a portion should be about half a cupped hand.\n" +
                "NHS website has more info about balanced diets.";



        tv1.setText(s1);
        tv1.setMovementMethod(new ScrollingMovementMethod());
    }
}
