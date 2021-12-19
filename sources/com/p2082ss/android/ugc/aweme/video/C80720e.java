package com.p2082ss.android.ugc.aweme.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Objects;
import p078c.p080b.C1756d;

/* renamed from: com.ss.android.ugc.aweme.video.e */
public final class C80720e {

    /* renamed from: a */
    public static Context f180465a;

    static {
        Covode.recordClassIndex(94007);
    }

    /* renamed from: a */
    public static boolean m139922a(String str, String str2) {
        MethodCollector.m26663i(14225);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14225);
            return true;
        }
        try {
            FileWriter fileWriter = new FileWriter(str, false);
            fileWriter.write(str2);
            fileWriter.flush();
            fileWriter.close();
            MethodCollector.m26664o(14225);
            return true;
        } catch (Exception unused) {
            MethodCollector.m26664o(14225);
            return false;
        }
    }

    /* renamed from: c */
    public static String m139929c() {
        return m139928c(f180465a).getPath();
    }

    /* renamed from: e */
    public static boolean m139939e() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static long m139940f() {
        if (!m139935d()) {
            return 0;
        }
        return C1756d.m5895b(C17867d.m33078a());
    }

    /* renamed from: a */
    public static File m139914a() {
        if (!m139935d() || !m139939e()) {
            return null;
        }
        File file = new File(m139924b(f180465a), "video");
        m139920a(file);
        file.getAbsolutePath();
        return file;
    }

    /* renamed from: b */
    public static File m139923b() {
        if (!m139935d() || !m139939e()) {
            return null;
        }
        File file = new File(m139924b(f180465a), "picture");
        m139920a(file);
        file.getAbsolutePath();
        return file;
    }

    /* renamed from: d */
    public static boolean m139935d() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return m139944h(f180465a);
        }
    }

    /* renamed from: a */
    public static void m139919a(Context context) {
        Objects.requireNonNull(context);
        f180465a = context;
    }

    /* renamed from: a */
    public static void m139920a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static File m139924b(Context context) {
        File d = m139934d(context);
        if (d == null) {
            return m139937e(context);
        }
        return d;
    }

    /* renamed from: b */
    public static boolean m139927b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: c */
    public static File m139928c(Context context) {
        File f;
        if (Environment.isExternalStorageEmulated() || (f = m139943g(context)) == null) {
            f = m139941f(context);
        } else {
            m139920a(f);
        }
        f.getAbsolutePath();
        return f;
    }

    /* renamed from: d */
    private static File m139934d(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: e */
    private static File m139937e(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: g */
    private static File m139943g(Context context) {
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

    /* renamed from: c */
    public static boolean m139931c(String str) {
        if (!TextUtils.isEmpty(str) && m139939e()) {
            File file = new File(str);
            if (!file.exists() || !m139930c(file)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m139938e(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m139925b(file2);
                    } else {
                        m139930c(file2);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private static File m139941f(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: b */
    public static void m139925b(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m139925b(file2);
                        } else {
                            m139930c(file2);
                        }
                    }
                    m139930c(file);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private static boolean m139930c(File file) {
        MethodCollector.m26663i(14215);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14215);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14215);
        return delete;
    }

    /* renamed from: d */
    public static long m139933d(String str) {
        long j;
        long j2 = 0;
        try {
            if (m139939e()) {
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            File[] listFiles = file.listFiles();
                            if (listFiles == null) {
                                return 0;
                            }
                            for (File file2 : listFiles) {
                                if (file2.isFile()) {
                                    j = file2.length();
                                } else if (file2.isDirectory()) {
                                    j = m139933d(file2.getAbsolutePath());
                                }
                                j2 += j;
                            }
                            return j2;
                        }
                    }
                }
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045 A[SYNTHETIC, Splitter:B:30:0x0045] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m139942f(java.lang.String r7) {
        /*
            r6 = 14232(0x3798, float:1.9943E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 0
            if (r0 == 0) goto L_0x0010
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        L_0x0010:
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0042, all -> 0x0038 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x0042, all -> 0x0038 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r3.<init>()     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r0]     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
        L_0x001e:
            int r1 = r4.read(r2)     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r0 = -1
            if (r1 == r0) goto L_0x002a
            r0 = 0
            r3.append(r2, r0, r1)     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            goto L_0x001e
        L_0x002a:
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        L_0x0035:
            r0 = move-exception
            r5 = r4
            goto L_0x0039
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r5.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        L_0x0042:
            r4 = r5
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.C80720e.m139942f(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static File m139916a(String str) {
        if (!m139935d() || !m139939e() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(m139924b(f180465a), str);
        m139920a(file);
        file.getAbsolutePath();
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[Catch:{ Exception -> 0x0095 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m139944h(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.C80720e.m139944h(android.content.Context):boolean");
    }

    /* renamed from: b */
    public static void m139926b(String str, String str2) {
        m139921a(str, str2, true);
    }

    /* renamed from: a */
    public static File m139915a(File file, String str) {
        if (!m139935d() || !m139939e() || TextUtils.isEmpty(str)) {
            return null;
        }
        if (file == null) {
            file = m139924b(f180465a);
        }
        File file2 = new File(file, str);
        m139920a(file2);
        file2.getAbsolutePath();
        return file2;
    }

    /* renamed from: c */
    public static boolean m139932c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        m139917a(str2, true);
        return m139936d(str, str2);
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
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m139936d(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.C80720e.m139936d(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static File m139917a(String str, boolean z) {
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

    /* renamed from: a */
    private static Object m139918a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(14235);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(14235);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m139921a(String str, String str2, boolean z) {
        File[] listFiles;
        if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                File file2 = new File(str2);
                if (!file2.exists() || !file2.isDirectory()) {
                    file2.mkdirs();
                }
                for (File file3 : listFiles) {
                    if (!z || !file3.isDirectory()) {
                        m139936d(file3.getPath(), str2 + file3.getName());
                    } else {
                        m139921a(file3.getPath(), str2 + file3.getName() + File.separator, z);
                    }
                }
            }
        }
    }
}
