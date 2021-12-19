package com.facebook.p1814a.p1816b.p1817a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.a.b.a.e */
public class C23887e {

    /* renamed from: a */
    private static final String f56552a = C23887e.class.getCanonicalName();

    /* renamed from: b */
    private static Class<?> f56553b;

    static {
        Covode.recordClassIndex(28008);
    }

    /* renamed from: a */
    public static void m45154a(String str) {
        m45155a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: a */
    public static void m45155a(String str, String str2, String str3) {
        try {
            if (f56553b == null) {
                f56553b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f56553b.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(f56553b, str, str2, str3);
        } catch (Exception unused) {
        }
    }
}
