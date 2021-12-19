package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.af */
public final class C7079af extends AbstractC18337f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(7825);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(Object obj, C18338g gVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_teen_mode", ((IHostContext) C6193a.m13435a(IHostContext.class)).isNeedProtectMinor());
        return jSONObject;
    }
}
