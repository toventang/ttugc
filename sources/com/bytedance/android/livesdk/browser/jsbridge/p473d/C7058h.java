package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.h */
public final class C7058h implements AbstractC18293d {
    static {
        Covode.recordClassIndex(7797);
    }

    /* renamed from: a */
    private static int m15016a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            C11688a aVar = (C11688a) C11116a.m19746a(jSONObject.toString(), (Type) C11688a.class);
            if (aVar == null) {
                return 1;
            }
            aVar.f27935f = C11688a.EnumC11689a.FromWeb;
            C11115u.m19743a().mo17915b().mo13156a(aVar);
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        int i;
        if ("follow".equals(hVar.f43671d.getString(StringSet.type))) {
            i = m15016a(hVar.f43671d.getJSONObject("args"));
        } else {
            i = 0;
        }
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
    }
}
