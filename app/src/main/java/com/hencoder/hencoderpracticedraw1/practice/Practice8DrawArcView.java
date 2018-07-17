package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        canvas.drawArc(200,100,800,500, // 两个点确定椭圆的大小和位置
                20, // 起始位置
                100, // 弧线扫过的角度，精确值弧线扫过的长度，顺时针旋转
                true, // 连接圆心
                paint);
        canvas.drawArc(200,100,800,500, // 两个点确定椭圆的大小和位置
                190, // 起始位置
                50, // 弧线扫过的角度，精确值弧线扫过的长度，顺时针旋转
                false, // 连接圆心
                paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200,100,800,500, // 两个点确定椭圆的大小和位置
                250, // 起始位置
                120, // 弧线扫过的角度，精确值弧线扫过的长度，顺时针旋转
                true, // 连接圆心
                paint);
    }
}
