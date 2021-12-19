package com.bytedance.sdk.p1625a.p1649i;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22290c;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22510c;
import com.p2082ss.android.account.C29351f;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.i.a */
public final class C22455a {
    static {
        Covode.recordClassIndex(26271);
    }

    /* renamed from: a */
    public static void m42376a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        jSONObject.put("passport-sdk-version", 19);
        jSONObject.put("result", 0);
        m42377b(str, jSONObject);
    }

    /* renamed from: b */
    public static void m42377b(String str, JSONObject jSONObject) {
        AbstractC22510c e = C29351f.m58781a().mo52213e();
        if (jSONObject != null) {
            try {
                if (!jSONObject.has("passport-sdk-version")) {
                    jSONObject.put("passport-sdk-version", 19);
                }
                jSONObject.put("params_for_special", "uc_login");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        e.mo36784a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m42371a(String str, String str2, String str3, C22289b bVar) {
        m42372a(str, str2, str3, bVar, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m42375a(String str, Throwable th, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("urlpath", new URI(str).getPath().toLowerCase());
            if (th != null) {
                jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
                jSONObject.put("exception_msg", th.getMessage());
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("exception_msg", str2);
            }
            jSONObject.put("errorCode", i);
            jSONObject.put("passport-sdk-version", 19);
            jSONObject.put("sdkVersion", 2);
            m42377b("passport_net_err", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m42372a(String str, String str2, String str3, C22289b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONException e;
        if (bVar != null) {
            String str4 = bVar.f52717f;
            if (TextUtils.isEmpty(str4)) {
                str4 = bVar.f52718g;
            }
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("logid", bVar.f52712a);
                    if (bVar instanceof C22290c) {
                        String str5 = ((C22290c) bVar).f52722k;
                        if (!TextUtils.isEmpty(str5)) {
                            jSONObject2.put("logout_from", str5);
                        }
                    }
                } catch (JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                    m42374a(str, bVar.f52714c, str2, str3, bVar.f52713b, bVar.f52716e, str4, jSONObject2);
                    return;
                }
            } catch (JSONException e3) {
                e = e3;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                m42374a(str, bVar.f52714c, str2, str3, bVar.f52713b, bVar.f52716e, str4, jSONObject2);
                return;
            }
            m42374a(str, bVar.f52714c, str2, str3, bVar.f52713b, bVar.f52716e, str4, jSONObject2);
            return;
        }
        m42374a(str, null, str2, str3, false, -1, null, null);
    }

    /* renamed from: a */
    public static void m42373a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("logid", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("urlpath", str2);
            }
            jSONObject.put("sdkVersion", 2);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("extra", str4);
            }
            jSONObject.put("passport-sdk-version", 19);
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            jSONObject.put("user_was_login", str5);
            jSONObject.put("result", 0);
            m42377b(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m42374a(String str, String str2, String str3, String str4, boolean z, int i, String str5, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        jSONObject.put("platform", str3);
        jSONObject.put("scene", str4);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("urlpath", str2);
        }
        if (z) {
            jSONObject.put("result", 1);
        } else {
            jSONObject.put("result", 0);
            jSONObject.put("errorCode", i);
            if (str5 != null) {
                jSONObject.put("errDesc", str5);
            }
        }
        jSONObject.put("passport-sdk-version", 19);
        jSONObject.put("sdkVersion", 2);
        m42377b(str, jSONObject);
    }
}
