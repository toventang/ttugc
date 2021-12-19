package com.p2082ss.android.ugc.tools.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p078c.p080b.C1756d;

/* renamed from: com.ss.android.ugc.tools.utils.i */
public final class C84902i {
    static {
        Covode.recordClassIndex(98896);
    }

    /* renamed from: a */
    public static boolean m145892a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C84896h.f189732b || !C84896h.m145869b(str)) {
            return new File(str).exists();
        }
        return C84896h.m145864a(str, (C84896h.AbstractC84898b) null);
    }

    /* renamed from: a */
    public static boolean m145893a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        m145883a(str2, true);
        return m145897b(str, str2);
    }

    /* renamed from: a */
    public static boolean m145891a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(10236);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m145885a((Closeable) inputStream);
                    m145885a(outputStream);
                    MethodCollector.m26664o(10236);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                m145885a((Closeable) inputStream);
                m145885a(outputStream);
                MethodCollector.m26664o(10236);
                return false;
            } catch (Throwable th) {
                m145885a((Closeable) inputStream);
                m145885a(outputStream);
                MethodCollector.m26664o(10236);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static boolean m145890a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static long m145882a(Context context) {
        return C1756d.m5895b(context);
    }

    /* renamed from: a */
    private static void m145885a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static int m145894b(File file) {
        try {
            return m145903e(file);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m145900c(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    /* renamed from: b */
    public static File m145895b(Context context) {
        File d;
        if (Environment.isExternalStorageEmulated() || (d = m145901d(context)) == null) {
            return m145898c(context);
        }
        m145900c(d);
        return d;
    }

    /* renamed from: c */
    private static File m145898c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: d */
    private static File m145901d(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: b */
    public static boolean m145896b(String str) {
        if (!TextUtils.isEmpty(str) && m145890a()) {
            File file = new File(str);
            if (!file.exists() || !m145902d(file)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m145899c(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m145886a(file2);
                    } else {
                        m145902d(file2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private static int m145903e(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            return 0;
        }
        File[] listFiles = file.listFiles();
        int i = 0;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                i += m145903e(file2);
            } else if (file2.isFile() && file2.exists()) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m145884a(java.io.InputStream r7) {
        /*
            r6 = 10071(0x2757, float:1.4112E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r2 = new char[r0]     // Catch:{ Exception -> 0x0030 }
        L_0x0014:
            r0 = -1
            int r1 = r3.read(r2)     // Catch:{ Exception -> 0x0030 }
            if (r0 == r1) goto L_0x0020
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0014
        L_0x0020:
            r3.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0028:
            java.lang.String r0 = r5.toString()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        L_0x0030:
            r0 = move-exception
            goto L_0x0036
        L_0x0032:
            r1 = move-exception
            goto L_0x003c
        L_0x0034:
            r0 = move-exception
            r3 = r4
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x004a
        L_0x003a:
            r1 = move-exception
            r4 = r3
        L_0x003c:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r1
        L_0x004a:
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84902i.m145884a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: d */
    private static boolean m145902d(File file) {
        MethodCollector.m26663i(10067);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(10067);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(10067);
        return delete;
    }

    /* renamed from: a */
    public static void m145886a(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m145886a(file2);
                        } else {
                            m145902d(file2);
                        }
                    }
                    m145902d(file);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static File m145883a(String str, boolean z) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0096, code lost:
        if (r11 == null) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[SYNTHETIC, Splitter:B:42:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006c A[Catch:{ IOException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0071 A[Catch:{ IOException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0076 A[Catch:{ IOException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b7 A[SYNTHETIC, Splitter:B:80:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00bc A[Catch:{ IOException -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00c1 A[Catch:{ IOException -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00c6 A[Catch:{ IOException -> 0x00ca }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m145897b(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84902i.m145897b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m145887a(File file, AbstractC0189a<File, Boolean> aVar) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m145887a(file2, aVar);
                        } else if (aVar.mo365a(file2).booleanValue()) {
                            m145902d(file2);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m145888a(String str, AbstractC0189a<File, Boolean> aVar) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m145887a(file2, aVar);
                    } else if (aVar.mo365a(file2).booleanValue()) {
                        m145902d(file2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m145889a(String str, C84896h.AbstractC84898b bVar) {
        if (TextUtils.isEmpty(str)) {
            bVar.mo96669a(false);
        } else if (!C84896h.f189732b || !C84896h.m145869b(str)) {
            bVar.mo96669a(Boolean.valueOf(new File(str).exists()));
        } else {
            C84896h.m145864a(str, bVar);
        }
    }
}
