package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imageutils.C24658b;

/* renamed from: com.facebook.imagepipeline.nativecode.b */
public final class C24632b {

    /* renamed from: a */
    private static boolean f58544a;

    static {
        Covode.recordClassIndex(28782);
    }

    /* renamed from: a */
    public static synchronized void m47148a() {
        synchronized (C24632b.class) {
            MethodCollector.m26663i(6406);
            if (!f58544a) {
                C24658b.m47175a("static-webp");
                f58544a = true;
            }
            MethodCollector.m26664o(6406);
        }
    }
}
