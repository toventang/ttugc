package com.p2082ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.cache.e */
public final class C61320e {

    /* renamed from: a */
    public final C22099u<?> f139269a;

    /* renamed from: b */
    public long f139270b;

    static {
        Covode.recordClassIndex(71951);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61320e)) {
            return false;
        }
        C61320e eVar = (C61320e) obj;
        return C89219l.m154714a(this.f139269a, eVar.f139269a) && this.f139270b == eVar.f139270b;
    }

    public final int hashCode() {
        C22099u<?> uVar = this.f139269a;
        int hashCode = uVar != null ? uVar.hashCode() : 0;
        long j = this.f139270b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CacheRecord(response=" + this.f139269a + ", lastModified=" + this.f139270b + ")";
    }

    public /* synthetic */ C61320e(C22099u uVar) {
        this(uVar, System.currentTimeMillis());
    }

    private C61320e(C22099u<?> uVar, long j) {
        C89219l.m154721d(uVar, "");
        this.f139269a = uVar;
        this.f139270b = j;
    }
}
