package com.bytedance.bdlocation.utils;

import com.bytedance.bdlocation.p849d.C13166b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.utils.g */
public final class C13235g {
    static {
        Covode.recordClassIndex(15196);
    }

    /* renamed from: a */
    public static void m23792a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("upload_source", str);
            jSONObject.put("status", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C13166b.m23696a("region_location_new_submit", jSONObject);
    }
}
