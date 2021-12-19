package com.bytedance.push.p1589b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.bytedance.push.b.e */
final class C21766e {
    static {
        Covode.recordClassIndex(25415);
    }

    /* renamed from: a */
    static byte[] m40742a(InputStream inputStream) {
        MethodCollector.m26663i(6001);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.m26664o(6001);
                return byteArray;
            }
        }
    }
}
