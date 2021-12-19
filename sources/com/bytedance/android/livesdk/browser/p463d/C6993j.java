package com.bytedance.android.livesdk.browser.p463d;

import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.browser.d.j */
final /* synthetic */ class C6993j implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC6986h f17577a;

    static {
        Covode.recordClassIndex(7732);
    }

    C6993j(View$OnClickListenerC6986h hVar) {
        this.f17577a = hVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        View$OnClickListenerC6986h hVar = this.f17577a;
        C11688a aVar = (C11688a) obj;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put(StringSet.type, "follow");
                jSONObject2.put("user_id", String.valueOf(aVar.f27930a));
                jSONObject2.put("follow_status", aVar.mo18451a());
                jSONObject.put("args", jSONObject2);
                hVar.mo13294a("H5_userStatusChange", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
