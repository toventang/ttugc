package com.p2082ss.android.ugc.aweme.comment.p2489c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.c.j */
public final class C36395j extends BaseResponse {
    @AbstractC27891c(mo46611a = "notice")

    /* renamed from: a */
    public final C36394i f86080a;

    static {
        Covode.recordClassIndex(43690);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C36395j) && C89219l.m154714a(this.f86080a, ((C36395j) obj).f86080a);
        }
        return true;
    }

    public final int hashCode() {
        C36394i iVar = this.f86080a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PinResult(notice=" + this.f86080a + ")";
    }
}
