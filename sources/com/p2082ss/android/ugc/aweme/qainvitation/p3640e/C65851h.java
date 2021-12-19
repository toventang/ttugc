package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.h */
public final class C65851h {
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: a */
    public final Long f148398a;
    @AbstractC27891c(mo46611a = "user_blocked_results")

    /* renamed from: b */
    public final List<C65852i> f148399b;

    static {
        Covode.recordClassIndex(77352);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65851h)) {
            return false;
        }
        C65851h hVar = (C65851h) obj;
        return C89219l.m154714a(this.f148398a, hVar.f148398a) && C89219l.m154714a(this.f148399b, hVar.f148399b);
    }

    public final int hashCode() {
        Long l = this.f148398a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        List<C65852i> list = this.f148399b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserBlockData(uid=" + this.f148398a + ", userBlockedResults=" + this.f148399b + ")";
    }
}
