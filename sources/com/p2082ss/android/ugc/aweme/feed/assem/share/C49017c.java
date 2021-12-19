package com.p2082ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.c */
public final class C49017c {

    /* renamed from: a */
    public final float f112941a;

    /* renamed from: b */
    public final float f112942b;

    static {
        Covode.recordClassIndex(57808);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49017c)) {
            return false;
        }
        C49017c cVar = (C49017c) obj;
        return Float.compare(this.f112941a, cVar.f112941a) == 0 && Float.compare(this.f112942b, cVar.f112942b) == 0;
    }

    public final String toString() {
        return "FlipScale(scaleMin=" + this.f112941a + ", scaleMax=" + this.f112942b + ")";
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f112941a) * 31) + Float.floatToIntBits(this.f112942b);
    }

    public C49017c(float f, float f2) {
        this.f112941a = f;
        this.f112942b = f2;
    }
}
