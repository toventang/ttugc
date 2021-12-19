package com.p2082ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.b */
public final class C32831b {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C32832c f78196a;
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: b */
    public final String f78197b;

    static {
        Covode.recordClassIndex(39615);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32831b)) {
            return false;
        }
        C32831b bVar = (C32831b) obj;
        return C89219l.m154714a(this.f78196a, bVar.f78196a) && C89219l.m154714a(this.f78197b, bVar.f78197b);
    }

    public final int hashCode() {
        C32832c cVar = this.f78196a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f78197b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BoolData(data=" + this.f78196a + ", message=" + this.f78197b + ")";
    }
}
