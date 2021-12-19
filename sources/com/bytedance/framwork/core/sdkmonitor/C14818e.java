package com.bytedance.framwork.core.sdkmonitor;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.e */
public final class C14818e {
    static {
        Covode.recordClassIndex(16919);
    }

    /* renamed from: a */
    public static void m27209a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
