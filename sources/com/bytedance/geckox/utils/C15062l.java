package com.bytedance.geckox.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14871a;
import com.bytedance.geckox.p1012b.C14884b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1023j.C14960b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.bytedance.geckox.utils.l */
public final class C15062l {
    static {
        Covode.recordClassIndex(17230);
    }

    /* renamed from: a */
    private static String m27734a(String str) {
        if (str.indexOf("/") == 0) {
            str = str.substring(1);
        }
        if (str.lastIndexOf("/") == str.length() - 1) {
            return str.substring(0, str.lastIndexOf("/"));
        }
        return str;
    }

    /* renamed from: b */
    private static boolean m27737b(File file) {
        MethodCollector.m26663i(5253);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5253);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5253);
        return delete;
    }

    /* renamed from: a */
    public static long[] m27735a(File file) {
        long j;
        long j2;
        long j3;
        C14957a.m27543a("gecko resource info dirs", file);
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.C15062l.C150631 */

            static {
                Covode.recordClassIndex(17231);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        int i = C14871a.m27298a().f36328g;
        if (i >= 3 && listFiles != null && listFiles.length > 1) {
            Long l = null;
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l == null) {
                        l = Long.valueOf(longValue);
                    } else if (longValue > l.longValue()) {
                        l = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
            C14884b.m27328a(file.getAbsolutePath(), l, true, 42);
        }
        long j4 = 0;
        if (listFiles == null || listFiles.length <= 0) {
            j3 = 0;
            j2 = 0;
            j = 0;
        } else {
            long j5 = 0;
            j = 0;
            for (File file3 : listFiles) {
                try {
                    Long.valueOf(file3.getName());
                    File file4 = new File(file3, "res.zip");
                    if (file4.exists()) {
                        if (i >= 2) {
                            m27737b(file4);
                        } else {
                            j4 += C15052e.m27715d(file4);
                        }
                    }
                    File file5 = new File(file3, "res");
                    if (file5.exists()) {
                        j5 += C15052e.m27715d(file5);
                    }
                } catch (Exception unused2) {
                    j += C15052e.m27715d(file3);
                }
            }
            j2 = j4 + j5 + j;
            j3 = j4;
            j4 = j5;
        }
        return new long[]{j4, j, j3, j2};
    }

    /* renamed from: b */
    public static Long m27736b(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && file.exists() && file.isDirectory()) {
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                File file3 = new File(file2.getAbsolutePath(), str2);
                if (!file3.exists()) {
                    return null;
                }
                return C15064m.m27738a(file3);
            } catch (Throwable unused) {
                C14957a.m27542a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m27732a(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && file.exists() && file.isDirectory()) {
            String a = m27734a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                File file3 = new File(absolutePath, a);
                if (!file3.exists()) {
                    return null;
                }
                Long a2 = C15064m.m27738a(file3);
                if (a2 == null) {
                    C14960b.m27549a(str, a, "null", "3", "false", System.currentTimeMillis());
                    return null;
                }
                String str3 = absolutePath + File.separator + a + File.separator + a2 + File.separator + "res";
                C14960b.m27549a(str, a, String.valueOf(a2), "3", "true", System.currentTimeMillis());
                return str3;
            } catch (Throwable unused) {
                C14957a.m27542a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m27733a(File file, String str, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && j != 0 && file.exists() && file.isDirectory()) {
            String a = m27734a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                if (!new File(absolutePath, a).exists()) {
                    return null;
                }
                return absolutePath + File.separator + a + File.separator + j + File.separator + "res";
            } catch (Throwable unused) {
                C14957a.m27542a();
            }
        }
        return null;
    }
}
