package com.p2082ss.android.p2133d;

import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.Objects;

/* renamed from: com.ss.android.d.e */
public final class C29857e {
    static {
        Covode.recordClassIndex(36265);
    }

    /* renamed from: b */
    private static File m60168b(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: b */
    private static void m60169b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m60169b(listFiles[i].getAbsolutePath());
                } else {
                    m60167a(listFiles[i]);
                }
            }
            m60167a(file);
        }
    }

    /* renamed from: a */
    public static String m60165a(Context context) {
        Objects.requireNonNull(context, "Context is NUll");
        String str = null;
        try {
            if (m60168b(context) != null) {
                str = m60168b(context).getPath();
            } else {
                File dir = context.getDir("/data/data/" + context.getPackageName() + "/cache/", 0);
                if (dir != null) {
                    str = dir.getPath();
                }
            }
        } catch (Throwable unused) {
        }
        if (!C13627m.m24498a(str)) {
            return str;
        }
        throw new NullPointerException("Cannot Create Cache Dir");
    }

    /* renamed from: a */
    public static void m60166a(String str) {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m60169b(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    m60167a(listFiles[i]);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m60167a(File file) {
        MethodCollector.m26663i(12915);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12915);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12915);
        return delete;
    }

    /* renamed from: a */
    public static long m60164a(File file, boolean z) {
        long j;
        long j2 = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    j = m60164a(file2, z);
                } else if (file2.isFile()) {
                    j = file2.length();
                }
                j2 += j;
            }
            return j2;
        } catch (Throwable unused) {
        }
    }
}
