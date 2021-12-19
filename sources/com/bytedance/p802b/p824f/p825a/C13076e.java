package com.bytedance.p802b.p824f.p825a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import com.bytedance.p802b.p827g.C13084b;
import com.bytedance.p802b.p827g.p828a.AbstractC13083b;
import com.bytedance.p802b.p827g.p828a.C13082a;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.e */
public class C13076e implements AbstractC13083b {

    /* renamed from: a */
    C13082a f31876a;

    static {
        Covode.recordClassIndex(14912);
    }

    @Override // com.bytedance.p802b.p827g.p828a.AbstractC13083b
    /* renamed from: a */
    public C13082a mo20831a() {
        return this.f31876a;
    }

    public C13076e() {
        C13065a.m23491a().mo20920b();
        C13065a.m23491a().mo20918a(new AbstractC13069b() {
            /* class com.bytedance.p802b.p824f.p825a.C13076e.C130771 */

            static {
                Covode.recordClassIndex(14913);
            }

            @Override // com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b
            /* renamed from: a */
            public final void mo20917a(JSONObject jSONObject) {
                JSONObject optJSONObject;
                boolean z;
                C13076e eVar = C13076e.this;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("memory")) != null) {
                    long optLong = optJSONObject.optLong("collect_interval", 120);
                    double optDouble = optJSONObject.optDouble("reach_top_memory_rate", 0.8d);
                    boolean z2 = true;
                    if (optJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (optJSONObject.optInt("close_memory_collect") == 1) {
                        z2 = false;
                    }
                    eVar.f31876a = new C13082a(optLong, optDouble, z, z2);
                    C13084b.C13086a.f31905a.mo20926a(eVar.mo20831a());
                }
            }
        });
    }
}
