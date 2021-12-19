package com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.l.b.c */
public final class C49735c implements AbstractC49728a {

    /* renamed from: a */
    AbstractC49736a f114458a;

    /* renamed from: b */
    public final int f114459b;

    /* renamed from: c */
    private final AbstractC49737d f114460c;

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.c$a */
    public interface AbstractC49736a {
        static {
            Covode.recordClassIndex(58585);
        }

        /* renamed from: a */
        void mo81476a();
    }

    static {
        Covode.recordClassIndex(58584);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.AbstractC49728a
    /* renamed from: a */
    public final void mo81471a() {
        AbstractC49736a aVar = this.f114458a;
        if (aVar != null) {
            aVar.mo81476a();
        }
    }

    public final String toString() {
        return "nodeId : " + this.f114459b;
    }

    /* renamed from: a */
    public final void mo81477a(AbstractC49736a aVar) {
        this.f114458a = aVar;
        this.f114460c.mo81465a(this);
    }

    public C49735c(int i, AbstractC49737d dVar) {
        C89219l.m154721d(dVar, "");
        this.f114459b = i;
        this.f114460c = dVar;
    }
}
