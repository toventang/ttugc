package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.helios.api.b.b */
public final class C15304b {

    /* renamed from: a */
    public final long f37323a;

    /* renamed from: b */
    public long f37324b;

    static {
        Covode.recordClassIndex(17534);
    }

    public C15304b() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15304b)) {
            return false;
        }
        C15304b bVar = (C15304b) obj;
        return this.f37323a == bVar.f37323a && this.f37324b == bVar.f37324b;
    }

    public final int hashCode() {
        long j = this.f37323a;
        long j2 = this.f37324b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ClosureExtra(callCloseTime=" + this.f37323a + ", realCloseTime=" + this.f37324b + ")";
    }

    private C15304b(long j) {
        this.f37323a = j;
        this.f37324b = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15304b(long j, int i) {
        this((i & 1) != 0 ? 0 : j);
    }
}
