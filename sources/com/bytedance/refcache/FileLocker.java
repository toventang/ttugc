package com.bytedance.refcache;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class FileLocker {
    static native int getStatus(String str);

    static {
        Covode.recordClassIndex(25652);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("flock-lib", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "flock-lib");
    }

    /* renamed from: a */
    public static boolean m41317a(String str) {
        boolean z;
        MethodCollector.m26663i(7790);
        if (getStatus(str) >= 0) {
            z = true;
        } else {
            z = false;
        }
        MethodCollector.m26664o(7790);
        return z;
    }
}
