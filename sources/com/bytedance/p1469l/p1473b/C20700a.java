package com.bytedance.p1469l.p1473b;

import com.bytedance.android.live.base.p178b.AbstractC2955a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.AbstractC58647j;
import com.p2082ss.android.ugc.aweme.live.livehostimpl.C58707w;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.l.b.a */
public final class C20700a implements AbstractC58647j {
    static {
        Covode.recordClassIndex(24273);
    }

    /* renamed from: com.bytedance.l.b.a$a */
    public static class C20701a {

        /* renamed from: a */
        public static AbstractC58647j f48888a = new C20700a();

        static {
            Covode.recordClassIndex(24274);
        }
    }

    /* renamed from: com.bytedance.l.b.a$b */
    static class C20702b {

        /* renamed from: a */
        public static AbstractC2955a f48889a = new C58707w();

        static {
            Covode.recordClassIndex(24275);
        }
    }

    /* renamed from: a */
    private static JSONObject m38951a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m38952a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2150");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            C3854a.m9453a(6, "LiveOuterSlardarMonitor", e.getMessage());
        }
        return jSONObject2;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58647j
    /* renamed from: a */
    public final void mo34111a(String str, int i, Map<String, Object> map) {
        if (C20702b.f48889a != null) {
            JSONObject a = m38951a(map);
            if (C20702b.f48889a != null) {
                C20702b.f48889a.mo7730a(str, i, m38952a(a));
            }
        }
    }
}
