package com.bytedance.android.live.publicscreen.impl.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.t */
public final class C6090t extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private int f15228a;

    /* renamed from: b */
    private int f15229b = 1;

    static {
        Covode.recordClassIndex(6707);
    }

    public C6090t(int i) {
        this.f15228a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int d = RecyclerView.m4277d(view);
        int i = this.f15229b;
        if (i == 0) {
            if (d != 0) {
                rect.left = this.f15228a;
            }
        } else if (1 == i) {
            rect.top = this.f15228a;
        }
    }
}
