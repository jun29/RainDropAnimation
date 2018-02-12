package com.example.jyun0.raindropanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //    private Thread thread;
    private AnimationHelper mAnimationHelper;
    private RainDrops mRainDrops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRainDrops = findViewById(R.id.raindrops);
        mAnimationHelper = new AnimationHelper(mRainDrops, 50);
    }

    public void startAnimation(View view){
        RainDrops.DROPS_PER_SEC = 1;
        mAnimationHelper.start();
        /*
            << Old Way >>
            final AnimationView av = findViewById(R.id.myAnimationView);
            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    av.doAnimation();
                }
            });
            thread.start();
        */
    }
    public void stopAnimation(View view){
        mAnimationHelper.stop();
    }
}
