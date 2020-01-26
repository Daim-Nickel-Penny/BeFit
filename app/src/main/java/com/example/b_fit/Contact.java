package com.example.b_fit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Contact extends MainActivity {


    Button b1,b2,b3,b4;
    TextView textView,tv;
    VideoView videoViewc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactme);
        Intent intentt=getIntent();
        videoViewc=(VideoView)findViewById(R.id.videoView);
        videoViewc.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoViewc.start();
            }
        });
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.contac);
        videoViewc.setVideoURI(uri);
        videoViewc.requestFocus();
        videoViewc.start();

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        textView=(TextView)findViewById(R.id.textview);
        tv=(TextView)findViewById(R.id.textview1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/i_am_daim_/?hl=en"));
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/daimk29?lang=en"));
                startActivity(intent2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contact.this, "daimk558@gmail.com", Toast.LENGTH_LONG).show();
            }
        });



    }
    @Override
    protected void onStart () {
        super.onStart();
        videoViewc.start();

    }
}


