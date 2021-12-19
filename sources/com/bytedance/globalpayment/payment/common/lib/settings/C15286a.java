package com.bytedance.globalpayment.payment.common.lib.settings;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.settings.a */
public class C15286a {
    static {
        Covode.recordClassIndex(17490);
    }

    /* renamed from: a */
    public static JSONObject m28180a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
