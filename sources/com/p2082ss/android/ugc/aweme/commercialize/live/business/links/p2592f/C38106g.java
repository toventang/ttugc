package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.g */
public final class C38106g {
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: a */
    public final String f90032a;
    @AbstractC27891c(mo46611a = "live_status")

    /* renamed from: b */
    public final String f90033b;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: c */
    public final int f90034c;
    @AbstractC27891c(mo46611a = "card_data")

    /* renamed from: d */
    public final C38107h f90035d;

    static {
        Covode.recordClassIndex(45573);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38106g)) {
            return false;
        }
        C38106g gVar = (C38106g) obj;
        return C89219l.m154714a(this.f90032a, gVar.f90032a) && C89219l.m154714a(this.f90033b, gVar.f90033b) && this.f90034c == gVar.f90034c && C89219l.m154714a(this.f90035d, gVar.f90035d);
    }

    public final int hashCode() {
        String str = this.f90032a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90033b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f90034c) * 31;
        C38107h hVar = this.f90035d;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BusinessLinksLiveLinkPin(actionType=" + this.f90032a + ", liveStatus=" + this.f90033b + ", count=" + this.f90034c + ", cardData=" + this.f90035d + ")";
    }
}
