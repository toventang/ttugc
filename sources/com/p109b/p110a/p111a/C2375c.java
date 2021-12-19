package com.p109b.p110a.p111a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.b.a.a.c */
public final class C2375c {

    /* renamed from: a */
    public static volatile boolean f7218a;

    static {
        Covode.recordClassIndex(2653);
    }

    /* renamed from: a */
    public static void m7217a(Context context) {
        if (context != null && C2374b.f7216a) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C2373a());
                f7218a = true;
            } catch (Throwable unused) {
            }
        }
    }
}
