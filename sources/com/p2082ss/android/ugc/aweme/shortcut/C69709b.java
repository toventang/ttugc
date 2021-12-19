package com.p2082ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortcut.b */
public final class C69709b extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C69706a f155615a;

    static {
        Covode.recordClassIndex(82087);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C69709b) && C89219l.m154714a(this.f155615a, ((C69709b) obj).f155615a);
        }
        return true;
    }

    public final int hashCode() {
        C69706a aVar = this.f155615a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FissionWithdrawalNumData(data=" + this.f155615a + ")";
    }
}
