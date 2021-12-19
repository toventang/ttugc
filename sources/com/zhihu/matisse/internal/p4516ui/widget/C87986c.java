package com.zhihu.matisse.internal.p4516ui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.zhihu.matisse.internal.ui.widget.c */
public final class C87986c extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private int f199849a;

    /* renamed from: b */
    private int f199850b;

    /* renamed from: c */
    private boolean f199851c = false;

    static {
        Covode.recordClassIndex(104011);
    }

    public C87986c(int i, int i2) {
        this.f199849a = i;
        this.f199850b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int d = RecyclerView.m4277d(view);
        int i = this.f199849a;
        int i2 = d % i;
        if (this.f199851c) {
            int i3 = this.f199850b;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * this.f199850b) / this.f199849a;
            if (d < this.f199849a) {
                rect.top = this.f199850b;
            }
            rect.bottom = this.f199850b;
            return;
        }
        rect.left = (this.f199850b * i2) / i;
        int i4 = this.f199850b;
        rect.right = i4 - (((i2 + 1) * i4) / this.f199849a);
        if (d >= this.f199849a) {
            rect.top = this.f199850b;
        }
    }
}
