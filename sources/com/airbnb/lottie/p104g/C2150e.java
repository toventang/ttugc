package com.airbnb.lottie.p104g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.airbnb.lottie.g.e */
public final class C2150e {

    /* renamed from: a */
    public static AbstractC2151a f6508a;

    /* renamed from: com.airbnb.lottie.g.e$a */
    public interface AbstractC2151a {
        static {
            Covode.recordClassIndex(2346);
        }

        /* renamed from: a */
        void mo6077a();
    }

    static {
        Covode.recordClassIndex(2345);
    }

    /* renamed from: a */
    protected static synchronized void m6701a() {
        synchronized (C2150e.class) {
            MethodCollector.m26663i(12560);
            AbstractC2151a aVar = f6508a;
            if (aVar != null) {
                aVar.mo6077a();
                f6508a = null;
            }
            MethodCollector.m26664o(12560);
        }
    }
}
