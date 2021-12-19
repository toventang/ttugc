package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.gift.p548d.C8800d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;

public class LiveOpenFirstRechargeDialogMethod extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7812);
    }

    public Object invoke(JSONObject jSONObject, C18338g gVar) {
        String str;
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject != null) {
            str = optJSONObject.optString("charge_reason");
        } else {
            str = "";
        }
        C6779a.m14563a().mo13053a(new C8800d(str));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        return jSONObject2;
    }
}
