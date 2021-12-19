package com.p2082ss.android.ugc.aweme.p2388bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bg.d */
public final class C34828d {
    @AbstractC27891c(mo46611a = "show_id")

    /* renamed from: a */
    public final String f82270a;
    @AbstractC27891c(mo46611a = "number")

    /* renamed from: b */
    public final long[] f82271b;

    static {
        Covode.recordClassIndex(41836);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34828d)) {
            return false;
        }
        C34828d dVar = (C34828d) obj;
        return C89219l.m154714a(this.f82270a, dVar.f82270a) && C89219l.m154714a(this.f82271b, dVar.f82271b);
    }

    public final int hashCode() {
        String str = this.f82270a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long[] jArr = this.f82271b;
        if (jArr != null) {
            i = Arrays.hashCode(jArr);
        }
        return hashCode + i;
    }

    public final String toString() {
        return "KproPopupPeriod(show_id=" + this.f82270a + ", timePair=" + Arrays.toString(this.f82271b) + ")";
    }
}
