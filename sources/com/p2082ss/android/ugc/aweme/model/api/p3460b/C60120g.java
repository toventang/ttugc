package com.p2082ss.android.ugc.aweme.model.api.p3460b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60108c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.b.g */
public final class C60120g extends BaseResponse {
    @AbstractC27891c(mo46611a = "features")

    /* renamed from: a */
    public final List<C60108c> f137039a;

    static {
        Covode.recordClassIndex(70631);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C60120g) && C89219l.m154714a(this.f137039a, ((C60120g) obj).f137039a);
        }
        return true;
    }

    public final int hashCode() {
        List<C60108c> list = this.f137039a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviStarterAvatarResponse(features=" + this.f137039a + ")";
    }
}
