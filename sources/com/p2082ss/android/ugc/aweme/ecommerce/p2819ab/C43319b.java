package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.b */
public final class C43319b {
    @AbstractC27891c(mo46611a = "coupon_panel_schema")

    /* renamed from: a */
    public final String f101096a;
    @AbstractC27891c(mo46611a = "prefetch_schema")

    /* renamed from: b */
    public final C43330m f101097b;

    static {
        Covode.recordClassIndex(51533);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43319b)) {
            return false;
        }
        C43319b bVar = (C43319b) obj;
        return C89219l.m154714a(this.f101096a, bVar.f101096a) && C89219l.m154714a(this.f101097b, bVar.f101097b);
    }

    public final int hashCode() {
        String str = this.f101096a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C43330m mVar = this.f101097b;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ECSettingConfig(couponPanelSchema=" + this.f101096a + ", prefetchSchema=" + this.f101097b + ")";
    }

    private C43319b() {
        this.f101096a = null;
        this.f101097b = null;
    }

    public /* synthetic */ C43319b(byte b) {
        this();
    }
}
