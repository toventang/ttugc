package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.s */
public final class C39260s {
    @AbstractC27891c(mo46611a = "upvote")

    /* renamed from: a */
    public int f92751a;

    static {
        Covode.recordClassIndex(46918);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39260s) && this.f92751a == ((C39260s) obj).f92751a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f92751a;
    }

    public final String toString() {
        return "RecommendationSettings(upvote=" + this.f92751a + ")";
    }
}
