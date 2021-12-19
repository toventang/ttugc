package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.i */
public final class C60209i {
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: a */
    public final C60210j f137243a = null;

    static {
        Covode.recordClassIndex(70738);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C60209i) && C89219l.m154714a(this.f137243a, ((C60209i) obj).f137243a);
        }
        return true;
    }

    public final int hashCode() {
        C60210j jVar = this.f137243a;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductBase(price=" + this.f137243a + ")";
    }

    private C60209i() {
    }
}
