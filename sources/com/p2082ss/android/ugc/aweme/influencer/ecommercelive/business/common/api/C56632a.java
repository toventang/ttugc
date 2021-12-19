package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.a */
public final class C56632a {

    /* renamed from: a */
    public final BaseResponse<String> f129079a;

    /* renamed from: b */
    public final String f129080b;

    /* renamed from: c */
    public final Throwable f129081c;

    static {
        Covode.recordClassIndex(66477);
    }

    public C56632a() {
        this((BaseResponse) null, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56632a)) {
            return false;
        }
        C56632a aVar = (C56632a) obj;
        return C89219l.m154714a(this.f129079a, aVar.f129079a) && C89219l.m154714a(this.f129080b, aVar.f129080b) && C89219l.m154714a(this.f129081c, aVar.f129081c);
    }

    public final int hashCode() {
        BaseResponse<String> baseResponse = this.f129079a;
        int i = 0;
        int hashCode = (baseResponse != null ? baseResponse.hashCode() : 0) * 31;
        String str = this.f129080b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.f129081c;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "OperateProductResult(response=" + this.f129079a + ", productId=" + this.f129080b + ", throwable=" + this.f129081c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C56632a(BaseResponse baseResponse, String str, int i) {
        this((i & 1) != 0 ? null : baseResponse, (i & 2) != 0 ? null : str, (Throwable) null);
    }

    public C56632a(BaseResponse<String> baseResponse, String str, Throwable th) {
        this.f129079a = baseResponse;
        this.f129080b = str;
        this.f129081c = th;
    }
}
