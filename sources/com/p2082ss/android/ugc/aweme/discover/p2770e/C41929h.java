package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.e.h */
public final class C41929h implements AbstractC81914b {

    /* renamed from: a */
    public C67678d f97808a;

    static {
        Covode.recordClassIndex(49855);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41929h) && C89219l.m154714a(this.f97808a, ((C41929h) obj).f97808a);
        }
        return true;
    }

    public final int hashCode() {
        C67678d dVar = this.f97808a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "InnerSearchEvent(param=" + this.f97808a + ")";
    }

    public C41929h(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f97808a = dVar;
    }
}
