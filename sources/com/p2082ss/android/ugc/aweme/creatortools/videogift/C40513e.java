package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.e */
public final class C40513e extends BaseResponse {
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public final C40510b f94784a;
    @AbstractC27891c(mo46611a = "requirements")

    /* renamed from: b */
    public final List<C40512d> f94785b;

    static {
        Covode.recordClassIndex(48325);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40513e)) {
            return false;
        }
        C40513e eVar = (C40513e) obj;
        return C89219l.m154714a(this.f94784a, eVar.f94784a) && C89219l.m154714a(this.f94785b, eVar.f94785b);
    }

    public final int hashCode() {
        C40510b bVar = this.f94784a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        List<C40512d> list = this.f94785b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "VideoGiftEligibilityResponse(image=" + this.f94784a + ", requirements=" + this.f94785b + ")";
    }
}
