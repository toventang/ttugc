package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.af */
final /* synthetic */ class C18321af implements AbstractC18347m.AbstractC18348a.AbstractC18349a {

    /* renamed from: a */
    private final C18315ad f43825a;

    /* renamed from: b */
    private final String f43826b;

    static {
        Covode.recordClassIndex(20993);
    }

    C18321af(C18315ad adVar, String str) {
        this.f43825a = adVar;
        this.f43826b = str;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a.AbstractC18349a
    /* renamed from: a */
    public final void mo29315a(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        C18315ad adVar = this.f43825a;
        String str2 = this.f43826b;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optInt("status") == 0) {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                if (optJSONObject3 == null) {
                    optJSONObject = null;
                } else {
                    optJSONObject = optJSONObject3.optJSONObject("packages");
                }
                if (optJSONObject == null || TextUtils.isEmpty(str)) {
                    adVar.f43809b.mo29387h().mo29392b("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str2);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(str);
                JSONObject optJSONObject4 = jSONObject2.optJSONObject("data");
                if (optJSONObject4 == null || (optJSONObject2 = optJSONObject4.optJSONObject("packages")) == null) {
                    adVar.f43809b.mo29387h().mo29392b("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str2);
                    return;
                }
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    optJSONObject2.put(next, optJSONObject.getJSONArray(next));
                }
                String jSONObject3 = jSONObject2.toString();
                adVar.f43809b.mo29387h().mo29392b("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", jSONObject3);
                C18315ad.m34059a(jSONObject3, TimeLineEvent.C18303b.f43698N, (String) null);
            }
        } catch (JSONException e) {
            C18344j.m34125b(e);
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43691G, e.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43692H, e.getMessage()).mo29301a(TimeLineEvent.C18303b.f43754c, str2).mo29301a(TimeLineEvent.C18303b.f43756e, str).mo29302a(TimeLineEvent.C18303b.f43731ae, C18364w.f43929f);
        }
    }
}
