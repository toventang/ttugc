package com.p2082ss.android.ugc.aweme.share.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.model.b */
public final class C69330b extends BaseResponse {
    @AbstractC27891c(mo46611a = "checksum")

    /* renamed from: a */
    public final String f154897a;

    static {
        Covode.recordClassIndex(81661);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C69330b) && C89219l.m154714a(this.f154897a, ((C69330b) obj).f154897a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f154897a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SharerInfoChecksum(checksum=" + this.f154897a + ")";
    }
}
