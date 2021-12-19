package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2545c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a */
public final class C37703a implements Serializable {
    @AbstractC27891c(mo46611a = "is_ad")

    /* renamed from: a */
    private final boolean f89066a;
    @AbstractC27891c(mo46611a = "creative_id")

    /* renamed from: b */
    private final Long f89067b;
    @AbstractC27891c(mo46611a = "log_extra")

    /* renamed from: c */
    private final String f89068c;

    static {
        Covode.recordClassIndex(45141);
    }

    public static /* synthetic */ C37703a copy$default(C37703a aVar, boolean z, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f89066a;
        }
        if ((i & 2) != 0) {
            l = aVar.f89067b;
        }
        if ((i & 4) != 0) {
            str = aVar.f89068c;
        }
        return aVar.copy(z, l, str);
    }

    public final boolean component1() {
        return this.f89066a;
    }

    public final Long component2() {
        return this.f89067b;
    }

    public final String component3() {
        return this.f89068c;
    }

    public final C37703a copy(boolean z, Long l, String str) {
        return new C37703a(z, l, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37703a)) {
            return false;
        }
        C37703a aVar = (C37703a) obj;
        return this.f89066a == aVar.f89066a && C89219l.m154714a(this.f89067b, aVar.f89067b) && C89219l.m154714a(this.f89068c, aVar.f89068c);
    }

    public final int hashCode() {
        boolean z = this.f89066a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Long l = this.f89067b;
        int i5 = 0;
        int hashCode = (i4 + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f89068c;
        if (str != null) {
            i5 = str.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "ShopifyPdpAdInfo(isAd=" + this.f89066a + ", creativeId=" + this.f89067b + ", logExtra=" + this.f89068c + ")";
    }

    public final Long getCreativeId() {
        return this.f89067b;
    }

    public final String getLogExtra() {
        return this.f89068c;
    }

    public final boolean isAd() {
        return this.f89066a;
    }

    public C37703a(boolean z, Long l, String str) {
        this.f89066a = z;
        this.f89067b = l;
        this.f89068c = str;
    }
}
