package com.p2082ss.android.ugc.aweme.model.api.p3460b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.b.d */
public final class C60117d extends BaseResponse {
    @AbstractC27891c(mo46611a = "navi")

    /* renamed from: a */
    public final C60107b f137034a;

    static {
        Covode.recordClassIndex(70628);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C60117d) && C89219l.m154714a(this.f137034a, ((C60117d) obj).f137034a);
        }
        return true;
    }

    public final int hashCode() {
        C60107b bVar = this.f137034a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviInfoResponse(navi=" + this.f137034a + ")";
    }
}
