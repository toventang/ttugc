package com.p2082ss.android.ugc.aweme.xsearch.live;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.xsearch.live.a */
public final class C81740a {

    /* renamed from: a */
    public final int f182782a;

    /* renamed from: b */
    public final int f182783b;

    static {
        Covode.recordClassIndex(95146);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81740a)) {
            return false;
        }
        C81740a aVar = (C81740a) obj;
        return this.f182782a == aVar.f182782a && this.f182783b == aVar.f182783b;
    }

    public final int hashCode() {
        return (this.f182782a * 31) + this.f182783b;
    }

    public final String toString() {
        return "AwemeIndex(rank=" + this.f182782a + ", index=" + this.f182783b + ")";
    }

    private /* synthetic */ C81740a() {
        this(-1, 0);
    }

    public C81740a(int i, int i2) {
        this.f182782a = i;
        this.f182783b = i2;
    }
}
