package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.segment.n */
public final class C30615n {
    static {
        Covode.recordClassIndex(37150);
    }

    /* renamed from: a */
    public static long m62870a(List<C30607i> list) {
        long j;
        long j2;
        Iterator<C30607i> it = list.iterator();
        long j3 = 0;
        loop0:
        while (true) {
            j = -1;
            j2 = -1;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C30607i next = it.next();
                if (j == -1) {
                    if (next.mo54837a() > 0) {
                        j = next.f73068a;
                        j2 = next.mo54841c();
                    }
                } else if (next.f73068a > j2) {
                    j3 += j2 - j;
                    if (next.mo54837a() > 0) {
                        j = next.f73068a;
                        j2 = next.mo54841c();
                    }
                } else if (next.mo54841c() > j2) {
                    j2 = next.mo54841c();
                }
            }
        }
        if (j < 0 || j2 <= j) {
            return j3;
        }
        return j3 + (j2 - j);
    }
}
