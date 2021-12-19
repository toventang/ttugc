package com.bytedance.sdk.p1665b.p1667b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.b.b */
public final class C22530b {

    /* renamed from: a */
    public String f53261a;

    /* renamed from: b */
    public long f53262b;

    static {
        Covode.recordClassIndex(26346);
    }

    /* renamed from: a */
    public final boolean mo36816a() {
        if (this.f53262b != 0 && System.currentTimeMillis() / 1000 > this.f53262b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C22530b m42502a(String str) {
        C22530b bVar = new C22530b();
        JSONObject jSONObject = new JSONObject(str);
        bVar.f53261a = jSONObject.optString("free_flow_id");
        bVar.f53262b = (long) jSONObject.optInt("expiration_time", -1);
        return bVar;
    }
}
