package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.n */
public final class C12792n<T> extends AbstractC12783f<T> {

    /* renamed from: a */
    public final T f31116a;

    static {
        Covode.recordClassIndex(14620);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C12792n) && C89219l.m154714a(this.f31116a, ((C12792n) obj).f31116a);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.f31116a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Success(value=" + ((Object) this.f31116a) + ")";
    }

    @Override // com.bytedance.assem.arch.extensions.AbstractC12783f
    /* renamed from: a */
    public final T mo20635a() {
        return this.f31116a;
    }

    public C12792n(T t) {
        super((byte) 0);
        this.f31116a = t;
    }
}
