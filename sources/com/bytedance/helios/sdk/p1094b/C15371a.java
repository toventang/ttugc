package com.bytedance.helios.sdk.p1094b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.b.a */
public final class C15371a {

    /* renamed from: a */
    public final int f37485a;

    /* renamed from: b */
    public final int f37486b;

    /* renamed from: c */
    public final int f37487c;

    /* renamed from: d */
    public final String f37488d;

    /* renamed from: e */
    public final String f37489e;

    /* renamed from: f */
    public final String f37490f;

    /* renamed from: g */
    public final String f37491g;

    /* renamed from: h */
    public final String f37492h;

    /* renamed from: i */
    public final String f37493i;

    /* renamed from: j */
    public final String f37494j;

    /* renamed from: k */
    public final boolean f37495k = false;

    static {
        Covode.recordClassIndex(17623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15371a)) {
            return false;
        }
        C15371a aVar = (C15371a) obj;
        return this.f37485a == aVar.f37485a && this.f37486b == aVar.f37486b && this.f37487c == aVar.f37487c && C89219l.m154714a(this.f37488d, aVar.f37488d) && C89219l.m154714a(this.f37489e, aVar.f37489e) && C89219l.m154714a(this.f37490f, aVar.f37490f) && C89219l.m154714a(this.f37491g, aVar.f37491g) && C89219l.m154714a(this.f37492h, aVar.f37492h) && C89219l.m154714a(this.f37493i, aVar.f37493i) && C89219l.m154714a(this.f37494j, aVar.f37494j) && this.f37495k == aVar.f37495k;
    }

    public final int hashCode() {
        int i = ((((this.f37485a * 31) + this.f37486b) * 31) + this.f37487c) * 31;
        String str = this.f37488d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f37489e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37490f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f37491g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f37492h;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f37493i;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f37494j;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i3 = (hashCode6 + i2) * 31;
        boolean z = this.f37495k;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "SensitiveApiConfig(id=" + this.f37485a + ", invokeType=" + this.f37486b + ", type=" + this.f37487c + ", className=" + this.f37488d + ", memberName=" + this.f37489e + ", desc=" + this.f37490f + ", scopes=" + this.f37491g + ", actionName=" + this.f37492h + ", resourceName=" + this.f37493i + ", resourceId=" + this.f37494j + ", isCustomApi=" + this.f37495k + ")";
    }

    public C15371a(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        C89219l.m154719c(str5, "");
        C89219l.m154719c(str6, "");
        C89219l.m154719c(str7, "");
        this.f37485a = i;
        this.f37486b = i2;
        this.f37487c = i3;
        this.f37488d = str;
        this.f37489e = str2;
        this.f37490f = str3;
        this.f37491g = str4;
        this.f37492h = str5;
        this.f37493i = str6;
        this.f37494j = str7;
    }
}
