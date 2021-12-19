package com.bytedance.zoin.zstd.p1792a;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.bytedance.zoin.zstd.a.a */
public final class C23756a {

    /* renamed from: a */
    private static boolean f56212a;

    static {
        Covode.recordClassIndex(27864);
    }

    /* renamed from: a */
    public static synchronized void m44905a() {
        synchronized (C23756a.class) {
            MethodCollector.m26663i(1135);
            if (f56212a) {
                MethodCollector.m26664o(1135);
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a("zstd-jni-decompress", false, (Context) null);
            C58032m.m104852a(uptimeMillis, "zstd-jni-decompress");
            f56212a = true;
            MethodCollector.m26664o(1135);
        }
    }
}
