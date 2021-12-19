package com.google.android.gms.common.p1938c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.C25609k;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.google.android.gms.common.c.a */
public final class C25498a {

    /* renamed from: a */
    private static Context f60478a;

    /* renamed from: b */
    private static Boolean f60479b;

    static {
        Covode.recordClassIndex(30897);
    }

    /* renamed from: a */
    public static synchronized boolean m49168a(Context context) {
        Boolean bool;
        synchronized (C25498a.class) {
            MethodCollector.m26663i(7929);
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            Context context2 = f60478a;
            if (context2 == null || (bool = f60479b) == null || context2 != applicationContext) {
                f60479b = null;
                if (C25609k.m49423e()) {
                    f60479b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f60479b = true;
                    } catch (ClassNotFoundException unused) {
                        f60479b = false;
                    }
                }
                f60478a = applicationContext;
                boolean booleanValue = f60479b.booleanValue();
                MethodCollector.m26664o(7929);
                return booleanValue;
            }
            boolean booleanValue2 = bool.booleanValue();
            MethodCollector.m26664o(7929);
            return booleanValue2;
        }
    }
}
