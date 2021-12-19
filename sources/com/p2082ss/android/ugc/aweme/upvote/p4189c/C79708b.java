package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.b */
public final class C79708b extends BaseResponse {
    @AbstractC27891c(mo46611a = "upvote_lists")

    /* renamed from: a */
    public final List<C79711e> f178843a;

    static {
        Covode.recordClassIndex(92929);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C79708b) && C89219l.m154714a(this.f178843a, ((C79708b) obj).f178843a);
        }
        return true;
    }

    public final int hashCode() {
        List<C79711e> list = this.f178843a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvoteBatchListResponse(upvoteLists=" + this.f178843a + ")";
    }
}
