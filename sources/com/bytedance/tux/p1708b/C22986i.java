package com.bytedance.tux.p1708b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.tux.b.i */
public final class C22986i {

    /* renamed from: a */
    public final int f54371a;

    /* renamed from: b */
    public final AbstractC89277c<?> f54372b;

    /* renamed from: c */
    public final boolean f54373c;

    static {
        Covode.recordClassIndex(26903);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22986i)) {
            return false;
        }
        C22986i iVar = (C22986i) obj;
        return this.f54371a == iVar.f54371a && C89219l.m154714a(this.f54372b, iVar.f54372b) && this.f54373c == iVar.f54373c;
    }

    public final int hashCode() {
        int i = this.f54371a * 31;
        AbstractC89277c<?> cVar = this.f54372b;
        int hashCode = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z = this.f54373c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "TuxStateValueContainer(variant=" + this.f54371a + ", iconClass=" + this.f54372b + ", rtl=" + this.f54373c + ")";
    }

    public C22986i(int i, AbstractC89277c<?> cVar, boolean z) {
        this.f54371a = i;
        this.f54372b = cVar;
        this.f54373c = z;
    }
}
