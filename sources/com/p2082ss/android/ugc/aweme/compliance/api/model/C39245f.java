package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.f */
public final class C39245f {
    @AbstractC27891c(mo46611a = "mention")

    /* renamed from: a */
    public int f92696a;
    @AbstractC27891c(mo46611a = "mention_notice")

    /* renamed from: b */
    public int f92697b;
    @AbstractC27891c(mo46611a = "tag")

    /* renamed from: c */
    public int f92698c;
    @AbstractC27891c(mo46611a = "tag_notice")

    /* renamed from: d */
    public int f92699d;
    @AbstractC27891c(mo46611a = "qna_invite")

    /* renamed from: e */
    public int f92700e;

    static {
        Covode.recordClassIndex(46903);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39245f)) {
            return false;
        }
        C39245f fVar = (C39245f) obj;
        return this.f92696a == fVar.f92696a && this.f92697b == fVar.f92697b && this.f92698c == fVar.f92698c && this.f92699d == fVar.f92699d && this.f92700e == fVar.f92700e;
    }

    public final int hashCode() {
        return (((((((this.f92696a * 31) + this.f92697b) * 31) + this.f92698c) * 31) + this.f92699d) * 31) + this.f92700e;
    }

    public final String toString() {
        return "InvolveSettings(mention=" + this.f92696a + ", mentionNotice=" + this.f92697b + ", tag=" + this.f92698c + ", tag_notice=" + this.f92699d + ", qnaInvite=" + this.f92700e + ")";
    }
}
