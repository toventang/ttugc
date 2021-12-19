package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.e */
public final class C43322e {
    @AbstractC27891c(mo46611a = "pdp_cache_timeout_config")

    /* renamed from: a */
    public final int f101102a;
    @AbstractC27891c(mo46611a = "pdp_prefetch_cache_timeout_config")

    /* renamed from: b */
    public final int f101103b;
    @AbstractC27891c(mo46611a = "coupon_popup_bg_2x")

    /* renamed from: c */
    public final String f101104c;
    @AbstractC27891c(mo46611a = "coupon_popup_bg_3x")

    /* renamed from: d */
    public final String f101105d;

    static {
        Covode.recordClassIndex(51536);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43322e)) {
            return false;
        }
        C43322e eVar = (C43322e) obj;
        return this.f101102a == eVar.f101102a && this.f101103b == eVar.f101103b && C89219l.m154714a(this.f101104c, eVar.f101104c) && C89219l.m154714a(this.f101105d, eVar.f101105d);
    }

    public final int hashCode() {
        int i = ((this.f101102a * 31) + this.f101103b) * 31;
        String str = this.f101104c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f101105d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EComPdpConfig(cacheTimeout=" + this.f101102a + ", prefetchTimeout=" + this.f101103b + ", couponPopupBg2xUrl=" + this.f101104c + ", couponPopupBg3xUrl=" + this.f101105d + ")";
    }

    private C43322e() {
        this.f101102a = 120;
        this.f101103b = 10;
        this.f101104c = null;
        this.f101105d = null;
    }

    public /* synthetic */ C43322e(byte b) {
        this();
    }
}
