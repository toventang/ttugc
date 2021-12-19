package com.adm.push;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.adm.push.a */
public class C1881a {

    /* renamed from: b */
    private static C1881a f5702b;

    /* renamed from: a */
    final ADM f5703a;

    static {
        Covode.recordClassIndex(2055);
    }

    private C1881a(Context context) {
        this.f5703a = new ADM(context);
    }

    /* renamed from: a */
    public static C1881a m6061a(Context context) {
        MethodCollector.m26663i(13335);
        if (f5702b == null) {
            synchronized (C1881a.class) {
                try {
                    if (f5702b == null) {
                        f5702b = new C1881a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13335);
                    throw th;
                }
            }
        }
        C1881a aVar = f5702b;
        MethodCollector.m26664o(13335);
        return aVar;
    }
}
