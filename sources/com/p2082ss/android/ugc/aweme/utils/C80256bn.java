package com.p2082ss.android.ugc.aweme.utils;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.utils.bn */
public final class C80256bn {
    static {
        Covode.recordClassIndex(93524);
    }

    /* renamed from: b */
    public static String m139105b(File... fileArr) {
        return m139104a((double) m139103a(fileArr));
    }

    /* renamed from: a */
    private static String m139104a(double d) {
        return C1764a.m5928a("%.2fMB", new Object[]{Double.valueOf(d / 1048576.0d)});
    }

    /* renamed from: a */
    public static long m139103a(File... fileArr) {
        long j;
        long j2 = 0;
        for (File file : fileArr) {
            try {
                File[] listFiles = file.listFiles();
                for (int i = 0; i < listFiles.length; i++) {
                    if (listFiles[i].isDirectory()) {
                        j = m139103a(listFiles[i]);
                    } else {
                        j = listFiles[i].length();
                    }
                    j2 += j;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return j2;
    }
}
