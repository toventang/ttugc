package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.a */
public final class C84649a extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final float f189135a;

    static {
        Covode.recordClassIndex(98616);
    }

    public C84649a(float f) {
        this.f189135a = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        rect.left = (int) Math.max(0.0f, this.f189135a);
        rect.right = (int) Math.max(0.0f, this.f189135a);
    }
}
