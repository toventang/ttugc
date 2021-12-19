package com.p2082ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.u */
public final class C81623u implements AbstractC18293d {
    static {
        Covode.recordClassIndex(95020);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        String str = "h5";
        if (!(hVar == null || hVar.f43671d == null)) {
            str = hVar.f43671d.optString("logout_from", str);
        }
        C31575b.m65860b().logout(str, "user_logout");
    }
}
