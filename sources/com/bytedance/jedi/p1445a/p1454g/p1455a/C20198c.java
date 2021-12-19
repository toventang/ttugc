package com.bytedance.jedi.p1445a.p1454g.p1455a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.bytedance.jedi.a.g.a.c */
public final class C20198c {
    static {
        Covode.recordClassIndex(23706);
    }

    /* renamed from: a */
    public static <T> T m38190a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static <T> T m38191a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m38194b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m38192a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m38193a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(C20199d.m38196a(str, Long.valueOf(j)));
        }
    }
}
