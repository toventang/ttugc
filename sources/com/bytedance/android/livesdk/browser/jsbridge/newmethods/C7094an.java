package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.event.C8458k;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.an */
public final class C7094an extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7840);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString(StringSet.type);
        JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        optString.hashCode();
        if (!optString.equals("recharge") || !TextUtils.equals(optJSONObject.optString("status"), "1")) {
            return null;
        }
        C6779a.m14563a().mo13053a(new C8458k(1, true));
        return null;
    }
}
