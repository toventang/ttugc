package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.f */
public final class C17814f<T, A> {

    /* renamed from: a */
    private AbstractC89172b<? super A, ? extends T> f42507a;

    /* renamed from: b */
    private volatile T f42508b;

    static {
        Covode.recordClassIndex(20378);
    }

    public C17814f(AbstractC89172b<? super A, ? extends T> bVar) {
        C89219l.m154719c(bVar, "");
        this.f42507a = bVar;
    }

    /* renamed from: a */
    public final T mo28277a(A a) {
        T t;
        MethodCollector.m26663i(1317);
        T t2 = this.f42508b;
        if (t2 != null) {
            MethodCollector.m26664o(1317);
            return t2;
        }
        synchronized (this) {
            try {
                t = this.f42508b;
                if (t != null) {
                    this.f42507a = null;
                } else {
                    AbstractC89172b<? super A, ? extends T> bVar = this.f42507a;
                    if (bVar == null) {
                        C89219l.m154707a();
                    }
                    t = (T) bVar.invoke(a);
                    this.f42508b = t;
                    this.f42507a = null;
                }
            } finally {
                MethodCollector.m26664o(1317);
            }
        }
        return t;
    }
}
