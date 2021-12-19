package com.bytedance.common.utility.p909d;

import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.common.utility.d.b */
public final class C13609b {
    static {
        Covode.recordClassIndex(15636);
    }

    /* renamed from: a */
    public static void m24451a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m24454b(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m24452a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                m24453a(file);
            }
        }
    }

    /* renamed from: d */
    public static long m24456d(String str) {
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return 0;
            }
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m24453a(File file) {
        MethodCollector.m26663i(14240);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14240);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14240);
        return delete;
    }

    /* renamed from: c */
    public static long m24455c(String str) {
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
                    length += m24455c(file2.getAbsolutePath());
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
}
