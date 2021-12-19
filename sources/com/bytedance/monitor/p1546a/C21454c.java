package com.bytedance.monitor.p1546a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.monitor.a.c */
public final class C21454c {
    static {
        Covode.recordClassIndex(25077);
    }

    /* renamed from: a */
    public static void m40295a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m40296a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Throwable unused) {
            }
        }
    }
}
