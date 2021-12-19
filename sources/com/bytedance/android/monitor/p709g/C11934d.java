package com.bytedance.android.monitor.p709g;

import com.bytedance.android.monitor.p703a.AbstractC11902c;
import com.bytedance.android.monitor.p720m.C11999a;
import com.bytedance.android.monitor.p720m.C12000b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.g.d */
public class C11934d extends AbstractC11931a implements AbstractC11902c {

    /* renamed from: a */
    private static volatile AbstractC11902c f28551a;

    /* renamed from: b */
    private Map<String, JSONObject> f28552b = new HashMap();

    static {
        Covode.recordClassIndex(13660);
    }

    private C11934d() {
    }

    /* renamed from: b */
    public static AbstractC11902c m21048b() {
        MethodCollector.m26663i(9332);
        if (f28551a == null) {
            synchronized (C11934d.class) {
                try {
                    if (f28551a == null) {
                        f28551a = new C11934d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9332);
                    throw th;
                }
            }
        }
        AbstractC11902c cVar = f28551a;
        MethodCollector.m26664o(9332);
        return cVar;
    }

    @Override // com.bytedance.android.monitor.p703a.AbstractC11902c
    /* renamed from: a */
    public final void mo19110a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (mo19148a() && str.length() != 0) {
            String[] a = C12000b.m21196a(str);
            C11999a.m21194a(jSONObject, "url", (Object) str);
            C11999a.m21194a(jSONObject, "host", (Object) a[0]);
            C11999a.m21194a(jSONObject, "path", (Object) a[1]);
            String str3 = a[0];
            String str4 = a[1];
            C11999a.m21195a(jSONObject3, "event_name", str2);
            JSONObject jSONObject4 = new JSONObject();
            C11999a.m21194a(jSONObject4, "client_category", jSONObject);
            C11999a.m21194a(jSONObject4, "client_metric", jSONObject2);
            C11999a.m21194a(jSONObject4, "client_extra", jSONObject3);
            C11999a.m21195a(jSONObject4, "ev_type", "custom");
            C11999a.m21195a(jSONObject4, "url", str);
            C11999a.m21195a(jSONObject4, "host", str3);
            C11999a.m21195a(jSONObject4, "path", str4);
            C11999a.m21194a(jSONObject4, "platform", (Object) 0);
            mo19149b("custom", jSONObject4);
        }
    }
}
