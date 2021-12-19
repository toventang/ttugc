package com.p2082ss.ttvideoengine;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.ttvideoengine.p4430s.C86641i;

/* renamed from: com.ss.ttvideoengine.JniUtils */
public class JniUtils {

    /* renamed from: a */
    public static volatile AbstractC86564l f192756a;

    /* renamed from: b */
    public static volatile boolean f192757b;

    /* renamed from: c */
    public static volatile String f192758c = "";

    public static native String getDecodedStr(byte[] bArr, byte[] bArr2);

    public static native String getEncryptionKey(byte[] bArr);

    public static native byte[] getSignature(String str);

    public static native int getSupportedMethod();

    static {
        Covode.recordClassIndex(101525);
    }

    /* renamed from: a */
    public static synchronized void m148583a() {
        synchronized (JniUtils.class) {
            MethodCollector.m26663i(4059);
            try {
                if (!f192757b) {
                    if (f192756a == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Librarian.m38962a("videodec");
                        C58032m.m104852a(uptimeMillis, "videodec");
                    }
                    f192757b = true;
                }
                MethodCollector.m26664o(4059);
            } catch (Throwable th) {
                f192758c = th.toString();
                MethodCollector.m26664o(4059);
            }
        }
    }

    /* renamed from: b */
    public static int m148584b() {
        MethodCollector.m26663i(4129);
        String str = "exception is null";
        if (!f192757b) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f192758c != null) {
                str = f192758c;
            }
            Exception exc = new Exception(sb.append(str).toString());
            MethodCollector.m26664o(4129);
            throw exc;
        }
        try {
            int supportedMethod = getSupportedMethod();
            MethodCollector.m26664o(4129);
            return supportedMethod;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            Exception exc2 = new Exception(sb2.append(str).toString());
            MethodCollector.m26664o(4129);
            throw exc2;
        }
    }

    /* renamed from: a */
    public static String m148581a(byte[] bArr) {
        MethodCollector.m26663i(4066);
        String str = "exception is null";
        if (!f192757b) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f192758c != null) {
                str = f192758c;
            }
            Exception exc = new Exception(sb.append(str).toString());
            MethodCollector.m26664o(4066);
            throw exc;
        } else if (bArr == null) {
            C86641i.m150117e("JniUtils", "getEncryptionKeyWithCheck convertedKey is null");
            MethodCollector.m26664o(4066);
            return null;
        } else {
            try {
                String encryptionKey = getEncryptionKey(bArr);
                MethodCollector.m26664o(4066);
                return encryptionKey;
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder("getEncryptionKey exception:");
                if (th.toString() != null) {
                    str = th.toString();
                }
                Exception exc2 = new Exception(sb2.append(str).toString());
                MethodCollector.m26664o(4066);
                throw exc2;
            }
        }
    }

    /* renamed from: a */
    public static String m148582a(byte[] bArr, byte[] bArr2) {
        MethodCollector.m26663i(4103);
        String str = "exception is null";
        if (!f192757b) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f192758c != null) {
                str = f192758c;
            }
            Exception exc = new Exception(sb.append(str).toString());
            MethodCollector.m26664o(4103);
            throw exc;
        }
        try {
            String decodedStr = getDecodedStr(bArr, bArr2);
            MethodCollector.m26664o(4103);
            return decodedStr;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            Exception exc2 = new Exception(sb2.append(str).toString());
            MethodCollector.m26664o(4103);
            throw exc2;
        }
    }
}
