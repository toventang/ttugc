package com.bytedance.creativex.filter.view.widget;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.filter.view.widget.b */
public final class C14094b {

    /* renamed from: a */
    public final String f34284a;

    /* renamed from: b */
    public final String f34285b;

    static {
        Covode.recordClassIndex(16163);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14094b)) {
            return false;
        }
        C14094b bVar = (C14094b) obj;
        return C89219l.m154714a(this.f34284a, bVar.f34284a) && C89219l.m154714a(this.f34285b, bVar.f34285b);
    }

    public final int hashCode() {
        String str = this.f34284a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34285b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterNameWithCategory(filterName=" + this.f34284a + ", category=" + this.f34285b + ")";
    }

    public C14094b(String str, String str2) {
        C89219l.m154721d(str, "");
        this.f34284a = str;
        this.f34285b = str2;
    }
}
