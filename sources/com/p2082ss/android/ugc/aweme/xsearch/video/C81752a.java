package com.p2082ss.android.ugc.aweme.xsearch.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.xsearch.video.a */
public final class C81752a {

    /* renamed from: a */
    public final int f182807a;

    /* renamed from: b */
    public final int f182808b;

    static {
        Covode.recordClassIndex(95159);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81752a)) {
            return false;
        }
        C81752a aVar = (C81752a) obj;
        return this.f182807a == aVar.f182807a && this.f182808b == aVar.f182808b;
    }

    public final int hashCode() {
        return (this.f182807a * 31) + this.f182808b;
    }

    public final String toString() {
        return "AwemeIndex(rank=" + this.f182807a + ", index=" + this.f182808b + ")";
    }

    private /* synthetic */ C81752a() {
        this(-1, 0);
    }

    public C81752a(int i, int i2) {
        this.f182807a = i;
        this.f182808b = i2;
    }
}
