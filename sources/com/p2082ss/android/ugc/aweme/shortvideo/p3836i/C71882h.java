package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72806r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.h */
public final class C71882h {

    /* renamed from: a */
    public AbstractC71881g f161068a;

    /* renamed from: b */
    private final AbstractC72769aq f161069b;

    static {
        Covode.recordClassIndex(84431);
    }

    /* renamed from: b */
    private final void m126945b() {
        if (this.f161068a == null) {
            this.f161068a = new C72806r(this.f161069b);
        }
    }

    /* renamed from: a */
    public final int mo113534a() {
        m126945b();
        AbstractC71881g gVar = this.f161068a;
        if (gVar == null) {
            C89219l.m154710a("strategy");
        }
        return gVar.mo113531a();
    }

    public C71882h(AbstractC72769aq aqVar) {
        C89219l.m154721d(aqVar, "");
        this.f161069b = aqVar;
    }
}
