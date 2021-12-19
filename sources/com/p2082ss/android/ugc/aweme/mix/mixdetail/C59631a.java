package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.a */
public final class C59631a extends RecyclerView.AbstractC1361h {
    static {
        Covode.recordClassIndex(70032);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m4277d(view) == 0) {
            rect.set(0, (int) C13628n.m24520b(view.getContext(), 8.0f), 0, 0);
        }
    }
}
