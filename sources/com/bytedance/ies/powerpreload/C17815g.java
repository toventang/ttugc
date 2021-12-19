package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ies.powerpreload.g */
public final class C17815g<T> {

    /* renamed from: a */
    private WeakReference<T> f42509a;

    static {
        Covode.recordClassIndex(20379);
    }

    public C17815g() {
        this(C178161.f42510a);
    }

    /* renamed from: a */
    public final T mo28278a(AbstractC89286i<?> iVar) {
        C89219l.m154719c(iVar, "");
        return this.f42509a.get();
    }

    public C17815g(AbstractC89171a<? extends T> aVar) {
        C89219l.m154719c(aVar, "");
        this.f42509a = new WeakReference<>(aVar.invoke());
    }

    /* renamed from: a */
    public final void mo28279a(AbstractC89286i<?> iVar, T t) {
        C89219l.m154719c(iVar, "");
        this.f42509a = new WeakReference<>(t);
    }
}
