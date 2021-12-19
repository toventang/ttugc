package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.g */
public final class C74443g {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f167421a;
    @AbstractC27891c(mo46611a = "product_detail")

    /* renamed from: b */
    public final ShoutoutsProduct f167422b;

    static {
        Covode.recordClassIndex(87233);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74443g)) {
            return false;
        }
        C74443g gVar = (C74443g) obj;
        return this.f167421a == gVar.f167421a && C89219l.m154714a(this.f167422b, gVar.f167422b);
    }

    public final int hashCode() {
        int i = this.f167421a * 31;
        ShoutoutsProduct shoutoutsProduct = this.f167422b;
        return i + (shoutoutsProduct != null ? shoutoutsProduct.hashCode() : 0);
    }

    public final String toString() {
        return "ShoutoutsProductResp(statusCode=" + this.f167421a + ", productDetail=" + this.f167422b + ")";
    }
}
