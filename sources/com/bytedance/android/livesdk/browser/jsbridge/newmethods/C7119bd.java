package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd */
public final class C7119bd extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7865);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("eventName");
        String optString2 = jSONObject2.optString("labelName");
        JSONObject optJSONObject = jSONObject2.optJSONObject("params");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString3 = optJSONObject.optString(next);
            keys.remove();
            hashMap.put(next, optString3);
        }
        C11199a.m19849a(optString, optString2, hashMap, null);
        return null;
    }
}
