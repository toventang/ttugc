package com.bytedance.android.live.core.p218f;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.f.x */
public final class C3965x {

    /* renamed from: a */
    public static Map<String, Class> f10867a = new HashMap();

    static {
        Covode.recordClassIndex(4494);
    }

    /* renamed from: a */
    public static Class m9652a(String str) {
        if (f10867a.containsKey(str)) {
            return f10867a.get(str);
        }
        Class<?> cls = null;
        try {
            cls = Class.forName(str);
            f10867a.put(str, cls);
            return cls;
        } catch (Throwable unused) {
            return cls;
        }
    }
}
