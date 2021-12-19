package com.bytedance.android.livesdk.browser.p464e;

import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.e.b */
public final class C7013b {

    /* renamed from: a */
    public static final C7013b f17611a = new C7013b();

    private C7013b() {
    }

    static {
        Covode.recordClassIndex(7752);
    }

    /* renamed from: a */
    private static JSONObject m14957a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m14958a(boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject.put("offline", i);
            jSONObject.put("live_container_type", "webview");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m14959a(WebView webView, String str, boolean z) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(str, "");
        C12044i.f28862a.mo19232a(webView, str, "template_offline", m14958a(z), null, null, m14957a(), false);
    }
}
