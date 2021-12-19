package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ae */
public final class C7078ae extends AbstractC18337f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(7824);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(Object obj, C18338g gVar) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(gVar, "");
        JSONObject jSONObject = new JSONObject();
        AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a, "");
        jSONObject.put("status", ((AbstractC4409b) a).getLinkStatus4H5());
        jSONObject.put("code", 1);
        return jSONObject;
    }
}
