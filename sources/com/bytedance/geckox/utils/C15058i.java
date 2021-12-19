package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: com.bytedance.geckox.utils.i */
public final class C15058i {

    /* renamed from: a */
    static final char[] f36781a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(17226);
    }

    /* renamed from: a */
    public static String m27724a(File file, String str) {
        Throwable th;
        MethodCollector.m26663i(3571);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                String b = m27726b(fileInputStream2, str);
                C15050c.m27709a(fileInputStream2);
                MethodCollector.m26664o(3571);
                return b;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C15050c.m27709a(fileInputStream);
                MethodCollector.m26664o(3571);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C15050c.m27709a(fileInputStream);
            MethodCollector.m26664o(3571);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m27725a(InputStream inputStream, String str) {
        if (str != null) {
            String b = m27726b(inputStream, "MD5");
            if (!b.equals(str)) {
                throw new RuntimeException("md5 check failed file: local md5:" + b + " expect md5:" + str);
            }
            return;
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    /* renamed from: b */
    private static String m27726b(InputStream inputStream, String str) {
        MethodCollector.m26663i(3578);
        byte[] bArr = new byte[16384];
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            int length = digest.length;
            if (length + 0 <= digest.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = digest[i3 + 0] & 255;
                    int i5 = i2 + 1;
                    char[] cArr2 = f36781a;
                    cArr[i2] = cArr2[i4 >> 4];
                    i2 = i5 + 1;
                    cArr[i5] = cArr2[i4 & 15];
                }
                String str2 = new String(cArr, 0, i);
                C15050c.m27709a(inputStream);
                MethodCollector.m26664o(3578);
                return str2;
            }
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.m26664o(3578);
            throw indexOutOfBoundsException;
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("getHash error: " + e.getMessage());
            MethodCollector.m26664o(3578);
            throw runtimeException;
        } catch (Throwable th) {
            C15050c.m27709a(inputStream);
            MethodCollector.m26664o(3578);
            throw th;
        }
    }
}
