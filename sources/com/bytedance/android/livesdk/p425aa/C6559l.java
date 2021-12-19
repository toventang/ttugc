package com.bytedance.android.livesdk.p425aa;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.aa.l */
public final class C6559l {

    /* renamed from: a */
    public JSONObject f16376a = new JSONObject();

    /* renamed from: b */
    private JSONObject f16377b = new JSONObject();

    static {
        Covode.recordClassIndex(7295);
    }

    /* renamed from: a */
    public final void mo12693a(String str, int i) {
        C3868c.m9493a(str, i, this.f16377b, this.f16376a);
    }

    /* renamed from: a */
    public final C6559l mo12692a(String str, Object obj) {
        try {
            this.f16376a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }
}
