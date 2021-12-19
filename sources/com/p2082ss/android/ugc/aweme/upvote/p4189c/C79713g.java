package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.g */
public final class C79713g extends BaseResponse {
    @AbstractC27891c(mo46611a = "upvote")

    /* renamed from: a */
    public final C79714h f178854a;
    @AbstractC27891c(mo46611a = "rethink_popup")

    /* renamed from: b */
    public final CommentRethinkPopup f178855b;

    static {
        Covode.recordClassIndex(92934);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79713g)) {
            return false;
        }
        C79713g gVar = (C79713g) obj;
        return C89219l.m154714a(this.f178854a, gVar.f178854a) && C89219l.m154714a(this.f178855b, gVar.f178855b);
    }

    public final int hashCode() {
        C79714h hVar = this.f178854a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        CommentRethinkPopup commentRethinkPopup = this.f178855b;
        if (commentRethinkPopup != null) {
            i = commentRethinkPopup.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvotePublishResponse(upvote=" + this.f178854a + ", rethinkPopup=" + this.f178855b + ")";
    }
}
