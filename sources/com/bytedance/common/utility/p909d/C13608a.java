package com.bytedance.common.utility.p909d;

import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import java.io.File;
import java.util.Objects;

/* renamed from: com.bytedance.common.utility.d.a */
public final class C13608a {

    /* renamed from: a */
    private static final byte[] f33085a = {71, 73, 70, 56, 55, 97};

    /* renamed from: b */
    private static final byte[] f33086b = {71, 73, 70, 56, 57, 97};

    /* renamed from: c */
    private static final byte[] f33087c = {-1, -40, -1};

    /* renamed from: d */
    private static final byte[] f33088d = {-119, 80, 78, 71, C86745e.f195623b, 10, 26, 10};

    static {
        Covode.recordClassIndex(15635);
    }

    /* renamed from: b */
    private static File m24449b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static void m24445a(String str) {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m24450b(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    m24446a(listFiles[i]);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m24450b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m24450b(listFiles[i].getAbsolutePath());
                } else {
                    m24446a(listFiles[i]);
                }
            }
            m24446a(file);
        }
    }

    /* renamed from: a */
    public static String m24444a(Context context) {
        Objects.requireNonNull(context, "Context is NUll");
        String str = null;
        try {
            if (m24449b(context) != null) {
                str = m24449b(context).getPath();
            } else {
                File dir = context.getDir("/data/data/" + context.getPackageName() + "/files/", 0);
                if (dir != null) {
                    str = dir.getPath();
                }
            }
        } catch (Throwable unused) {
        }
        if (!C13627m.m24498a(str)) {
            return str;
        }
        throw new NullPointerException("Cannot Create Files Dir");
    }

    /* renamed from: a */
    private static boolean m24446a(File file) {
        MethodCollector.m26663i(12347);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12347);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12347);
        return delete;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:26|27|28|32|33|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:30|29|40|41|42|43|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if (0 == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0071, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x006c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m24447a(java.io.InputStream r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p909d.C13608a.m24447a(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        if (r3 == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC, Splitter:B:35:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24448a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 12070(0x2f26, float:1.6914E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            boolean r0 = com.bytedance.common.utility.C13627m.m24498a(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.bytedance.common.utility.C13627m.m24498a(r6)
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.bytedance.common.utility.C13627m.m24498a(r7)
            if (r0 == 0) goto L_0x001c
        L_0x0018:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        L_0x001c:
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0038 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0038 }
            boolean r1 = m24447a(r2, r6, r7)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            r2.close()     // Catch:{ Exception -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        L_0x0032:
            r1 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x0035:
            r0 = move-exception
            r3 = r2
            goto L_0x0039
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            r0.printStackTrace()     // Catch:{ all -> 0x003d }
            goto L_0x004c
        L_0x003d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0048
        L_0x0040:
            r3.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x004c:
            if (r3 == 0) goto L_0x0056
            r3.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0056:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p909d.C13608a.m24448a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
