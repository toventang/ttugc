package com.bytedance.frameworks.encryptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class EncryptorUtil {
    private static native byte[] ttEncrypt(byte[] bArr, int i);

    static {
        Covode.recordClassIndex(16863);
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38965b("Encryptor", false, null);
            C58032m.m104852a(uptimeMillis, "Encryptor");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static byte[] m27092a(byte[] bArr, int i) {
        MethodCollector.m26663i(4742);
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    byte[] ttEncrypt = ttEncrypt(bArr, i);
                    MethodCollector.m26664o(4742);
                    return ttEncrypt;
                }
            } catch (Throwable unused) {
                MethodCollector.m26664o(4742);
                return null;
            }
        }
        MethodCollector.m26664o(4742);
        return null;
    }
}
