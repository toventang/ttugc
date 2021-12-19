package com.p2082ss.android.token;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1664o.C22513f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.C29338a;
import com.p2082ss.android.account.C29351f;
import java.net.URI;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.token.e */
public final class C30629e {
    static {
        Covode.recordClassIndex(37167);
    }

    /* renamed from: a */
    static String m62924a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                URI uri = new URI(str);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (!TextUtils.isEmpty(uri.getPath())) {
                    sb.append(uri.getPath());
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m62929a(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_msg", th.getMessage());
            jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
            C22455a.m42376a("tt_token_exception", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m62925a(String str, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            jSONObject.put("error_code_msg", str2);
            jSONObject.put("extra", new StringBuilder().toString());
            C22455a.m42376a(str, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m62927a(String str, String str2, JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        jSONObject.put("error_name", str);
        jSONObject.put("error_message", str2);
        int i2 = 1;
        if (C22513f.m42469a(C29351f.m58781a().mo52210b())) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("network_available", i);
        if (C29338a.f69613a <= 0) {
            i2 = 0;
        }
        jSONObject.put("app_in_foreground", i2);
        C22455a.m42376a("token_config_err_v2", jSONObject);
    }

    /* renamed from: a */
    public static void m62928a(String str, List list, boolean z) {
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            if (list != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj instanceof C30627c) {
                        if ("X-TT-LOGID".equalsIgnoreCase(((C30627c) obj).f73191a)) {
                            str2 = ((C30627c) obj).f73192b;
                        }
                    } else if (obj != null) {
                        sb.append(obj.toString());
                        sb.append(";");
                    }
                }
            }
            C22455a.m42373a("tt_token_logout", m62924a(str), str2, sb.toString(), z);
        } catch (Exception e) {
            m62929a(e);
        }
    }

    /* renamed from: a */
    public static void m62926a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tokenSign", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("token", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("errorMsg", str4);
            }
            C22455a.m42376a("tt_token_decrypt_err", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
