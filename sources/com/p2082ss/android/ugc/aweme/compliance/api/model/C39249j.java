package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.j */
public final class C39249j {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    public final String f92716a;
    @AbstractC27891c(mo46611a = "is_bold")

    /* renamed from: b */
    public final boolean f92717b;
    @AbstractC27891c(mo46611a = "link_type")

    /* renamed from: c */
    public final String f92718c;
    @AbstractC27891c(mo46611a = "link")

    /* renamed from: d */
    public final String f92719d;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: e */
    public final String f92720e;
    @AbstractC27891c(mo46611a = "approve")

    /* renamed from: f */
    public final boolean f92721f;
    @AbstractC27891c(mo46611a = "operation")

    /* renamed from: g */
    public final Integer f92722g;
    @AbstractC27891c(mo46611a = "next_pop_up")

    /* renamed from: h */
    public final String f92723h;
    @AbstractC27891c(mo46611a = "dismiss")

    /* renamed from: i */
    public final Boolean f92724i;
    @AbstractC27891c(mo46611a = "dismiss_all")

    /* renamed from: j */
    public final Boolean f92725j;
    @AbstractC27891c(mo46611a = "re_get_settings")

    /* renamed from: k */
    public final Boolean f92726k;

    static {
        Covode.recordClassIndex(46907);
    }

    public C39249j() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39249j)) {
            return false;
        }
        C39249j jVar = (C39249j) obj;
        return C89219l.m154714a(this.f92716a, jVar.f92716a) && this.f92717b == jVar.f92717b && C89219l.m154714a(this.f92718c, jVar.f92718c) && C89219l.m154714a(this.f92719d, jVar.f92719d) && C89219l.m154714a(this.f92720e, jVar.f92720e) && this.f92721f == jVar.f92721f && C89219l.m154714a(this.f92722g, jVar.f92722g) && C89219l.m154714a(this.f92723h, jVar.f92723h) && C89219l.m154714a(this.f92724i, jVar.f92724i) && C89219l.m154714a(this.f92725j, jVar.f92725j) && C89219l.m154714a(this.f92726k, jVar.f92726k);
    }

    public final int hashCode() {
        String str = this.f92716a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f92717b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f92718c;
        int hashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f92719d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f92720e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        if (!this.f92721f) {
            i2 = 0;
        }
        int i7 = (hashCode4 + i2) * 31;
        Integer num = this.f92722g;
        int hashCode5 = (i7 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f92723h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f92724i;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f92725j;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f92726k;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "PolicyNoticeAction(text=" + this.f92716a + ", isBold=" + this.f92717b + ", linkType=" + this.f92718c + ", link=" + this.f92719d + ", extra=" + this.f92720e + ", approve=" + this.f92721f + ", operation=" + this.f92722g + ", nextPopUp=" + this.f92723h + ", dismiss=" + this.f92724i + ", dismissAll=" + this.f92725j + ", reGetSettings=" + this.f92726k + ")";
    }

    private C39249j(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f92716a = str;
        this.f92717b = false;
        this.f92718c = str2;
        this.f92719d = str3;
        this.f92720e = str4;
        this.f92721f = false;
        this.f92722g = num;
        this.f92723h = str5;
        this.f92724i = bool;
        this.f92725j = bool2;
        this.f92726k = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39249j(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, int r22) {
        /*
            r12 = this;
            r2 = r22
            r11 = r21
            r10 = r20
            r9 = r19
            r7 = r17
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0 = r2 & 1
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0016
            r3 = r8
        L_0x0016:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x001b
            r4 = r8
        L_0x001b:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0020
            r5 = r8
        L_0x0020:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0025
            r6 = r8
        L_0x0025:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x002a
            r7 = 0
        L_0x002a:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004c
        L_0x002e:
            r0 = r2 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
        L_0x0037:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x003f
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
        L_0x003f:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0047
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
        L_0x0047:
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x004c:
            r8 = r18
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
