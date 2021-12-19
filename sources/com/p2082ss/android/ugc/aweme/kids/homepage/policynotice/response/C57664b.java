package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b */
public final class C57664b {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    public final String f131608a;
    @AbstractC27891c(mo46611a = "is_bold")

    /* renamed from: b */
    public final boolean f131609b;
    @AbstractC27891c(mo46611a = "link_type")

    /* renamed from: c */
    public final String f131610c;
    @AbstractC27891c(mo46611a = "link")

    /* renamed from: d */
    public final String f131611d;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: e */
    public final String f131612e;
    @AbstractC27891c(mo46611a = "approve")

    /* renamed from: f */
    public final boolean f131613f;
    @AbstractC27891c(mo46611a = "operation")

    /* renamed from: g */
    public final Integer f131614g;
    @AbstractC27891c(mo46611a = "next_pop_up")

    /* renamed from: h */
    public final String f131615h;
    @AbstractC27891c(mo46611a = "dismiss")

    /* renamed from: i */
    public final Boolean f131616i;
    @AbstractC27891c(mo46611a = "dismiss_all")

    /* renamed from: j */
    public final Boolean f131617j;
    @AbstractC27891c(mo46611a = "re_get_settings")

    /* renamed from: k */
    public final Boolean f131618k;

    static {
        Covode.recordClassIndex(67631);
    }

    public C57664b() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57664b)) {
            return false;
        }
        C57664b bVar = (C57664b) obj;
        return C89219l.m154714a(this.f131608a, bVar.f131608a) && this.f131609b == bVar.f131609b && C89219l.m154714a(this.f131610c, bVar.f131610c) && C89219l.m154714a(this.f131611d, bVar.f131611d) && C89219l.m154714a(this.f131612e, bVar.f131612e) && this.f131613f == bVar.f131613f && C89219l.m154714a(this.f131614g, bVar.f131614g) && C89219l.m154714a(this.f131615h, bVar.f131615h) && C89219l.m154714a(this.f131616i, bVar.f131616i) && C89219l.m154714a(this.f131617j, bVar.f131617j) && C89219l.m154714a(this.f131618k, bVar.f131618k);
    }

    public final int hashCode() {
        String str = this.f131608a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f131609b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f131610c;
        int hashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f131611d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f131612e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        if (!this.f131613f) {
            i2 = 0;
        }
        int i7 = (hashCode4 + i2) * 31;
        Integer num = this.f131614g;
        int hashCode5 = (i7 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f131615h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f131616i;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f131617j;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f131618k;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "PolicyNoticeAction(text=" + this.f131608a + ", isBold=" + this.f131609b + ", linkType=" + this.f131610c + ", link=" + this.f131611d + ", extra=" + this.f131612e + ", approve=" + this.f131613f + ", operation=" + this.f131614g + ", nextPopUp=" + this.f131615h + ", dismiss=" + this.f131616i + ", dismissAll=" + this.f131617j + ", reGetSettings=" + this.f131618k + ")";
    }

    private C57664b(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f131608a = str;
        this.f131609b = false;
        this.f131610c = str2;
        this.f131611d = str3;
        this.f131612e = str4;
        this.f131613f = false;
        this.f131614g = num;
        this.f131615h = str5;
        this.f131616i = bool;
        this.f131617j = bool2;
        this.f131618k = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C57664b(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, int r22) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
