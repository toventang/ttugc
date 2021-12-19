package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.j */
public final class C12760j {

    /* renamed from: a */
    public final Class<?> f31028a;

    /* renamed from: b */
    public final String f31029b;

    static {
        Covode.recordClassIndex(14584);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12760j)) {
            return false;
        }
        C12760j jVar = (C12760j) obj;
        return C89219l.m154714a(this.f31028a, jVar.f31028a) && C89219l.m154714a(this.f31029b, jVar.f31029b);
    }

    public final int hashCode() {
        Class<?> cls = this.f31028a;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.f31029b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "HierarchyDataIdentifier(clazz=" + this.f31028a + ", key=" + this.f31029b + ")";
    }

    public C12760j(Class<?> cls, String str) {
        C89219l.m154719c(cls, "");
        this.f31028a = cls;
        this.f31029b = str;
    }
}
