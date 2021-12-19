package com.p2082ss.android.ugc.aweme.specact.popup.p3945d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.d.a */
public final class C75196a {

    /* renamed from: a */
    public final String f169081a;

    /* renamed from: b */
    public final String f169082b;

    /* renamed from: c */
    public final boolean f169083c;

    /* renamed from: d */
    public final String f169084d;

    /* renamed from: e */
    public final int f169085e;

    static {
        Covode.recordClassIndex(88074);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75196a)) {
            return false;
        }
        C75196a aVar = (C75196a) obj;
        return C89219l.m154714a(this.f169081a, aVar.f169081a) && C89219l.m154714a(this.f169082b, aVar.f169082b) && this.f169083c == aVar.f169083c && C89219l.m154714a(this.f169084d, aVar.f169084d) && this.f169085e == aVar.f169085e;
    }

    public final int hashCode() {
        String str = this.f169081a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f169082b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f169083c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        String str3 = this.f169084d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i5 + i) * 31) + this.f169085e;
    }

    public final String toString() {
        return "InAppPushParams(title=" + this.f169081a + ", content=" + this.f169082b + ", showButton=" + this.f169083c + ", url=" + this.f169084d + ", iconResId=" + this.f169085e + ")";
    }

    private C75196a(String str, String str2, boolean z, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f169081a = str;
        this.f169082b = str2;
        this.f169083c = z;
        this.f169084d = str3;
        this.f169085e = -1;
    }

    public /* synthetic */ C75196a(String str, String str2, boolean z, String str3, byte b) {
        this(str, str2, z, str3);
    }
}
