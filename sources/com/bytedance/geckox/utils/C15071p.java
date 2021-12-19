package com.bytedance.geckox.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.geckox.utils.p */
public final class C15071p {

    /* renamed from: a */
    private static Handler f36792a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(17239);
    }

    /* renamed from: a */
    public static void m27748a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f36792a.post(runnable);
        }
    }
}
