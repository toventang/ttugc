package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ap */
public final class C7096ap extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7842);
    }

    /* renamed from: a */
    private static Object m15042a(JSONObject jSONObject) {
        String optString = jSONObject.optString("json_str");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        boolean tryShowKoiRedPackageInLive = ((IHostAction) C6193a.m13435a(IHostAction.class)).tryShowKoiRedPackageInLive(optString);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", tryShowKoiRedPackageInLive);
            jSONObject2.put("content", optString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C3868c.m9492a("ttlive_open_koi_packet", 0, jSONObject2);
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        return m15042a(jSONObject);
    }
}
