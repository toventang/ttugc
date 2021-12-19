package com.bytedance.android.livesdkapi.p696i;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.livesdkapi.i.a */
public final class C11820a {

    /* renamed from: a */
    public static boolean f28176a = true;

    static {
        Covode.recordClassIndex(13518);
    }

    /* renamed from: a */
    public static Class<?> m20823a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m20824a(Context context) {
        Method method;
        m20825a(context, "live-app-core-sdk", 0);
        m20825a(context, "ttlive_live_user", 0);
        m20825a(context, "live_fans_comment_guide", 0);
        m20825a(context, "live_fans_club_tips", 0);
        m20825a(context, "extra_group", 0);
        m20825a(context, "pay_controll", 4);
        m20825a(context, "ttlive_sdk_shared_pref_cache", 4);
        Class<?> a = m20823a("com.bytedance.android.livesdk.i18n.I18nDbManager");
        if (a != null) {
            if (context != null) {
                try {
                    method = a.getDeclaredMethod("prepareInit", Context.class);
                    method.setAccessible(true);
                    method.invoke(null, context);
                } catch (Exception unused) {
                    return;
                }
            } else {
                method = a.getDeclaredMethod("prepareInit", new Class[0]);
                method.setAccessible(true);
                method.invoke(null, new Object[0]);
            }
            method.setAccessible(false);
        }
    }

    /* renamed from: a */
    private static void m20825a(Context context, String str, int i) {
        if (context != null && str.length() > 0) {
            C34822d.m71158a(context, str, i);
        }
    }
}
