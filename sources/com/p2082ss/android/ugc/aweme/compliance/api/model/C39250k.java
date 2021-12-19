package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.k */
public final class C39250k extends BaseResponse {
    @AbstractC27891c(mo46611a = "policy_notices")

    /* renamed from: a */
    public final List<C39248i> f92727a;

    static {
        Covode.recordClassIndex(46908);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39250k) && C89219l.m154714a(this.f92727a, ((C39250k) obj).f92727a);
        }
        return true;
    }

    public final int hashCode() {
        List<C39248i> list = this.f92727a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PolicyNoticeResponse(policyNotices=" + this.f92727a + ")";
    }

    private /* synthetic */ C39250k() {
        this(C89086z.INSTANCE);
    }

    private C39250k(List<C39248i> list) {
        C89219l.m154721d(list, "");
        this.f92727a = list;
    }
}
