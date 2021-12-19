package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.i */
public final class C12786i<T> implements AbstractC89244h<T> {

    /* renamed from: a */
    private T f31104a;

    /* renamed from: b */
    private final boolean f31105b;

    /* renamed from: c */
    private final AbstractC89171a<T> f31106c;

    static {
        Covode.recordClassIndex(14614);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        return this.f31105b;
    }

    @Override // p4600h.AbstractC89244h
    public final T getValue() {
        T t = this.f31104a;
        if (t != null) {
            return t;
        }
        T invoke = this.f31106c.invoke();
        this.f31104a = invoke;
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12786i(boolean z, AbstractC89171a<? extends T> aVar) {
        C89219l.m154719c(aVar, "");
        this.f31105b = z;
        this.f31106c = aVar;
    }
}
