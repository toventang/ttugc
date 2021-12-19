package com.p2082ss.texturerender;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.texturerender.l */
public final class C86203l {

    /* renamed from: a */
    private static AbstractC86204a f192326a;

    /* renamed from: com.ss.texturerender.l$a */
    public interface AbstractC86204a {
        static {
            Covode.recordClassIndex(101347);
        }

        /* renamed from: a */
        int mo136515a(String str, String str2);
    }

    static {
        Covode.recordClassIndex(101346);
    }

    /* renamed from: a */
    public static synchronized void m148117a(AbstractC86204a aVar) {
        synchronized (C86203l.class) {
            MethodCollector.m26663i(5769);
            f192326a = aVar;
            MethodCollector.m26664o(5769);
        }
    }

    /* renamed from: a */
    public static int m148116a(String str, String str2) {
        AbstractC86204a aVar = f192326a;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo136515a(str, str2);
    }
}
