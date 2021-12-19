package com.p2082ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.api.f */
public final class C36273f extends BaseResponse {
    @AbstractC27891c(mo46611a = "block_fail_toUserIds")

    /* renamed from: a */
    public final String f85715a;
    @AbstractC27891c(mo46611a = "max_batch_size")

    /* renamed from: b */
    public final Integer f85716b;

    static {
        Covode.recordClassIndex(43548);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36273f)) {
            return false;
        }
        C36273f fVar = (C36273f) obj;
        return C89219l.m154714a(this.f85715a, fVar.f85715a) && C89219l.m154714a(this.f85716b, fVar.f85716b);
    }

    public final int hashCode() {
        String str = this.f85715a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f85716b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserBatchBlockResponse(blockFailToUserIds=" + this.f85715a + ", maxBatchSize=" + this.f85716b + ")";
    }

    private /* synthetic */ C36273f() {
        this("", 0);
    }

    private C36273f(String str, Integer num) {
        this.f85715a = str;
        this.f85716b = num;
    }
}
