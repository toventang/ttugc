package com.p2082ss.android.ugc.aweme.user.p4194a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.a.a */
public final class C80037a {
    @AbstractC27891c(mo46611a = "has_set")

    /* renamed from: a */
    public final Boolean f179352a;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: b */
    public final String f179353b;
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: c */
    public int f179354c;

    static {
        Covode.recordClassIndex(93268);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80037a)) {
            return false;
        }
        C80037a aVar = (C80037a) obj;
        return C89219l.m154714a(this.f179352a, aVar.f179352a) && C89219l.m154714a(this.f179353b, aVar.f179353b) && this.f179354c == aVar.f179354c;
    }

    public final int hashCode() {
        Boolean bool = this.f179352a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f179353b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.f179354c;
    }

    public final String toString() {
        return "QueryUserPasswordSetStatusData(hasSet=" + this.f179352a + ", description=" + this.f179353b + ", errorCode=" + this.f179354c + ")";
    }
}
