package com.p2082ss.android.ugc.aweme.base.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.p3891b.C74273a;

/* renamed from: com.ss.android.ugc.aweme.base.widget.b */
public class C34745b extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private int f82062a;

    /* renamed from: b */
    private int f82063b;

    /* renamed from: c */
    private boolean f82064c = false;

    static {
        Covode.recordClassIndex(41741);
    }

    public C34745b(int i, int i2) {
        this.f82062a = i;
        this.f82063b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int d = RecyclerView.m4277d(view);
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter instanceof AbstractC34766g) {
            if (((AbstractC34766g) adapter).mo61481b() != null) {
                if (d != 0) {
                    d++;
                } else {
                    return;
                }
            }
        } else if (adapter instanceof C74273a) {
            int b = ((C74273a) adapter).f167015a.mo2184b();
            if (d >= b) {
                d += b;
            } else {
                return;
            }
        }
        int i = this.f82062a;
        int i2 = d % i;
        if (this.f82064c) {
            int i3 = this.f82063b;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * this.f82063b) / this.f82062a;
            if (d < this.f82062a) {
                rect.top = this.f82063b;
            }
            rect.bottom = this.f82063b;
            return;
        }
        rect.left = (this.f82063b * i2) / i;
        int i4 = this.f82063b;
        rect.right = i4 - (((i2 + 1) * i4) / this.f82062a);
        if (d >= this.f82062a) {
            rect.top = this.f82063b;
        }
    }
}
