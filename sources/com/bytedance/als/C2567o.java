package com.bytedance.als;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.als.o */
public final class C2567o {

    /* renamed from: a */
    private static final Handler f7729a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(2952);
    }

    /* renamed from: a */
    public static void m7493a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            final IllegalStateException illegalStateException = new IllegalStateException("This method must call on main thread");
            f7729a.post(new Runnable() {
                /* class com.bytedance.als.C2567o.RunnableC25681 */

                static {
                    Covode.recordClassIndex(2953);
                }

                public final void run() {
                    throw illegalStateException;
                }
            });
        }
    }
}
