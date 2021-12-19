package com.bytedance.push.p1598i;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.p1593f.C21804c;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.LocalFrequencySettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.i.e */
public final class C21842e {

    /* renamed from: a */
    private static Map<Integer, C21804c> f51746a;

    static {
        Covode.recordClassIndex(25494);
    }

    /* renamed from: b */
    private static void m40917b(Context context) {
        if (f51746a == null) {
            List<C21804c> j = ((LocalFrequencySettings) C21895h.m41120a(context, LocalFrequencySettings.class)).mo35593j();
            if (j == null) {
                f51746a = new HashMap();
                return;
            }
            HashMap hashMap = new HashMap();
            for (C21804c cVar : j) {
                if (cVar != null) {
                    hashMap.put(Integer.valueOf(cVar.f51679e), cVar);
                }
            }
            f51746a = hashMap;
        }
    }

    /* renamed from: a */
    public static synchronized Map<Integer, C21804c> m40915a(Context context) {
        synchronized (C21842e.class) {
            MethodCollector.m26663i(3636);
            m40917b(context);
            Map<Integer, C21804c> map = f51746a;
            if (map == null) {
                MethodCollector.m26664o(3636);
                return null;
            }
            Map<Integer, C21804c> unmodifiableMap = Collections.unmodifiableMap(map);
            MethodCollector.m26664o(3636);
            return unmodifiableMap;
        }
    }

    /* renamed from: a */
    static synchronized C21804c m40914a(Context context, int i) {
        synchronized (C21842e.class) {
            MethodCollector.m26663i(3506);
            m40917b(context);
            Map<Integer, C21804c> map = f51746a;
            if (map == null) {
                MethodCollector.m26664o(3506);
                return null;
            }
            C21804c cVar = map.get(Integer.valueOf(i));
            MethodCollector.m26664o(3506);
            return cVar;
        }
    }

    /* renamed from: a */
    static synchronized void m40916a(Context context, C21804c cVar) {
        synchronized (C21842e.class) {
            MethodCollector.m26663i(3633);
            m40917b(context);
            Map<Integer, C21804c> map = f51746a;
            if (map == null) {
                MethodCollector.m26664o(3633);
                return;
            }
            map.put(Integer.valueOf(cVar.f51679e), cVar);
            ((LocalFrequencySettings) C21895h.m41120a(context, LocalFrequencySettings.class)).mo35577a(new ArrayList(f51746a.values()));
            MethodCollector.m26664o(3633);
        }
    }
}
