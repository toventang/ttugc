package com.google.android.gms.measurement.module;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.measurement.internal.C26381ff;

public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f62623a;

    /* renamed from: b */
    private final C26381ff f62624b;

    static {
        Covode.recordClassIndex(31968);
    }

    private Analytics(C26381ff ffVar) {
        C25565r.m49314a(ffVar);
        this.f62624b = ffVar;
    }

    public static Analytics getInstance(Context context) {
        MethodCollector.m26663i(3673);
        if (f62623a == null) {
            synchronized (Analytics.class) {
                try {
                    if (f62623a == null) {
                        f62623a = new Analytics(C26381ff.m51900a(context, null, null));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3673);
                    throw th;
                }
            }
        }
        Analytics analytics = f62623a;
        MethodCollector.m26664o(3673);
        return analytics;
    }
}
