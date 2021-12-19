package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.h */
public final class C39121h<DATA> {

    /* renamed from: a */
    public final AbstractC89172b<DATA, C89391z> f92322a;

    /* renamed from: b */
    public final AbstractC89172b<Throwable, C89391z> f92323b;

    static {
        Covode.recordClassIndex(46739);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39121h)) {
            return false;
        }
        C39121h hVar = (C39121h) obj;
        return C89219l.m154714a(this.f92322a, hVar.f92322a) && C89219l.m154714a(this.f92323b, hVar.f92323b);
    }

    public final int hashCode() {
        AbstractC89172b<DATA, C89391z> bVar = this.f92322a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        AbstractC89172b<Throwable, C89391z> bVar2 = this.f92323b;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EasyRxInterceptor(onSuccess=" + this.f92322a + ", onError=" + this.f92323b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super DATA, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39121h(AbstractC89172b<? super DATA, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        this.f92322a = bVar;
        this.f92323b = bVar2;
    }
}
