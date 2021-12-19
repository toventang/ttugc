package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at */
public final class C7102at extends AbstractC18337f<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(7848);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        String optString = jSONObject2.optString("schema");
        AbstractC11816k kVar = (AbstractC11816k) C6193a.m13435a(AbstractC11816k.class);
        if (kVar != null) {
            kVar.mo18886a(optString, gVar.f43859a);
        }
        return new JSONObject();
    }
}
