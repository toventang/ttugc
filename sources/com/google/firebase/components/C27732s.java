package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.p2012d.AbstractC27738a;

/* renamed from: com.google.firebase.components.s */
public final class C27732s<T> implements AbstractC27738a<T> {

    /* renamed from: a */
    private static final Object f65166a = new Object();

    /* renamed from: b */
    private volatile Object f65167b = f65166a;

    /* renamed from: c */
    private volatile AbstractC27738a<T> f65168c;

    static {
        Covode.recordClassIndex(33315);
    }

    @Override // com.google.firebase.p2012d.AbstractC27738a
    /* renamed from: a */
    public final T mo46341a() {
        MethodCollector.m26663i(7279);
        T t = (T) this.f65167b;
        Object obj = f65166a;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f65167b;
                    if (t == obj) {
                        t = this.f65168c.mo46341a();
                        this.f65167b = t;
                        this.f65168c = null;
                    }
                } finally {
                    MethodCollector.m26664o(7279);
                }
            }
        }
        return t;
    }

    public C27732s(AbstractC27738a<T> aVar) {
        this.f65168c = aVar;
    }
}
