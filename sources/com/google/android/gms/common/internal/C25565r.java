package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.C25616r;
import java.util.Objects;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C25565r {
    static {
        Covode.recordClassIndex(30968);
    }

    /* renamed from: a */
    public static <T> T m49314a(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    /* renamed from: b */
    public static void m49323b(String str) {
        if (!C25616r.m49450a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: c */
    public static void m49326c(String str) {
        if (C25616r.m49450a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static String m49316a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: b */
    public static void m49324b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m49318a(Handler handler) {
        String str;
        if (Looper.myLooper() != null) {
            str = Looper.myLooper().getThread().getName();
        } else {
            str = "null current looper";
        }
        String name = handler.getLooper().getThread().getName();
        m49319a(handler, new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length()).append("Must be called on ").append(name).append(" thread, but got ").append(str).append(".").toString());
    }

    /* renamed from: a */
    public static void m49320a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m49315a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m49317a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m49325b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m49319a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m49321a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m49322a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(C1764a.m5928a(str, objArr));
        }
    }
}
