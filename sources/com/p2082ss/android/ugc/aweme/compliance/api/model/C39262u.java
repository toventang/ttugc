package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.u */
public final class C39262u extends BaseResponse {
    @AbstractC27891c(mo46611a = "set_anonymize_for_appsflyer")

    /* renamed from: a */
    public final boolean f92757a;
    @AbstractC27891c(mo46611a = "postpone_af_tracking")

    /* renamed from: b */
    public final boolean f92758b;

    static {
        Covode.recordClassIndex(46920);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39262u)) {
            return false;
        }
        C39262u uVar = (C39262u) obj;
        return this.f92757a == uVar.f92757a && this.f92758b == uVar.f92758b;
    }

    public final int hashCode() {
        boolean z = this.f92757a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f92758b) {
            i = 0;
        }
        return i5 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UltimateCmplSettings(setAnonymizeUserForAF=" + this.f92757a + ", delayAFStart=" + this.f92758b + ")";
    }
}
