package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p078c.p080b.C1752a;
import p078c.p080b.C1756d;

/* renamed from: com.bytedance.android.livesdk.utils.g */
public final class C11265g {
    static {
        Covode.recordClassIndex(12897);
    }

    /* renamed from: a */
    public static String m19959a() {
        try {
            C1752a a = C1756d.m5890a("y+2X0b3qfIqkZDbYHfFiN/8XI5fyqrwX5dCdfGk=");
            if (!a.exists()) {
                a.mkdirs();
            }
            return a.getAbsolutePath();
        } catch (IOException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m19964b(File file) {
        if (!file.isDirectory()) {
            return m19965c(file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return m19965c(file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m19964b(file2);
            } else {
                m19965c(file2);
            }
        }
        return m19965c(file);
    }

    /* renamed from: a */
    public static byte[] m19962a(File file) {
        MethodCollector.m26663i(10155);
        if (!file.exists()) {
            MethodCollector.m26664o(10155);
            return null;
        }
        try {
            byte[] a = m19963a(new FileInputStream(file));
            MethodCollector.m26664o(10155);
            return a;
        } catch (FileNotFoundException unused) {
            MethodCollector.m26664o(10155);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m19965c(File file) {
        MethodCollector.m26663i(10924);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(10924);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(10924);
        return delete;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m19963a(java.io.InputStream r6) {
        /*
            r5 = 10630(0x2986, float:1.4896E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            r4 = 0
            if (r6 != 0) goto L_0x000c
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x000c:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r3.<init>()     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0034, all -> 0x002c }
        L_0x0015:
            int r1 = r6.read(r2)     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r0 = -1
            if (r1 == r0) goto L_0x0021
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            goto L_0x0015
        L_0x0021:
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r6.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        L_0x002c:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0034:
            r6.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C11265g.m19963a(java.io.InputStream):byte[]");
    }

    /* renamed from: a */
    public static byte[] m19961a(Context context, Uri uri) {
        MethodCollector.m26663i(10310);
        if (context == null || uri == null) {
            MethodCollector.m26664o(10310);
            return null;
        }
        try {
            byte[] a = m19963a(context.getContentResolver().openInputStream(uri));
            MethodCollector.m26664o(10310);
            return a;
        } catch (FileNotFoundException unused) {
            MethodCollector.m26664o(10310);
            return null;
        }
    }

    /* renamed from: a */
    public static void m19960a(String str, String str2) {
        MethodCollector.m26663i(10772);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        String str3 = ".." + File.separator;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!C13627m.m24498a(name) && name.contains(str3)) {
                    IOException iOException = new IOException("Unzip maybe be unsafe.");
                    MethodCollector.m26664o(10772);
                    throw iOException;
                } else if (nextEntry.isDirectory()) {
                    new File(str2 + File.separator + name).mkdirs();
                } else {
                    File file = new File(str2 + File.separator + name);
                    if (file.exists()) {
                        m19965c(file);
                    } else {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                MethodCollector.m26664o(10772);
                return;
            }
        }
    }
}
