package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.m */
public final class C15317m implements AbstractC15308f {

    /* renamed from: a */
    public final String f37346a;

    /* renamed from: b */
    public final long f37347b;

    static {
        Covode.recordClassIndex(17547);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15317m)) {
            return false;
        }
        C15317m mVar = (C15317m) obj;
        return C89219l.m154714a(this.f37346a, mVar.f37346a) && this.f37347b == mVar.f37347b;
    }

    public final int hashCode() {
        String str = this.f37346a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f37347b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PerfEvent(methodName=" + this.f37346a + ", methodTimeCost=" + this.f37347b + ")";
    }

    private /* synthetic */ C15317m() {
        this("", 0);
    }

    public C15317m(String str, long j) {
        C89219l.m154719c(str, "");
        this.f37346a = str;
        this.f37347b = j;
    }
}
