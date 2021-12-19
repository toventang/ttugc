package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.firebase.components.u */
public final class C27734u {
    static {
        Covode.recordClassIndex(33317);
    }

    /* renamed from: a */
    public static <T> T m55451a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static <T> T m55452a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static void m55453a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m55454b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
