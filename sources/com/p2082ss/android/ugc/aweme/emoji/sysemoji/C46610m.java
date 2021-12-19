package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.m */
public final class C46610m extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public int f108681a;

    static {
        Covode.recordClassIndex(55200);
    }

    private /* synthetic */ C46610m() {
        this(0);
    }

    public C46610m(int i) {
        this.f108681a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        rect.left = this.f108681a;
        rect.right = this.f108681a;
    }
}
