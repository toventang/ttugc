package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.e */
public final class C33536e extends BaseResponse {
    @AbstractC27891c(mo46611a = "landing_url")

    /* renamed from: a */
    public final String f79648a;

    static {
        Covode.recordClassIndex(40406);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33536e) && C89219l.m154714a(this.f79648a, ((C33536e) obj).f79648a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f79648a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LinkTransResult(longUrl=" + this.f79648a + ")";
    }
}
