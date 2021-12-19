package com.p2082ss.android.ugc.aweme.widgetcompat;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.widgetcompat.b */
public final class C81637b extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private int f182533a;

    /* renamed from: b */
    private int f182534b;

    /* renamed from: c */
    private boolean f182535c = false;

    static {
        Covode.recordClassIndex(95038);
    }

    public C81637b(int i, int i2) {
        this.f182533a = i;
        this.f182534b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int d = RecyclerView.m4277d(view);
        recyclerView.getAdapter();
        int i = this.f182533a;
        int i2 = d % i;
        if (this.f182535c) {
            int i3 = this.f182534b;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * this.f182534b) / this.f182533a;
            if (d < this.f182533a) {
                rect.top = this.f182534b;
            }
            rect.bottom = this.f182534b;
            return;
        }
        rect.left = (this.f182534b * i2) / i;
        int i4 = this.f182534b;
        rect.right = i4 - (((i2 + 1) * i4) / this.f182533a);
        if (d >= this.f182533a) {
            rect.top = this.f182534b;
        }
    }
}
