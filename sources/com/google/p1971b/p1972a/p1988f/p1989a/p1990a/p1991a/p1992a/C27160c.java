package com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.b.a.f.a.a.a.a.c */
public final class C27160c {
    static {
        Covode.recordClassIndex(32740);
    }

    /* renamed from: a */
    public static RuntimeException m53986a(Throwable th) {
        Throwable th2 = (Throwable) C27159b.m53980a(th);
        m53987a(th2, Error.class);
        m53987a(th2, RuntimeException.class);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    private static <X extends Throwable> void m53987a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }
}
