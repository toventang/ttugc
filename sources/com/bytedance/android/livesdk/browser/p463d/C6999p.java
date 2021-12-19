package com.bytedance.android.livesdk.browser.p463d;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.browser.d.p */
final /* synthetic */ class C6999p implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC6986h f17583a;

    static {
        Covode.recordClassIndex(7738);
    }

    C6999p(View$OnClickListenerC6986h hVar) {
        this.f17583a = hVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        View$OnClickListenerC6986h hVar = this.f17583a;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "1");
            jSONObject.put("args", jSONObject2);
            hVar.mo13294a("H5_loginStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
