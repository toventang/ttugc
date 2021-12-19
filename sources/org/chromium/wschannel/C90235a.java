package org.chromium.wschannel;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: org.chromium.wschannel.a */
public class C90235a extends Observable {

    /* renamed from: a */
    private static volatile C90235a f204974a;

    static {
        Covode.recordClassIndex(106497);
    }

    /* renamed from: a */
    public static C90235a m156959a() {
        MethodCollector.m26663i(3801);
        if (f204974a == null) {
            synchronized (C90235a.class) {
                try {
                    if (f204974a == null) {
                        f204974a = new C90235a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3801);
                    throw th;
                }
            }
        }
        C90235a aVar = f204974a;
        MethodCollector.m26664o(3801);
        return aVar;
    }

    /* renamed from: a */
    private void m156960a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    /* renamed from: a */
    public final void mo145283a(String str, long j, long j2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j));
        hashMap.put("received_bytes", Long.valueOf(j2));
        hashMap.put("is_heartbeat_frame", Boolean.valueOf(z));
        m156960a(hashMap);
    }
}
