package com.p2082ss.android.ugc.aweme.lancet.p3384a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3682s.C67247c;

/* renamed from: com.ss.android.ugc.aweme.lancet.a.a */
public final class C58003a {

    /* renamed from: a */
    public static Application f132199a;

    /* renamed from: b */
    public static Context f132200b;

    /* renamed from: c */
    public static boolean f132201c;

    static {
        Covode.recordClassIndex(68038);
    }

    /* renamed from: a */
    public static void m104825a(Application application, Context context) {
        f132199a = application;
        f132200b = context;
        f132201c = C67247c.m119172a(context, "optimize_cold_boot_hook_app_context");
    }
}
