package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.i */
public final class C56384i {

    /* renamed from: c */
    public static final C56384i f128609c = new C56384i();

    /* renamed from: d */
    public static final C56385a f128610d = new C56385a((byte) 0);

    /* renamed from: a */
    public long f128611a = 0;

    /* renamed from: b */
    public long f128612b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56384i)) {
            return false;
        }
        C56384i iVar = (C56384i) obj;
        return this.f128611a == iVar.f128611a && this.f128612b == iVar.f128612b;
    }

    public final String toString() {
        return "LifecycleMeta(startTs=" + this.f128611a + ", endTs=" + this.f128612b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.i$a */
    public static final class C56385a {
        static {
            Covode.recordClassIndex(66205);
        }

        private C56385a() {
        }

        public /* synthetic */ C56385a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo93375a() {
        return this.f128612b - this.f128611a;
    }

    private C56384i() {
    }

    static {
        Covode.recordClassIndex(66204);
    }

    public final int hashCode() {
        long j = this.f128611a;
        long j2 = this.f128612b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
