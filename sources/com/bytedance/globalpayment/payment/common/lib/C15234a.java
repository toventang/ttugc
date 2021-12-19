package com.bytedance.globalpayment.payment.common.lib;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.a */
public class C15234a {
    static {
        Covode.recordClassIndex(17434);
    }

    public void add(JSONObject jSONObject, String str, float f) {
        try {
            jSONObject.put(str, (double) f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void add(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void add(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void add(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
