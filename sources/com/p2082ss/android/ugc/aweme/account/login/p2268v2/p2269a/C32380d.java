package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.d */
public final class C32380d extends BaseResponse {
    @AbstractC27891c(mo46611a = "is_valid")

    /* renamed from: a */
    public final Boolean f77214a = null;
    @AbstractC27891c(mo46611a = "recommended_unique_ids")

    /* renamed from: b */
    public final List<String> f77215b = null;

    static {
        Covode.recordClassIndex(39148);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32380d)) {
            return false;
        }
        C32380d dVar = (C32380d) obj;
        return C89219l.m154714a(this.f77214a, dVar.f77214a) && C89219l.m154714a(this.f77215b, dVar.f77215b);
    }

    public final int hashCode() {
        Boolean bool = this.f77214a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<String> list = this.f77215b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CheckUserNameResponse(is_valid=" + this.f77214a + ", recommended_unique_ids=" + this.f77215b + ")";
    }
}
