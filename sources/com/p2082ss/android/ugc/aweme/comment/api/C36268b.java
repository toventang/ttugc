package com.p2082ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.api.b */
public final class C36268b extends BaseResponse {
    @AbstractC27891c(mo46611a = "failed_cids")

    /* renamed from: a */
    public final String f85710a;

    static {
        Covode.recordClassIndex(43543);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C36268b) && C89219l.m154714a(this.f85710a, ((C36268b) obj).f85710a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f85710a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CommentBatchDeleteResponse(failedCids=" + this.f85710a + ")";
    }

    private /* synthetic */ C36268b() {
        this("");
    }

    private C36268b(String str) {
        this.f85710a = str;
    }
}
