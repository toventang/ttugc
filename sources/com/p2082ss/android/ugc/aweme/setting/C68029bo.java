package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.bo */
public final class C68029bo {
    @AbstractC27891c(mo46611a = "light")

    /* renamed from: a */
    public final String f152375a;
    @AbstractC27891c(mo46611a = "dark")

    /* renamed from: b */
    public final String f152376b;

    static {
        Covode.recordClassIndex(80225);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68029bo)) {
            return false;
        }
        C68029bo boVar = (C68029bo) obj;
        return C89219l.m154714a(this.f152375a, boVar.f152375a) && C89219l.m154714a(this.f152376b, boVar.f152376b);
    }

    public final int hashCode() {
        String str = this.f152375a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152376b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PrivacyUrls(lightUrl=" + this.f152375a + ", darkUrl=" + this.f152376b + ")";
    }
}
