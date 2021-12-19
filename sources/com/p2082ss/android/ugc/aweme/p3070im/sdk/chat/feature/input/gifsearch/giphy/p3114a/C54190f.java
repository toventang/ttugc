package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.f */
public final class C54190f {
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: a */
    public final boolean f124157a = false;
    @AbstractC27891c(mo46611a = "next_offset")

    /* renamed from: b */
    public final int f124158b = 0;

    static {
        Covode.recordClassIndex(63874);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54190f)) {
            return false;
        }
        C54190f fVar = (C54190f) obj;
        return this.f124157a == fVar.f124157a && this.f124158b == fVar.f124158b;
    }

    public final int hashCode() {
        boolean z = this.f124157a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f124158b;
    }

    public final String toString() {
        return "GiphyPaginationBean(hasMore=" + this.f124157a + ", nextOffset=" + this.f124158b + ")";
    }

    private C54190f() {
    }
}
