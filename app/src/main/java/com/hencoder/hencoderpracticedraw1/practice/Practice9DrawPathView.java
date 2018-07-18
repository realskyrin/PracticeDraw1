package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    Paint paint;
    Path path;

    public Practice9DrawPathView(Context context) {
        super(context);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        path = new Path();
        RectF rectF = new RectF(200,100,500,400);
        path.addArc(rectF,130,220);
        rectF = new RectF(500,100,800,400);
        path.arcTo(rectF,180,230,false);
        path.lineTo(500,600);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
//        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(points, new Paint());
//
//        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        paint.setColor(Color.RED);
//
//        canvas.drawCircle(200,200,130,paint);
//        canvas.drawCircle(460,200,130,paint);
//
//        Path path = new Path();
//        paint.setColor(Color.RED);
//        path.moveTo(80,255);
//        path.lineTo(580,255);
//        path.lineTo(330,550);
//        path.close();
        canvas.drawPath(path,paint);
    }
}
