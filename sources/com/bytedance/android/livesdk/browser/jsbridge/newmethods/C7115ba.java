package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ba */
public final class C7115ba extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7861);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        SharedPreferences a;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("key");
        String optString2 = jSONObject2.optString("data");
        if (gVar.f43859a == null || (a = C34822d.m71158a(gVar.f43859a, "webcast_jsb_local_data", 4)) == null) {
            return null;
        }
        a.edit().putString(optString, optString2).commit();
        return null;
    }
}
