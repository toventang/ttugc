package com.p2082ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.api.b */
public final class C31411b extends BaseResponse {
    @AbstractC27891c(mo46611a = "age")

    /* renamed from: a */
    public final Integer f75218a;

    static {
        Covode.recordClassIndex(38128);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C31411b) && C89219l.m154714a(this.f75218a, ((C31411b) obj).f75218a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f75218a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DoBResponse(age=" + this.f75218a + ")";
    }

    private /* synthetic */ C31411b() {
        this(0);
    }

    private C31411b(Integer num) {
        this.f75218a = num;
    }
}
