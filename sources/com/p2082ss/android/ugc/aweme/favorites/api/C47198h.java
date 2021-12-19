package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.h */
public final class C47198h extends BaseResponse {
    @AbstractC27891c(mo46611a = "is_valid")

    /* renamed from: a */
    public final Boolean f109863a = null;

    static {
        Covode.recordClassIndex(55808);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C47198h) && C89219l.m154714a(this.f109863a, ((C47198h) obj).f109863a);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.f109863a;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionNameCheckResponse(isValid=" + this.f109863a + ")";
    }

    private C47198h() {
    }
}
