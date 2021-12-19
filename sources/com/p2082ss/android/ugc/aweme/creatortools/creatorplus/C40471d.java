package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.d */
public final class C40471d extends BaseResponse {
    @AbstractC27891c(mo46611a = "creator_plus_status")

    /* renamed from: a */
    public final Integer f94711a;
    @AbstractC27891c(mo46611a = "features")

    /* renamed from: b */
    public final List<C40470c> f94712b;

    static {
        Covode.recordClassIndex(48278);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40471d)) {
            return false;
        }
        C40471d dVar = (C40471d) obj;
        return C89219l.m154714a(this.f94711a, dVar.f94711a) && C89219l.m154714a(this.f94712b, dVar.f94712b);
    }

    public final int hashCode() {
        Integer num = this.f94711a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<C40470c> list = this.f94712b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CreatorPlusFeaturesResponse(creatorPlusStatus=" + this.f94711a + ", features=" + this.f94712b + ")";
    }
}
