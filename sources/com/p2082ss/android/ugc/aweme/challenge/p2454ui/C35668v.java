package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.v */
public final class C35668v extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final int f84155a;

    static {
        Covode.recordClassIndex(42892);
    }

    private C35668v(int i) {
        this.f84155a = i;
    }

    public C35668v(int i, byte b) {
        this(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        GridLayoutManager.AbstractC1337c cVar;
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager != null && (cVar = gridLayoutManager.f4321g) != null) {
            int d = RecyclerView.m4277d(view);
            int i = gridLayoutManager.f4316b;
            if (cVar.mo4342a(d) == 1) {
                int a = cVar.mo4343a(d, i);
                rect.left = (this.f84155a * a) / i;
                int i2 = this.f84155a;
                rect.right = i2 - (((a + 1) * i2) / i);
                if (cVar.mo4346d(d, i) > 0) {
                    rect.top = this.f84155a;
                }
            }
        }
    }
}
