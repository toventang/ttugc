package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.play.core.b.bi */
public final class C26918bi<T> implements AbstractC26916bg, AbstractC26920bk {

    /* renamed from: a */
    private static final Object f63802a = new Object();

    /* renamed from: b */
    private volatile AbstractC26920bk<T> f63803b;

    /* renamed from: c */
    private volatile Object f63804c = f63802a;

    static {
        Covode.recordClassIndex(32393);
    }

    private C26918bi(AbstractC26920bk<T> bkVar) {
        this.f63803b = bkVar;
    }

    /* renamed from: a */
    public static <P extends AbstractC26920bk<T>, T> AbstractC26920bk<T> m53470a(P p) {
        return p instanceof C26918bi ? p : new C26918bi(p);
    }

    /* renamed from: b */
    public static <P extends AbstractC26920bk<T>, T> AbstractC26916bg<T> m53471b(P p) {
        return p instanceof AbstractC26916bg ? (AbstractC26916bg) p : new C26918bi(p);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26916bg, com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final T mo44603a() {
        MethodCollector.m26663i(12806);
        T t = (T) this.f63804c;
        Object obj = f63802a;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f63804c;
                    if (t == obj) {
                        t = this.f63803b.mo44411a();
                        Object obj2 = this.f63804c;
                        if (obj2 == obj || (obj2 instanceof C26919bj) || obj2 == t) {
                            this.f63804c = t;
                            this.f63803b = null;
                        } else {
                            String valueOf = String.valueOf(obj2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                            MethodCollector.m26664o(12806);
                            throw illegalStateException;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(12806);
                }
            }
        }
        return t;
    }
}
