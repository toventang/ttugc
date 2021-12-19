package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.j */
public class C14663j extends Observable {

    /* renamed from: a */
    private static volatile C14663j f35592a;

    static {
        Covode.recordClassIndex(16758);
    }

    /* renamed from: a */
    public static C14663j m26834a() {
        MethodCollector.m26663i(729);
        if (f35592a == null) {
            synchronized (C14663j.class) {
                try {
                    if (f35592a == null) {
                        f35592a = new C14663j();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(729);
                    throw th;
                }
            }
        }
        C14663j jVar = f35592a;
        MethodCollector.m26664o(729);
        return jVar;
    }

    /* renamed from: a */
    private void m26835a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    /* renamed from: a */
    public final void mo23631a(String str, long j, long j2, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j));
        hashMap.put("received_bytes", Long.valueOf(j2));
        hashMap.put("content_type", str2);
        hashMap.put("request_log", str3);
        m26835a(hashMap);
    }
}
