package com.facebook.p1814a.p1820e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* renamed from: com.facebook.a.e.f */
final class C23937f {
    static {
        Covode.recordClassIndex(28058);
    }

    /* renamed from: a */
    static String m45248a(File file) {
        int read;
        MethodCollector.m26663i(7498);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1024);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                }
            } while (read != -1);
            String bigInteger = new BigInteger(1, instance.digest()).toString(16);
            bufferedInputStream.close();
            MethodCollector.m26664o(7498);
            return bigInteger;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            MethodCollector.m26664o(7498);
            throw th;
        }
    }
}
