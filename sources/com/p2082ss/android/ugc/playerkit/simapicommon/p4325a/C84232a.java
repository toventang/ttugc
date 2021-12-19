package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.a */
public final class C84232a implements Serializable {

    /* renamed from: a */
    private final long f188316a;

    /* renamed from: b */
    private final String f188317b;

    /* renamed from: c */
    private final String f188318c;

    /* renamed from: d */
    private final int f188319d;

    /* renamed from: e */
    private final String f188320e;

    /* renamed from: f */
    private final String f188321f;

    /* renamed from: g */
    private final long f188322g;

    /* renamed from: h */
    private final boolean f188323h;

    /* renamed from: i */
    private final long f188324i;

    /* renamed from: j */
    private final long f188325j;

    /* renamed from: k */
    private final int f188326k;

    /* renamed from: l */
    private String f188327l;

    static {
        Covode.recordClassIndex(98141);
    }

    /* renamed from: com_ss_android_ugc_playerkit_simapicommon_model_CaptionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m144839x9d086e8e(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_playerkit_simapicommon_model_CaptionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m144840x9d086e8e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C84232a copy$default(C84232a aVar, long j, String str, String str2, int i, String str3, String str4, long j2, boolean z, long j3, long j4, int i2, String str5, int i3, Object obj) {
        String str6 = str;
        long j5 = j;
        String str7 = str3;
        int i4 = i;
        String str8 = str2;
        long j6 = j2;
        String str9 = str4;
        long j7 = j3;
        boolean z2 = z;
        long j8 = j4;
        String str10 = str5;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            j5 = aVar.f188316a;
        }
        if ((i3 & 2) != 0) {
            str6 = aVar.f188317b;
        }
        if ((i3 & 4) != 0) {
            str8 = aVar.f188318c;
        }
        if ((i3 & 8) != 0) {
            i4 = aVar.f188319d;
        }
        if ((i3 & 16) != 0) {
            str7 = aVar.f188320e;
        }
        if ((i3 & 32) != 0) {
            str9 = aVar.f188321f;
        }
        if ((i3 & 64) != 0) {
            j6 = aVar.f188322g;
        }
        if ((i3 & 128) != 0) {
            z2 = aVar.f188323h;
        }
        if ((i3 & 256) != 0) {
            j7 = aVar.f188324i;
        }
        if ((i3 & 512) != 0) {
            j8 = aVar.f188325j;
        }
        if ((i3 & 1024) != 0) {
            i5 = aVar.f188326k;
        }
        if ((i3 & 2048) != 0) {
            str10 = aVar.f188327l;
        }
        return aVar.copy(j5, str6, str8, i4, str7, str9, j6, z2, j7, j8, i5, str10);
    }

    public final long component1() {
        return this.f188316a;
    }

    public final long component10() {
        return this.f188325j;
    }

    public final int component11() {
        return this.f188326k;
    }

    public final String component12() {
        return this.f188327l;
    }

    public final String component2() {
        return this.f188317b;
    }

    public final String component3() {
        return this.f188318c;
    }

    public final int component4() {
        return this.f188319d;
    }

    public final String component5() {
        return this.f188320e;
    }

    public final String component6() {
        return this.f188321f;
    }

    public final long component7() {
        return this.f188322g;
    }

    public final boolean component8() {
        return this.f188323h;
    }

    public final long component9() {
        return this.f188324i;
    }

    public final C84232a copy(long j, String str, String str2, int i, String str3, String str4, long j2, boolean z, long j3, long j4, int i2, String str5) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        return new C84232a(j, str, str2, i, str3, str4, j2, z, j3, j4, i2, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84232a)) {
            return false;
        }
        C84232a aVar = (C84232a) obj;
        return this.f188316a == aVar.f188316a && C89219l.m154714a(this.f188317b, aVar.f188317b) && C89219l.m154714a(this.f188318c, aVar.f188318c) && this.f188319d == aVar.f188319d && C89219l.m154714a(this.f188320e, aVar.f188320e) && C89219l.m154714a(this.f188321f, aVar.f188321f) && this.f188322g == aVar.f188322g && this.f188323h == aVar.f188323h && this.f188324i == aVar.f188324i && this.f188325j == aVar.f188325j && this.f188326k == aVar.f188326k && C89219l.m154714a(this.f188327l, aVar.f188327l);
    }

    public final int hashCode() {
        int com_ss_android_ugc_playerkit_simapicommon_model_CaptionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m144840x9d086e8e(this.f188316a) * 31;
        String str = this.f188317b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_playerkit_simapicommon_model_CaptionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f188318c;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m144839x9d086e8e(this.f188319d)) * 31;
        String str3 = this.f188320e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f188321f;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + m144840x9d086e8e(this.f188322g)) * 31;
        boolean z = this.f188323h;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_playerkit_simapicommon_model_CaptionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((((((hashCode4 + i2) * 31) + m144840x9d086e8e(this.f188324i)) * 31) + m144840x9d086e8e(this.f188325j)) * 31) + m144839x9d086e8e(this.f188326k)) * 31;
        String str5 = this.f188327l;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return com_ss_android_ugc_playerkit_simapicommon_model_CaptionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i;
    }

    public final String toString() {
        return "CaptionInfo(expire=" + this.f188316a + ", captionFormat=" + this.f188317b + ", lang=" + this.f188318c + ", subId=" + this.f188319d + ", subVersion=" + this.f188320e + ", url=" + this.f188321f + ", languageId=" + this.f188322g + ", isAutoGenerated=" + this.f188323h + ", complaintId=" + this.f188324i + ", createTime=" + this.f188325j + ", id=" + this.f188326k + ", uri=" + this.f188327l + ")";
    }

    public final String getCaptionFormat() {
        return this.f188317b;
    }

    public final long getComplaintId() {
        return this.f188324i;
    }

    public final long getCreateTime() {
        return this.f188325j;
    }

    public final long getExpire() {
        return this.f188316a;
    }

    public final int getId() {
        return this.f188326k;
    }

    public final String getLang() {
        return this.f188318c;
    }

    public final long getLanguageId() {
        return this.f188322g;
    }

    public final int getSubId() {
        return this.f188319d;
    }

    public final String getSubVersion() {
        return this.f188320e;
    }

    public final String getUri() {
        return this.f188327l;
    }

    public final String getUrl() {
        return this.f188321f;
    }

    public final boolean isAutoGenerated() {
        return this.f188323h;
    }

    public final void setUri(String str) {
        this.f188327l = str;
    }

    public C84232a(long j, String str, String str2, int i, String str3, String str4, long j2, boolean z, long j3, long j4, int i2, String str5) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        this.f188316a = j;
        this.f188317b = str;
        this.f188318c = str2;
        this.f188319d = i;
        this.f188320e = str3;
        this.f188321f = str4;
        this.f188322g = j2;
        this.f188323h = z;
        this.f188324i = j3;
        this.f188325j = j4;
        this.f188326k = i2;
        this.f188327l = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C84232a(long j, String str, String str2, int i, String str3, String str4, long j2, boolean z, long j3, long j4, int i2, String str5, int i3, C89214g gVar) {
        this(j, str, str2, i, str3, str4, j2, z, j3, j4, i2, (i3 & 2048) != 0 ? null : str5);
    }
}
