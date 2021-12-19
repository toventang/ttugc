package com.bytedance.ies.xbridge.p1301e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.c */
public final class C18502c {

    /* renamed from: a */
    public final String f44153a;

    /* renamed from: b */
    public final AbstractC18754n f44154b;

    static {
        Covode.recordClassIndex(21196);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18502c)) {
            return false;
        }
        C18502c cVar = (C18502c) obj;
        return C89219l.m154714a(this.f44153a, cVar.f44153a) && C89219l.m154714a(this.f44154b, cVar.f44154b);
    }

    public final int hashCode() {
        String str = this.f44153a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC18754n nVar = this.f44154b;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Js2NativeEvent(eventName=" + this.f44153a + ", params=" + this.f44154b + ")";
    }

    public C18502c(String str, AbstractC18754n nVar) {
        C89219l.m154719c(str, "");
        this.f44153a = str;
        this.f44154b = nVar;
    }
}
