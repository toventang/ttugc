package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.bytedance.android.livesdk.o */
public final class C9986o {
    static {
        Covode.recordClassIndex(11540);
    }

    /* renamed from: a */
    public static void m18454a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(10525);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr, 0, 4096);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                gZIPInputStream.close();
                MethodCollector.m26664o(10525);
                return;
            }
        }
    }
}
