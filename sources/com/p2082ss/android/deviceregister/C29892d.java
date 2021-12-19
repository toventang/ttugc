package com.p2082ss.android.deviceregister;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.deviceregister.p2139d.C29896c;

/* renamed from: com.ss.android.deviceregister.d */
public class C29892d {

    /* renamed from: a */
    private static volatile Pair<String, Boolean> f71330a;

    static {
        Covode.recordClassIndex(36302);
    }

    /* renamed from: a */
    public static Pair<String, Boolean> m60259a(Context context) {
        MethodCollector.m26663i(549);
        if (f71330a == null) {
            synchronized (C29892d.class) {
                try {
                    if (f71330a == null) {
                        f71330a = C29896c.m60264b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(549);
                    throw th;
                }
            }
        }
        Pair<String, Boolean> pair = f71330a;
        MethodCollector.m26664o(549);
        return pair;
    }
}
