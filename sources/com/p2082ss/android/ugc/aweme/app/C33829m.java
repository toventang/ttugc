package com.p2082ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.app.m */
public final class C33829m {
    static {
        Covode.recordClassIndex(40729);
    }

    /* renamed from: a */
    public static void m69189a(Intent intent, Context context, int i) {
        if (i == 5) {
            intent.setClassName(context, "com.bytedance.android.aweme.lite.home.HomeActivity");
        } else {
            intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        }
    }
}
