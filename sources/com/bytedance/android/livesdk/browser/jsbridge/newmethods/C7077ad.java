package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad */
public final class C7077ad extends AbstractC18337f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(7823);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(Object obj, C18338g gVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> b = ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18888b("");
        if (b == null) {
            return jSONObject;
        }
        for (Map.Entry<String, String> entry : b.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("token", jSONObject2);
        return jSONObject;
    }
}
