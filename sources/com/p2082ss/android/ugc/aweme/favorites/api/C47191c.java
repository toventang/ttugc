package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.c */
public final class C47191c extends BaseResponse {
    @AbstractC27891c(mo46611a = "items")

    /* renamed from: a */
    public final List<Aweme> f109839a;
    @AbstractC27891c(mo46611a = "max_cursor")

    /* renamed from: b */
    public final Long f109840b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public final Boolean f109841c;

    static {
        Covode.recordClassIndex(55801);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47191c)) {
            return false;
        }
        C47191c cVar = (C47191c) obj;
        return C89219l.m154714a(this.f109839a, cVar.f109839a) && C89219l.m154714a(this.f109840b, cVar.f109840b) && C89219l.m154714a(this.f109841c, cVar.f109841c);
    }

    public final int hashCode() {
        List<Aweme> list = this.f109839a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l = this.f109840b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.f109841c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionContentResponse(items=" + this.f109839a + ", maxCursor=" + this.f109840b + ", hasMore=" + this.f109841c + ")";
    }

    private /* synthetic */ C47191c() {
        this(null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47191c(List<? extends Aweme> list, Long l, Boolean bool) {
        this.f109839a = list;
        this.f109840b = l;
        this.f109841c = bool;
    }
}
