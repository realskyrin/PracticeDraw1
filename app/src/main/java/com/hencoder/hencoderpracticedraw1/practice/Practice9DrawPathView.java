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
    Path pathStar;

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

        // star
        pathStar = new Path();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        pathStar.setFillType(Path.FillType.EVEN_ODD);
        pathStar.moveTo(200,300);
        pathStar.lineTo(500,300);
        pathStar.lineTo(230,500);
        pathStar.lineTo(350,50);
        pathStar.lineTo(470,500);
        pathStar.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
//        canvas.drawPath(path,paint);
        canvas.drawPath(pathStar,paint);
    }
}
