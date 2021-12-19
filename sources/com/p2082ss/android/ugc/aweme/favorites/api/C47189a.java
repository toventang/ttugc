package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.a */
public final class C47189a extends BaseResponse {
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: a */
    public final List<Aweme> f109835a = null;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public final Long f109836b = null;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public final Integer f109837c = null;

    static {
        Covode.recordClassIndex(55799);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47189a)) {
            return false;
        }
        C47189a aVar = (C47189a) obj;
        return C89219l.m154714a(this.f109835a, aVar.f109835a) && C89219l.m154714a(this.f109836b, aVar.f109836b) && C89219l.m154714a(this.f109837c, aVar.f109837c);
    }

    public final int hashCode() {
        List<Aweme> list = this.f109835a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l = this.f109836b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.f109837c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AllFavoriteContentResponse(items=" + this.f109835a + ", maxCursor=" + this.f109836b + ", hasMore=" + this.f109837c + ")";
    }

    private C47189a() {
    }
}
