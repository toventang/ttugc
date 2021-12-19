package com.p2082ss.android.ugc.aweme.search.p3700n;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.n.e */
public final class C67693e {

    /* renamed from: a */
    public final String f151722a;

    static {
        Covode.recordClassIndex(79338);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C67693e) && C89219l.m154714a(this.f151722a, ((C67693e) obj).f151722a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f151722a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchImmutableData(enterFrom=" + this.f151722a + ")";
    }

    private /* synthetic */ C67693e() {
        this("");
    }

    public C67693e(String str) {
        C89219l.m154721d(str, "");
        this.f151722a = str;
    }
}
