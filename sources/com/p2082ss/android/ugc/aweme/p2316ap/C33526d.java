package com.p2082ss.android.ugc.aweme.p2316ap;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ap.d */
final class C33526d<T> implements AbstractC33525c<T> {

    /* renamed from: a */
    private AbstractC89171a<? extends T> f79625a;

    /* renamed from: b */
    private volatile Object f79626b;

    /* renamed from: c */
    private final Object f79627c;

    static {
        Covode.recordClassIndex(40389);
    }

    public final String toString() {
        if (this.f79626b != C33528f.f79628a) {
            return String.valueOf(mo59628a());
        }
        return "Lazy value not initialized yet.";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2316ap.AbstractC33525c
    /* renamed from: a */
    public final T mo59628a() {
        T t;
        MethodCollector.m26663i(11058);
        T t2 = (T) this.f79626b;
        if (t2 != C33528f.f79628a) {
            MethodCollector.m26664o(11058);
            return t2;
        }
        synchronized (this.f79627c) {
            try {
                t = (T) this.f79626b;
                if (t == C33528f.f79628a) {
                    AbstractC89171a<? extends T> aVar = this.f79625a;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    t = (T) aVar.invoke();
                    this.f79626b = t;
                    this.f79625a = null;
                }
            } finally {
                MethodCollector.m26664o(11058);
            }
        }
        return t;
    }

    private C33526d(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        this.f79625a = aVar;
        this.f79626b = C33528f.f79628a;
        this.f79627c = this;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2316ap.AbstractC33525c
    /* renamed from: a */
    public final void mo59629a(T t) {
        MethodCollector.m26663i(11059);
        if (C89219l.m154714a(this.f79626b, C33528f.f79628a)) {
            synchronized (this.f79627c) {
                try {
                    this.f79626b = t;
                    this.f79625a = null;
                } finally {
                    MethodCollector.m26664o(11059);
                }
            }
            return;
        }
        this.f79626b = t;
        MethodCollector.m26664o(11059);
    }

    public /* synthetic */ C33526d(AbstractC89171a aVar, byte b) {
        this(aVar);
    }
}
