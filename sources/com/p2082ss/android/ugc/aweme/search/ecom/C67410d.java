package com.p2082ss.android.ugc.aweme.search.ecom;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.d */
public final class C67410d implements AbstractC17641a {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f151013a;

    static {
        Covode.recordClassIndex(79043);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C67410d) && C89219l.m154714a(this.f151013a, ((C67410d) obj).f151013a);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC89171a<C89391z> aVar = this.f151013a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSeeAllItem(clickListener=" + this.f151013a + ")";
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

    public C67410d(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f151013a = aVar;
    }
}
