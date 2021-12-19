package com.bytedance.p802b.p841k;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.b.k.i */
public final class C13133i {

    /* renamed from: a */
    private static Handler f31982a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(14969);
    }

    /* renamed from: a */
    public static void m23618a(Runnable runnable) {
        f31982a.post(runnable);
    }

    /* renamed from: a */
    public static byte[] m23619a(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
