package net.openid.appauth;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: net.openid.appauth.p */
public final class C90009p {
    static {
        Covode.recordClassIndex(106180);
    }

    /* renamed from: a */
    public static <T> T m156197a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static String m156201b(String str, Object obj) {
        if (str != null) {
            m156199a(str, obj);
        }
        return str;
    }

    /* renamed from: a */
    public static <T> T m156198a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m156199a(String str, Object obj) {
        m156198a((Object) str, obj);
        m156200a(!TextUtils.isEmpty(str), obj);
        return str;
    }

    /* renamed from: a */
    public static void m156200a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
