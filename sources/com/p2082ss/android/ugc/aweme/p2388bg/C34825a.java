package com.p2082ss.android.ugc.aweme.p2388bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bg.a */
public final class C34825a extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C34826b f82261a;

    static {
        Covode.recordClassIndex(41833);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C34825a) && C89219l.m154714a(this.f82261a, ((C34825a) obj).f82261a);
        }
        return true;
    }

    public final int hashCode() {
        C34826b bVar = this.f82261a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "KproActivityResponse(data=" + this.f82261a + ")";
    }
}
