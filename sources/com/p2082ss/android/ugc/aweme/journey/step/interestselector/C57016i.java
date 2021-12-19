package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.i */
public final class C57016i extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final int f129804a;

    static {
        Covode.recordClassIndex(66904);
    }

    public C57016i(int i) {
        this.f129804a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        rect.bottom = this.f129804a;
        if (RecyclerView.m4277d(view) == 0) {
            rect.top = this.f129804a;
        }
    }
}
