package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.l */
public final class C41788l extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public int f97468a;

    /* renamed from: b */
    private final int f97469b;

    /* renamed from: c */
    private final boolean f97470c;

    static {
        Covode.recordClassIndex(49703);
    }

    public C41788l(int i, boolean z) {
        this.f97469b = i;
        this.f97470c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((GridLayoutManager.C1336b) layoutParams).f4324a % 2 == 0) {
            if (this.f97470c) {
                rect.left = this.f97469b;
            } else {
                rect.right = this.f97469b;
            }
        }
        rect.bottom = this.f97468a;
    }
}
