package com.p2082ss.android.ugc.aweme.search.ecom;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.c */
public final class C67409c implements AbstractC17641a {

    /* renamed from: a */
    public final C67394a f151010a;

    /* renamed from: b */
    public final AbstractC67393a f151011b;

    /* renamed from: c */
    public final AbstractC67411e f151012c;

    static {
        Covode.recordClassIndex(79042);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67409c)) {
            return false;
        }
        C67409c cVar = (C67409c) obj;
        return C89219l.m154714a(this.f151010a, cVar.f151010a) && C89219l.m154714a(this.f151011b, cVar.f151011b) && C89219l.m154714a(this.f151012c, cVar.f151012c);
    }

    public final int hashCode() {
        C67394a aVar = this.f151010a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        AbstractC67393a aVar2 = this.f151011b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        AbstractC67411e eVar = this.f151012c;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ProductItem(product=" + this.f151010a + ", clickListener=" + this.f151011b + ", showListener=" + this.f151012c + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C67409c(C67394a aVar, AbstractC67393a aVar2, AbstractC67411e eVar) {
        C89219l.m154721d(aVar, "");
        this.f151010a = aVar;
        this.f151011b = aVar2;
        this.f151012c = eVar;
    }
}
