package com.example.jyun0.raindropanimation;

import android.graphics.Paint;

public class RainDrop {
    private float x;
    private float y;
    private float radius;
    private Paint paint;
    private int r = 0;
    private int g = 0;
    private int b = 0;

    public RainDrop(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.paint = new Paint();
        r = ((int) (Math.random() * 255));
        g = ((int) (Math.random() * 255));
        b = ((int) (Math.random() * 255));
        this.paint.setARGB(255, r, g, b);
    }

    public RainDrop(float x, float y, float radius, Paint paint) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.paint = paint;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }
}


