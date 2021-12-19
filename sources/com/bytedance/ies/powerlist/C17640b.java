package com.bytedance.ies.powerlist;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.b */
public final class C17640b<T> {

    /* renamed from: a */
    public final List<T> f42191a;

    /* renamed from: b */
    public final boolean f42192b;

    static {
        Covode.recordClassIndex(20193);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17640b)) {
            return false;
        }
        C17640b bVar = (C17640b) obj;
        return C89219l.m154714a(this.f42191a, bVar.f42191a) && this.f42192b == bVar.f42192b;
    }

    public final int hashCode() {
        List<T> list = this.f42191a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f42192b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "ListStateContent(items=" + this.f42191a + ", manual=" + this.f42192b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17640b(List<? extends T> list, boolean z) {
        C89219l.m154719c(list, "");
        this.f42191a = list;
        this.f42192b = z;
    }
}
