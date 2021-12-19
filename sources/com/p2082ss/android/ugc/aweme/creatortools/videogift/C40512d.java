package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.d */
public final class C40512d {
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: a */
    public final String f94781a;
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: b */
    public final String f94782b;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: c */
    public final Integer f94783c;

    static {
        Covode.recordClassIndex(48324);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40512d)) {
            return false;
        }
        C40512d dVar = (C40512d) obj;
        return C89219l.m154714a(this.f94781a, dVar.f94781a) && C89219l.m154714a(this.f94782b, dVar.f94782b) && C89219l.m154714a(this.f94783c, dVar.f94783c);
    }

    public final int hashCode() {
        String str = this.f94781a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f94782b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f94783c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Requirement(description=" + this.f94781a + ", key=" + this.f94782b + ", status=" + this.f94783c + ")";
    }
}
