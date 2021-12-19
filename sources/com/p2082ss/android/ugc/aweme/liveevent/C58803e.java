package com.p2082ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.liveevent.e */
public final class C58803e {
    @AbstractC27891c(mo46611a = "operation")

    /* renamed from: a */
    public String f133832a;
    @AbstractC27891c(mo46611a = "event")

    /* renamed from: b */
    public C58792b f133833b;

    static {
        Covode.recordClassIndex(69113);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58803e)) {
            return false;
        }
        C58803e eVar = (C58803e) obj;
        return C89219l.m154714a(this.f133832a, eVar.f133832a) && C89219l.m154714a(this.f133833b, eVar.f133833b);
    }

    public final int hashCode() {
        String str = this.f133832a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C58792b bVar = this.f133833b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EventParams(operation=" + this.f133832a + ", event=" + this.f133833b + ")";
    }
}
