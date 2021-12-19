package com.bytedance.crash.nativecrash;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.p928f.C13874b;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.util.C14056j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.nativecrash.f */
public final class C13962f {

    /* renamed from: a */
    public static HashMap<String, String> f34016a;

    static {
        Covode.recordClassIndex(16025);
    }

    /* renamed from: a */
    public static String m25278a() {
        return m25277a(C13933m.f33936a) + "/npth/selflib/";
    }

    /* renamed from: a */
    public static File m25277a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static String m25279a(String str) {
        return m25277a(C13933m.f33936a) + "/npth/selflib/lib" + str + ".so";
    }

    /* renamed from: a */
    public static void m25280a(final String str, final String str2) {
        C14019n.m25421b().mo22551a(new Runnable() {
            /* class com.bytedance.crash.nativecrash.C13962f.RunnableC139631 */

            static {
                Covode.recordClassIndex(16026);
            }

            public final void run() {
                if (C13962f.f34016a == null) {
                    C13962f.f34016a = new HashMap<>();
                    File file = new File(C13962f.m25277a(C13933m.f33936a), "/npth/selflib/");
                    String[] list = file.list();
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith(".ver")) {
                                try {
                                    C13962f.f34016a.put(str.substring(0, str.length() - 4), C14056j.m25561a(file.getAbsolutePath() + "/" + str, "\n"));
                                } catch (Throwable th) {
                                    C13849d.m25014a("NPTH_CATCH", th);
                                }
                            } else if (!str.endsWith(".so")) {
                                C14056j.m25574a(new File(file, str));
                            }
                        }
                    }
                }
                String str2 = str;
                if (!str2.equals(C13962f.f34016a.get(str2)) || !new File(C13962f.m25279a(str2)).exists()) {
                    File file2 = new File(C13962f.m25279a(str));
                    file2.getParentFile().mkdirs();
                    if (file2.exists()) {
                        m25281a(file2);
                    }
                    C13933m.f33942g.isDebugMode();
                    if (C13874b.m25098a(C13933m.f33936a, str, file2) == null) {
                        C13962f.f34016a.put(file2.getName(), str2);
                        try {
                            C14056j.m25566a(new File(C13962f.m25277a(C13933m.f33936a) + "/npth/selflib/" + str + ".ver"), str2, false);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }

            /* renamed from: a */
            private static boolean m25281a(File file) {
                MethodCollector.m26663i(1646);
                try {
                    C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                    if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                    }
                    if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                        MethodCollector.m26664o(1646);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.m26664o(1646);
                return delete;
            }
        });
    }
}
