package com.p2082ss.android.ugc.aweme.sec.captcha;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sec.captcha.a */
public final class C67822a {

    /* renamed from: a */
    public String f152012a;

    /* renamed from: b */
    public int f152013b;

    /* renamed from: c */
    public String f152014c;

    /* renamed from: d */
    public String f152015d;

    /* renamed from: e */
    public String f152016e;

    /* renamed from: f */
    public String f152017f;

    /* renamed from: g */
    public String f152018g;

    /* renamed from: h */
    public int f152019h;

    static {
        Covode.recordClassIndex(79482);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67822a)) {
            return false;
        }
        C67822a aVar = (C67822a) obj;
        return C89219l.m154714a(this.f152012a, aVar.f152012a) && this.f152013b == aVar.f152013b && C89219l.m154714a(this.f152014c, aVar.f152014c) && C89219l.m154714a(this.f152015d, aVar.f152015d) && C89219l.m154714a(this.f152016e, aVar.f152016e) && C89219l.m154714a(this.f152017f, aVar.f152017f) && C89219l.m154714a(this.f152018g, aVar.f152018g) && this.f152019h == aVar.f152019h;
    }

    public final int hashCode() {
        String str = this.f152012a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f152013b) * 31;
        String str2 = this.f152014c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f152015d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f152016e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f152017f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f152018g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f152019h;
    }

    public final String toString() {
        return "CaptchaParams(language=" + this.f152012a + ", aid=" + this.f152013b + ", appName=" + this.f152014c + ", iid=" + this.f152015d + ", did=" + this.f152016e + ", channel=" + this.f152017f + ", session=" + this.f152018g + ", errorCode=" + this.f152019h + ")";
    }

    /* renamed from: a */
    public final void mo106924a(String str) {
        C89219l.m154721d(str, "");
        this.f152015d = str;
    }

    /* renamed from: b */
    public final void mo106925b(String str) {
        C89219l.m154721d(str, "");
        this.f152016e = str;
    }

    private C67822a(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.f152012a = str;
        this.f152013b = i;
        this.f152014c = str2;
        this.f152015d = str3;
        this.f152016e = str4;
        this.f152017f = str5;
        this.f152018g = str6;
        this.f152019h = 3058;
    }

    public /* synthetic */ C67822a(String str, int i, String str2, String str3, String str4, String str5, String str6, byte b) {
        this(str, i, str2, str3, str4, str5, str6);
    }
}
