package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ad */
public final class C48033ad {

    /* renamed from: a */
    public final int f111270a;

    /* renamed from: b */
    public final int f111271b;

    static {
        Covode.recordClassIndex(56762);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48033ad)) {
            return false;
        }
        C48033ad adVar = (C48033ad) obj;
        return this.f111270a == adVar.f111270a && this.f111271b == adVar.f111271b;
    }

    public final int hashCode() {
        return (this.f111270a * 31) + this.f111271b;
    }

    public final String toString() {
        return "NumberResult(video=" + this.f111270a + ", image=" + this.f111271b + ")";
    }

    public C48033ad(int i, int i2) {
        this.f111270a = i;
        this.f111271b = i2;
    }
}
