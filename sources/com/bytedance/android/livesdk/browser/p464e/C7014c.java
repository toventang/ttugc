package com.bytedance.android.livesdk.browser.p464e;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.e.c */
public final class C7014c {

    /* renamed from: a */
    public static long f17612a;

    static {
        Covode.recordClassIndex(7753);
    }

    /* renamed from: a */
    private static JSONObject m14960a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_container_type", "webview");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m14965b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m14961a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m14964a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m14962a(String str, WebView webView, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        m14964a(jSONObject, "from", str);
        C3868c.m9494a("ttlive_webview_init_all", currentTimeMillis, jSONObject);
        C12044i.f28862a.mo19232a(webView, null, "hybrid_container_init_duration", m14960a(), m14961a(currentTimeMillis), null, m14965b(), false);
    }

    /* renamed from: a */
    public static void m14963a(String str, String str2, int i) {
        long currentTimeMillis = System.currentTimeMillis() - f17612a;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        m14964a(jSONObject, "from", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        m14964a(jSONObject, "url", str2);
        if (i == 0) {
            C3868c.m9490a("ttlive_webview_offline_all", i, currentTimeMillis, jSONObject);
        } else {
            C3868c.m9497b("ttlive_webview_offline_all", i, jSONObject);
        }
    }
}
