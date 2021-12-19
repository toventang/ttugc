package com.p2082ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.awemepushapi.AbstractC81805a;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.f */
public final class C81862f {

    /* renamed from: b */
    private static C81862f f183023b;

    /* renamed from: a */
    private AbstractC81805a f183024a;

    static {
        Covode.recordClassIndex(95276);
    }

    /* renamed from: a */
    public static AbstractC81805a m141759a() {
        C81862f fVar = f183023b;
        if (fVar != null) {
            return fVar.f183024a;
        }
        throw new IllegalStateException("Please call holdService to initialize");
    }

    private C81862f(AbstractC81805a aVar) {
        this.f183024a = aVar;
    }

    /* renamed from: a */
    static synchronized void m141760a(AbstractC81805a aVar) {
        synchronized (C81862f.class) {
            MethodCollector.m26663i(11054);
            if (aVar != null) {
                C81862f fVar = f183023b;
                if (fVar == null) {
                    f183023b = new C81862f(aVar);
                    MethodCollector.m26664o(11054);
                    return;
                }
                fVar.f183024a = aVar;
                MethodCollector.m26664o(11054);
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Please use MainInterfaceForPush instance initialization");
            MethodCollector.m26664o(11054);
            throw illegalArgumentException;
        }
    }
}
