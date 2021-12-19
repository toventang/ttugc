package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.codec.binary.Base64;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;

/* renamed from: com.ss.android.ugc.aweme.utils.cs */
public final class C80313cs {
    static {
        Covode.recordClassIndex(93581);
    }

    /* renamed from: a */
    public static void m139228a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m139234c(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m139234c(file2.getPath());
                    } else {
                        m139229a(file2);
                    }
                }
                m139229a(file);
            }
        }
    }

    /* renamed from: b */
    public static String m139233b(String str) {
        byte[] a;
        MethodCollector.m26663i(12763);
        if (str.startsWith("content://")) {
            Uri parse = Uri.parse(str);
            a = m139232a(C1756d.m5891a(C17867d.m33078a(), parse), C1757e.m5900a(C17867d.m33078a(), parse), str);
        } else {
            File file = new File(str);
            a = m139232a(new FileInputStream(file), file.length(), file.getName());
        }
        String str2 = new String(Base64.encodeBase64(a));
        MethodCollector.m26664o(12763);
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC, Splitter:B:27:0x0050] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m139235d(java.lang.String r5) {
        /*
            r4 = 12946(0x3292, float:1.8141E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003a }
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r1 = r0 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            int r1 = r1 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            int r1 = r1 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        L_0x0034:
            r1 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x0037:
            r0 = move-exception
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            r0.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x004e
        L_0x003f:
            r1 = move-exception
        L_0x0040:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x004e:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0058:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80313cs.m139235d(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m139229a(File file) {
        MethodCollector.m26663i(12850);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12850);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12850);
        return delete;
    }

    /* renamed from: a */
    public static boolean m139231a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static String m139226a(File file, String str) {
        MethodCollector.m26663i(12640);
        try {
            String a = m139227a(new FileInputStream(file), str);
            MethodCollector.m26664o(12640);
            return a;
        } catch (FileNotFoundException unused) {
            MethodCollector.m26664o(12640);
            return null;
        }
    }

    /* renamed from: a */
    public static File m139225a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                file.mkdirs();
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[Catch:{ Exception -> 0x0044 }, LOOP:0: B:11:0x0028->B:13:0x002f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[EDGE_INSN: B:14:0x0034->B:15:? ?: BREAK  , SYNTHETIC, Splitter:B:14:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060 A[SYNTHETIC, Splitter:B:36:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m139227a(java.io.InputStream r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80313cs.m139227a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m139230a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(12761);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m139228a(inputStream);
                    m139228a(outputStream);
                    MethodCollector.m26664o(12761);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                m139228a(inputStream);
                m139228a(outputStream);
                MethodCollector.m26664o(12761);
                return false;
            } catch (Throwable th) {
                m139228a(inputStream);
                m139228a(outputStream);
                MethodCollector.m26664o(12761);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m139232a(InputStream inputStream, long j, String str) {
        MethodCollector.m26663i(12764);
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        if (i2 >= i) {
            inputStream.close();
            MethodCollector.m26664o(12764);
            return bArr;
        }
        IOException iOException = new IOException("Could not completely read file ".concat(String.valueOf(str)));
        MethodCollector.m26664o(12764);
        throw iOException;
    }
}
