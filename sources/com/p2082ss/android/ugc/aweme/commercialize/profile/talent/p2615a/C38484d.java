package com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.a.d */
public final class C38484d extends BaseResponse {
    @AbstractC27891c(mo46611a = "ad_gap")

    /* renamed from: a */
    public final int f90905a;
    @AbstractC27891c(mo46611a = "profile_ads")

    /* renamed from: b */
    public final List<C38482b> f90906b;

    static {
        Covode.recordClassIndex(45995);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38484d)) {
            return false;
        }
        C38484d dVar = (C38484d) obj;
        return this.f90905a == dVar.f90905a && C89219l.m154714a(this.f90906b, dVar.f90906b);
    }

    public final int hashCode() {
        int i = this.f90905a * 31;
        List<C38482b> list = this.f90906b;
        return i + (list != null ? list.hashCode() : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileTalentShareAdResult(adGap=" + this.f90905a + ", profileAds=" + this.f90906b + ")";
    }
}
