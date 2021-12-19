package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.l */
public class C34692l extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private static final String f81952a = C34692l.class.getSimpleName();

    /* renamed from: b */
    private final int f81953b = 1;

    /* renamed from: c */
    private final int f81954c;

    /* renamed from: d */
    private final int f81955d;

    /* renamed from: e */
    private final Paint f81956e;

    /* renamed from: f */
    private int f81957f;

    /* renamed from: g */
    private int f81958g;

    static {
        Covode.recordClassIndex(41679);
    }

    /* renamed from: a */
    public static C34692l m70857a(Context context) {
        C34692l lVar = new C34692l(1, context.getResources().getColor(R.color.b2));
        int a = C34728n.m70946a(16.0d);
        int a2 = C34728n.m70946a(16.0d);
        lVar.f81957f = a;
        lVar.f81958g = a2;
        return lVar;
    }

    public C34692l(int i, int i2) {
        Paint paint = new Paint();
        this.f81956e = paint;
        paint.setAntiAlias(true);
        paint.setColor(i2);
        this.f81954c = i;
        this.f81955d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        int i = 0;
        if (this.f81953b == 1) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft() + this.f81957f;
            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f81958g;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    int bottom = childAt.getBottom() + ((RecyclerView.C1367j) childAt.getLayoutParams()).bottomMargin;
                    canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f81955d + bottom), this.f81956e);
                    i++;
                } else {
                    return;
                }
            }
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            if (childAt2 != null) {
                int height = childAt2.getHeight() - recyclerView.getPaddingBottom();
                int right = childAt2.getRight() + ((RecyclerView.C1367j) childAt2.getLayoutParams()).rightMargin;
                canvas.drawRect((float) right, (float) paddingTop, (float) (this.f81955d + right), (float) height, this.f81956e);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        int a = sVar.mo4782a();
        int e = RecyclerView.m4278e(view);
        if (e == -1 || !(layoutManager instanceof LinearLayoutManager) || (layoutManager instanceof GridLayoutManager)) {
            return;
        }
        if (this.f81953b == 1) {
            if (e == a) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, 0, this.f81954c);
            }
        } else if (e == a) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, this.f81954c, 0);
        }
    }
}
