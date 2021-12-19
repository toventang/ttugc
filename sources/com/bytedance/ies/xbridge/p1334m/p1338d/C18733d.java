package com.bytedance.ies.xbridge.p1334m.p1338d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.d.d */
public class C18733d<T, A> {

    /* renamed from: a */
    private AbstractC89172b<? super A, ? extends T> f44516a;

    /* renamed from: b */
    private volatile T f44517b;

    static {
        Covode.recordClassIndex(21427);
    }

    public C18733d(AbstractC89172b<? super A, ? extends T> bVar) {
        C89219l.m154719c(bVar, "");
        this.f44516a = bVar;
    }

    /* renamed from: a */
    public final T mo29752a(A a) {
        T t;
        MethodCollector.m26663i(3282);
        T t2 = this.f44517b;
        if (t2 != null) {
            MethodCollector.m26664o(3282);
            return t2;
        }
        synchronized (this) {
            try {
                t = this.f44517b;
                if (t == null) {
                    AbstractC89172b<? super A, ? extends T> bVar = this.f44516a;
                    if (bVar == null) {
                        C89219l.m154707a();
                    }
                    t = (T) bVar.invoke(a);
                    this.f44517b = t;
                    this.f44516a = null;
                }
            } finally {
                MethodCollector.m26664o(3282);
            }
        }
        return t;
    }
}
