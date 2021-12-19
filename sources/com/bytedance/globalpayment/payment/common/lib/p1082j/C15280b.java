package com.bytedance.globalpayment.payment.common.lib.p1082j;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.j.b */
public final class C15280b {
    static {
        Covode.recordClassIndex(17480);
    }

    /* renamed from: a */
    public static Map<String, String> m28153a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
