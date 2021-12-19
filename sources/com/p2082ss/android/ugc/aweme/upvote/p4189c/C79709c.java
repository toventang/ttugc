package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.c */
public final class C79709c extends BaseResponse {
    @AbstractC27891c(mo46611a = "upvotes")

    /* renamed from: a */
    public final List<C79714h> f178844a;
    @AbstractC27891c(mo46611a = "failed_item_ids")

    /* renamed from: b */
    public final List<String> f178845b;

    static {
        Covode.recordClassIndex(92930);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79709c)) {
            return false;
        }
        C79709c cVar = (C79709c) obj;
        return C89219l.m154714a(this.f178844a, cVar.f178844a) && C89219l.m154714a(this.f178845b, cVar.f178845b);
    }

    public final int hashCode() {
        List<C79714h> list = this.f178844a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f178845b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvoteBatchPublishResponse(upvotes=" + this.f178844a + ", failedItemIds=" + this.f178845b + ")";
    }
}
