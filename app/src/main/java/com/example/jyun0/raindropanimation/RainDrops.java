package com.example.jyun0.raindropanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RainDrops extends View {
    private final List<RainDrop> drops = new ArrayList<>();
    private int animationTrick = 0;
    public static int DROPS_PER_SEC = 2;

    public RainDrops(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        for(RainDrop drop: drops){
            drop.setY(drop.getY() + 10);
            canvas.drawCircle(drop.getX(), drop.getY(), drop.getRadius(), drop.getPaint());
        }
        animationTrick++;
        // Every 1 sec, animationTick gets incremented by 50
        if(animationTrick % (50 / DROPS_PER_SEC) == 0){
            float rand = (float) Math.random() * canvas.getWidth();
            RainDrop drop = new RainDrop(rand, 0 , 20);
            drops.add(drop);
        }
    }
}
