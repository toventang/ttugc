package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.jsbridge.p470a.C7036c;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ah */
public final class C7084ah extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7830);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        C6779a.m14563a().mo13053a(new C7036c(jSONObject.getLong("gift_id")));
        return null;
    }
}
