package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.m */
public final class C66994m implements Serializable {

    /* renamed from: a */
    private final int f150307a;

    /* renamed from: b */
    private final String f150308b;

    /* renamed from: c */
    private final String f150309c;

    /* renamed from: d */
    private final String f150310d;

    /* renamed from: e */
    private final String f150311e;

    static {
        Covode.recordClassIndex(78571);
    }

    public C66994m() {
        this(0, null, null, null, null, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m118696xf2a4004f(int i) {
        return i;
    }

    public static /* synthetic */ C66994m copy$default(C66994m mVar, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mVar.f150307a;
        }
        if ((i2 & 2) != 0) {
            str = mVar.f150308b;
        }
        if ((i2 & 4) != 0) {
            str2 = mVar.f150309c;
        }
        if ((i2 & 8) != 0) {
            str3 = mVar.f150310d;
        }
        if ((i2 & 16) != 0) {
            str4 = mVar.f150311e;
        }
        return mVar.copy(i, str, str2, str3, str4);
    }

    public final int component1() {
        return this.f150307a;
    }

    public final String component2() {
        return this.f150308b;
    }

    public final String component3() {
        return this.f150309c;
    }

    public final String component4() {
        return this.f150310d;
    }

    public final String component5() {
        return this.f150311e;
    }

    public final C66994m copy(int i, String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new C66994m(i, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66994m)) {
            return false;
        }
        C66994m mVar = (C66994m) obj;
        return this.f150307a == mVar.f150307a && C89219l.m154714a(this.f150308b, mVar.f150308b) && C89219l.m154714a(this.f150309c, mVar.f150309c) && C89219l.m154714a(this.f150310d, mVar.f150310d) && C89219l.m154714a(this.f150311e, mVar.f150311e);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m118696xf2a4004f(this.f150307a) * 31;
        String str = this.f150308b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f150309c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f150310d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f150311e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "SocialRecommendFriendsConfig(socialRecType=" + this.f150307a + ", title=" + this.f150308b + ", subTitle=" + this.f150309c + ", buttonText=" + this.f150310d + ", toast=" + this.f150311e + ")";
    }

    public final String getButtonText() {
        return this.f150310d;
    }

    public final int getSocialRecType() {
        return this.f150307a;
    }

    public final String getSubTitle() {
        return this.f150309c;
    }

    public final String getTitle() {
        return this.f150308b;
    }

    public final String getToast() {
        return this.f150311e;
    }

    public C66994m(int i, String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f150307a = i;
        this.f150308b = str;
        this.f150309c = str2;
        this.f150310d = str3;
        this.f150311e = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C66994m(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, p4600h.p4611f.p4613b.C89214g r13) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0009
            r1 = 0
        L_0x0009:
            r0 = r12 & 2
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r5
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0023:
            r5 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.recommend.C66994m.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
