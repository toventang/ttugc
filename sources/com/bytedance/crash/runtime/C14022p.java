package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.nativecrash.C13964g;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14047d;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Date;

/* renamed from: com.bytedance.crash.runtime.p */
public final class C14022p {

    /* renamed from: a */
    private static File f34173a;

    static {
        Covode.recordClassIndex(16087);
    }

    /* renamed from: a */
    public static File m25425a() {
        if (f34173a == null) {
            if (C14044b.m25520c(C13933m.f33936a) == null) {
                return null;
            }
            f34173a = new File(C13964g.m25290b(), "procHistory.txt");
            C14019n.m25421b().mo22552a(new Runnable() {
                /* class com.bytedance.crash.runtime.C14022p.RunnableC140231 */

                static {
                    Covode.recordClassIndex(16088);
                }

                public final void run() {
                    File file;
                    String[] list;
                    if (C14044b.m25518b(C13933m.f33936a) && (list = (file = new File(C14069r.m25642j(C13933m.f33936a), "npth/ProcessTrack/")).list()) != null && list.length > 25) {
                        Arrays.sort(list);
                        for (int i = 0; i < list.length - 25; i++) {
                            C14056j.m25574a(new File(file, list[i]));
                        }
                    }
                }
            }, 15000);
        }
        return f34173a;
    }

    /* renamed from: b */
    public static C14056j.C14058b m25429b(long j) {
        File[] listFiles = m25426a(j).listFiles(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.C14022p.C140242 */

            static {
                Covode.recordClassIndex(16089);
            }

            public final boolean accept(File file, String str) {
                return str.endsWith(".txt");
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        return new C14056j.C14058b(listFiles, true);
    }

    /* renamed from: a */
    public static File m25426a(long j) {
        return new File(C14069r.m25642j(C13933m.f33936a), "npth/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    /* renamed from: a */
    public static File m25427a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            str = C13933m.f33936a.getPackageName();
        }
        return new File(m25426a(j), str.replace(':', '_') + ".txt");
    }

    /* renamed from: a */
    public static void m25428a(String str, String str2) {
        try {
            File a = m25425a();
            if (a != null) {
                C14056j.m25566a(a, str + ' ' + str2 + ' ' + C14047d.m25529a().format(new Date(System.currentTimeMillis())) + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
