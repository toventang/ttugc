package com.bytedance.android.monitorV2.p740l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.bytedance.android.monitorV2.l.d */
public final class C12127d {
    static {
        Covode.recordClassIndex(13856);
    }

    /* renamed from: b */
    private static boolean m21642b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m21640a() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m21638a(File file) {
        if (file.exists()) {
            m21644c(file);
        }
    }

    /* renamed from: d */
    private static void m21645d(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static boolean m21643b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            try {
                if (!file.exists()) {
                    return file.createNewFile();
                }
                return true;
            } catch (IOException unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m21644c(File file) {
        MethodCollector.m26663i(352);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(352);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(352);
        return delete;
    }

    /* renamed from: a */
    public static File m21637a(Context context, String str) {
        if (context == null || !m21640a() || !m21642b()) {
            return null;
        }
        File b = m21641b(context, str);
        m21645d(b);
        return b;
    }

    /* renamed from: b */
    private static File m21641b(Context context, String str) {
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
    public static synchronized void m21639a(String str, String str2) {
        Throwable th;
        synchronized (C12127d.class) {
            MethodCollector.m26663i(344);
            if (str == null) {
                MethodCollector.m26664o(344);
            } else if (str2 == null) {
                MethodCollector.m26664o(344);
            } else {
                File file = new File(str);
                FileWriter fileWriter = null;
                try {
                    if (!file.exists()) {
                        m21643b(file);
                    }
                    FileWriter fileWriter2 = new FileWriter(file, true);
                    try {
                        fileWriter2.write(str2);
                        fileWriter2.flush();
                        try {
                            fileWriter2.close();
                            MethodCollector.m26664o(344);
                        } catch (IOException e) {
                            e.printStackTrace();
                            MethodCollector.m26664o(344);
                        }
                    } catch (IOException unused) {
                        fileWriter = fileWriter2;
                        try {
                            fileWriter.close();
                            MethodCollector.m26664o(344);
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            MethodCollector.m26664o(344);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileWriter2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        MethodCollector.m26664o(344);
                        throw th;
                    }
                } catch (IOException unused2) {
                    if (0 == 0) {
                        MethodCollector.m26664o(344);
                        return;
                    }
                    fileWriter.close();
                    MethodCollector.m26664o(344);
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.m26664o(344);
                    throw th;
                }
            }
        }
    }
}
