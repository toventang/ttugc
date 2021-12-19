package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.response.c */
public final class C57665c extends BaseResponse {
    @AbstractC27891c(mo46611a = "policy_notices")

    /* renamed from: a */
    public final List<C57663a> f131619a;

    static {
        Covode.recordClassIndex(67632);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C57665c) && C89219l.m154714a(this.f131619a, ((C57665c) obj).f131619a);
        }
        return true;
    }

    public final int hashCode() {
        List<C57663a> list = this.f131619a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PolicyNoticeResponse(policyNotices=" + this.f131619a + ")";
    }

    private /* synthetic */ C57665c() {
        this(C89086z.INSTANCE);
    }

    private C57665c(List<C57663a> list) {
        C89219l.m154721d(list, "");
        this.f131619a = list;
    }
}
