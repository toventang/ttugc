package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.crash.util.m */
public final class C14061m {
    static {
        Covode.recordClassIndex(16128);
    }

    /* renamed from: a */
    public static void m25588a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m25589a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
