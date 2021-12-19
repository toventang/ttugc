package com.bytedance.android.live.core.performance.p227a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* renamed from: com.bytedance.android.live.core.performance.a.c */
public final class C4016c {
    static {
        Covode.recordClassIndex(4550);
    }

    /* renamed from: a */
    public static void m9791a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
