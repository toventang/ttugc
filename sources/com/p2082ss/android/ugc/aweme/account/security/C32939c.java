package com.p2082ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.security.c */
public final class C32939c extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C32937a f78376a = null;

    static {
        Covode.recordClassIndex(39731);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C32939c) && C89219l.m154714a(this.f78376a, ((C32939c) obj).f78376a);
        }
        return true;
    }

    public final int hashCode() {
        C32937a aVar = this.f78376a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SafeInfoNoticeMsgResponse(data=" + this.f78376a + ")";
    }

    private C32939c() {
    }
}
