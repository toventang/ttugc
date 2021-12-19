package com.p2082ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.api.response.b */
public final class C59396b extends BaseResponse {
    @AbstractC27891c(mo46611a = "mix_id")

    /* renamed from: a */
    public final String f135679a;

    static {
        Covode.recordClassIndex(69788);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C59396b) && C89219l.m154714a(this.f135679a, ((C59396b) obj).f135679a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f135679a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ManageResponse(mixId=" + this.f135679a + ")";
    }
}
