package com.bytedance.liko.p1485c.p1486a;

import android.os.Build;
import android.system.Os;
import com.bytedance.covode.number.Covode;
import com.bytedance.liko.p1485c.C20844b;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.liko.c.a.a */
public final class C20843a {

    /* renamed from: a */
    public static final C20843a f49298a = new C20843a();

    private C20843a() {
    }

    static {
        Covode.recordClassIndex(24419);
    }

    /* renamed from: a */
    public static List<String> m39192a(File file) {
        C89219l.m154719c(file, "");
        if (!file.exists() || !file.isDirectory()) {
            return C89086z.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
            for (File file3 : arrayList) {
                if (file3.exists()) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            C89219l.m154709a((Object) file3, "");
                            String readlink = Os.readlink(file3.getPath());
                            C89219l.m154709a((Object) readlink, "");
                            linkedHashSet.add(readlink);
                        } catch (Throwable unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("readlink ");
                        C89219l.m154709a((Object) file3, "");
                        linkedHashSet.add(C20844b.m39193a(sb.append(file3.getPath()).toString()).get(0));
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return C89086z.INSTANCE;
        }
        return C89070n.m154590j(linkedHashSet);
    }
}
