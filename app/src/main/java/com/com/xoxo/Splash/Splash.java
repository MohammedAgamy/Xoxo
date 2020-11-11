package com.com.xoxo.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.com.xoxo.ChosePlay.PlayerWith;
import com.com.xoxo.R;

public class Splash extends AppCompatActivity {
    LottieAnimationView mLottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLottie = findViewById(R.id.animationView);
        mLottie.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                mLottie.pauseAnimation();

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                mLottie.pauseAnimation();
                startActivity(new Intent(Splash.this, PlayerWith.class));
                finish();
            }
        });


    }
}