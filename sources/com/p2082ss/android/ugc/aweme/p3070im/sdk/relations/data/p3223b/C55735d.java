package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.b.d */
public final class C55735d {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final int f127124a = 63;
    @AbstractC27891c(mo46611a = "event")

    /* renamed from: b */
    public final String f127125b;

    static {
        Covode.recordClassIndex(65521);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55735d)) {
            return false;
        }
        C55735d dVar = (C55735d) obj;
        return this.f127124a == dVar.f127124a && C89219l.m154714a(this.f127125b, dVar.f127125b);
    }

    public final int hashCode() {
        int i = this.f127124a * 31;
        String str = this.f127125b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RelationTypeParameters(type=" + this.f127124a + ", event=" + this.f127125b + ")";
    }

    public C55735d(String str) {
        C89219l.m154721d(str, "");
        this.f127125b = str;
    }
}
