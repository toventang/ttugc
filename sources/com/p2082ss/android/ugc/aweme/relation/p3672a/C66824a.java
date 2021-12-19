package com.p2082ss.android.ugc.aweme.relation.p3672a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.a.a */
public final class C66824a implements Serializable {

    /* renamed from: a */
    private final int f150076a;

    /* renamed from: b */
    private final String f150077b;

    /* renamed from: c */
    private final int f150078c;

    /* renamed from: d */
    private final String f150079d;

    /* renamed from: e */
    private final String f150080e;

    /* renamed from: f */
    private final String f150081f;

    /* renamed from: g */
    private final String f150082g;

    /* renamed from: h */
    private final String f150083h;

    /* renamed from: i */
    private final int f150084i;

    static {
        Covode.recordClassIndex(78398);
    }

    /* renamed from: com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m118552x92443116(int i) {
        return i;
    }

    public static /* synthetic */ C66824a copy$default(C66824a aVar, int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = aVar.f150076a;
        }
        if ((i4 & 2) != 0) {
            str = aVar.f150077b;
        }
        if ((i4 & 4) != 0) {
            i2 = aVar.f150078c;
        }
        if ((i4 & 8) != 0) {
            str2 = aVar.f150079d;
        }
        if ((i4 & 16) != 0) {
            str3 = aVar.f150080e;
        }
        if ((i4 & 32) != 0) {
            str4 = aVar.f150081f;
        }
        if ((i4 & 64) != 0) {
            str5 = aVar.f150082g;
        }
        if ((i4 & 128) != 0) {
            str6 = aVar.f150083h;
        }
        if ((i4 & 256) != 0) {
            i3 = aVar.f150084i;
        }
        return aVar.copy(i, str, i2, str2, str3, str4, str5, str6, i3);
    }

    public final int component1() {
        return this.f150076a;
    }

    public final String component2() {
        return this.f150077b;
    }

    public final int component3() {
        return this.f150078c;
    }

    public final String component4() {
        return this.f150079d;
    }

    public final String component5() {
        return this.f150080e;
    }

    public final String component6() {
        return this.f150081f;
    }

    public final String component7() {
        return this.f150082g;
    }

    public final String component8() {
        return this.f150083h;
    }

    public final int component9() {
        return this.f150084i;
    }

    public final C66824a copy(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        return new C66824a(i, str, i2, str2, str3, str4, str5, str6, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66824a)) {
            return false;
        }
        C66824a aVar = (C66824a) obj;
        return this.f150076a == aVar.f150076a && C89219l.m154714a(this.f150077b, aVar.f150077b) && this.f150078c == aVar.f150078c && C89219l.m154714a(this.f150079d, aVar.f150079d) && C89219l.m154714a(this.f150080e, aVar.f150080e) && C89219l.m154714a(this.f150081f, aVar.f150081f) && C89219l.m154714a(this.f150082g, aVar.f150082g) && C89219l.m154714a(this.f150083h, aVar.f150083h) && this.f150084i == aVar.f150084i;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m118552x92443116(this.f150076a) * 31;
        String str = this.f150077b;
        int i = 0;
        int hashCode = (((com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + m118552x92443116(this.f150078c)) * 31;
        String str2 = this.f150079d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f150080e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f150081f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f150082g;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f150083h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + m118552x92443116(this.f150084i);
    }

    public final String toString() {
        return "SocialConsentConfig(socialRecType=" + this.f150076a + ", header=" + this.f150077b + ", iconRes=" + this.f150078c + ", title=" + this.f150079d + ", desc=" + this.f150080e + ", leftButtonText=" + this.f150081f + ", rightButtonText=" + this.f150082g + ", toast=" + this.f150083h + ", step=" + this.f150084i + ")";
    }

    public final String getDesc() {
        return this.f150080e;
    }

    public final String getHeader() {
        return this.f150077b;
    }

    public final int getIconRes() {
        return this.f150078c;
    }

    public final String getLeftButtonText() {
        return this.f150081f;
    }

    public final String getRightButtonText() {
        return this.f150082g;
    }

    public final int getSocialRecType() {
        return this.f150076a;
    }

    public final int getStep() {
        return this.f150084i;
    }

    public final String getTitle() {
        return this.f150079d;
    }

    public final String getToast() {
        return this.f150083h;
    }

    public C66824a(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.f150076a = i;
        this.f150077b = str;
        this.f150078c = i2;
        this.f150079d = str2;
        this.f150080e = str3;
        this.f150081f = str4;
        this.f150082g = str5;
        this.f150083h = str6;
        this.f150084i = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C66824a(int r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, p4600h.p4611f.p4613b.C89214g r23) {
        /*
            r12 = this;
            r2 = r22
            r9 = r19
            r8 = r18
            r7 = r17
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1 = r2 & 1
            r0 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
        L_0x0013:
            r0 = r2 & 2
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x001a
            r4 = r10
        L_0x001a:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x001f
            r5 = 0
        L_0x001f:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0024
            r6 = r10
        L_0x0024:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0029
            r7 = r10
        L_0x0029:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x002e
            r8 = r10
        L_0x002e:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0033
            r9 = r10
        L_0x0033:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
        L_0x0037:
            r2 = r12
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x003e:
            r10 = r20
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3672a.C66824a.<init>(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, h.f.b.g):void");
    }
}
