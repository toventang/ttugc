package com.google.android.play.core.common;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.common.c */
public final class C26972c {

    /* renamed from: a */
    private final Map<String, Object> f63858a = new HashMap();

    static {
        Covode.recordClassIndex(32448);
    }

    /* renamed from: a */
    public final synchronized void mo44673a(Bundle bundle) {
        MethodCollector.m26663i(11652);
        for (String str : bundle.keySet()) {
            Object a = m53593a(bundle, str);
            if (a != null && this.f63858a.get(str) == null) {
                this.f63858a.put(str, a);
            }
        }
        MethodCollector.m26664o(11652);
    }

    /* renamed from: a */
    private static Object m53593a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
