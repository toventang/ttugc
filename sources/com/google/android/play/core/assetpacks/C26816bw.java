package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26896an;
import com.google.android.play.core.p1963b.C26915bf;
import com.google.android.play.core.p1965d.C26991q;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.bw */
public final class C26816bw {

    /* renamed from: a */
    private static AbstractC26860e f63604a;

    static {
        Covode.recordClassIndex(32291);
    }

    /* renamed from: a */
    static long m53264a(byte[] bArr, int i) {
        return ((long) ((m53269b(bArr, i + 2) << 16) | m53269b(bArr, i))) & 4294967295L;
    }

    /* renamed from: a */
    static String m53266a(List<File> list) {
        int read;
        MethodCollector.m26663i(13961);
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C26915bf.m53466a(th, th);
                }
            } while (read != -1);
            fileInputStream.close();
        }
        String encodeToString = Base64.encodeToString(instance.digest(), 11);
        MethodCollector.m26664o(13961);
        return encodeToString;
        MethodCollector.m26664o(13961);
        throw th;
    }

    /* renamed from: a */
    public static boolean m53267a(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: a */
    static boolean m53268a(int i, int i2) {
        if (i == 5) {
            return i2 != 5;
        }
        if (i == 6) {
            return (i2 == 6 || i2 == 5) ? false : true;
        }
        if (i == 4) {
            return i2 != 4;
        }
        if (i == 3) {
            return i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: b */
    static int m53269b(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: b */
    public static boolean m53270b(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: c */
    public static boolean m53271c(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: a */
    static synchronized AbstractC26860e m53265a(Context context) {
        AbstractC26860e eVar;
        synchronized (C26816bw.class) {
            MethodCollector.m26663i(14001);
            if (f63604a == null) {
                C26782ap apVar = new C26782ap((byte) 0);
                apVar.f63459a = new C26848da(C26991q.m53630a(context));
                C26896an.m53420a(apVar.f63459a, C26848da.class);
                f63604a = new C26783aq(apVar.f63459a);
            }
            eVar = f63604a;
            MethodCollector.m26664o(14001);
        }
        return eVar;
    }
}
