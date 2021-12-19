package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.d */
public final class C64350d extends C35672z {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f145885a;

    static {
        Covode.recordClassIndex(75804);
    }

    public C64350d(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f145885a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
        if (i == 0) {
            this.f145885a.invoke();
        }
    }
}
