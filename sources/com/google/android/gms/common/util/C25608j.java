package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.util.j */
public final class C25608j {
    static {
        Covode.recordClassIndex(31018);
    }

    /* renamed from: a */
    public static void m49418a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
