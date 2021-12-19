package com.bytedance.bdlocation.traceroute.p855a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.bdlocation.traceroute.a.a */
public class C13214a {

    /* renamed from: b */
    private static C13214a f32304b;

    /* renamed from: a */
    public SharedPreferences f32305a;

    static {
        Covode.recordClassIndex(15164);
    }

    private C13214a(Context context) {
        this.f32305a = C34822d.m71158a(context, "TraceRouterCache", 0);
    }

    /* renamed from: a */
    public static C13214a m23759a(Context context) {
        MethodCollector.m26663i(7027);
        if (f32304b == null) {
            synchronized (C13214a.class) {
                try {
                    if (f32304b == null) {
                        f32304b = new C13214a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7027);
                    throw th;
                }
            }
        }
        C13214a aVar = f32304b;
        MethodCollector.m26664o(7027);
        return aVar;
    }
}
