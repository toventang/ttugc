package com.bytedance.p1782z.p1783a.p1791d;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* renamed from: com.bytedance.z.a.d.c */
public final class C23753c {
    static {
        Covode.recordClassIndex(27858);
    }

    /* renamed from: a */
    public static ArrayList<Long> m44901a(String str) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (File file : new File(str).listFiles(new FilenameFilter() {
            /* class com.bytedance.p1782z.p1783a.p1791d.C23753c.C237541 */

            static {
                Covode.recordClassIndex(27859);
            }

            public final boolean accept(File file, String str) {
                try {
                    Long.parseLong(str);
                    return true;
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
        })) {
            arrayList.add(Long.valueOf(Long.parseLong(file.getName())));
        }
        return arrayList;
    }
}
