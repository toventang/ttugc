package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40616h;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.f */
final /* synthetic */ class C40590f implements ValueCallback {

    /* renamed from: a */
    private final DouPlusMonitorBusiness f94999a;

    /* renamed from: b */
    private final int f95000b;

    /* renamed from: c */
    private final String f95001c;

    /* renamed from: d */
    private final WebView f95002d;

    static {
        Covode.recordClassIndex(48429);
    }

    C40590f(DouPlusMonitorBusiness douPlusMonitorBusiness, int i, String str, WebView webView) {
        this.f94999a = douPlusMonitorBusiness;
        this.f95000b = i;
        this.f95001c = str;
        this.f95002d = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        C34337k monitorSession;
        AbstractC34340m mVar;
        int i = this.f95000b;
        String str = this.f95001c;
        WebView webView = this.f95002d;
        String str2 = (String) obj;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.length() != 0) {
                    C89219l.m154721d(jSONObject, "");
                    C89219l.m154721d(webView, "");
                    if ((webView instanceof SingleWebView) && webView != null) {
                        Objects.requireNonNull(webView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView");
                        SingleWebView singleWebView = (SingleWebView) webView;
                        if (!(singleWebView == null || (monitorSession = singleWebView.getMonitorSession()) == null || (mVar = (AbstractC34340m) monitorSession.mo60793a(AbstractC34340m.class)) == null)) {
                            try {
                                C40616h.m81983a(jSONObject, mVar);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_status", i);
                        jSONObject2.put("error_message", str);
                        jSONObject2.put("full_process_event", str2);
                    } catch (JSONException unused) {
                    }
                    C12290b.m22060a("douplus_full_process_log", 0, jSONObject2);
                }
            } catch (Exception unused2) {
            }
        }
    }
}
