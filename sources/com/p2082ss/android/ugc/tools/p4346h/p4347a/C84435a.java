package com.p2082ss.android.ugc.tools.p4346h.p4347a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.a */
public final class C84435a<K, V> {

    /* renamed from: a */
    public final List<V> f188773a;

    /* renamed from: b */
    public final List<C89378p<K, List<V>>> f188774b;

    static {
        Covode.recordClassIndex(98400);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84435a)) {
            return false;
        }
        C84435a aVar = (C84435a) obj;
        return C89219l.m154714a(this.f188773a, aVar.f188773a) && C89219l.m154714a(this.f188774b, aVar.f188774b);
    }

    public final int hashCode() {
        List<V> list = this.f188773a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C89378p<K, List<V>>> list2 = this.f188774b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CategoryList(list=" + this.f188773a + ", table=" + this.f188774b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends h.p<? extends K, ? extends java.util.List<? extends V>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84435a(List<? extends V> list, List<? extends C89378p<? extends K, ? extends List<? extends V>>> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f188773a = list;
        this.f188774b = list2;
    }
}
