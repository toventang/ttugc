package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p602p.C10074a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.be */
public final class C7120be extends AbstractC18334e<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7866);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        int i = jSONObject.getInt("status");
        C10074a aVar = new C10074a();
        aVar.f24483a = i;
        C6779a.m14563a().mo13053a(aVar);
    }
}
