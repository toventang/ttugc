package com.p2082ss.android.ugc.aweme.search.ecom.p3688a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.a.b */
public final class C67397b {
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: a */
    public final Boolean f151001a = null;
    @AbstractC27891c(mo46611a = "product_list")

    /* renamed from: b */
    public final List<C67394a> f151002b = null;

    static {
        Covode.recordClassIndex(79030);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67397b)) {
            return false;
        }
        C67397b bVar = (C67397b) obj;
        return C89219l.m154714a(this.f151001a, bVar.f151001a) && C89219l.m154714a(this.f151002b, bVar.f151002b);
    }

    public final int hashCode() {
        Boolean bool = this.f151001a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<C67394a> list = this.f151002b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProductGroup(hasMore=" + this.f151001a + ", productList=" + this.f151002b + ")";
    }

    private C67397b() {
    }
}
