package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.j */
public final class C55072j {
    @AbstractC27891c(mo46611a = "update")

    /* renamed from: a */
    public final long f126033a = 259200;
    @AbstractC27891c(mo46611a = "coldup_update")

    /* renamed from: b */
    public final long f126034b = 0;
    @AbstractC27891c(mo46611a = "frontier_update")

    /* renamed from: c */
    public final long f126035c = 0;
    @AbstractC27891c(mo46611a = "font_update")

    /* renamed from: d */
    public final long f126036d = 0;

    /* renamed from: e */
    private final long f126037e = 600;

    static {
        Covode.recordClassIndex(64800);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55072j)) {
            return false;
        }
        C55072j jVar = (C55072j) obj;
        return this.f126033a == jVar.f126033a && this.f126034b == jVar.f126034b && this.f126035c == jVar.f126035c && this.f126036d == jVar.f126036d;
    }

    public final String toString() {
        return "RelationFetchFrequencyConfig(fullUpdateFreq=" + this.f126033a + ", coldUpDiffUpdateFreq=" + this.f126034b + ", wsDiffUpdateFreq=" + this.f126035c + ", fontDiffFreq=" + this.f126036d + ")";
    }

    public final int hashCode() {
        long j = this.f126033a;
        long j2 = this.f126034b;
        long j3 = this.f126035c;
        long j4 = this.f126036d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    /* renamed from: a */
    public final long mo91987a(EnumC55835a aVar) {
        C89219l.m154721d(aVar, "");
        int i = C55073k.f126038a[aVar.ordinal()];
        if (i == 1) {
            return this.f126033a;
        }
        if (i == 2) {
            return this.f126034b;
        }
        if (i == 3) {
            return this.f126035c;
        }
        if (i == 4) {
            return this.f126036d;
        }
        if (i != 5) {
            return this.f126037e;
        }
        return this.f126037e;
    }
}
