package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.d.a */
public final class C24082a {
    static {
        Covode.recordClassIndex(28209);
    }

    /* renamed from: a */
    public static long m45598a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(13048);
        C24091i.m45617a(inputStream);
        C24091i.m45617a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } else {
                MethodCollector.m26664o(13048);
                return j;
            }
        }
    }

    /* renamed from: a */
    public static int m45597a(InputStream inputStream, byte[] bArr, int i) {
        MethodCollector.m26663i(13126);
        C24091i.m45617a(inputStream);
        C24091i.m45617a(bArr);
        if (i >= 0) {
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2 + 0, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            MethodCollector.m26664o(13126);
            return i2;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("len is negative");
        MethodCollector.m26664o(13126);
        throw indexOutOfBoundsException;
    }
}
