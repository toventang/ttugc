package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.api.model.e */
public final class C10368e {
    @AbstractC27891c(mo46611a = "score_location")

    /* renamed from: a */
    public int f25053a;
    @AbstractC27891c(mo46611a = "threshold_config")

    /* renamed from: b */
    public C10371h f25054b;
    @AbstractC27891c(mo46611a = "exempt_config")

    /* renamed from: c */
    public C10364a f25055c;

    static {
        Covode.recordClassIndex(11942);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10368e)) {
            return false;
        }
        C10368e eVar = (C10368e) obj;
        return this.f25053a == eVar.f25053a && C89219l.m154714a(this.f25054b, eVar.f25054b) && C89219l.m154714a(this.f25055c, eVar.f25055c);
    }

    public final int hashCode() {
        int i = this.f25053a * 31;
        C10371h hVar = this.f25054b;
        int i2 = 0;
        int hashCode = (i + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C10364a aVar = this.f25055c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ScoreDisplayConfig(scoreLocation=" + this.f25053a + ", thresholdConfig=" + this.f25054b + ", exemptConfig=" + this.f25055c + ")";
    }

    private /* synthetic */ C10368e() {
        this(EnumC10370g.UNKNOWN.getValue());
    }

    private C10368e(int i) {
        this.f25053a = i;
        this.f25054b = null;
        this.f25055c = null;
    }
}
