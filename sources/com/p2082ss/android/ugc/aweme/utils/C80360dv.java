package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34483c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.dv */
public final class C80360dv {
    static {
        Covode.recordClassIndex(93628);
    }

    /* renamed from: a */
    private static void m139330a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22064a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m139331a(Throwable th, String str, String str2) {
        if (th != null && !TextUtils.isEmpty(str)) {
            if ((th instanceof C34483c) || (th instanceof C28027t)) {
                m139330a("aweme_parse_error_log", "", new C33743c().mo59976a("errorUrl", str).mo59976a("errorDesc", Log.getStackTraceString(th)).mo59976a("errorResponse", str2).mo59977a());
            }
        }
    }
}
