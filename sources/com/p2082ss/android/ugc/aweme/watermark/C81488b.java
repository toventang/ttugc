package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.b */
public final class C81488b {

    /* renamed from: a */
    public final int f182188a;

    /* renamed from: b */
    public final int f182189b;

    /* renamed from: c */
    public final int f182190c;

    /* renamed from: d */
    public final String f182191d;

    /* renamed from: e */
    public final int f182192e;

    /* renamed from: f */
    public final int f182193f;

    /* renamed from: g */
    public final boolean f182194g;

    static {
        Covode.recordClassIndex(94861);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81488b)) {
            return false;
        }
        C81488b bVar = (C81488b) obj;
        return this.f182188a == bVar.f182188a && this.f182189b == bVar.f182189b && this.f182190c == bVar.f182190c && C89219l.m154714a(this.f182191d, bVar.f182191d) && this.f182192e == bVar.f182192e && this.f182193f == bVar.f182193f && this.f182194g == bVar.f182194g;
    }

    public final int hashCode() {
        int i = ((((this.f182188a * 31) + this.f182189b) * 31) + this.f182190c) * 31;
        String str = this.f182191d;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f182192e) * 31) + this.f182193f) * 31;
        boolean z = this.f182194g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "CommentWatermarkParam(inputMediaDuration=" + this.f182188a + ", inputMediaWidth=" + this.f182189b + ", inputMediaHeight=" + this.f182190c + ", commentWaterMarkPath=" + this.f182191d + ", commentWaterMarkHeight=" + this.f182192e + ", commentWaterMarkWidth=" + this.f182193f + ", is1To1=" + this.f182194g + ")";
    }

    public C81488b(int i, int i2, int i3, String str, int i4, int i5, boolean z) {
        C89219l.m154721d(str, "");
        this.f182188a = i;
        this.f182189b = i2;
        this.f182190c = i3;
        this.f182191d = str;
        this.f182192e = i4;
        this.f182193f = i5;
        this.f182194g = z;
    }
}
