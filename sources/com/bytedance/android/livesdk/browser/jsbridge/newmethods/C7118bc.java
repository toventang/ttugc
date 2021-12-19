package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc */
public final class C7118bc extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7864);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        C6501b a;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("eventName");
        JSONObject optJSONObject = jSONObject2.optJSONObject("config");
        boolean z = false;
        if (optJSONObject != null) {
            z = optJSONObject.optBoolean("disable_livesdk", false);
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("params");
        Iterator<String> keys = optJSONObject2.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString2 = optJSONObject2.optString(next);
            keys.remove();
            hashMap.put(next, optString2);
        }
        if (z) {
            a = C6501b.C6502a.m13949b(optString);
        } else {
            a = C6501b.C6502a.m13948a(optString);
        }
        a.mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
        return null;
    }
}
