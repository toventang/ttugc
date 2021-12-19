package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.g */
public final class C47197g extends BaseResponse {
    @AbstractC27891c(mo46611a = "item_archive_id")

    /* renamed from: a */
    public final String f109862a;

    static {
        Covode.recordClassIndex(55807);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C47197g) && C89219l.m154714a(this.f109862a, ((C47197g) obj).f109862a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f109862a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionManageResponse(collectionId=" + this.f109862a + ")";
    }
}
