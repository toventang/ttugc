package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.f */
public final class C82775f extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public final Integer f185037a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public final Boolean f185038b;
    @AbstractC27891c(mo46611a = "ngos")

    /* renamed from: c */
    public final List<C82774e> f185039c;

    static {
        Covode.recordClassIndex(96625);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82775f)) {
            return false;
        }
        C82775f fVar = (C82775f) obj;
        return C89219l.m154714a(this.f185037a, fVar.f185037a) && C89219l.m154714a(this.f185038b, fVar.f185038b) && C89219l.m154714a(this.f185039c, fVar.f185039c);
    }

    public final int hashCode() {
        Integer num = this.f185037a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.f185038b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List<C82774e> list = this.f185039c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "OrganizationSearchResultResponse(cursor=" + this.f185037a + ", hasMore=" + this.f185038b + ", orgList=" + this.f185039c + ")";
    }
}
