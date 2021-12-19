package com.bytedance.android.livesdk.hashtag;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.a */
public final class C8930a extends RecyclerView.AbstractC1361h {
    static {
        Covode.recordClassIndex(9822);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        rect.set(C3966y.m9653a(2.0f), 0, C3966y.m9653a(2.0f), C3966y.m9653a(3.0f));
    }
}
