package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDisableWebviewFileUriMtSetting;
import com.bytedance.common.p900c.C13500a;
import com.bytedance.common.p900c.C13501b;
import com.bytedance.common.p900c.C13507d;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.browser.view.b */
public final class C7244b {

    /* renamed from: a */
    public boolean f18028a = true;

    /* renamed from: b */
    private WeakReference<Context> f18029b;

    /* renamed from: c */
    private boolean f18030c = true;

    /* renamed from: d */
    private boolean f18031d = true;

    /* renamed from: e */
    private boolean f18032e = true;

    /* renamed from: f */
    private boolean f18033f = true;

    /* renamed from: g */
    private boolean f18034g = true;

    /* renamed from: h */
    private boolean f18035h = true;

    /* renamed from: i */
    private boolean f18036i = true;

    static {
        Covode.recordClassIndex(7992);
    }

    /* renamed from: a */
    public static C7244b m15159a(Context context) {
        return new C7244b(context);
    }

    private C7244b(Context context) {
        this.f18029b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo13449a(WebView webView) {
        WebSettings settings;
        if (webView != null && this.f18029b.get() != null && (settings = webView.getSettings()) != null) {
            try {
                settings.setJavaScriptEnabled(this.f18030c);
            } catch (Exception unused) {
                C3854a.m9453a(5, "SSWebSettings", "setJavaScriptEnabled failed");
            }
            try {
                if (this.f18031d) {
                    settings.setSupportZoom(true);
                    settings.setBuiltInZoomControls(true);
                    C13500a.m24282a(settings);
                } else {
                    settings.setSupportZoom(false);
                }
            } catch (Throwable unused2) {
            }
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(this.f18032e);
            settings.setDomStorageEnabled(this.f18034g);
            if (!LiveDisableWebviewFileUriMtSetting.INSTANCE.getValue()) {
                settings.setAllowFileAccess(this.f18035h);
            } else {
                settings.setAllowFileAccess(false);
            }
            settings.setBlockNetworkImage(!this.f18036i);
            if (!this.f18028a) {
                try {
                    webView.setLayerType(1, null);
                } catch (Throwable unused3) {
                }
            }
            settings.setTextZoom(100);
            C13501b.m24283a(settings, false);
            m15160a(webView, this.f18033f);
            C13507d.m24290a(settings, 2);
            C13507d.f32889a.mo21779a(webView);
        }
    }

    /* renamed from: a */
    private void m15160a(WebView webView, boolean z) {
        if (!z) {
            webView.setOnLongClickListener(null);
            webView.setLongClickable(false);
            return;
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new View$OnLongClickListenerC7247c(this));
    }
}
