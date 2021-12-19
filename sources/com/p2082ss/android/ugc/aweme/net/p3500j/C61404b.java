package com.p2082ss.android.ugc.aweme.net.p3500j;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.j.b */
public final class C61404b {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    public final Boolean f139401a;
    @AbstractC27891c(mo46611a = "scope")

    /* renamed from: b */
    public final Integer f139402b;
    @AbstractC27891c(mo46611a = "regions")

    /* renamed from: c */
    public final Set<String> f139403c;
    @AbstractC27891c(mo46611a = "denyKeys")

    /* renamed from: d */
    public final Set<String> f139404d;
    @AbstractC27891c(mo46611a = "allowApis")

    /* renamed from: e */
    public final List<C61403a> f139405e;

    static {
        Covode.recordClassIndex(72054);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61404b)) {
            return false;
        }
        C61404b bVar = (C61404b) obj;
        return C89219l.m154714a(this.f139401a, bVar.f139401a) && C89219l.m154714a(this.f139402b, bVar.f139402b) && C89219l.m154714a(this.f139403c, bVar.f139403c) && C89219l.m154714a(this.f139404d, bVar.f139404d) && C89219l.m154714a(this.f139405e, bVar.f139405e);
    }

    public final int hashCode() {
        Boolean bool = this.f139401a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.f139402b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Set<String> set = this.f139403c;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f139404d;
        int hashCode4 = (hashCode3 + (set2 != null ? set2.hashCode() : 0)) * 31;
        List<C61403a> list = this.f139405e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "HeaderParamConfig(enable=" + this.f139401a + ", scope=" + this.f139402b + ", regions=" + this.f139403c + ", denyKeys=" + this.f139404d + ", allowApis=" + this.f139405e + ")";
    }

    private /* synthetic */ C61404b() {
        this(false, C89036ab.INSTANCE, C89036ab.INSTANCE);
    }

    private C61404b(Boolean bool, Set<String> set, Set<String> set2) {
        this.f139401a = bool;
        this.f139402b = null;
        this.f139403c = set;
        this.f139404d = set2;
        this.f139405e = null;
    }
}
