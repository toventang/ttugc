package com.bytedance.apm.p789q;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.q.s */
public final class C12599s {
    static {
        Covode.recordClassIndex(14416);
    }

    /* renamed from: a */
    public static boolean m22724a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
