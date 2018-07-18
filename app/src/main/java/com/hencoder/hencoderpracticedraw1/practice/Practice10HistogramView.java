package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);

        Path path = new Path(); //
        path.moveTo(150,20);
        path.lineTo(150,500);
        path.lineTo(900,500);

        canvas.drawPath(path,paint);

        // 柱状图
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(180,400,280,500,paint);
        canvas.drawRect(300,80,400,500,paint);
        canvas.drawRect(420,150,520,500,paint);

        // 字
        paint.setTextSize(22);
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        canvas.drawText("Lolipop",180,520,paint);
        canvas.drawText("KikTy",300,520,paint);
        canvas.drawText("Lolipop",420,520,paint);

    }
}
