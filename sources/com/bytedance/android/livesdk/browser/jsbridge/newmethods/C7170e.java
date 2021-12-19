package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.e */
public final class C7170e extends AbstractC18337f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(7916);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(Object obj, C18338g gVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> b = C5809h.m12739a().mo11588b();
        for (String str : b.keySet()) {
            String str2 = b.get(str);
            if (!C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
                jSONObject.put(str, str2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> b2 = ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18888b("");
        if (b2 != null) {
            for (Map.Entry<String, String> entry : b2.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("tt_token", jSONObject2);
        return jSONObject;
    }
}
