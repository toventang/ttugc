package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45696g;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.b */
public final class C45698b {

    /* renamed from: a */
    public final BaseResponse<C45696g> f106416a;

    /* renamed from: b */
    public final Throwable f106417b;

    static {
        Covode.recordClassIndex(54213);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45698b)) {
            return false;
        }
        C45698b bVar = (C45698b) obj;
        return C89219l.m154714a(this.f106416a, bVar.f106416a) && C89219l.m154714a(this.f106417b, bVar.f106417b);
    }

    public final int hashCode() {
        BaseResponse<C45696g> baseResponse = this.f106416a;
        int i = 0;
        int hashCode = (baseResponse != null ? baseResponse.hashCode() : 0) * 31;
        Throwable th = this.f106417b;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProductListResult(response=" + this.f106416a + ", throwable=" + this.f106417b + ")";
    }

    private /* synthetic */ C45698b() {
        this(null, null);
    }

    public C45698b(BaseResponse<C45696g> baseResponse, Throwable th) {
        this.f106416a = baseResponse;
        this.f106417b = th;
    }
}
