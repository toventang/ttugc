package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.a */
public final class C39053a implements Serializable {

    /* renamed from: a */
    private final int f92212a;

    /* renamed from: b */
    private String f92213b;

    /* renamed from: c */
    private final String f92214c;

    /* renamed from: d */
    private final String f92215d;

    /* renamed from: e */
    private final Integer f92216e;

    /* renamed from: f */
    private final String f92217f;

    /* renamed from: g */
    private final UrlModel f92218g;

    /* renamed from: h */
    private final boolean f92219h;

    /* renamed from: i */
    private final String f92220i;

    /* renamed from: j */
    private final String f92221j;

    /* renamed from: k */
    private Long f92222k;

    /* renamed from: l */
    private final String f92223l;

    /* renamed from: m */
    private String f92224m;

    static {
        Covode.recordClassIndex(46669);
    }

    public C39053a(int i, String str) {
        this(i, str, null, null, null, null, null, false, null, null, null, null, null, 8188, null);
    }

    public C39053a(int i, String str, String str2) {
        this(i, str, str2, null, null, null, null, false, null, null, null, null, null, 8184, null);
    }

    public C39053a(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, null, null, null, false, null, null, null, null, null, 8176, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num) {
        this(i, str, str2, str3, num, null, null, false, null, null, null, null, null, 8160, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4) {
        this(i, str, str2, str3, num, str4, null, false, null, null, null, null, null, 8128, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        this(i, str, str2, str3, num, str4, urlModel, false, null, null, null, null, null, 8064, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z) {
        this(i, str, str2, str3, num, str4, urlModel, z, null, null, null, null, null, 7936, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, null, null, null, null, 7680, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, null, null, null, 7168, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, null, null, 6144, null);
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, null, 4096, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_common_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79252xa4646e18(int i) {
        return i;
    }

    public static /* synthetic */ C39053a copy$default(C39053a aVar, int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f92212a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f92213b;
        }
        if ((i2 & 4) != 0) {
            str2 = aVar.f92214c;
        }
        if ((i2 & 8) != 0) {
            str3 = aVar.f92215d;
        }
        if ((i2 & 16) != 0) {
            num = aVar.f92216e;
        }
        if ((i2 & 32) != 0) {
            str4 = aVar.f92217f;
        }
        if ((i2 & 64) != 0) {
            urlModel = aVar.f92218g;
        }
        if ((i2 & 128) != 0) {
            z = aVar.f92219h;
        }
        if ((i2 & 256) != 0) {
            str5 = aVar.f92220i;
        }
        if ((i2 & 512) != 0) {
            str6 = aVar.f92221j;
        }
        if ((i2 & 1024) != 0) {
            l = aVar.f92222k;
        }
        if ((i2 & 2048) != 0) {
            str7 = aVar.f92223l;
        }
        if ((i2 & 4096) != 0) {
            str8 = aVar.f92224m;
        }
        return aVar.copy(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8);
    }

    public final int component1() {
        return this.f92212a;
    }

    public final String component10() {
        return this.f92221j;
    }

    public final Long component11() {
        return this.f92222k;
    }

    public final String component12() {
        return this.f92223l;
    }

    public final String component13() {
        return this.f92224m;
    }

    public final String component2() {
        return this.f92213b;
    }

    public final String component3() {
        return this.f92214c;
    }

    public final String component4() {
        return this.f92215d;
    }

    public final Integer component5() {
        return this.f92216e;
    }

    public final String component6() {
        return this.f92217f;
    }

    public final UrlModel component7() {
        return this.f92218g;
    }

    public final boolean component8() {
        return this.f92219h;
    }

    public final String component9() {
        return this.f92220i;
    }

    public final C39053a copy(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8) {
        C89219l.m154721d(str, "");
        return new C39053a(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39053a)) {
            return false;
        }
        C39053a aVar = (C39053a) obj;
        return this.f92212a == aVar.f92212a && C89219l.m154714a(this.f92213b, aVar.f92213b) && C89219l.m154714a(this.f92214c, aVar.f92214c) && C89219l.m154714a(this.f92215d, aVar.f92215d) && C89219l.m154714a(this.f92216e, aVar.f92216e) && C89219l.m154714a(this.f92217f, aVar.f92217f) && C89219l.m154714a(this.f92218g, aVar.f92218g) && this.f92219h == aVar.f92219h && C89219l.m154714a(this.f92220i, aVar.f92220i) && C89219l.m154714a(this.f92221j, aVar.f92221j) && C89219l.m154714a(this.f92222k, aVar.f92222k) && C89219l.m154714a(this.f92223l, aVar.f92223l) && C89219l.m154714a(this.f92224m, aVar.f92224m);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_common_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m79252xa4646e18(this.f92212a) * 31;
        String str = this.f92213b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_common_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f92214c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f92215d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f92216e;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f92217f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f92218g;
        int hashCode6 = (hashCode5 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        boolean z = this.f92219h;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode6 + i2) * 31;
        String str5 = this.f92220i;
        int hashCode7 = (i5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f92221j;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Long l = this.f92222k;
        int hashCode9 = (hashCode8 + (l != null ? l.hashCode() : 0)) * 31;
        String str7 = this.f92223l;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f92224m;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "AnchorTransData(businessType=" + this.f92212a + ", anchorContent=" + this.f92213b + ", title=" + this.f92214c + ", anchorTag=" + this.f92215d + ", source=" + this.f92216e + ", id=" + this.f92217f + ", anchorIcon=" + this.f92218g + ", canDelete=" + this.f92219h + ", url=" + this.f92220i + ", language=" + this.f92221j + ", addTime=" + this.f92222k + ", extra=" + this.f92223l + ", subtype=" + this.f92224m + ")";
    }

    public final Long getAddTime() {
        return this.f92222k;
    }

    public final String getAnchorContent() {
        return this.f92213b;
    }

    public final UrlModel getAnchorIcon() {
        return this.f92218g;
    }

    public final String getAnchorTag() {
        return this.f92215d;
    }

    public final int getBusinessType() {
        return this.f92212a;
    }

    public final boolean getCanDelete() {
        return this.f92219h;
    }

    public final String getExtra() {
        return this.f92223l;
    }

    public final String getId() {
        return this.f92217f;
    }

    public final String getLanguage() {
        return this.f92221j;
    }

    public final Integer getSource() {
        return this.f92216e;
    }

    public final String getSubtype() {
        return this.f92224m;
    }

    public final String getTitle() {
        return this.f92214c;
    }

    public final String getUrl() {
        return this.f92220i;
    }

    public C39053a(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8) {
        C89219l.m154721d(str, "");
        this.f92212a = i;
        this.f92213b = str;
        this.f92214c = str2;
        this.f92215d = str3;
        this.f92216e = num;
        this.f92217f = str4;
        this.f92218g = urlModel;
        this.f92219h = z;
        this.f92220i = str5;
        this.f92221j = str6;
        this.f92222k = l;
        this.f92223l = str7;
        this.f92224m = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39053a(int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, com.p2082ss.android.ugc.aweme.base.model.UrlModel r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.Long r25, java.lang.String r26, java.lang.String r27, int r28, p4600h.p4611f.p4613b.C89214g r29) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.C39053a.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }

    public final void setAddTime(Long l) {
        this.f92222k = l;
    }

    public final void setSubtype(String str) {
        this.f92224m = str;
    }

    public final void setAnchorContent(String str) {
        C89219l.m154721d(str, "");
        this.f92213b = str;
    }
}
