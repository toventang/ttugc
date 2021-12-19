package com.p2082ss.android.ugc.aweme.mediachoose.p3436a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.e */
public final class C59155e {

    /* renamed from: a */
    public final int f134593a;

    /* renamed from: b */
    public final int f134594b;

    /* renamed from: c */
    public final int f134595c;

    static {
        Covode.recordClassIndex(69513);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59155e)) {
            return false;
        }
        C59155e eVar = (C59155e) obj;
        return this.f134593a == eVar.f134593a && this.f134594b == eVar.f134594b && this.f134595c == eVar.f134595c;
    }

    public final int hashCode() {
        return (((this.f134593a * 31) + this.f134594b) * 31) + this.f134595c;
    }

    public final String toString() {
        return "MediaRequestParam(mediaType=" + this.f134593a + ", pageSize=" + this.f134594b + ", pageIndex=" + this.f134595c + ")";
    }

    public C59155e(int i, int i2, int i3) {
        this.f134593a = i;
        this.f134594b = i2;
        this.f134595c = i3;
    }
}
