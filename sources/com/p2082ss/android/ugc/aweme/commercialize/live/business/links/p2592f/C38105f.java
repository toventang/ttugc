package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.f */
public final class C38105f {
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: a */
    public final String f90030a;
    @AbstractC27891c(mo46611a = "link_id")

    /* renamed from: b */
    public final String f90031b;

    static {
        Covode.recordClassIndex(45572);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38105f)) {
            return false;
        }
        C38105f fVar = (C38105f) obj;
        return C89219l.m154714a(this.f90030a, fVar.f90030a) && C89219l.m154714a(this.f90031b, fVar.f90031b);
    }

    public final int hashCode() {
        String str = this.f90030a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90031b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BusinessLinksLiveLinkCard(actionType=" + this.f90030a + ", linkId=" + this.f90031b + ")";
    }
}
