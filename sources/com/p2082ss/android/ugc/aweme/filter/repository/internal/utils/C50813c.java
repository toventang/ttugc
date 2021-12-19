package com.p2082ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.utils.c */
public final class C50813c {
    static {
        Covode.recordClassIndex(59984);
    }

    /* renamed from: a */
    public static final String m95170a(String str) {
        File[] listFiles;
        C89219l.m154721d(str, "");
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return "";
        }
        String str2 = "";
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory()) {
                String name = file2.getName();
                File[] listFiles2 = file2.listFiles();
                if (listFiles2 != null) {
                    int length = listFiles2.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        File file3 = listFiles2[i];
                        if (file3 != null) {
                            if (file3.isFile() && C89219l.m154714a((Object) file3.getName(), (Object) (name + ".png"))) {
                                str2 = file3.getAbsolutePath();
                                C89219l.m154716b(str2, "");
                                break;
                            } else if (file3.isDirectory()) {
                                name = file3.getName();
                                File[] listFiles3 = file3.listFiles();
                                if (listFiles3 != null) {
                                    int length2 = listFiles3.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length2) {
                                            break;
                                        }
                                        File file4 = listFiles3[i2];
                                        if (file4 != null && file4.isFile() && C89219l.m154714a((Object) file4.getName(), (Object) (name + ".png"))) {
                                            str2 = file4.getAbsolutePath();
                                            C89219l.m154716b(str2, "");
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
            }
        }
        return str2;
    }
}
