package com.com.xoxo.ChosePlay;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.com.xoxo.Play.Player;
import com.com.xoxo.Play.Robot;
import com.com.xoxo.R;

public class PlayerWith extends AppCompatActivity implements View.OnClickListener {
    Button mPlayer, mRobot;
    LottieAnimationView mLottie;
    TextView mOr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_one);
        iniview();

    }

    private void iniview() {
        mPlayer = findViewById(R.id.player);
        mPlayer.setOnClickListener(this);
        mRobot = findViewById(R.id.robot);
        mRobot.setOnClickListener(this);
       // mLottie=findViewById(R.id.animationView2);
        mOr=findViewById(R.id.or);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.player:
                startActivity(new Intent(PlayerWith.this, Player.class));
                finish();
                break;
            case R.id.robot:
              startActivity(new Intent(PlayerWith.this, Robot.class));
                finish();
                break;
        }
    }

    private void animPlay()
    {
        mLottie.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }
}
