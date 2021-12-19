package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.aj */
public final class C20372aj<T> extends AbstractC20362a<T> {

    /* renamed from: a */
    public final T f48256a;

    static {
        Covode.recordClassIndex(23884);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C20372aj) && C89219l.m154714a(this.f48256a, ((C20372aj) obj).f48256a);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.f48256a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Success(value=" + ((Object) this.f48256a) + ")";
    }

    @Override // com.bytedance.jedi.arch.AbstractC20362a
    /* renamed from: a */
    public final T mo33695a() {
        return this.f48256a;
    }

    public C20372aj(T t) {
        super((byte) 0);
        this.f48256a = t;
    }
}
