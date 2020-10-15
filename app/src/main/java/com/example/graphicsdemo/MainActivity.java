package com.example.graphicsdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    ImageView ourView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        draw();
        setContentView(ourView);
    }

    private void draw() {
        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(5000,3000,Bitmap.Config.ARGB_8888);

        Canvas canvas;
        canvas = new Canvas(blankBitmap);
        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();
        canvas.drawColor(Color.argb(255,0,150,0));
        paint.setTextSize(250);

        paint.setColor(Color.argb(255,255,255,255));
        Bitmap bitmapBob;
        bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.genshin);

        canvas.drawBitmap(bitmapBob, 0, 300, paint);
        canvas.drawPoint(0,0,paint);
        canvas.drawText("This is My Journey, and I Enjoy it...", 650,250, paint);
        paint.setColor(Color.argb(255,  249, 129, 0));

    }
}