package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.ea */
public final class C80370ea<T> implements AbstractC80367dz<T> {

    /* renamed from: a */
    private AbstractC89171a<? extends T> f179897a;

    /* renamed from: b */
    private volatile Object f179898b;

    /* renamed from: c */
    private final Object f179899c;

    static {
        Covode.recordClassIndex(93638);
    }

    public final String toString() {
        if (this.f179898b != C80574ih.f180191a) {
            return String.valueOf(mo123714a());
        }
        return "Lazy value not initialized yet.";
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz
    /* renamed from: a */
    public final T mo123714a() {
        T t;
        MethodCollector.m26663i(12926);
        T t2 = (T) this.f179898b;
        if (t2 != C80574ih.f180191a) {
            MethodCollector.m26664o(12926);
            return t2;
        }
        synchronized (this.f179899c) {
            try {
                t = (T) this.f179898b;
                if (t == C80574ih.f180191a) {
                    AbstractC89171a<? extends T> aVar = this.f179897a;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    t = (T) aVar.invoke();
                    this.f179898b = t;
                    this.f179897a = null;
                }
            } finally {
                MethodCollector.m26664o(12926);
            }
        }
        return t;
    }

    private C80370ea(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        this.f179897a = aVar;
        this.f179898b = C80574ih.f180191a;
        this.f179899c = this;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz
    /* renamed from: a */
    public final void mo123715a(T t) {
        MethodCollector.m26663i(13009);
        if (C89219l.m154714a(this.f179898b, C80574ih.f180191a)) {
            synchronized (this.f179899c) {
                try {
                    this.f179898b = t;
                    this.f179897a = null;
                } finally {
                    MethodCollector.m26664o(13009);
                }
            }
            return;
        }
        this.f179898b = t;
        MethodCollector.m26664o(13009);
    }

    public /* synthetic */ C80370ea(AbstractC89171a aVar, byte b) {
        this(aVar);
    }
}
