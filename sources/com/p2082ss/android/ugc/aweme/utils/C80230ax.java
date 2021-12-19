package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;

/* renamed from: com.ss.android.ugc.aweme.utils.ax */
public final class C80230ax {

    /* renamed from: a */
    private static volatile boolean f179706a;

    /* renamed from: b */
    private static volatile boolean f179707b;

    /* renamed from: c */
    private static Object f179708c = new Object();

    static {
        Covode.recordClassIndex(93498);
    }

    /* renamed from: a */
    public static boolean m139066a(Context context) {
        m139067b(context);
        return f179706a;
    }

    /* renamed from: b */
    public static void m139067b(Context context) {
        boolean z;
        MethodCollector.m26663i(8779);
        if (f179707b || context == null) {
            MethodCollector.m26664o(8779);
            return;
        }
        synchronized (f179708c) {
            try {
                if (!f179707b) {
                    Keva repo = Keva.getRepo("keva_new_user_repo_".concat(String.valueOf(C58227a.m105171b(context))));
                    if (!repo.getBoolean("is_new_user", true) || !C58945a.m108290b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f179706a = z;
                    f179707b = true;
                    repo.storeBoolean("is_new_user", false);
                }
            } finally {
                MethodCollector.m26664o(8779);
            }
        }
    }
}
