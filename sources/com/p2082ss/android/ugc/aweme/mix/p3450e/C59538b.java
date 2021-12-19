package com.p2082ss.android.ugc.aweme.mix.p3450e;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.e.b */
public final class C59538b implements Serializable {

    /* renamed from: a */
    private String f135877a;

    /* renamed from: b */
    private Integer f135878b;

    /* renamed from: c */
    private String f135879c;

    /* renamed from: d */
    private int f135880d;

    static {
        Covode.recordClassIndex(69933);
    }

    public C59538b() {
        this(null, null, null, 0, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_mix_params_SearchParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m109171x95d7847e(int i) {
        return i;
    }

    public static /* synthetic */ C59538b copy$default(C59538b bVar, String str, Integer num, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.f135877a;
        }
        if ((i2 & 2) != 0) {
            num = bVar.f135878b;
        }
        if ((i2 & 4) != 0) {
            str2 = bVar.f135879c;
        }
        if ((i2 & 8) != 0) {
            i = bVar.f135880d;
        }
        return bVar.copy(str, num, str2, i);
    }

    public final String component1() {
        return this.f135877a;
    }

    public final Integer component2() {
        return this.f135878b;
    }

    public final String component3() {
        return this.f135879c;
    }

    public final int component4() {
        return this.f135880d;
    }

    public final C59538b copy(String str, Integer num, String str2, int i) {
        return new C59538b(str, num, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59538b)) {
            return false;
        }
        C59538b bVar = (C59538b) obj;
        return C89219l.m154714a(this.f135877a, bVar.f135877a) && C89219l.m154714a(this.f135878b, bVar.f135878b) && C89219l.m154714a(this.f135879c, bVar.f135879c) && this.f135880d == bVar.f135880d;
    }

    public final int hashCode() {
        String str = this.f135877a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f135878b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f135879c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + m109171x95d7847e(this.f135880d);
    }

    public final String toString() {
        return "SearchParam(searchId=" + this.f135877a + ", isFromVideo=" + this.f135878b + ", searchType=" + this.f135879c + ", flowStartPositionInGeneralSearch=" + this.f135880d + ")";
    }

    public final int getFlowStartPositionInGeneralSearch() {
        return this.f135880d;
    }

    public final String getSearchId() {
        return this.f135877a;
    }

    public final String getSearchType() {
        return this.f135879c;
    }

    public final Integer isFromVideo() {
        return this.f135878b;
    }

    public final void setFlowStartPositionInGeneralSearch(int i) {
        this.f135880d = i;
    }

    public final void setFromVideo(Integer num) {
        this.f135878b = num;
    }

    public final void setSearchId(String str) {
        this.f135877a = str;
    }

    public final void setSearchType(String str) {
        this.f135879c = str;
    }

    public C59538b(String str, Integer num, String str2, int i) {
        this.f135877a = str;
        this.f135878b = num;
        this.f135879c = str2;
        this.f135880d = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C59538b(String str, Integer num, String str2, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : num, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i);
    }
}
