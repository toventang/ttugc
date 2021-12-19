package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.medialib.model.c */
public class C30018c {

    /* renamed from: a */
    public long f71642a;

    /* renamed from: b */
    public double f71643b;

    static {
        Covode.recordClassIndex(36497);
    }

    /* renamed from: a */
    public static int m60569a(List<? extends C30018c> list) {
        int i = 0;
        if (list != null && list.size() > 0) {
            for (C30018c cVar : list) {
                long j = cVar.f71642a;
                double d = cVar.f71643b;
                double d2 = (double) j;
                Double.isNaN(d2);
                i = (int) (((long) i) + ((long) ((d2 * 1.0d) / d)));
            }
        }
        return i;
    }

    public C30018c(long j, double d) {
        this.f71642a = j;
        this.f71643b = d;
    }
}
