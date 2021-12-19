package com.p2082ss.android.ugc.aweme.filter.repository.internal;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.b */
public final class C50719b {

    /* renamed from: a */
    public final EnumC50720c f117083a;

    /* renamed from: b */
    public final C50698f f117084b;

    /* renamed from: c */
    public final C50721d f117085c;

    /* renamed from: d */
    public final Exception f117086d;

    static {
        Covode.recordClassIndex(59881);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50719b)) {
            return false;
        }
        C50719b bVar = (C50719b) obj;
        return C89219l.m154714a(this.f117083a, bVar.f117083a) && C89219l.m154714a(this.f117084b, bVar.f117084b) && C89219l.m154714a(this.f117085c, bVar.f117085c) && C89219l.m154714a(this.f117086d, bVar.f117086d);
    }

    public final int hashCode() {
        EnumC50720c cVar = this.f117083a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C50698f fVar = this.f117084b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C50721d dVar = this.f117085c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Exception exc = this.f117086d;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "FilterDownloadEvent(state=" + this.f117083a + ", filterMeta=" + this.f117084b + ", downloadResult=" + this.f117085c + ", exception=" + this.f117086d + ")";
    }

    public C50719b(EnumC50720c cVar, C50698f fVar, C50721d dVar, Exception exc) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(fVar, "");
        this.f117083a = cVar;
        this.f117084b = fVar;
        this.f117085c = dVar;
        this.f117086d = exc;
    }
}
