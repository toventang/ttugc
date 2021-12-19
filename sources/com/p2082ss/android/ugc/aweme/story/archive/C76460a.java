package com.p2082ss.android.ugc.aweme.story.archive;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.archive.a */
public final class C76460a {

    /* renamed from: a */
    public final List<Aweme> f171734a;

    /* renamed from: b */
    public final boolean f171735b;

    static {
        Covode.recordClassIndex(89440);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76460a)) {
            return false;
        }
        C76460a aVar = (C76460a) obj;
        return C89219l.m154714a(this.f171734a, aVar.f171734a) && this.f171735b == aVar.f171735b;
    }

    public final int hashCode() {
        List<Aweme> list = this.f171734a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f171735b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "PrivateAwemeResult(list=" + this.f171734a + ", hasMore=" + this.f171735b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C76460a(List<? extends Aweme> list, boolean z) {
        this.f171734a = list;
        this.f171735b = z;
    }
}
