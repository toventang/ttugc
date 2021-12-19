package com.bytedance.android.livesdk.feed.p534j;

import com.bytedance.android.live.core.p213c.AbstractC3855b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.feed.j.a */
public final class C8633a extends AbstractC3855b {

    /* renamed from: a */
    private static C8633a f21349a;

    static {
        Covode.recordClassIndex(9490);
    }

    private C8633a() {
    }

    /* renamed from: b */
    public static synchronized C8633a m16888b() {
        C8633a aVar;
        synchronized (C8633a.class) {
            MethodCollector.m26663i(1015);
            if (f21349a == null) {
                f21349a = new C8633a();
            }
            aVar = f21349a;
            MethodCollector.m26664o(1015);
        }
        return aVar;
    }

    @Override // com.bytedance.android.live.core.p213c.AbstractC3855b
    /* renamed from: a */
    public final JSONObject mo9214a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", String.valueOf(((IHostUser) C6193a.m13435a(IHostUser.class)).getCurUserId()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
