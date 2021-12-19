package com.p2082ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37834c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.l */
public final class C81614l implements AbstractC18293d {
    static {
        Covode.recordClassIndex(95011);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (hVar.f43671d.optInt("submit_result") == 1) {
            AbstractC81915c.m141874a(new C37834c());
        }
    }
}
