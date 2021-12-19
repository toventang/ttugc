package com.p2082ss.android.ugc.aweme.discover.mob;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.logger.C58945a;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.q */
public final class C42469q {

    /* renamed from: a */
    public static volatile boolean f99001a = true;

    /* renamed from: b */
    public static long f99002b = -1;

    /* renamed from: c */
    public static final C42469q f99003c = new C42469q();

    /* renamed from: d */
    private static final long f99004d = C58945a.C58947b.f134185a.f134181h;

    /* renamed from: e */
    private static final SparseArray<Long> f99005e = new SparseArray<>();

    /* renamed from: f */
    private static final SparseArray<Long> f99006f = new SparseArray<>();

    private C42469q() {
    }

    /* renamed from: a */
    public static void m84883a() {
        if (f99001a) {
            f99002b = System.currentTimeMillis() - f99004d;
        }
    }

    static {
        Covode.recordClassIndex(50418);
    }

    /* renamed from: a */
    public static void m84884a(int i) {
        if (i >= 0) {
            f99005e.put(i, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: c */
    public static long m84886c(int i) {
        Long l = f99006f.get(i);
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static void m84885b(int i) {
        SparseArray<Long> sparseArray;
        Long l;
        if (i >= 0 && (l = (sparseArray = f99005e).get(i)) != null && l.longValue() > 0) {
            sparseArray.put(i, -1L);
            f99006f.put(i, Long.valueOf(System.currentTimeMillis() - l.longValue()));
        }
    }
}
