package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.e */
public final class C81702e extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private final C81687b f182695a;

    static {
        Covode.recordClassIndex(95107);
    }

    private /* synthetic */ C81702e() {
        this(null);
    }

    public C81702e(C81687b bVar) {
        this.f182695a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        C89219l.m154721d(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        C81687b bVar = this.f182695a;
        if (bVar != null) {
            C81687b.m141550a(bVar, "scroll", C89041ag.m154412a(new C89378p("scrollLeft", Integer.valueOf(i))));
        }
    }
}
