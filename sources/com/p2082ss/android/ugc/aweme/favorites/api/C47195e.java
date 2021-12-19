package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.e */
public final class C47195e extends BaseResponse {
    @AbstractC27891c(mo46611a = "item_archive_detail_list")

    /* renamed from: a */
    public final List<C47192d> f109850a = null;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public final Long f109851b = null;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public final Boolean f109852c = null;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: d */
    public final Long f109853d = null;

    static {
        Covode.recordClassIndex(55805);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47195e)) {
            return false;
        }
        C47195e eVar = (C47195e) obj;
        return C89219l.m154714a(this.f109850a, eVar.f109850a) && C89219l.m154714a(this.f109851b, eVar.f109851b) && C89219l.m154714a(this.f109852c, eVar.f109852c) && C89219l.m154714a(this.f109853d, eVar.f109853d);
    }

    public final int hashCode() {
        List<C47192d> list = this.f109850a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l = this.f109851b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.f109852c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l2 = this.f109853d;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionListResponse(items=" + this.f109850a + ", cursor=" + this.f109851b + ", hasMore=" + this.f109852c + ", total=" + this.f109853d + ")";
    }

    private C47195e() {
    }
}
