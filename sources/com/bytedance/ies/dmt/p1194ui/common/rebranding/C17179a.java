package com.bytedance.ies.dmt.p1194ui.common.rebranding;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a */
public final class C17179a {

    /* renamed from: a */
    private static final HashMap<Class, C17180a> f40924a = new HashMap<>();

    static {
        Covode.recordClassIndex(19638);
    }

    /* renamed from: a */
    public static void m31714a() {
        MethodCollector.m26663i(13362);
        HashMap<Class, C17180a> hashMap = f40924a;
        synchronized (hashMap) {
            try {
                for (Map.Entry<Class, C17180a> entry : hashMap.entrySet()) {
                    C17180a value = entry.getValue();
                    if (value != null) {
                        value.f40925a = false;
                        value.f40926b = -1;
                    }
                }
            } finally {
                MethodCollector.m26664o(13362);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a$a */
    public static class C17180a {

        /* renamed from: a */
        public boolean f40925a = true;

        /* renamed from: b */
        public int f40926b = -1;

        static {
            Covode.recordClassIndex(19639);
        }

        public C17180a(int i) {
            this.f40926b = i;
        }
    }

    /* renamed from: a */
    public static C17180a m31713a(Class cls) {
        C17180a aVar;
        MethodCollector.m26663i(13366);
        HashMap<Class, C17180a> hashMap = f40924a;
        synchronized (hashMap) {
            try {
                aVar = hashMap.get(cls);
            } finally {
                MethodCollector.m26664o(13366);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m31715a(Class cls, C17180a aVar) {
        MethodCollector.m26663i(13364);
        HashMap<Class, C17180a> hashMap = f40924a;
        synchronized (hashMap) {
            try {
                hashMap.put(cls, aVar);
            } finally {
                MethodCollector.m26664o(13364);
            }
        }
    }
}
