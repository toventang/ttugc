package com.p2082ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.y */
public final class C85616y {
    static {
        Covode.recordClassIndex(99800);
    }

    /* renamed from: a */
    public static void m147700a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m147702a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m147706c(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m147701a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                m147703a(file);
            }
        }
    }

    /* renamed from: b */
    public static boolean m147705b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: d */
    public static boolean m147707d(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("content:") || str.startsWith("file:")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m147703a(File file) {
        MethodCollector.m26663i(3747);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3747);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3747);
        return delete;
    }

    /* renamed from: a */
    public static boolean m147704a(String str, String str2) {
        MethodCollector.m26663i(3757);
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            MethodCollector.m26664o(3757);
            return false;
        }
        boolean renameTo = file.renameTo(file2);
        MethodCollector.m26664o(3757);
        return renameTo;
    }
}
