package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.f */
public final class C79712f extends BaseResponse {
    @AbstractC27891c(mo46611a = "upvote_list")

    /* renamed from: a */
    public final C79711e f178852a;
    @AbstractC27891c(mo46611a = "new_insert_ids")

    /* renamed from: b */
    public final String f178853b;

    static {
        Covode.recordClassIndex(92933);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79712f)) {
            return false;
        }
        C79712f fVar = (C79712f) obj;
        return C89219l.m154714a(this.f178852a, fVar.f178852a) && C89219l.m154714a(this.f178853b, fVar.f178853b);
    }

    public final int hashCode() {
        C79711e eVar = this.f178852a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        String str = this.f178853b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvoteListResponse(upvoteList=" + this.f178852a + ", newInsertIds=" + this.f178853b + ")";
    }
}
