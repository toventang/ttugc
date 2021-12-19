package com.p2082ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.g */
public final class C81436g extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    int f182013a;

    /* renamed from: b */
    int f182014b;

    /* renamed from: c */
    private boolean f182015c;

    /* renamed from: d */
    private Paint f182016d;

    /* renamed from: e */
    private int f182017e;

    /* renamed from: f */
    private int f182018f;

    /* renamed from: g */
    private int f182019g;

    /* renamed from: h */
    private float f182020h;

    /* renamed from: i */
    private float f182021i;

    static {
        Covode.recordClassIndex(94805);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i = 0;
        if (this.f182019g == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int top = childAt.getTop() + ((RecyclerView.C1367j) childAt.getLayoutParams()).topMargin;
                int i2 = top - this.f182018f;
                if (this.f182015c) {
                    canvas.drawRect(this.f182020h + 0.0f, (float) i2, ((float) measuredWidth) - this.f182021i, (float) top, this.f182016d);
                } else {
                    float f = (float) i2;
                    float f2 = (float) top;
                    canvas.drawRect(0.0f, f, this.f182020h, f2, this.f182016d);
                    float f3 = (float) measuredWidth;
                    canvas.drawRect(f3 - this.f182021i, f, f3, f2, this.f182016d);
                }
                i++;
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            int left = childAt2.getLeft() + ((RecyclerView.C1367j) childAt2.getLayoutParams()).leftMargin;
            int i3 = left - this.f182018f;
            if (this.f182015c) {
                canvas.drawRect((float) i3, this.f182020h + 0.0f, (float) left, ((float) measuredHeight) - this.f182021i, this.f182016d);
            } else {
                float f4 = (float) i3;
                float f5 = this.f182020h;
                float f6 = (float) left;
                canvas.drawRect(f4, f5 + 0.0f, f6, f5, this.f182016d);
                float f7 = (float) measuredHeight;
                canvas.drawRect(f4, f7 - this.f182021i, f6, f7, this.f182016d);
            }
            i++;
        }
    }

    public C81436g(int i, int i2, float f, float f2) {
        this(i, i2, 1, f, f2, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        int i2;
        int d = RecyclerView.m4277d(view);
        if (this.f182019g == 1) {
            if (d == this.f182013a) {
                i2 = this.f182014b;
            } else {
                i2 = this.f182018f;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (d == this.f182013a) {
            i = this.f182014b;
        } else {
            i = this.f182018f;
        }
        rect.set(0, 0, i, 0);
    }

    public C81436g(int i, int i2, int i3, float f, float f2, boolean z) {
        this.f182013a = -1;
        this.f182017e = i;
        this.f182018f = i2;
        this.f182019g = i3;
        Paint paint = new Paint(1);
        this.f182016d = paint;
        paint.setColor(this.f182017e);
        this.f182016d.setStyle(Paint.Style.FILL);
        this.f182020h = f;
        this.f182021i = f2;
        this.f182015c = z;
    }
}
