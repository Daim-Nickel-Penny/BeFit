package com.example.b_fit;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.b_fit.MainActivity;

public class Blogs extends MainActivity {

    Button bl1 ,bl2,bl3,bl4,bl5 ;
        TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blogs);
        Intent getbintent =getIntent();
        bl1=(Button)findViewById(R.id.bl1);
        bl2=(Button)findViewById(R.id.bl2);
        bl3=(Button)findViewById(R.id.bl3);
        bl4=(Button)findViewById(R.id.bl4);
        bl5=(Button)findViewById(R.id.bl5);
        textView1=(TextView)findViewById(R.id.textview);
        Toast.makeText(this,"Tap",Toast.LENGTH_SHORT).show();

        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.kh"));
                startActivity(intent);
            }
        });


        bl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Intent.ACTION_VIEW,Uri.parse("https://blog.myfitnesspal.com/how-music-influences-your-workout/"));
                startActivity(intent1);
            }
        });


        bl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://blog.myfitnesspal.com/is-cutting-carbs-the-key-to-losing-weight/?otm_medium=onespot&otm_source=onsite&otm_content=article-page:article-footer-unit&otm_click_id=4eabab0b-6919-486a-8327-9a70d288144b"));
                startActivity(intent2);
            }
        });

        bl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://blog.myfitnesspal.com/3-ways-weight-loss-changes-your-brain/?otm_medium=onespot&otm_source=onsite&otm_content=article-page:article-footer-unit&otm_click_id=f738215c-ba94-495d-ae77-5e029812fcd9"));
                startActivity(intent4);
            }
        });

        bl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://blog.myfitnesspal.com/12-healthy-foods-fill-best/?otm_medium=onespot&otm_source=onsite&otm_content=article-page:article-footer-unit&otm_click_id=467f400b-4e60-4387-a069-24fdd908e969"));
                startActivity(intent5);
            }
        });


    }

}
