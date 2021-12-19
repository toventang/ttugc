package com.bytedance.sdk.p1665b.p1668c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1676f.C22586c;
import com.p2082ss.ugc.live.sdk.message.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.c.b */
public final class C22540b {
    static {
        Covode.recordClassIndex(26356);
    }

    /* renamed from: a */
    public static JSONObject m42537a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("carrier", C22586c.m42622a(C22518a.m42479c(), false));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("params_for_special", "uc_login");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m42538a(String str, JSONObject jSONObject) {
        if (C22518a.m42482f() != null) {
            C22518a.m42482f().mo36794a(str, jSONObject);
        }
        m42540b(str, jSONObject);
    }

    /* renamed from: b */
    private static void m42540b(String str, JSONObject jSONObject) {
        C22539a.m42533a("event:" + str + "; content:" + jSONObject.toString());
    }

    /* renamed from: a */
    public static void m42539a(boolean z, String str, int i, String str2) {
        int i2;
        JSONObject a = m42537a();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            a.put("result", i2);
            if (!z) {
                a.put("error_code", i);
                a.put("error_msg", str2);
            } else {
                a.put("flow_id", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m42538a("mobile_flow_international_get_free_id_result", a);
    }

    /* renamed from: b */
    public static void m42541b(boolean z, String str, int i, String str2) {
        int i2;
        JSONObject a = m42537a();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            a.put("result", i2);
            if (!z) {
                a.put("error_code", i);
                a.put("error_msg", str2);
            } else {
                a.put("flow_info", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m42538a("mobile_flow_international_get_flow_info_result", a);
    }
}
