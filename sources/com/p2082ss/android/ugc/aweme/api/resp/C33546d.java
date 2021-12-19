package com.p2082ss.android.ugc.aweme.api.resp;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.resp.d */
public final class C33546d extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C33547e f79677a = null;

    static {
        Covode.recordClassIndex(40420);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33546d) && C89219l.m154714a(this.f79677a, ((C33546d) obj).f79677a);
        }
        return true;
    }

    public final int hashCode() {
        C33547e eVar = this.f79677a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GetItemProductInfoResponse(data=" + this.f79677a + ")";
    }

    private C33546d() {
    }
}
