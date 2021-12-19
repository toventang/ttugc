package com.bytedance.geckox.statistic.p1035a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.statistic.a.a */
public class C15018a {

    /* renamed from: c */
    private static C15018a f36687c;

    /* renamed from: a */
    public C14827k f36688a;

    /* renamed from: b */
    public AtomicBoolean f36689b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17181);
    }

    private C15018a() {
    }

    /* renamed from: a */
    public static C15018a m27636a() {
        MethodCollector.m26663i(3940);
        if (f36687c == null) {
            synchronized (C15018a.class) {
                try {
                    if (f36687c == null) {
                        f36687c = new C15018a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3940);
                    throw th;
                }
            }
        }
        C15018a aVar = f36687c;
        MethodCollector.m26664o(3940);
        return aVar;
    }

    /* renamed from: a */
    public final void mo24303a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.f36689b.get()) {
            C14827k kVar = this.f36688a;
            if (kVar != null) {
                kVar.mo23859a(str, jSONObject, jSONObject2, (JSONObject) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Please init MonitorManager first");
    }
}
