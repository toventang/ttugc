package com.p2082ss.android.ugc.aweme.model.api.p3460b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60112f;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.b.f */
public final class C60119f extends BaseResponse {
    @AbstractC27891c(mo46611a = "initial_navis")

    /* renamed from: a */
    public final List<C60112f> f137038a;

    static {
        Covode.recordClassIndex(70630);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C60119f) && C89219l.m154714a(this.f137038a, ((C60119f) obj).f137038a);
        }
        return true;
    }

    public final int hashCode() {
        List<C60112f> list = this.f137038a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviStarterAvatarListResponse(starterAvatarList=" + this.f137038a + ")";
    }
}
