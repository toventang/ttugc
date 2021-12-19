package com.p2082ss.android.ugc.aweme.net.p3500j;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.j.a */
public final class C61403a {
    @AbstractC27891c(mo46611a = "domains")

    /* renamed from: a */
    public final Set<String> f139399a;
    @AbstractC27891c(mo46611a = "paths")

    /* renamed from: b */
    public final Set<String> f139400b;

    static {
        Covode.recordClassIndex(72053);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61403a)) {
            return false;
        }
        C61403a aVar = (C61403a) obj;
        return C89219l.m154714a(this.f139399a, aVar.f139399a) && C89219l.m154714a(this.f139400b, aVar.f139400b);
    }

    public final int hashCode() {
        Set<String> set = this.f139399a;
        int i = 0;
        int hashCode = (set != null ? set.hashCode() : 0) * 31;
        Set<String> set2 = this.f139400b;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AllowApiConfig(domains=" + this.f139399a + ", paths=" + this.f139400b + ")";
    }

    private /* synthetic */ C61403a() {
        this(C89036ab.INSTANCE, C89036ab.INSTANCE);
    }

    private C61403a(Set<String> set, Set<String> set2) {
        this.f139399a = set;
        this.f139400b = set2;
    }
}
