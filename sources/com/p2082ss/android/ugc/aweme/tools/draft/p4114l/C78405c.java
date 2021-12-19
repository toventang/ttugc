package com.p2082ss.android.ugc.aweme.tools.draft.p4114l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.l.c */
public final class C78405c extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    int f176150a = -1;

    /* renamed from: b */
    int f176151b;

    /* renamed from: c */
    private boolean f176152c;

    /* renamed from: d */
    private Paint f176153d;

    /* renamed from: e */
    private int f176154e;

    /* renamed from: f */
    private int f176155f;

    /* renamed from: g */
    private int f176156g;

    /* renamed from: h */
    private float f176157h;

    /* renamed from: i */
    private float f176158i;

    static {
        Covode.recordClassIndex(91531);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i = 0;
        if (this.f176156g == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int top = childAt.getTop() + ((RecyclerView.C1367j) childAt.getLayoutParams()).topMargin;
                int i2 = top - this.f176155f;
                if (this.f176152c) {
                    canvas.drawRect(this.f176157h + 0.0f, (float) i2, ((float) measuredWidth) - this.f176158i, (float) top, this.f176153d);
                } else {
                    float f = (float) i2;
                    float f2 = (float) top;
                    canvas.drawRect(0.0f, f, this.f176157h, f2, this.f176153d);
                    float f3 = (float) measuredWidth;
                    canvas.drawRect(f3 - this.f176158i, f, f3, f2, this.f176153d);
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
            int i3 = left - this.f176155f;
            if (this.f176152c) {
                canvas.drawRect((float) i3, this.f176157h + 0.0f, (float) left, ((float) measuredHeight) - this.f176158i, this.f176153d);
            } else {
                float f4 = (float) i3;
                float f5 = this.f176157h;
                float f6 = (float) left;
                canvas.drawRect(f4, f5 + 0.0f, f6, f5, this.f176153d);
                float f7 = (float) measuredHeight;
                canvas.drawRect(f4, f7 - this.f176158i, f6, f7, this.f176153d);
            }
            i++;
        }
    }

    public C78405c(int i, int i2, float f, float f2) {
        this.f176154e = i;
        this.f176155f = i2;
        this.f176156g = 1;
        Paint paint = new Paint(1);
        this.f176153d = paint;
        paint.setColor(this.f176154e);
        this.f176153d.setStyle(Paint.Style.FILL);
        this.f176157h = f;
        this.f176158i = f2;
        this.f176152c = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        int i2;
        int d = RecyclerView.m4277d(view);
        if (this.f176156g == 1) {
            if (d == this.f176150a) {
                i2 = this.f176151b;
            } else {
                i2 = this.f176155f;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (d == this.f176150a) {
            i = this.f176151b;
        } else {
            i = this.f176155f;
        }
        rect.set(0, 0, i, 0);
    }
}
