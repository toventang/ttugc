package com.bytedance.ttnet.p1701b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.bytedance.ttnet.b.b */
public class C22931b extends Observable {

    /* renamed from: a */
    public static volatile String f54195a = "";

    /* renamed from: b */
    public static volatile String f54196b = "";

    /* renamed from: c */
    public static volatile String f54197c = "";

    /* renamed from: d */
    private static volatile C22931b f54198d;

    static {
        Covode.recordClassIndex(26839);
    }

    /* renamed from: a */
    public static C22931b m43215a() {
        MethodCollector.m26663i(4735);
        if (f54198d == null) {
            synchronized (C22931b.class) {
                try {
                    if (f54198d == null) {
                        f54198d = new C22931b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4735);
                    throw th;
                }
            }
        }
        C22931b bVar = f54198d;
        MethodCollector.m26664o(4735);
        return bVar;
    }

    /* renamed from: a */
    private void m43216a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    /* renamed from: a */
    public final void mo37252a(String str, String str2, String str3) {
        f54195a = str;
        f54196b = str2;
        f54197c = str3;
        HashMap hashMap = new HashMap();
        hashMap.put("store_idc", str);
        hashMap.put("store_region", str2);
        hashMap.put("region_source", str3);
        m43216a(hashMap);
    }
}
