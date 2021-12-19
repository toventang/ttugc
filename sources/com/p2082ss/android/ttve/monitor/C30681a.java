package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.common.IESAppLogger;
import com.p2082ss.android.vesdk.C85315al;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.a */
public class C30681a {
    static {
        Covode.recordClassIndex(37251);
    }

    /* renamed from: a */
    public static void m63028a(String str, JSONObject jSONObject, String str2, boolean z) {
        IESAppLogger.sharedInstance().appLogOnEvent(str, jSONObject, str2, z);
        try {
            jSONObject.put("ApiName", str);
            jSONObject.put("ApiParam", jSONObject.toString());
            jSONObject.put("ApiResult", jSONObject.opt("resultCode"));
            IESAppLogger.sharedInstance().appLogOnEvent("vesdk_api", jSONObject, "behavior", z);
        } catch (JSONException e) {
            C85315al.m146636a(C30681a.class, "JSON error", e);
        }
    }
}
