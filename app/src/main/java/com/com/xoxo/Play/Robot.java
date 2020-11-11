package com.com.xoxo.Play;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.com.xoxo.ChosePlay.PlayerWith;
import com.com.xoxo.R;

import java.util.ArrayList;
import java.util.Random;

public class Robot extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, mBack;
    LottieAnimationView mLottie_Robot, mLottie_bravo ,mBot;
    LinearLayout mLayout;
    int mCode = 0;
    int changePlayer = 1;
    ArrayList<Integer> PlayerOne;
    ArrayList<Integer> PlayerTow;
    ArrayList<Integer> PlayerRobo;
    TextView mViewText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot);
        iniview();
        PlayerOne = new ArrayList<Integer>();
        PlayerTow = new ArrayList<Integer>();
        PlayerRobo = new ArrayList<Integer>();
        mLottie_Robot.setVisibility(View.VISIBLE);
        animStart();
        animPravo();
    }

    private void animPravo()
    {
        mLottie_bravo.addAnimatorListener(new Animator.AnimatorListener() {
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
                mLottie_bravo.pauseAnimation();
                startActivity(new Intent(Robot.this,Robot.class));
                finish();
                mLayout.setVisibility(View.VISIBLE);
                mViewText.setVisibility(View.GONE);
            }
        });
    }


    private void animStart() {
        mLottie_Robot.addAnimatorListener(new Animator.AnimatorListener() {
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
                mLottie_Robot.setVisibility(View.GONE);
                mLayout.setVisibility(View.VISIBLE);
            }
        });
    }


    private void iniview() {
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        mBack = findViewById(R.id.Back);
        mBack.setOnClickListener(this);

        mLayout = findViewById(R.id.liner);
        mLottie_bravo = findViewById(R.id.bravo_R);
        mLottie_Robot = findViewById(R.id.anim_R);
        mViewText = findViewById(R.id.text);
        mBot=findViewById(R.id.bot);


    }


    @Override
    public void onClick(View view) {
        Button btnS = (Button) view;
        switch (view.getId()) {
            case R.id.btn1:
                mCode = 1;
                break;
            case R.id.btn2:
                mCode = 2;
                break;
            case R.id.btn3:
                mCode = 3;
                break;
            case R.id.btn4:
                mCode = 4;
                break;
            case R.id.btn5:
                mCode = 5;
                break;
            case R.id.btn6:
                mCode = 6;
                break;
            case R.id.btn7:
                mCode = 7;
                break;
            case R.id.btn8:
                mCode = 8;
                break;
            case R.id.btn9:
                mCode = 9;
                break;
            case R.id.Back:
                startActivity(new Intent(Robot.this, PlayerWith.class));
                finish();
                break;
        }
        payerGamr(btnS);
    }

    void payerGamr(Button btnS) {
        if (changePlayer == 1) {
            btnS.setText("X");
            PlayerOne.add(mCode);
            changePlayer = 2;
            robotPlayer();




        } else if
        (changePlayer == 2) {
            btnS.setText("O");
            btnS.setTextColor(getResources().getColor(R.color.red));
            PlayerTow.add(mCode);
            changePlayer = 1;
        }

        checkWiner(btnS);

    }

    void checkWiner(Button bt) {
        int Win = 0;
        if (PlayerOne.contains(1) && PlayerOne.contains(2) && PlayerOne.contains(3)) {
            Win = 1;
        }
        if (PlayerTow.contains(1) && PlayerTow.contains(2) && PlayerTow.contains(3)) {
            Win = 2;
        }
        if (PlayerOne.contains(4) && PlayerOne.contains(5) && PlayerOne.contains(6)) {
            Win = 1;
        }
        if (PlayerTow.contains(4) && PlayerTow.contains(5) && PlayerTow.contains(6)) {
            Win = 2;
        }
        if (PlayerOne.contains(7) && PlayerOne.contains(8) && PlayerOne.contains(9)) {
            Win = 1;
        }
        if (PlayerTow.contains(7) && PlayerTow.contains(8) && PlayerTow.contains(9)) {
            Win = 2;
        }
        if (PlayerOne.contains(1) && PlayerOne.contains(4) && PlayerOne.contains(7)) {
            Win = 1;
        }
        if (PlayerTow.contains(1) && PlayerTow.contains(4) && PlayerTow.contains(7)) {
            Win = 2;
        }
        if (PlayerOne.contains(2) && PlayerOne.contains(5) && PlayerOne.contains(8)) {
            Win = 1;
        }
        if (PlayerTow.contains(2) && PlayerTow.contains(5) && PlayerTow.contains(8)) {
            Win = 2;
        }
        if (PlayerOne.contains(3) && PlayerOne.contains(6) && PlayerOne.contains(9)) {
            Win = 1;
        }
        if (PlayerTow.contains(3) && PlayerTow.contains(6) && PlayerTow.contains(9)) {
            Win = 2;
        }
        if (PlayerOne.contains(1) && PlayerOne.contains(5) && PlayerOne.contains(9)) {
            Win = 1;
        }
        if (PlayerTow.contains(1) && PlayerTow.contains(5) && PlayerTow.contains(9)) {
            Win = 2;
        }
        if (PlayerOne.contains(3) && PlayerOne.contains(5) && PlayerOne.contains(7)) {
            Win = 1;
        }
        if (PlayerTow.contains(3) && PlayerTow.contains(5) && PlayerTow.contains(7)) {
            Win = 2;
        }


        if (Win != -1) {
            if (Win == 1) {
                mViewText.setText("Bot Win");
                mViewText.setVisibility(View.VISIBLE);
                mBot.setVisibility(View.VISIBLE);
                mBot.playAnimation();
            Bot();

            }
            if (Win == 2) {
                mViewText.setText("Player One Win");
                mViewText.setVisibility(View.VISIBLE);
                mLottie_bravo.setVisibility(View.VISIBLE);
                mLottie_bravo.playAnimation();
                animPravo();
            }

        }



    }

    private void Bot()
    {
        mBot.addAnimatorListener(new Animator.AnimatorListener() {
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
                mBot.pauseAnimation();
                startActivity(new Intent(Robot.this,Robot.class));
                finish();
                mLayout.setVisibility(View.VISIBLE);
                mViewText.setVisibility(View.GONE);
            }
        });
    }

    void robotPlayer() {
        Button btnS;
        for (int i = 1; i < 10; i++) {
            if (!(PlayerOne.contains(i) || PlayerTow.contains(i))) {
                PlayerRobo.add(i);
            }
        }
        Random r = new Random();
        int x = r.nextInt(PlayerRobo.size() - 0) + 0;
        int call = PlayerRobo.get(x);

        switch (call) {
            case 1:
                btnS = findViewById(R.id.btn1);
                break;
            case 2:
                btnS = findViewById(R.id.btn2);
                break;
            case 3:
                btnS = findViewById(R.id.btn3);
                break;
            case 4:
                btnS = findViewById(R.id.btn4);
                break;
            case 5:
                btnS = findViewById(R.id.btn5);
                break;
            case 6:
                btnS = findViewById(R.id.btn6);
                break;
            case 7:
                btnS = findViewById(R.id.btn7);
                break;
            case 8:
                btnS = findViewById(R.id.btn8);
                break;
            case 9:
                btnS = findViewById(R.id.btn9);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + call);
        }
        payerGamr(btnS);
        mCode = call;

    }


}