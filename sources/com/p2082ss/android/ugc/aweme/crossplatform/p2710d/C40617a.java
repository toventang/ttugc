package com.p2082ss.android.ugc.aweme.crossplatform.p2710d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a */
public final class C40617a {

    /* renamed from: a */
    public Integer f95052a;

    /* renamed from: b */
    public Bundle f95053b;

    /* renamed from: c */
    public String f95054c;

    /* renamed from: d */
    public boolean f95055d;

    /* renamed from: e */
    public String f95056e;

    /* renamed from: f */
    public String f95057f;

    /* renamed from: g */
    public boolean f95058g;

    /* renamed from: h */
    public boolean f95059h;

    /* renamed from: i */
    public boolean f95060i;

    /* renamed from: j */
    public String f95061j;

    /* renamed from: k */
    public boolean f95062k;

    /* renamed from: l */
    public boolean f95063l;

    /* renamed from: m */
    public String f95064m;

    /* renamed from: n */
    public boolean f95065n;

    /* renamed from: o */
    public String f95066o;

    /* renamed from: p */
    public int f95067p;

    static {
        Covode.recordClassIndex(48457);
    }

    public C40617a(byte b) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40617a)) {
            return false;
        }
        C40617a aVar = (C40617a) obj;
        return C89219l.m154714a(this.f95052a, aVar.f95052a) && C89219l.m154714a(this.f95053b, aVar.f95053b) && C89219l.m154714a(this.f95054c, aVar.f95054c) && this.f95055d == aVar.f95055d && C89219l.m154714a(this.f95056e, aVar.f95056e) && C89219l.m154714a(this.f95057f, aVar.f95057f) && this.f95058g == aVar.f95058g && this.f95059h == aVar.f95059h && this.f95060i == aVar.f95060i && C89219l.m154714a(this.f95061j, aVar.f95061j) && this.f95062k == aVar.f95062k && this.f95063l == aVar.f95063l && C89219l.m154714a(this.f95064m, aVar.f95064m) && this.f95065n == aVar.f95065n && C89219l.m154714a(this.f95066o, aVar.f95066o) && this.f95067p == aVar.f95067p;
    }

    public final int hashCode() {
        Integer num = this.f95052a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Bundle bundle = this.f95053b;
        int hashCode2 = (hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str = this.f95054c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f95055d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        String str2 = this.f95056e;
        int hashCode4 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f95057f;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.f95058g;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode5 + i7) * 31;
        boolean z3 = this.f95059h;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f95060i;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        String str4 = this.f95061j;
        int hashCode6 = (i18 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z5 = this.f95062k;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (hashCode6 + i19) * 31;
        boolean z6 = this.f95063l;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        String str5 = this.f95064m;
        int hashCode7 = (i26 + (str5 != null ? str5.hashCode() : 0)) * 31;
        if (!this.f95065n) {
            i2 = 0;
        }
        int i27 = (hashCode7 + i2) * 31;
        String str6 = this.f95066o;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((i27 + i) * 31) + this.f95067p;
    }

    public final String toString() {
        return "BaseInfo(platform=" + this.f95052a + ", rawBundle=" + this.f95053b + ", url=" + this.f95054c + ", safeTemplate=" + this.f95055d + ", groupId=" + this.f95056e + ", enterFrom=" + this.f95057f + ", autoPlayAudio=" + this.f95058g + ", forbidJump=" + this.f95059h + ", fromNotification=" + this.f95060i + ", awemeId=" + this.f95061j + ", controlRequestUrl=" + this.f95062k + ", noHardware=" + this.f95063l + ", ownerId=" + this.f95064m + ", hideSystemVideoPoster=" + this.f95065n + ", reportType=" + this.f95066o + ", pageDepthOfReportShow=" + this.f95067p + ")";
    }

    private /* synthetic */ C40617a() {
        this("");
    }

    /* renamed from: a */
    public final void mo69769a(String str) {
        C89219l.m154721d(str, "");
        this.f95064m = str;
    }

    private C40617a(String str) {
        C89219l.m154721d(str, "");
        this.f95052a = null;
        this.f95053b = null;
        this.f95054c = null;
        this.f95055d = false;
        this.f95056e = null;
        this.f95057f = null;
        this.f95058g = false;
        this.f95059h = false;
        this.f95060i = false;
        this.f95061j = null;
        this.f95062k = false;
        this.f95063l = false;
        this.f95064m = str;
        this.f95065n = false;
        this.f95066o = null;
        this.f95067p = 0;
    }
}
