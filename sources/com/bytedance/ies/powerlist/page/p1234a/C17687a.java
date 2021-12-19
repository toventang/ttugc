package com.bytedance.ies.powerlist.page.p1234a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.a.a */
public final class C17687a {

    /* renamed from: a */
    public final Object f42313a;

    /* renamed from: b */
    public final Object f42314b;

    static {
        Covode.recordClassIndex(20246);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17687a)) {
            return false;
        }
        C17687a aVar = (C17687a) obj;
        return C89219l.m154714a(this.f42313a, aVar.f42313a) && C89219l.m154714a(this.f42314b, aVar.f42314b);
    }

    public final int hashCode() {
        Object obj = this.f42313a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f42314b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PageCursor(prev=" + this.f42313a + ", next=" + this.f42314b + ")";
    }

    public C17687a(Object obj, Object obj2) {
        this.f42313a = obj;
        this.f42314b = obj2;
    }
}
