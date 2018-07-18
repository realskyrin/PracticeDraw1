package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#f13f3c"));
        canvas.drawArc(100-10,50-10,600-10,550-10,
                180,
                100,
                true,
                paint);

        paint.setColor(Color.parseColor("#159688"));
        canvas.drawArc(100,50,600,550,
                280,
                20,
                true,
                paint);

        paint.setColor(Color.parseColor("#9a27ae"));
        canvas.drawArc(100,50,600,550,
                300,
                30,
                true,
                paint);

        paint.setColor(Color.parseColor("#2a97f0"));
        canvas.drawArc(100,50,600,550,
                330,
                100,
                true,
                paint);

        paint.setColor(Color.parseColor("#fec02c"));
        canvas.drawArc(100,50,600,550,
                70,
                110,
                true,
                paint);
    }
}
