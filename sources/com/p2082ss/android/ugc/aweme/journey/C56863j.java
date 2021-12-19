package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.j */
public final class C56863j {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f129488a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    public final String f129489b;

    static {
        Covode.recordClassIndex(66749);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56863j)) {
            return false;
        }
        C56863j jVar = (C56863j) obj;
        return C89219l.m154714a(this.f129488a, jVar.f129488a) && C89219l.m154714a(this.f129489b, jVar.f129489b);
    }

    public final int hashCode() {
        String str = this.f129488a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129489b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "JourneyContentLanguageExtra(title=" + this.f129488a + ", text=" + this.f129489b + ")";
    }
}
