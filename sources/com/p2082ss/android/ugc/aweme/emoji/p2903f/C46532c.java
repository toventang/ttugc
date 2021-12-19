package com.p2082ss.android.ugc.aweme.emoji.p2903f;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.f.c */
public final class C46532c extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final int f108487a;

    /* renamed from: b */
    private final int f108488b;

    static {
        Covode.recordClassIndex(55119);
    }

    public C46532c(int i, int i2) {
        this.f108487a = i;
        this.f108488b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int layoutPosition = ((RecyclerView.C1367j) layoutParams).f4500c.getLayoutPosition();
        int i = this.f108487a;
        int i2 = layoutPosition % i;
        rect.left = (this.f108488b * i2) / i;
        int i3 = this.f108488b;
        rect.right = i3 - (((i2 + 1) * i3) / this.f108487a);
    }
}
