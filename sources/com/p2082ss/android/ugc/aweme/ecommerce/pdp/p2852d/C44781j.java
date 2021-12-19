package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.j */
public final class C44781j implements AbstractC44779h {

    /* renamed from: a */
    public final C44774d f104485a;

    static {
        Covode.recordClassIndex(53167);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h
    /* renamed from: a */
    public final String mo75904a() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44781j) && C89219l.m154714a(this.f104485a, ((C44781j) obj).f104485a);
        }
        return true;
    }

    public final int hashCode() {
        C44774d dVar = this.f104485a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectShippingVO(deliveryInfo=" + this.f104485a + ")";
    }

    public C44781j(C44774d dVar) {
        this.f104485a = dVar;
    }
}
