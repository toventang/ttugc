package com.bytedance.android.livesdk.container.p504b;

import android.webkit.WebView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.browser.p460a.C6941d;
import com.bytedance.android.livesdk.container.p505c.C8232c;
import com.bytedance.android.livesdk.livesetting.hybrid.AllowHtmlVideoSetting;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.b.b */
public final class C8215b extends C6941d {

    /* renamed from: e */
    public static final C8216a f20402e = new C8216a((byte) 0);

    /* renamed from: d */
    public final C8232c f20403d;

    /* renamed from: f */
    private final boolean f20404f = AllowHtmlVideoSetting.INSTANCE.getValue();

    static {
        Covode.recordClassIndex(9040);
    }

    public final void onGeolocationPermissionsHidePrompt() {
    }

    /* renamed from: com.bytedance.android.livesdk.container.b.b$a */
    public static final class C8216a {
        static {
            Covode.recordClassIndex(9041);
        }

        private C8216a() {
        }

        public /* synthetic */ C8216a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8215b(C8232c cVar) {
        super(cVar.f20420b);
        C89219l.m154721d(cVar, "");
        this.f20403d = cVar;
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6939b
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C12044i.f28862a.mo19237a(webView, i);
    }

    public final void onConsoleMessage(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        if (Logger.debug()) {
            C3854a.m9453a(3, "LiveWebChromeClient", str + " -- line " + i);
        }
    }
}
