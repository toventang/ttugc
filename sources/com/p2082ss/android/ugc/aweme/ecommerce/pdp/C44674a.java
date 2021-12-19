package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a */
public final class C44674a {

    /* renamed from: a */
    public final String f104237a;

    /* renamed from: b */
    public final long f104238b;

    static {
        Covode.recordClassIndex(53060);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44674a)) {
            return false;
        }
        C44674a aVar = (C44674a) obj;
        return C89219l.m154714a(this.f104237a, aVar.f104237a) && this.f104238b == aVar.f104238b;
    }

    public final int hashCode() {
        String str = this.f104237a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f104238b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CartTipData(message=" + this.f104237a + ", time=" + this.f104238b + ")";
    }

    public C44674a(String str, long j) {
        C89219l.m154721d(str, "");
        this.f104237a = str;
        this.f104238b = j;
    }
}
