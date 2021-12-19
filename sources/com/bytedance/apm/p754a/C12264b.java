package com.bytedance.apm.p754a;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p789q.C12598r;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b */
public final class C12264b {
    static {
        Covode.recordClassIndex(14000);
    }

    /* renamed from: a */
    public static void m22042a(String str) {
        if (C12397c.m22288e()) {
            String[] strArr = new String[2];
        }
    }

    /* renamed from: a */
    public static JSONObject m22041a(boolean z, int i, Exception exc, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("success", z);
            jSONObject.put("code", i);
            if (exc != null) {
                jSONObject.put("exception", exc.getMessage() + C12598r.m22723b(exc));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
