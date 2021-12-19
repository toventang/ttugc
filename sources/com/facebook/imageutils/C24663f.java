package com.facebook.imageutils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.imageutils.f */
public final class C24663f {
    static {
        Covode.recordClassIndex(28815);
    }

    /* renamed from: a */
    public static int m47180a(InputStream inputStream, int i, boolean z) {
        int i2;
        MethodCollector.m26663i(5627);
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & 255) << (i4 * 8);
                } else {
                    i3 <<= 8;
                    i2 = read & 255;
                }
                i3 |= i2;
            } else {
                IOException iOException = new IOException("no more bytes");
                MethodCollector.m26664o(5627);
                throw iOException;
            }
        }
        MethodCollector.m26664o(5627);
        return i3;
    }
}
