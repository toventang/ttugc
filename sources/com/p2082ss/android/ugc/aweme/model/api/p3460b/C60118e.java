package com.p2082ss.android.ugc.aweme.model.api.p3460b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.b.e */
public final class C60118e extends BaseResponse {
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: a */
    public final Long f137035a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public final int f137036b;
    @AbstractC27891c(mo46611a = "navis")

    /* renamed from: c */
    public final List<C60107b> f137037c;

    static {
        Covode.recordClassIndex(70629);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60118e)) {
            return false;
        }
        C60118e eVar = (C60118e) obj;
        return C89219l.m154714a(this.f137035a, eVar.f137035a) && this.f137036b == eVar.f137036b && C89219l.m154714a(this.f137037c, eVar.f137037c);
    }

    public final int hashCode() {
        Long l = this.f137035a;
        int i = 0;
        int hashCode = (((l != null ? l.hashCode() : 0) * 31) + this.f137036b) * 31;
        List<C60107b> list = this.f137037c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviListResponse(naviCount=" + this.f137035a + ", hasMore=" + this.f137036b + ", naviList=" + this.f137037c + ")";
    }
}
