package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.o */
public final class C12765o {

    /* renamed from: a */
    public final Class<?> f31045a;

    /* renamed from: b */
    public final String f31046b;

    static {
        Covode.recordClassIndex(14589);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12765o)) {
            return false;
        }
        C12765o oVar = (C12765o) obj;
        return C89219l.m154714a(this.f31045a, oVar.f31045a) && C89219l.m154714a(this.f31046b, oVar.f31046b);
    }

    public final int hashCode() {
        Class<?> cls = this.f31045a;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.f31046b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ServiceIdentifier(serviceClazz=" + this.f31045a + ", serviceKey=" + this.f31046b + ")";
    }

    public C12765o(Class<?> cls, String str) {
        C89219l.m154719c(cls, "");
        this.f31045a = cls;
        this.f31046b = str;
    }
}
