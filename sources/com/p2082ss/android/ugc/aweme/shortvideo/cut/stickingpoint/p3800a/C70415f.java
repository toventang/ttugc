package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70096q;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70410e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.f */
public final class C70415f extends C70096q {
    static {
        Covode.recordClassIndex(82858);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70415f(AbstractC70081l lVar) {
        super(lVar);
        C89219l.m154721d(lVar, "");
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70096q
    /* renamed from: a */
    public final int mo4986a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        if (!(viewHolder instanceof C70582z.C70583a) && !(viewHolder instanceof C70410e.C70411a)) {
            return super.mo4986a(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70096q
    /* renamed from: b */
    public final boolean mo4994b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        if (!(viewHolder2 instanceof C70582z.C70583a) && !(viewHolder2 instanceof C70410e.C70411a)) {
            return super.mo4994b(recyclerView, viewHolder, viewHolder2);
        }
        return false;
    }
}
