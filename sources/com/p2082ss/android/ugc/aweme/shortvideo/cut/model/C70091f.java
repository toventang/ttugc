package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.f */
public final class C70091f {

    /* renamed from: a */
    public boolean f156757a;

    /* renamed from: b */
    public int f156758b = -1;

    /* renamed from: c */
    public int f156759c = -1;

    /* renamed from: d */
    public final int f156760d;

    /* renamed from: e */
    public final int f156761e;

    /* renamed from: f */
    public final int f156762f;

    static {
        Covode.recordClassIndex(82514);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70091f)) {
            return false;
        }
        C70091f fVar = (C70091f) obj;
        return this.f156760d == fVar.f156760d && this.f156761e == fVar.f156761e && this.f156762f == fVar.f156762f;
    }

    public final int hashCode() {
        return (((this.f156760d * 31) + this.f156761e) * 31) + this.f156762f;
    }

    public final String toString() {
        return "SwapStateWrapper(state=" + this.f156760d + ", from=" + this.f156761e + ", to=" + this.f156762f + ")";
    }

    public C70091f(int i, int i2, int i3) {
        this.f156760d = i;
        this.f156761e = i2;
        this.f156762f = i3;
    }
}
