package com.aweme.storage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.aweme.storage.e */
public final class C2367e {

    /* renamed from: a */
    private static volatile int f7200a;

    static {
        Covode.recordClassIndex(2645);
    }

    /* renamed from: a */
    public static long m7200a(Context context) {
        try {
            File d = m7209d(context);
            if (d == null) {
                return 0;
            }
            return d.getTotalSpace();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m7204b(Context context) {
        try {
            File d = m7209d(context);
            if (d == null) {
                return 0;
            }
            return d.getFreeSpace();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m7207c(Context context) {
        if (f7200a <= 0) {
            return false;
        }
        long j = ((long) f7200a) * 1024 * 1024;
        if (m7203a(context, j) || m7206b(context, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static File m7209d(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: a */
    public static long m7201a(File file) {
        long j = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isFile() && file2.exists()) {
                        j += file2.length();
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: b */
    public static void m7205b(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        m7208c(file);
                        return;
                    }
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m7205b(file2);
                        } else {
                            m7208c(file2);
                        }
                    }
                    m7208c(file);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static long m7202a(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += m7202a(file2.getAbsolutePath());
                } catch (StackOverflowError e) {
                    e.printStackTrace();
                    return 0;
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                    return 0;
                }
            }
        }
        return length;
    }

    /* renamed from: c */
    private static boolean m7208c(File file) {
        MethodCollector.m26663i(1573);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1573);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1573);
        return delete;
    }

    /* renamed from: a */
    private static boolean m7203a(Context context, long j) {
        File d;
        if (context == null || (d = m7209d(context)) == null || d.getFreeSpace() >= j) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m7206b(Context context, long j) {
        if (context == null) {
            return false;
        }
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = context.getCacheDir();
        }
        File file = C58016d.f132221b;
        if (file != null && file.getFreeSpace() < j) {
            return true;
        }
        return false;
    }
}
