package com.p2082ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.a */
public final class C45858a {

    /* renamed from: a */
    public final String f106825a;

    /* renamed from: b */
    public final int f106826b;

    /* renamed from: c */
    public final int f106827c;

    /* renamed from: d */
    public final int f106828d;

    /* renamed from: e */
    public final int f106829e;

    static {
        Covode.recordClassIndex(54382);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45858a)) {
            return false;
        }
        C45858a aVar = (C45858a) obj;
        return C89219l.m154714a(this.f106825a, aVar.f106825a) && this.f106826b == aVar.f106826b && this.f106827c == aVar.f106827c && this.f106828d == aVar.f106828d && this.f106829e == aVar.f106829e;
    }

    public final int hashCode() {
        String str = this.f106825a;
        return ((((((((str != null ? str.hashCode() : 0) * 31) + this.f106826b) * 31) + this.f106827c) * 31) + this.f106828d) * 31) + this.f106829e;
    }

    public final String toString() {
        return "StickerCompileParam(draftDir=" + this.f106825a + ", targetWidth=" + this.f106826b + ", targetHeight=" + this.f106827c + ", videoWidth=" + this.f106828d + ", videoHeight=" + this.f106829e + ")";
    }

    public /* synthetic */ C45858a(String str, int i, int i2) {
        this(str, i, i2, 0, 0);
    }

    public C45858a(String str, int i, int i2, int i3, int i4) {
        this.f106825a = str;
        this.f106826b = i;
        this.f106827c = i2;
        this.f106828d = i3;
        this.f106829e = i4;
    }
}
