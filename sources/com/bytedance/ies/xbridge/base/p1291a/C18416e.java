package com.bytedance.ies.xbridge.base.p1291a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.a.e */
public class C18416e<T, A> {

    /* renamed from: a */
    private AbstractC89172b<? super A, ? extends T> f44001a;

    /* renamed from: b */
    private volatile T f44002b;

    static {
        Covode.recordClassIndex(21088);
    }

    public C18416e(AbstractC89172b<? super A, ? extends T> bVar) {
        C89219l.m154719c(bVar, "");
        this.f44001a = bVar;
    }

    /* renamed from: a */
    public final T mo29440a(A a) {
        T t;
        MethodCollector.m26663i(4402);
        T t2 = this.f44002b;
        if (t2 != null) {
            MethodCollector.m26664o(4402);
            return t2;
        }
        synchronized (this) {
            try {
                t = this.f44002b;
                if (t == null) {
                    AbstractC89172b<? super A, ? extends T> bVar = this.f44001a;
                    if (bVar == null) {
                        C89219l.m154707a();
                    }
                    t = (T) bVar.invoke(a);
                    this.f44002b = t;
                    this.f44001a = null;
                }
            } finally {
                MethodCollector.m26664o(4402);
            }
        }
        return t;
    }
}
