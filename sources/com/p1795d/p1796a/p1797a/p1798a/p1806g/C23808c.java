package com.p1795d.p1796a.p1797a.p1798a.p1806g;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23773d;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23780k;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23788d;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23789e;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.g.c */
public final class C23808c extends AbstractC23805a {

    /* renamed from: f */
    WebView f56313f;

    /* renamed from: g */
    private Long f56314g;

    /* renamed from: h */
    private Map<String, C23780k> f56315h;

    /* renamed from: i */
    private final String f56316i;

    static {
        Covode.recordClassIndex(27916);
    }

    public C23808c(Map<String, C23780k> map, String str) {
        this.f56315h = map;
        this.f56316i = str;
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a
    /* renamed from: a */
    public final void mo39264a() {
        MethodCollector.m26663i(3746);
        super.mo39264a();
        WebView webView = new WebView(C23788d.f56283a.f56284b);
        this.f56313f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo39266a(this.f56313f);
        C23789e.m44962a(this.f56313f, this.f56316i);
        for (String str : this.f56315h.keySet()) {
            String externalForm = this.f56315h.get(str).f56255b.toExternalForm();
            WebView webView2 = this.f56313f;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                C23789e.m44962a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f56314g = Long.valueOf(System.nanoTime());
        MethodCollector.m26664o(3746);
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a
    /* renamed from: a */
    public final void mo39267a(C23781l lVar, C23773d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(dVar.f56238d);
        for (String str : unmodifiableMap.keySet()) {
            C23798b.m44985a(jSONObject, str, unmodifiableMap.get(str));
        }
        mo39268a(lVar, dVar, jSONObject);
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a
    /* renamed from: b */
    public final void mo39271b() {
        super.mo39271b();
        new Handler().postDelayed(new Runnable() {
            /* class com.p1795d.p1796a.p1797a.p1798a.p1806g.C23808c.RunnableC238091 */

            /* renamed from: b */
            private WebView f56318b;

            static {
                Covode.recordClassIndex(27917);
            }

            public final void run() {
                this.f56318b.destroy();
            }

            {
                this.f56318b = C23808c.this.f56313f;
            }
        }, Math.max(4000 - (this.f56314g == null ? 4000 : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f56314g.longValue(), TimeUnit.NANOSECONDS)), (long) InteractFirstFrameTimeOutDurationSetting.DEFAULT));
        this.f56313f = null;
    }
}
