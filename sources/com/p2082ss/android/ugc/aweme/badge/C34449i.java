package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.i */
public final class C34449i extends BaseResponse {
    @AbstractC27891c(mo46611a = "campaign_detail")

    /* renamed from: a */
    public final C34435d f81412a;
    @AbstractC27891c(mo46611a = "profile_badges")

    /* renamed from: b */
    public final List<C34448h> f81413b;

    static {
        Covode.recordClassIndex(41397);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34449i)) {
            return false;
        }
        C34449i iVar = (C34449i) obj;
        return C89219l.m154714a(this.f81412a, iVar.f81412a) && C89219l.m154714a(this.f81413b, iVar.f81413b);
    }

    public final int hashCode() {
        C34435d dVar = this.f81412a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        List<C34448h> list = this.f81413b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "EditProfileBadgeResponse(campaignDetail=" + this.f81412a + ", profileBadges=" + this.f81413b + ")";
    }
}
