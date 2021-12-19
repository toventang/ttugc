package com.bytedance.p1435io.prefetcher;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.bytedance.io.prefetcher.IoProfileFile */
public class IoProfileFile {
    static {
        Covode.recordClassIndex(23568);
    }

    public static native int addFileOffsetToPathmap(int i, long j, long j2);

    public static native int addFileToPathmap(int i, String str);

    public static native int closePathmap();

    public static native int openPathmap(String str);

    public static native int writePathmap();

    /* renamed from: a */
    private static boolean m38003a(File file) {
        MethodCollector.m26663i(8433);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8433);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8433);
        return delete;
    }

    /* renamed from: a */
    public static void m38002a(C20062a[] aVarArr, File file, File file2) {
        MethodCollector.m26663i(8285);
        if (file2.exists()) {
            m38003a(file2);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                openPathmap(file2.getAbsolutePath());
                for (int i = 0; i < aVarArr.length; i++) {
                    addFileToPathmap(i, aVarArr[i].f47742d);
                }
                writePathmap();
                MethodCollector.m26664o(8285);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MethodCollector.m26664o(8285);
    }
}
