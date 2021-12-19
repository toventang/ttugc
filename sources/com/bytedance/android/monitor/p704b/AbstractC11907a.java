package com.bytedance.android.monitor.p704b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b.a */
public abstract class AbstractC11907a implements AbstractC11912f {
    static {
        Covode.recordClassIndex(13633);
    }

    /* renamed from: a */
    public abstract void mo19117a(JSONObject jSONObject);

    @Override // com.bytedance.android.monitor.p704b.AbstractC11912f
    /* renamed from: a */
    public JSONObject mo19116a() {
        JSONObject jSONObject = new JSONObject();
        mo19117a(jSONObject);
        return jSONObject;
    }
}
