package com.p2082ss.android.ugc.aweme.model.api.p3460b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.b.a */
public final class C60114a extends BaseResponse {
    @AbstractC27891c(mo46611a = "navi_id")

    /* renamed from: a */
    public final String f137030a;

    static {
        Covode.recordClassIndex(70625);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C60114a) && C89219l.m154714a(this.f137030a, ((C60114a) obj).f137030a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f137030a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviCreateResponse(naviId=" + this.f137030a + ")";
    }
}
