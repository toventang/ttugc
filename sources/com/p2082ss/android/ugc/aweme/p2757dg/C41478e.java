package com.p2082ss.android.ugc.aweme.p2757dg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;

/* renamed from: com.ss.android.ugc.aweme.dg.e */
public final class C41478e extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public float f96778a;

    /* renamed from: b */
    public Paint f96779b;

    /* renamed from: c */
    public int f96780c = 1;

    /* renamed from: d */
    private float f96781d;

    static {
        Covode.recordClassIndex(49377);
    }

    public C41478e() {
        Paint paint = new Paint();
        this.f96779b = paint;
        paint.setAntiAlias(true);
        this.f96779b.setColor(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int d = RecyclerView.m4277d(childAt);
            if (!(d == 0 || d == childCount - 1)) {
                if (this.f96780c == 1) {
                    float top = ((float) childAt.getTop()) - this.f96778a;
                    canvas.drawRect(((float) recyclerView.getPaddingLeft()) + this.f96781d, top, ((float) (recyclerView.getWidth() - recyclerView.getPaddingRight())) - this.f96781d, (float) childAt.getTop(), this.f96779b);
                } else {
                    canvas.drawRect(((float) childAt.getLeft()) - this.f96778a, ((float) recyclerView.getPaddingTop()) + this.f96781d, (float) childAt.getLeft(), ((float) (recyclerView.getHeight() - recyclerView.getPaddingBottom())) - this.f96781d, this.f96779b);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m4277d(view) != 0) {
            if (this.f96780c == 1) {
                rect.top = (int) this.f96778a;
            } else if (C23163i.m43663a(view.getContext())) {
                rect.right = (int) this.f96778a;
            } else {
                rect.left = (int) this.f96778a;
            }
        }
    }
}
