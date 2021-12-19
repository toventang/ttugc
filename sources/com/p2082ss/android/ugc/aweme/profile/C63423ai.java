package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ai */
public final class C63423ai {
    static {
        Covode.recordClassIndex(74714);
    }

    /* renamed from: a */
    public static void m115002a(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", exc.toString());
            jSONObject.put("success", 1);
            jSONObject.put("errorResponse", jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C33830n.m70668a("aweme_profile_recyclerview_crash_log", jSONObject);
    }
}
