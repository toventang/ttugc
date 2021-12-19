package com.p2082ss.android.ugc.aweme.model.api.p3460b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60109d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.b.c */
public final class C60116c extends BaseResponse {
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: a */
    public final int f137032a;
    @AbstractC27891c(mo46611a = "navi_profile_images")

    /* renamed from: b */
    public final List<C60109d> f137033b;

    static {
        Covode.recordClassIndex(70627);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60116c)) {
            return false;
        }
        C60116c cVar = (C60116c) obj;
        return this.f137032a == cVar.f137032a && C89219l.m154714a(this.f137033b, cVar.f137033b);
    }

    public final int hashCode() {
        int i = this.f137032a * 31;
        List<C60109d> list = this.f137033b;
        return i + (list != null ? list.hashCode() : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviImageListResponse(hasMore=" + this.f137032a + ", naviList=" + this.f137033b + ")";
    }
}
