package com.bytedance.android.livesdk.p425aa;

import com.bytedance.android.live.core.p213c.AbstractC3855b;
import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.aa.i */
public final class C6555i extends AbstractC3855b {

    /* renamed from: a */
    private static C6555i f16373a;

    static {
        Covode.recordClassIndex(7291);
    }

    private C6555i() {
    }

    /* renamed from: b */
    public static synchronized C6555i m14021b() {
        C6555i iVar;
        synchronized (C6555i.class) {
            MethodCollector.m26663i(11751);
            if (f16373a == null) {
                f16373a = new C6555i();
            }
            iVar = f16373a;
            MethodCollector.m26664o(11751);
        }
        return iVar;
    }

    @Override // com.bytedance.android.live.core.p213c.AbstractC3855b
    /* renamed from: a */
    public final JSONObject mo9214a() {
        long j;
        C6523c cVar;
        Long l;
        JSONObject jSONObject = new JSONObject();
        String valueOf = String.valueOf(C6544e.m13995i());
        String valueOf2 = String.valueOf(C6544e.m13994h());
        C6529h n = C6544e.m14000n();
        if (n == null || (cVar = n.f16312d) == null || (l = cVar.f16271i) == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        try {
            jSONObject.put("user_id", String.valueOf(j));
            jSONObject.put("room_id", valueOf);
            jSONObject.put("anchor_id", valueOf2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
