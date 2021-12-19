package com.bytedance.push.frontier;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.frontier.p1594a.AbstractC21806a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.frontier.a */
public final class C21805a implements AbstractC21806a {
    static {
        Covode.recordClassIndex(25455);
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21806a
    /* renamed from: a */
    public final void mo35488a(long j) {
        m40832a(new JSONObject(), "status", 0);
        m40832a(new JSONObject(), "time_consuming", j);
    }

    /* renamed from: a */
    private static void m40832a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21806a
    /* renamed from: a */
    public final void mo35487a(int i, String str, long j) {
        m40832a(new JSONObject(), "status", (long) i);
        try {
            new JSONObject().put("log", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m40832a(new JSONObject(), "time_consuming", j);
    }
}
