package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.b */
public final class C47190b extends BaseResponse {
    @AbstractC27891c(mo46611a = "item_archive_detail")

    /* renamed from: a */
    public final C47192d f109838a;

    static {
        Covode.recordClassIndex(55800);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C47190b) && C89219l.m154714a(this.f109838a, ((C47190b) obj).f109838a);
        }
        return true;
    }

    public final int hashCode() {
        C47192d dVar = this.f109838a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionAllFavoritesResponse(detail=" + this.f109838a + ")";
    }

    private C47190b() {
        this.f109838a = null;
    }

    public /* synthetic */ C47190b(byte b) {
        this();
    }
}
