package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.o */
public final class C71850o {
    static {
        Covode.recordClassIndex(84399);
    }

    /* renamed from: a */
    public static final List<C71848m> m126875a(String str) {
        int parseInt;
        if (!C84902i.m145892a(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = new File(str).listFiles();
        for (File file : listFiles) {
            C89219l.m154716b(file, "");
            if (!file.isHidden()) {
                String name = file.getName();
                C89219l.m154716b(name, "");
                if (C89361p.m154874b(name, "dynamic_watermark_", false)) {
                    String path = file.getPath();
                    C89219l.m154716b(path, "");
                    if (C89361p.m154876c(path, ".png", false)) {
                        String name2 = file.getName();
                        C89219l.m154716b(name2, "");
                        String h = C89361p.m154936h(C89361p.m154938i(name2, "dynamic_watermark_"), ".png");
                        if (C89361p.m154863e(h) == null) {
                            parseInt = 0;
                        } else {
                            parseInt = Integer.parseInt(h);
                        }
                        String path2 = file.getPath();
                        C89219l.m154716b(path2, "");
                        arrayList.add(new C71848m(parseInt, path2));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C71851a());
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.o$a */
    public static final class C71851a<T> implements Comparator {
        static {
            Covode.recordClassIndex(84400);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.f161017a), Integer.valueOf(t2.f161017a));
        }
    }
}
