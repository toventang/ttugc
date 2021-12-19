package com.bytedance.globalpayment.iap.common.ability.p1061h;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15281c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.h.a */
public class C15156a {

    /* renamed from: a */
    private static final String f36989a = C15156a.class.getCanonicalName();

    /* renamed from: b */
    private static SharedPreferences f36990b;

    static {
        Covode.recordClassIndex(17324);
    }

    /* renamed from: a */
    public static SharedPreferences m27877a(Context context) {
        if (f36990b == null) {
            f36990b = C34822d.m71158a(context, "payload_prefs", 0);
        }
        return f36990b;
    }

    /* renamed from: c */
    private static String m27883c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 0));
    }

    /* renamed from: d */
    private static String m27884d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.encode(str.getBytes(), 0));
    }

    /* renamed from: b */
    public static Pair<String, Pair<String, String>> m27882b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Pair.create("", Pair.create("", ""));
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return Pair.create(jSONObject.optString("userId"), Pair.create(jSONObject.optString("orderId"), jSONObject.optString("merchantId")));
        } catch (JSONException e) {
            C15253a.m28071a().mo24705e();
            e.getLocalizedMessage();
            return Pair.create("", Pair.create("", ""));
        }
    }

    /* renamed from: a */
    public static JSONObject m27880a(String str) {
        SharedPreferences a = m27877a(C15253a.m28071a().mo24709i().mo24713b());
        C15253a.m28071a().mo24705e();
        String string = a.getString(C15281c.m28154a("key_google_pay_".concat(String.valueOf(str))), "");
        if (string == null) {
            C15253a.m28071a().mo24705e();
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            String optString = jSONObject.optString(C15281c.m28154a("order_id"));
            String optString2 = jSONObject.optString(C15281c.m28154a("merchant_id"));
            String optString3 = jSONObject.optString(C15281c.m28154a("user_id"));
            String optString4 = jSONObject.optString(C15281c.m28154a("extra_payload"));
            String c = m27883c(optString);
            String c2 = m27883c(optString2);
            String c3 = m27883c(optString3);
            String c4 = m27883c(optString4);
            jSONObject.put("order_id", c);
            jSONObject.put("merchant_id", c2);
            jSONObject.put("user_id", c3);
            jSONObject.put("extra_payload", c4);
            return jSONObject;
        } catch (JSONException unused) {
            C15253a.m28071a().mo24705e();
            return null;
        }
    }

    /* renamed from: a */
    public static void m27881a(Context context, String str) {
        m27877a(context).edit().remove(C15281c.m28154a(str)).apply();
    }

    /* renamed from: a */
    public static String m27878a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C15281c.m28154a("order_id"), m27884d(str));
            jSONObject.put(C15281c.m28154a("merchant_id"), m27884d(str2));
            jSONObject.put(C15281c.m28154a("user_id"), m27884d(str3));
            jSONObject.put(C15281c.m28154a("extra_payload"), m27884d(str4));
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m27879a(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku_id", str);
            jSONObject.put("merchant_id", str2);
            jSONObject.put("user_id", str3);
            jSONObject.put("is_subscription", z);
            jSONObject.put("is_new_subscription", z2);
            jSONObject.put("extra_payload", str4);
            return jSONObject.toString();
        } catch (JSONException e) {
            C15253a.m28071a().mo24705e();
            e.getLocalizedMessage();
            return null;
        }
    }
}
