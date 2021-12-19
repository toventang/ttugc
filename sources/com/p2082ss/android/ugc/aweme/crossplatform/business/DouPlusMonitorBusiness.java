package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.p2713f.C40657b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness */
public class DouPlusMonitorBusiness extends BusinessService.Business {

    /* renamed from: a */
    public boolean f94937a;

    /* renamed from: b */
    private long f94938b;

    static {
        Covode.recordClassIndex(48394);
    }

    /* renamed from: a */
    private String m81889a() {
        return this.f94935k.f95069b.f95123r;
    }

    DouPlusMonitorBusiness(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: b */
    public final void mo69716b(String str) {
        if (C40657b.m82028a(m81889a(), str)) {
            this.f94937a = false;
        }
    }

    /* renamed from: a */
    public final void mo69715a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C40657b.m82028a(m81889a(), str)) {
                this.f94937a = true;
                this.f94938b = System.currentTimeMillis();
                return;
            }
            this.f94937a = false;
        }
    }

    /* renamed from: a */
    public final void mo69714a(int i, String str, WebView webView) {
        if (this.f94937a) {
            this.f94937a = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f94938b;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("duration", currentTimeMillis);
                jSONObject2.put("error_status", i);
                jSONObject2.put("error_message", str);
            } catch (JSONException unused) {
            }
            C33830n.m70666a("douplus_delivery_show", 0, jSONObject, jSONObject2);
            int i2 = Build.VERSION.SDK_INT;
            if (this.f94935k.f95069b.f95124s && webView != null) {
                webView.evaluateJavascript("ttwebview:/*getTTLogEventResult*/;", new C40590f(this, i, str, webView));
            }
        }
    }
}
