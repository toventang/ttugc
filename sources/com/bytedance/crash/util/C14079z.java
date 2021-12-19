package com.bytedance.crash.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.bytedance.crash.util.z */
public final class C14079z {

    /* renamed from: a */
    private static Map<String, Object> f34259a;

    static {
        Covode.recordClassIndex(16146);
    }

    /* renamed from: a */
    public static Map<String, Object> m25673a() {
        m25674b();
        return f34259a;
    }

    /* renamed from: b */
    private static void m25674b() {
        MethodCollector.m26663i(771);
        Context context = C13933m.f33936a;
        if (f34259a == null) {
            f34259a = new HashMap();
            try {
                Properties properties = new Properties();
                properties.load(context.getAssets().open("slardar.properties"));
                for (Map.Entry entry : properties.entrySet()) {
                    f34259a.put(String.valueOf(entry.getKey()), entry.getValue());
                }
                MethodCollector.m26664o(771);
            } catch (Throwable unused) {
                MethodCollector.m26664o(771);
            }
        } else {
            MethodCollector.m26664o(771);
        }
    }
}
