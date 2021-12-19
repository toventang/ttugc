package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.c */
public final class C43458c extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final int f101378a;

    /* renamed from: b */
    private final int f101379b;

    static {
        Covode.recordClassIndex(51687);
    }

    public C43458c(int i, int i2) {
        this.f101378a = i;
        this.f101379b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        if (RecyclerView.m4278e(view) == 0) {
            rect.left = this.f101379b;
            rect.right = this.f101378a / 2;
            return;
        }
        int e = RecyclerView.m4278e(view);
        C89219l.m154716b(adapter, "");
        if (e == adapter.getItemCount() - 1) {
            rect.left = this.f101378a / 2;
            rect.right = this.f101379b;
            return;
        }
        rect.left = this.f101378a / 2;
        rect.right = this.f101378a / 2;
    }
}
