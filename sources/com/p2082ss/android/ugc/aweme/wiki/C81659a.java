package com.p2082ss.android.ugc.aweme.wiki;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.wiki.a */
public final class C81659a implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f182590a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private final String f182591b;
    @AbstractC27891c(mo46611a = "review_result_type")

    /* renamed from: c */
    private final Integer f182592c;
    @AbstractC27891c(mo46611a = "review_text")

    /* renamed from: d */
    private final String f182593d;

    static {
        Covode.recordClassIndex(95062);
    }

    /* renamed from: com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m141529xf1f892a1(int i) {
        return i;
    }

    public static /* synthetic */ C81659a copy$default(C81659a aVar, int i, String str, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f182590a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f182591b;
        }
        if ((i2 & 4) != 0) {
            num = aVar.f182592c;
        }
        if ((i2 & 8) != 0) {
            str2 = aVar.f182593d;
        }
        return aVar.copy(i, str, num, str2);
    }

    public final int component1() {
        return this.f182590a;
    }

    public final String component2() {
        return this.f182591b;
    }

    public final Integer component3() {
        return this.f182592c;
    }

    public final String component4() {
        return this.f182593d;
    }

    public final C81659a copy(int i, String str, Integer num, String str2) {
        return new C81659a(i, str, num, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81659a)) {
            return false;
        }
        C81659a aVar = (C81659a) obj;
        return this.f182590a == aVar.f182590a && C89219l.m154714a(this.f182591b, aVar.f182591b) && C89219l.m154714a(this.f182592c, aVar.f182592c) && C89219l.m154714a(this.f182593d, aVar.f182593d);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m141529xf1f892a1(this.f182590a) * 31;
        String str = this.f182591b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f182592c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f182593d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CheckAnchorModerationResultResponse(code=" + this.f182590a + ", msg=" + this.f182591b + ", reviewResultType=" + this.f182592c + ", reviewText=" + this.f182593d + ")";
    }

    public final int getCode() {
        return this.f182590a;
    }

    public final String getMsg() {
        return this.f182591b;
    }

    public final Integer getReviewResultType() {
        return this.f182592c;
    }

    public final String getReviewText() {
        return this.f182593d;
    }

    public C81659a(int i, String str, Integer num, String str2) {
        this.f182590a = i;
        this.f182591b = str;
        this.f182592c = num;
        this.f182593d = str2;
    }
}
