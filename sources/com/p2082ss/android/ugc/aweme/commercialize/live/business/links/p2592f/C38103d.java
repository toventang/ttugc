package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.d */
public final class C38103d implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f90025a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private final String f90026b;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: c */
    private final int f90027c;

    static {
        Covode.recordClassIndex(45570);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77214x7bdecb03(int i) {
        return i;
    }

    public static /* synthetic */ C38103d copy$default(C38103d dVar, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dVar.f90025a;
        }
        if ((i3 & 2) != 0) {
            str = dVar.f90026b;
        }
        if ((i3 & 4) != 0) {
            i2 = dVar.f90027c;
        }
        return dVar.copy(i, str, i2);
    }

    public final int component1() {
        return this.f90025a;
    }

    public final String component2() {
        return this.f90026b;
    }

    public final int component3() {
        return this.f90027c;
    }

    public final C38103d copy(int i, String str, int i2) {
        C89219l.m154721d(str, "");
        return new C38103d(i, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38103d)) {
            return false;
        }
        C38103d dVar = (C38103d) obj;
        return this.f90025a == dVar.f90025a && C89219l.m154714a(this.f90026b, dVar.f90026b) && this.f90027c == dVar.f90027c;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77214x7bdecb03(this.f90025a) * 31;
        String str = this.f90026b;
        return ((com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + m77214x7bdecb03(this.f90027c);
    }

    public final String toString() {
        return "BusinessLinksCountResponse(statusCode=" + this.f90025a + ", statusMsg=" + this.f90026b + ", total=" + this.f90027c + ")";
    }

    public final int getStatusCode() {
        return this.f90025a;
    }

    public final String getStatusMsg() {
        return this.f90026b;
    }

    public final int getTotal() {
        return this.f90027c;
    }

    public C38103d(int i, String str, int i2) {
        C89219l.m154721d(str, "");
        this.f90025a = i;
        this.f90026b = str;
        this.f90027c = i2;
    }
}
