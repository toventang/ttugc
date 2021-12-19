package com.facebook.imagepipeline.p1891p;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.imagepipeline.p.b */
public class C24644b {

    /* renamed from: a */
    public static final AbstractC24645a f58566a = new C24646b((byte) 0);

    /* renamed from: b */
    private static volatile AbstractC24647c f58567b = null;

    /* renamed from: com.facebook.imagepipeline.p.b$a */
    public interface AbstractC24645a {
        static {
            Covode.recordClassIndex(28795);
        }
    }

    /* renamed from: com.facebook.imagepipeline.p.b$c */
    public interface AbstractC24647c {
        static {
            Covode.recordClassIndex(28797);
        }
    }

    /* renamed from: com.facebook.imagepipeline.p.b$b */
    static final class C24646b implements AbstractC24645a {
        static {
            Covode.recordClassIndex(28796);
        }

        private C24646b() {
        }

        /* synthetic */ C24646b(byte b) {
            this();
        }
    }

    private C24644b() {
    }

    static {
        Covode.recordClassIndex(28794);
    }

    /* renamed from: a */
    public static AbstractC24647c m47156a() {
        MethodCollector.m26663i(2940);
        if (f58567b == null) {
            synchronized (C24644b.class) {
                try {
                    if (f58567b == null) {
                        f58567b = new C24643a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2940);
                    throw th;
                }
            }
        }
        AbstractC24647c cVar = f58567b;
        MethodCollector.m26664o(2940);
        return cVar;
    }
}
