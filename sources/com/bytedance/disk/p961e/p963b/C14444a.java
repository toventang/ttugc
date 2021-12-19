package com.bytedance.disk.p961e.p963b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1746v.p1747a.C23535b;

/* renamed from: com.bytedance.disk.e.b.a */
public class C14444a {

    /* renamed from: a */
    private static boolean f34947a;

    static {
        Covode.recordClassIndex(16523);
    }

    /* renamed from: a */
    public static void m26379a(Context context) {
        MethodCollector.m26663i(3712);
        if (!f34947a) {
            synchronized (C14444a.class) {
                try {
                    C23535b.m44234a(context);
                    f34947a = true;
                } finally {
                    MethodCollector.m26664o(3712);
                }
            }
            return;
        }
        MethodCollector.m26664o(3712);
    }
}
