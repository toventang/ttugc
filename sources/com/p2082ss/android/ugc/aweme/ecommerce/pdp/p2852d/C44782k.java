package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.k */
public final class C44782k implements AbstractC44779h {

    /* renamed from: a */
    public final String f104486a;

    static {
        Covode.recordClassIndex(53168);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h
    /* renamed from: a */
    public final String mo75904a() {
        return "sku";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44782k) && C89219l.m154714a(this.f104486a, ((C44782k) obj).f104486a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f104486a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectSkuVO(selectSkuStr=" + this.f104486a + ")";
    }

    public C44782k(String str) {
        C89219l.m154721d(str, "");
        this.f104486a = str;
    }
}
