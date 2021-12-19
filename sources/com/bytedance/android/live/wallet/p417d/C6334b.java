package com.bytedance.android.live.wallet.p417d;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.wallet.AbstractC6366h;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.wallet.d.b */
public final class C6334b {

    /* renamed from: a */
    private JSONObject f15836a;

    static {
        Covode.recordClassIndex(7056);
    }

    /* renamed from: a */
    public final AbstractC6366h mo12387a() {
        JSONObject jSONObject = this.f15836a;
        if (jSONObject == null) {
            return null;
        }
        try {
            long j = jSONObject.getLong("activities_id");
            long j2 = this.f15836a.getLong("item_id");
            if (j > 0 && j2 > 0) {
                return new C6333a(j, j2);
            }
        } catch (JSONException e) {
            C3854a.m9453a(6, "PostChargeNetFactory", e.getMessage());
        }
        try {
            long j3 = this.f15836a.getLong("ward_id");
            long j4 = this.f15836a.getLong("anchor_id");
            if (j3 > 0) {
                return new C6335c(j3, j4);
            }
        } catch (JSONException e2) {
            C3854a.m9453a(6, "PostChargeNetFactory", e2.getMessage());
        }
        return null;
    }

    public C6334b(JSONObject jSONObject) {
        this.f15836a = jSONObject;
    }
}
