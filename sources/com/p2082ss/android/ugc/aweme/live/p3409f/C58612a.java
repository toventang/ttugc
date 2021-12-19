package com.p2082ss.android.ugc.aweme.live.p3409f;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.live.f.a */
public final class C58612a {
    static {
        Covode.recordClassIndex(68909);
    }

    /* renamed from: a */
    public static String m107734a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    File[] listFiles2 = file2.listFiles();
                    for (File file3 : listFiles2) {
                        if (file3.getName().endsWith(".png")) {
                            return file3.getAbsolutePath();
                        }
                    }
                    continue;
                }
            }
        }
        return str;
    }
}
