package com.bytedance.android.monitor.p714l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.bytedance.android.monitor.l.c */
public final class C11949c {
    static {
        Covode.recordClassIndex(13675);
    }

    /* renamed from: b */
    private static boolean m21092b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m21090a() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m21088a(File file) {
        if (file.exists()) {
            m21094c(file);
        }
    }

    /* renamed from: d */
    private static void m21095d(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static boolean m21093b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            try {
                if (!file.exists()) {
                    return file.createNewFile();
                }
                return true;
            } catch (IOException unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m21094c(File file) {
        MethodCollector.m26663i(2096);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2096);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2096);
        return delete;
    }

    /* renamed from: a */
    public static File m21087a(Context context, String str) {
        if (context == null || !m21090a() || !m21092b()) {
            return null;
        }
        File b = m21091b(context, str);
        m21095d(b);
        return b;
    }

    /* renamed from: b */
    private static File m21091b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: a */
    public static synchronized void m21089a(String str, String str2) {
        Throwable th;
        synchronized (C11949c.class) {
            MethodCollector.m26663i(1975);
            if (str == null) {
                MethodCollector.m26664o(1975);
            } else if (str2 == null) {
                MethodCollector.m26664o(1975);
            } else {
                File file = new File(str);
                FileWriter fileWriter = null;
                try {
                    if (!file.exists()) {
                        m21093b(file);
                    }
                    FileWriter fileWriter2 = new FileWriter(file, true);
                    try {
                        fileWriter2.write(str2);
                        fileWriter2.flush();
                        try {
                            fileWriter2.close();
                            MethodCollector.m26664o(1975);
                        } catch (IOException e) {
                            e.printStackTrace();
                            MethodCollector.m26664o(1975);
                        }
                    } catch (IOException unused) {
                        fileWriter = fileWriter2;
                        try {
                            fileWriter.close();
                            MethodCollector.m26664o(1975);
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            MethodCollector.m26664o(1975);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileWriter2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        MethodCollector.m26664o(1975);
                        throw th;
                    }
                } catch (IOException unused2) {
                    if (0 == 0) {
                        MethodCollector.m26664o(1975);
                        return;
                    }
                    fileWriter.close();
                    MethodCollector.m26664o(1975);
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.m26664o(1975);
                    throw th;
                }
            }
        }
    }
}
