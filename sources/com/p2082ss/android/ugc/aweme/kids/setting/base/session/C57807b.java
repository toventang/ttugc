package com.p2082ss.android.ugc.aweme.kids.setting.base.session;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.session.b */
public class C57807b {

    /* renamed from: b */
    private static C57807b f131845b;

    /* renamed from: a */
    HashMap<String, C57806a> f131846a = new HashMap<>();

    static {
        Covode.recordClassIndex(67811);
    }

    private C57807b() {
    }

    /* renamed from: a */
    public static C57807b m104534a() {
        MethodCollector.m26663i(12743);
        if (f131845b == null) {
            synchronized (C57807b.class) {
                try {
                    if (f131845b == null) {
                        f131845b = new C57807b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12743);
                    throw th;
                }
            }
        }
        C57807b bVar = f131845b;
        MethodCollector.m26664o(12743);
        return bVar;
    }

    /* renamed from: a */
    public final synchronized void mo95143a(C57806a aVar) {
        MethodCollector.m26663i(12746);
        this.f131846a.values().remove(aVar);
        MethodCollector.m26664o(12746);
    }

    /* renamed from: b */
    public final synchronized <T> C57806a<T> mo95144b(String str) {
        C57806a<T> aVar;
        MethodCollector.m26663i(12745);
        aVar = this.f131846a.get(str);
        MethodCollector.m26664o(12745);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized <T> C57806a<T> mo95142a(String str) {
        C57806a<T> aVar;
        MethodCollector.m26663i(12744);
        if (!this.f131846a.containsKey(str)) {
            this.f131846a.put(str, new C57806a());
        }
        aVar = this.f131846a.get(str);
        MethodCollector.m26664o(12744);
        return aVar;
    }
}
