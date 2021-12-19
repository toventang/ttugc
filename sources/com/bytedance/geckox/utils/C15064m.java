package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.m */
public final class C15064m {
    static {
        Covode.recordClassIndex(17232);
    }

    /* renamed from: a */
    public static Long m27738a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.C15064m.C150651 */

            static {
                Covode.recordClassIndex(17233);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        Long l = null;
        if (!(listFiles == null || listFiles.length == 0)) {
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
        }
        return l;
    }

    /* renamed from: b */
    public static List<Long> m27739b(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.C15064m.C150662 */

            static {
                Covode.recordClassIndex(17234);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            try {
                arrayList.add(Long.valueOf(Long.valueOf(file2.getName()).longValue()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
