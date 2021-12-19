package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.d */
public final class C36383d extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public final int f86052a;

    /* renamed from: b */
    public final int f86053b;

    static {
        Covode.recordClassIndex(43678);
    }

    public C36383d(int i, int i2) {
        this.f86052a = i;
        this.f86053b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (RecyclerView.m4278e(view) >= this.f86052a) {
            rect.top = this.f86053b;
        }
    }
}
