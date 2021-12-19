package com.appsflyer.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.aa */
public final class C2294aa {

    /* renamed from: ǃ */
    private static C2294aa f6968 = new C2294aa();

    /* renamed from: com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m7043x1755f72c(String str, String str2) {
        return 0;
    }

    /* renamed from: com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m7044x1755f72c(String str, String str2, Throwable th) {
        return 0;
    }

    private C2294aa() {
    }

    /* renamed from: ǃ */
    public static C2294aa m7047() {
        return f6968;
    }

    static {
        Covode.recordClassIndex(2546);
    }

    /* renamed from: ι */
    public static File m7050(Context context) {
        return new File(m7042xd9cd8a3a(context), "AFRequestCache");
    }

    /* renamed from: com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m7042xd9cd8a3a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: ı */
    public static C2323j m7046(File file) {
        Throwable th;
        MethodCollector.m26663i(3892);
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[((int) file.length())];
                fileReader.read(cArr);
                C2323j jVar = new C2323j(cArr);
                jVar.f7071 = file.getName();
                try {
                    fileReader.close();
                } catch (IOException unused) {
                }
                MethodCollector.m26664o(3892);
                return jVar;
            } catch (Exception unused2) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception unused3) {
                    }
                }
                MethodCollector.m26664o(3892);
                return null;
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileReader.close();
                } catch (IOException unused4) {
                }
                MethodCollector.m26664o(3892);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            MethodCollector.m26664o(3892);
            throw th;
        }
    }

    /* renamed from: com_appsflyer_internal_aa_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m7045x2008bbe6(File file) {
        MethodCollector.m26663i(4009);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4009);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4009);
        return delete;
    }

    /* renamed from: ǃ */
    public static List<C2323j> m7048(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(m7042xd9cd8a3a(context), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    m7043x1755f72c("AppsFlyer_5.4.1", new StringBuilder("Found cached request").append(file2.getName()).toString());
                    arrayList.add(m7046(file2));
                }
            }
        } catch (Exception unused) {
            m7043x1755f72c("AppsFlyer_5.4.1", "Could not cache request");
        }
        return arrayList;
    }

    /* renamed from: ǃ */
    public static void m7049(String str, Context context) {
        File file = new File(new File(m7042xd9cd8a3a(context), "AFRequestCache"), str);
        m7043x1755f72c("AppsFlyer_5.4.1", new StringBuilder("Deleting ").append(str).append(" from cache").toString());
        if (file.exists()) {
            try {
                m7045x2008bbe6(file);
            } catch (Exception e) {
                m7044x1755f72c("AppsFlyer_5.4.1", new StringBuilder("Could not delete ").append(str).append(" from cache").toString(), e);
            }
        }
    }
}
