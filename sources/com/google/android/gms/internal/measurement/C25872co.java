package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.co */
public final class C25872co<T> implements AbstractC25871cn<T> {

    /* renamed from: a */
    private volatile AbstractC25871cn<T> f60996a;

    /* renamed from: b */
    private volatile boolean f60997b;

    /* renamed from: c */
    private T f60998c;

    static {
        Covode.recordClassIndex(31287);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25871cn
    /* renamed from: a */
    public final T mo42201a() {
        MethodCollector.m26663i(4536);
        if (!this.f60997b) {
            synchronized (this) {
                try {
                    if (!this.f60997b) {
                        T a = this.f60996a.mo42201a();
                        this.f60998c = a;
                        this.f60997b = true;
                        this.f60996a = null;
                        return a;
                    }
                } finally {
                    MethodCollector.m26664o(4536);
                }
            }
        }
        T t = this.f60998c;
        MethodCollector.m26664o(4536);
        return t;
    }

    public final String toString() {
        Object obj = this.f60996a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f60998c);
            obj = new StringBuilder(String.valueOf(valueOf).length() + 25).append("<supplier that returned ").append(valueOf).append(">").toString();
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf2).length() + 19).append("Suppliers.memoize(").append(valueOf2).append(")").toString();
    }

    C25872co(AbstractC25871cn<T> cnVar) {
        this.f60996a = (AbstractC25871cn) C25866ci.m50065a(cnVar);
    }
}
