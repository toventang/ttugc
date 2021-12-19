package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.friends.a.d */
public final class C51453d extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    int f118590a;

    /* renamed from: b */
    int f118591b;

    /* renamed from: c */
    private Paint f118592c;

    /* renamed from: d */
    private int f118593d;

    /* renamed from: e */
    private int f118594e;

    /* renamed from: f */
    private int f118595f;

    /* renamed from: g */
    private float f118596g;

    /* renamed from: h */
    private float f118597h;

    static {
        Covode.recordClassIndex(60712);
    }

    public C51453d(int i, int i2, int i3) {
        this(i, i2, i3, 0.0f, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i = 0;
        if (this.f118595f == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            int itemCount = recyclerView.getAdapter().getItemCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int d = RecyclerView.m4277d(childAt);
                if (d > 0 && d < itemCount - 1 && d != this.f118590a + 1) {
                    int top = childAt.getTop() + ((RecyclerView.C1367j) childAt.getLayoutParams()).topMargin;
                    float f = (float) top;
                    float f2 = (float) (top + 1);
                    canvas.drawRect(0.0f, f, this.f118596g + 0.0f, f2, this.f118592c);
                    float f3 = (float) measuredWidth;
                    canvas.drawRect(f3 - this.f118597h, f, f3, f2, this.f118592c);
                }
                i++;
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            int d2 = RecyclerView.m4277d(childAt2);
            if (d2 > 0 && d2 < childCount2 - 1 && d2 != this.f118590a + 1) {
                int left = childAt2.getLeft() + ((RecyclerView.C1367j) childAt2.getLayoutParams()).leftMargin;
                float f4 = (float) (left - this.f118594e);
                canvas.drawRect(f4, 0.0f, f4, this.f118596g + 0.0f, this.f118592c);
                float f5 = (float) left;
                float f6 = (float) measuredHeight;
                canvas.drawRect(f5, f6 - this.f118597h, f5, f6, this.f118592c);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        int i2;
        int d = RecyclerView.m4277d(view);
        if (this.f118595f == 1) {
            if (d == this.f118590a) {
                i2 = this.f118591b;
            } else {
                i2 = this.f118594e;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (d == this.f118590a) {
            i = this.f118591b;
        } else {
            i = this.f118594e;
        }
        rect.set(0, 0, i, 0);
    }

    public C51453d(int i, int i2, int i3, float f, float f2) {
        this.f118590a = -1;
        this.f118593d = i;
        this.f118594e = i2;
        this.f118595f = i3;
        Paint paint = new Paint(1);
        this.f118592c = paint;
        paint.setColor(this.f118593d);
        this.f118592c.setStyle(Paint.Style.FILL);
        this.f118596g = f;
        this.f118597h = f2;
    }
}
