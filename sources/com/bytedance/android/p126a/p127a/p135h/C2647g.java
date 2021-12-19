package com.bytedance.android.p126a.p127a.p135h;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bytedance.android.a.a.h.g */
public final class C2647g {
    static {
        Covode.recordClassIndex(3035);
    }

    /* renamed from: a */
    public static void m7663a(Closeable... closeableArr) {
        int i = 0;
        do {
            Closeable closeable = closeableArr[0];
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            i++;
        } while (i <= 0);
    }
}
