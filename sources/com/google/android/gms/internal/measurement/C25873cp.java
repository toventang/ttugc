package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.cp */
public final class C25873cp<T> implements AbstractC25871cn<T>, Serializable {

    /* renamed from: a */
    private final AbstractC25871cn<T> f60999a;

    /* renamed from: b */
    private volatile transient boolean f61000b;

    /* renamed from: c */
    private transient T f61001c;

    static {
        Covode.recordClassIndex(31288);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25871cn
    /* renamed from: a */
    public final T mo42201a() {
        MethodCollector.m26663i(4534);
        if (!this.f61000b) {
            synchronized (this) {
                try {
                    if (!this.f61000b) {
                        T a = this.f60999a.mo42201a();
                        this.f61001c = a;
                        this.f61000b = true;
                        return a;
                    }
                } finally {
                    MethodCollector.m26664o(4534);
                }
            }
        }
        T t = this.f61001c;
        MethodCollector.m26664o(4534);
        return t;
    }

    public final String toString() {
        Object obj;
        if (this.f61000b) {
            String valueOf = String.valueOf(this.f61001c);
            obj = new StringBuilder(String.valueOf(valueOf).length() + 25).append("<supplier that returned ").append(valueOf).append(">").toString();
        } else {
            obj = this.f60999a;
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf2).length() + 19).append("Suppliers.memoize(").append(valueOf2).append(")").toString();
    }

    C25873cp(AbstractC25871cn<T> cnVar) {
        this.f60999a = (AbstractC25871cn) C25866ci.m50065a(cnVar);
    }
}
