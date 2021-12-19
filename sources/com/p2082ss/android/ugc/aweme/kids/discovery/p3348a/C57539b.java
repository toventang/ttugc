package com.p2082ss.android.ugc.aweme.kids.discovery.p3348a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.b */
public class C57539b extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private static final int[] f131348a = {16843284};

    /* renamed from: b */
    private Drawable f131349b;

    /* renamed from: c */
    private int f131350c;

    /* renamed from: d */
    private final int f131351d;

    /* renamed from: e */
    private final int f131352e;

    /* renamed from: f */
    private final int f131353f;

    /* renamed from: g */
    private final Rect f131354g;

    static {
        Covode.recordClassIndex(67489);
    }

    public C57539b(int i, int i2) {
        this(i, i2, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() != null && this.f131349b != null) {
            int i3 = 0;
            if (this.f131350c == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i2 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i3 < childCount) {
                    View childAt = recyclerView.getChildAt(i3);
                    RecyclerView.m4262a(childAt, this.f131354g);
                    int round = this.f131354g.bottom + Math.round(childAt.getTranslationY());
                    this.f131349b.setBounds(this.f131352e + i2, round - this.f131351d, width - this.f131353f, round);
                    this.f131349b.draw(canvas);
                    i3++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i3 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i3);
                recyclerView.getLayoutManager();
                RecyclerView.m4262a(childAt2, this.f131354g);
                int round2 = this.f131354g.right + Math.round(childAt2.getTranslationX());
                this.f131349b.setBounds(round2 - this.f131351d, this.f131352e + i, round2, height - this.f131353f);
                this.f131349b.draw(canvas);
                i3++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        if (this.f131349b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f131350c == 1) {
            rect.set(0, 0, 0, this.f131351d);
        } else {
            rect.set(0, 0, this.f131351d, 0);
        }
    }

    public C57539b(int i, int i2, int i3, int i4, int i5) {
        this.f131354g = new Rect();
        this.f131349b = new ColorDrawable(i);
        this.f131351d = i2;
        this.f131352e = i4;
        this.f131353f = i5;
        this.f131350c = i3;
    }
}
