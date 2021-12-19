package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21747h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.provider.a */
public final class C21731a<T extends AbstractC21747h> {

    /* renamed from: a */
    public final String f51499a;

    /* renamed from: b */
    public final Class<T> f51500b;

    static {
        Covode.recordClassIndex(25375);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21731a)) {
            return false;
        }
        C21731a aVar = (C21731a) obj;
        return C89219l.m154714a(this.f51499a, aVar.f51499a) && C89219l.m154714a(this.f51500b, aVar.f51500b);
    }

    public final int hashCode() {
        String str = this.f51499a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Class<T> cls = this.f51500b;
        if (cls != null) {
            i = cls.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SourceKey(tag=" + this.f51499a + ", target=" + this.f51500b + ")";
    }

    public C21731a(String str, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        this.f51499a = str;
        this.f51500b = cls;
    }
}
