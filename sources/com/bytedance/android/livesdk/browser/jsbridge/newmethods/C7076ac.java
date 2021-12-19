package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ac */
final /* synthetic */ class C7076ac implements AbstractC88434g {

    /* renamed from: a */
    private final String f17692a;

    /* renamed from: b */
    private final JSONObject f17693b;

    /* renamed from: c */
    private final JSONObject f17694c;

    /* renamed from: d */
    private final JSONObject f17695d;

    static {
        Covode.recordClassIndex(7822);
    }

    C7076ac(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f17692a = str;
        this.f17693b = jSONObject;
        this.f17694c = jSONObject2;
        this.f17695d = jSONObject3;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        String str = this.f17692a;
        JSONObject jSONObject = this.f17693b;
        JSONObject jSONObject2 = this.f17694c;
        JSONObject jSONObject3 = this.f17695d;
        if (TextUtils.equals((String) obj, UGCMonitor.TYPE_POST)) {
            return C7074ab.m15033a(str, jSONObject, jSONObject2, jSONObject3);
        }
        return Base64.encodeToString(C5809h.m12739a().mo11584a(C7074ab.m15032a(str, jSONObject2), C7074ab.m15034a(jSONObject), null).mo18908a().f28196e, 2);
    }
}
