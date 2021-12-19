package com.p2082ss.android.ugc.aweme.xsearch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.a */
public final class C81686a {

    /* renamed from: a */
    public final C51060g f182642a;

    /* renamed from: b */
    public final AbstractC51043a f182643b;

    /* renamed from: c */
    public final AbstractC51044b f182644c;

    static {
        Covode.recordClassIndex(95090);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81686a)) {
            return false;
        }
        C81686a aVar = (C81686a) obj;
        return C89219l.m154714a(this.f182642a, aVar.f182642a) && C89219l.m154714a(this.f182643b, aVar.f182643b) && C89219l.m154714a(this.f182644c, aVar.f182644c);
    }

    public final int hashCode() {
        C51060g gVar = this.f182642a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        AbstractC51043a aVar = this.f182643b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC51044b bVar = this.f182644c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AutoPlayBean(manager=" + this.f182642a + ", containerStatusProvider=" + this.f182643b + ", playVideoObserver=" + this.f182644c + ")";
    }

    public C81686a(C51060g gVar, AbstractC51043a aVar, AbstractC51044b bVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f182642a = gVar;
        this.f182643b = aVar;
        this.f182644c = bVar;
    }
}
