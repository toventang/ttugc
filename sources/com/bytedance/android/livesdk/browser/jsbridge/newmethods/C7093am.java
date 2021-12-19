package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.am */
public final class C7093am extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7839);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString(StringSet.type);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        optString.hashCode();
        char c = 65535;
        switch (optString.hashCode()) {
            case -1853762817:
                if (optString.equals("monitorStatusAndDuration")) {
                    c = 0;
                    break;
                }
                break;
            case -858688242:
                if (optString.equals("monitorDuration")) {
                    c = 1;
                    break;
                }
                break;
            case 1821543916:
                if (optString.equals("monitorStatus")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C3868c.m9490a(jSONObject3.optString("service"), jSONObject3.optInt("status"), jSONObject3.optLong("duration"), jSONObject3.optJSONObject("ext_json"));
                return null;
            case 1:
                C3868c.m9494a(jSONObject3.optString("service"), jSONObject3.optLong("duration"), jSONObject3.optJSONObject("ext_json"));
                return null;
            case 2:
                C3868c.m9492a(jSONObject3.optString("service"), jSONObject3.optInt("status"), jSONObject3.optJSONObject("ext_json"));
                return null;
            default:
                return null;
        }
    }
}
