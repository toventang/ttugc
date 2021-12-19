package com.p2082ss.android.ugc.aweme.user.p4194a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.a.b */
public final class C80038b {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f179355a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C80037a f179356b;

    static {
        Covode.recordClassIndex(93269);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80038b)) {
            return false;
        }
        C80038b bVar = (C80038b) obj;
        return C89219l.m154714a(this.f179355a, bVar.f179355a) && C89219l.m154714a(this.f179356b, bVar.f179356b);
    }

    public final int hashCode() {
        String str = this.f179355a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C80037a aVar = this.f179356b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "QueryUserPasswordSetStatusResponse(message=" + this.f179355a + ", data=" + this.f179356b + ")";
    }
}
