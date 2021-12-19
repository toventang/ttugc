package com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a.d */
public final class C40069d extends BaseResponse {
    @AbstractC27891c(mo46611a = "fp")

    /* renamed from: a */
    public final C40067b f94119a;
    @AbstractC27891c(mo46611a = "dw")

    /* renamed from: b */
    public final C40066a f94120b;

    static {
        Covode.recordClassIndex(47840);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40069d)) {
            return false;
        }
        C40069d dVar = (C40069d) obj;
        return C89219l.m154714a(this.f94119a, dVar.f94119a) && C89219l.m154714a(this.f94120b, dVar.f94120b);
    }

    public final int hashCode() {
        C40067b bVar = this.f94119a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C40066a aVar = this.f94120b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProtectionApiResponse(familyPairingBean=" + this.f94119a + ", digitalWellbeingBean=" + this.f94120b + ")";
    }

    private /* synthetic */ C40069d() {
        this(new C40067b(), new C40066a());
    }

    private C40069d(C40067b bVar, C40066a aVar) {
        this.f94119a = bVar;
        this.f94120b = aVar;
    }
}
