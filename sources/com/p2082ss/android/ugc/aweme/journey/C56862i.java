package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.i */
public final class C56862i {
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: a */
    public final String f129485a;
    @AbstractC27891c(mo46611a = "en_name")

    /* renamed from: b */
    public final String f129486b;
    @AbstractC27891c(mo46611a = "local_name")

    /* renamed from: c */
    public final String f129487c;

    static {
        Covode.recordClassIndex(66748);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56862i)) {
            return false;
        }
        C56862i iVar = (C56862i) obj;
        return C89219l.m154714a(this.f129485a, iVar.f129485a) && C89219l.m154714a(this.f129486b, iVar.f129486b) && C89219l.m154714a(this.f129487c, iVar.f129487c);
    }

    public final int hashCode() {
        String str = this.f129485a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129486b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f129487c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "JourneyContentLanguage(code=" + this.f129485a + ", en_name=" + this.f129486b + ", local_name=" + this.f129487c + ")";
    }
}
