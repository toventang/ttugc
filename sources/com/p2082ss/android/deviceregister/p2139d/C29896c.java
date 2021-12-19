package com.p2082ss.android.deviceregister.p2139d;

import android.content.Context;
import android.provider.Settings;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1930a.p1931a.C25248a;

/* renamed from: com.ss.android.deviceregister.d.c */
public final class C29896c {
    static {
        Covode.recordClassIndex(36306);
    }

    /* renamed from: a */
    public static String m60263a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static Pair<String, Boolean> m60264b(Context context) {
        String str = null;
        boolean z = false;
        try {
            C25248a.C25249a a = C25248a.m48579a(context);
            if (a != null) {
                z = a.f59858b;
                str = a.f59857a;
            }
        } catch (Throwable th) {
            if (!(th instanceof ClassNotFoundException) && !(th instanceof NoClassDefFoundError)) {
                return null;
            }
        }
        return new Pair<>(str, Boolean.valueOf(z));
    }
}
