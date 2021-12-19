package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.q */
public final class C42435q {
    @AbstractC27891c(mo46611a = "hotspot_items")

    /* renamed from: a */
    public List<? extends Aweme> f98893a;
    @AbstractC27891c(mo46611a = "hotspot")

    /* renamed from: b */
    public final C42436r f98894b;
    @AbstractC27891c(mo46611a = "ala_src")

    /* renamed from: c */
    public final String f98895c;
    @AbstractC27891c(mo46611a = "doc_id")

    /* renamed from: d */
    public String f98896d;

    static {
        Covode.recordClassIndex(50381);
    }

    public final int hashCode() {
        C42436r rVar = this.f98894b;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchSpot");
        return C89219l.m154714a(this.f98894b, ((C42435q) obj).f98894b);
    }
}
