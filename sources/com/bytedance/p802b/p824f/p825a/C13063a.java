package com.bytedance.p802b.p824f.p825a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p803a.C12918a;
import com.bytedance.p802b.p803a.p804a.AbstractC12921b;
import com.bytedance.p802b.p803a.p804a.C12920a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.a */
public final class C13063a implements AbstractC12921b {

    /* renamed from: a */
    volatile C12920a f31853a;

    static {
        Covode.recordClassIndex(14899);
    }

    @Override // com.bytedance.p802b.p803a.p804a.AbstractC12921b
    /* renamed from: a */
    public final C12920a mo20769a() {
        return this.f31853a;
    }

    public C13063a() {
        C13065a.m23491a().mo20920b();
        C13065a.m23491a().mo20918a(new AbstractC13069b() {
            /* class com.bytedance.p802b.p824f.p825a.C13063a.C130641 */

            static {
                Covode.recordClassIndex(14900);
            }

            @Override // com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b
            /* renamed from: a */
            public final void mo20917a(JSONObject jSONObject) {
                C13063a aVar = C13063a.this;
                JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("allow_service_name");
                    HashSet hashSet = new HashSet();
                    if (optJSONObject2 != null) {
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            hashSet.add(keys.next());
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("allow_log_type");
                    if (optJSONObject3 != null) {
                        Iterator<String> keys2 = optJSONObject3.keys();
                        while (keys2.hasNext()) {
                            String next = keys2.next();
                            if (optJSONObject3.optInt(next) == 1) {
                                hashSet2.add(next);
                            }
                        }
                    }
                    aVar.f31853a = new C12920a(hashSet, hashSet2);
                    if (C13037a.m23579r()) {
                        C12920a aVar2 = aVar.f31853a;
                    }
                    C12918a.m23181a(aVar.f31853a);
                }
            }
        });
    }
}
