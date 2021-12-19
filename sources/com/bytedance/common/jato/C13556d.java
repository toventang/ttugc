package com.bytedance.common.jato;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.bytedance.common.jato.d */
public final class C13556d {

    /* renamed from: a */
    private static boolean f32986a;

    static {
        Covode.recordClassIndex(15569);
    }

    /* renamed from: a */
    public static synchronized boolean m24356a() {
        synchronized (C13556d.class) {
            MethodCollector.m26663i(12703);
            if (f32986a) {
                MethodCollector.m26664o(12703);
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38965b("jato", false, null);
                C58032m.m104852a(uptimeMillis, "jato");
                f32986a = true;
            } catch (Throwable unused) {
            }
            boolean z = f32986a;
            MethodCollector.m26664o(12703);
            return z;
        }
    }
}
