package com.p2082ss.android.ugc.aweme.mediachoose;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.f */
public final class C59179f {

    /* renamed from: a */
    public final boolean f134655a;

    /* renamed from: b */
    public final String f134656b;

    /* renamed from: c */
    public final long f134657c;

    /* renamed from: d */
    public final String f134658d;

    /* renamed from: e */
    public final int f134659e;

    /* renamed from: f */
    public final String f134660f;

    static {
        Covode.recordClassIndex(69537);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59179f)) {
            return false;
        }
        C59179f fVar = (C59179f) obj;
        return this.f134655a == fVar.f134655a && C89219l.m154714a(this.f134656b, fVar.f134656b) && this.f134657c == fVar.f134657c && C89219l.m154714a(this.f134658d, fVar.f134658d) && this.f134659e == fVar.f134659e && C89219l.m154714a(this.f134660f, fVar.f134660f);
    }

    public final int hashCode() {
        boolean z = this.f134655a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f134656b;
        int i5 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f134657c;
        int i6 = (((i4 + hashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f134658d;
        int hashCode2 = (((i6 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f134659e) * 31;
        String str3 = this.f134660f;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return hashCode2 + i5;
    }

    public final String toString() {
        return "VideoCheckInfo(success=" + this.f134655a + ", checkerType=" + this.f134656b + ", costTime=" + this.f134657c + ", fileSuffix=" + this.f134658d + ", errorCode=" + this.f134659e + ", errorMsg=" + this.f134660f + ")";
    }

    public C59179f(boolean z, String str, long j, String str2, int i, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f134655a = z;
        this.f134656b = str;
        this.f134657c = j;
        this.f134658d = str2;
        this.f134659e = i;
        this.f134660f = str3;
    }
}
