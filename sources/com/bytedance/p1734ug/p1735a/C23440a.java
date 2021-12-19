package com.bytedance.p1734ug.p1735a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.a.a */
final class C23440a {

    /* renamed from: a */
    String f55587a;

    /* renamed from: b */
    String f55588b;

    /* renamed from: c */
    int f55589c;

    /* renamed from: d */
    String f55590d;

    /* renamed from: e */
    String f55591e;

    /* renamed from: f */
    int f55592f;

    /* renamed from: g */
    String f55593g;

    /* renamed from: h */
    JSONObject f55594h;

    static {
        Covode.recordClassIndex(27400);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo38208a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("launch_sequence", this.f55589c);
            jSONObject.put("sdk_name", this.f55587a);
            jSONObject.put("sdk_version", this.f55588b);
            jSONObject.put("action_id", this.f55590d);
            jSONObject.put("message", this.f55591e);
            jSONObject.put("result", this.f55592f);
            jSONObject.put("timestamp", this.f55593g);
            jSONObject.put("extra", this.f55594h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return "Action{sdkName='" + this.f55587a + '\'' + ", sdkVersion='" + this.f55588b + '\'' + ", launchSequence=" + this.f55589c + ", actionId='" + this.f55590d + '\'' + ", message='" + this.f55591e + '\'' + ", result=" + this.f55592f + ", timeStamp='" + this.f55593g + '\'' + ", extra=" + this.f55594h + '}';
    }

    C23440a(int i) {
        this.f55589c = i;
    }
}
