package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.b */
public final class C40469b {
    @AbstractC27891c(mo46611a = "creator_plus_should_show")

    /* renamed from: a */
    public final boolean f94702a;
    @AbstractC27891c(mo46611a = "creator_plus_opt_in_url")

    /* renamed from: b */
    public final String f94703b;
    @AbstractC27891c(mo46611a = "creator_plus_congrats_url")

    /* renamed from: c */
    public final String f94704c;

    static {
        Covode.recordClassIndex(48276);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40469b)) {
            return false;
        }
        C40469b bVar = (C40469b) obj;
        return this.f94702a == bVar.f94702a && C89219l.m154714a(this.f94703b, bVar.f94703b) && C89219l.m154714a(this.f94704c, bVar.f94704c);
    }

    public final int hashCode() {
        boolean z = this.f94702a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f94703b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94704c;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "CPlusSettings(allowCreatorPlus=" + this.f94702a + ", creatorPlusOptInURL=" + this.f94703b + ", creatorPlusCongratsURL=" + this.f94704c + ")";
    }
}
