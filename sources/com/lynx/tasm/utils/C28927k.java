package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.utils.k */
public final class C28927k {
    static {
        Covode.recordClassIndex(35055);
    }

    /* renamed from: a */
    public static String m57941a(InputStream inputStream) {
        byte[] b = m57942b(inputStream);
        if (b == null) {
            return null;
        }
        return new String(b);
    }

    /* renamed from: b */
    private static byte[] m57942b(InputStream inputStream) {
        MethodCollector.m26663i(3832);
        if (inputStream == null) {
            MethodCollector.m26664o(3832);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.m26664o(3832);
                    return byteArray;
                }
            } catch (IOException unused) {
                MethodCollector.m26664o(3832);
                return null;
            }
        }
    }
}
