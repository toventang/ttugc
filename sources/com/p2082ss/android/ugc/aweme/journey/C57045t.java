package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.t */
public final class C57045t {
    @AbstractC27891c(mo46611a = "impr_id")

    /* renamed from: a */
    public final String f129883a;

    static {
        Covode.recordClassIndex(66934);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C57045t) && C89219l.m154714a(this.f129883a, ((C57045t) obj).f129883a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f129883a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LogPbBean(imprId=" + this.f129883a + ")";
    }
}
