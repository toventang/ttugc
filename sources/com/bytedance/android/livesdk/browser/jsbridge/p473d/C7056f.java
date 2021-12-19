package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import com.bytedance.android.livesdk.gift.p548d.C8804h;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.f */
public final class C7056f implements AbstractC18293d {
    static {
        Covode.recordClassIndex(7795);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        String str;
        JSONObject optJSONObject = hVar.f43671d.optJSONObject("args");
        if (optJSONObject != null) {
            str = optJSONObject.optString("charge_reason");
        } else {
            str = "";
        }
        C8804h hVar2 = new C8804h();
        hVar2.f21684a = str;
        C6779a.m14563a().mo13053a(hVar2);
        jSONObject.put("code", 1);
    }
}
