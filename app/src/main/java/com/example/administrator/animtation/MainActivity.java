package com.example.administrator.animtation;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] buttons ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons = new Button[8];
        for(int i = 1; i<buttons.length ; i++){
            String btnid = "btn"+i;
            int resid = getResources().getIdentifier(btnid,"id",getPackageName());
            buttons[i]=findViewById(resid);
            buttons[i].setOnClickListener(this);

        }

    }

    public void clockwise(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        image.startAnimation(animation);
    }
    public void blink(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        image.startAnimation(animation);
    }
    public void fade(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        image.startAnimation(animation);
    }
    public void move(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        image.startAnimation(animation);
    }
    public void slide(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        image.startAnimation(animation);
    }
    public void zoom(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        image.startAnimation(animation);
    }
    public void zoom2(View view){
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom2);
        image.startAnimation(animation);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                clockwise(v);
                break;
            case R.id.btn2:
                blink(v);
                break;
            case R.id.btn3:
                fade(v);
                break;
            case R.id.btn4:
                move(v);
                break;
            case R.id.btn5:
                slide(v);
                break;
            case R.id.btn6:
                zoom(v);
                break;
            case R.id.btn7:
                zoom2(v);
                break;
        }

    }
}
