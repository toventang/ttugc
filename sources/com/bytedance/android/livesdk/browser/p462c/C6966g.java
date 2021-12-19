package com.bytedance.android.livesdk.browser.p462c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.C2943o;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.browser.C7015f;
import com.bytedance.android.livesdk.browser.C7026h;
import com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.p460a.C6939b;
import com.bytedance.android.livesdk.browser.p460a.C6940c;
import com.bytedance.android.livesdk.browser.p461b.C6951b;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p463d.C6972a;
import com.bytedance.android.livesdk.browser.p464e.C7013b;
import com.bytedance.android.livesdk.browser.p464e.C7014c;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.browser.p467h.AbstractC7027a;
import com.bytedance.android.livesdk.browser.p467h.C7028b;
import com.bytedance.android.livesdk.browser.view.C7244b;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.browser.view.SSWebView;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.g */
public class C6966g implements AbstractC6956d {

    /* renamed from: a */
    private static volatile C6966g f17429a;

    /* renamed from: b */
    private List<AbstractC7033a> f17430b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<DialogInterface$OnCancelListenerC0944d> f17431c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private Set<AbstractC7027a> f17432d;

    /* renamed from: e */
    private AbstractC6956d.AbstractC6960d f17433e;

    static {
        Covode.recordClassIndex(7705);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.g$a */
    static class C6967a extends C6939b {

        /* renamed from: a */
        public C7038b f17434a;

        static {
            Covode.recordClassIndex(7706);
        }

        public final void onGeolocationPermissionsHidePrompt() {
        }

        C6967a() {
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final boolean mo13256a(String str) {
        Set<AbstractC7027a> set = this.f17432d;
        if (set == null || set.size() <= 0) {
            return false;
        }
        for (AbstractC7027a aVar : this.f17432d) {
            if (aVar.mo13330a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13253a(AbstractC7033a aVar) {
        this.f17430b.add(aVar);
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13254a(String str, JSONObject jSONObject) {
        for (AbstractC7033a aVar : this.f17430b) {
            aVar.mo13267a(str, jSONObject);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final boolean mo13255a() {
        AbstractC6956d.AbstractC6960d dVar = this.f17433e;
        return dVar == null || dVar.mo13264a();
    }

    private C6966g() {
        HashSet hashSet = new HashSet();
        this.f17432d = hashSet;
        hashSet.add(new C7028b());
        C6964f.m14873a();
    }

    /* renamed from: b */
    public static AbstractC6956d m14875b() {
        MethodCollector.m26663i(6752);
        if (f17429a == null) {
            synchronized (C6966g.class) {
                try {
                    if (f17429a == null) {
                        f17429a = new C6966g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6752);
                    throw th;
                }
            }
        }
        C6966g gVar = f17429a;
        MethodCollector.m26664o(6752);
        return gVar;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final C4031a mo13245a(AbstractC6956d.C6958b bVar) {
        return C6972a.m14898a(bVar, (C2943o) null);
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: b */
    public final void mo13257b(AbstractC7033a aVar) {
        this.f17430b.remove(aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.g$b */
    static class C6968b extends C6940c implements AbstractC6956d.AbstractC6959c {

        /* renamed from: a */
        Map<String, Boolean> f17435a = new HashMap();

        /* renamed from: b */
        private AbstractC6956d.AbstractC6961e f17436b;

        static {
            Covode.recordClassIndex(7707);
        }

        @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d.AbstractC6959c
        /* renamed from: a */
        public final WebViewClient mo13262a() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d.AbstractC6959c
        /* renamed from: b */
        public final void mo13263b() {
            this.f17436b = null;
        }

        C6968b(AbstractC6956d.AbstractC6961e eVar) {
            this.f17436b = eVar;
        }

        @Override // com.bytedance.android.livesdk.browser.p460a.C6940c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            AbstractC6956d.AbstractC6961e eVar = this.f17436b;
            if (eVar != null) {
                eVar.mo13231a(webView, str);
            }
            this.f17435a.clear();
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
            if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
                return n.f139469b;
            }
            if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
                WebView webView2 = n.f139470c;
                Q q = n.f139468a;
                WebResourceResponse a = C7019d.m14971a().mo13327a(q, webView2);
                if (a != null) {
                    this.f17435a.put(q, true);
                    C7013b.m14959a(webView2, q, true);
                    return a;
                }
                this.f17435a.put(q, false);
                C7013b.m14959a(webView2, q, false);
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            throw n.f139472e;
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.web.p1285a.C18292c
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String lowerCase;
            if (super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    lowerCase = "";
                } else {
                    lowerCase = parse.getScheme().toLowerCase();
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    return false;
                }
                if (!"about".equals(lowerCase) && !lowerCase.equals("https")) {
                    if (!lowerCase.equals("http")) {
                        return ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(webView.getContext(), str);
                    }
                }
                return false;
            } catch (Exception e) {
                C3854a.m9453a(5, "TAG", "view url " + str + " exception: " + e);
                return false;
            }
        }

        @Override // com.bytedance.android.livesdk.browser.p460a.C6940c
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (webView instanceof SSWebView) {
                ((SSWebView) webView).setPageStartUrl(str);
            }
            super.onPageStarted(webView, str, bitmap);
            if (webView != null) {
                int i = Build.VERSION.SDK_INT;
                if (LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && C6935a.m14805a(str)) {
                    webView.evaluateJavascript(C1764a.m5928a("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", new Object[]{C7015f.m14967a(webView.getContext(), str, "0", Boolean.TRUE.equals(this.f17435a.get(str)))}), null);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final WebView mo13244a(Context context) {
        AbstractC6956d.C6962f b;
        String str;
        AbstractC6956d.AbstractC6960d dVar = this.f17433e;
        if (dVar != null && (b = dVar.mo13265b()) != null) {
            return b.f17423a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        RoundRectWebView roundRectWebView = new RoundRectWebView(context);
        if (context != null) {
            str = context.getClass().getName();
        } else {
            str = "other";
        }
        C7014c.m14962a(str, roundRectWebView, currentTimeMillis);
        C6951b.m14834b().mo13235a(roundRectWebView);
        return roundRectWebView;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13249a(WebView webView) {
        MethodCollector.m26663i(6896);
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        AbstractC6956d.AbstractC6960d dVar = this.f17433e;
        if (dVar == null || !dVar.mo13266c()) {
            C7026h.m14983a(webView);
        }
        C12044i.f28862a.mo19251a(webView);
        MethodCollector.m26664o(6896);
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13250a(AbstractC6956d.C6962f fVar) {
        if (fVar != null) {
            mo13257b(fVar);
            C7026h.m14983a(fVar.f17423a);
            if (fVar.f17424b != null) {
                fVar.f17424b.mo13238b();
            }
            C12044i.f28862a.mo19251a(fVar.f17423a);
            fVar.f17424b = null;
            fVar.f17423a = null;
            fVar.f17425c = null;
            fVar.f17426d = null;
            fVar.f17427e.mo13263b();
            fVar.f17427e = null;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final C4031a mo13246a(AbstractC6956d.C6958b bVar, C2943o oVar) {
        return C6972a.m14898a(bVar, oVar);
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final AbstractC6956d.C6962f mo13247a(Activity activity, AbstractC6956d.AbstractC6961e eVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        RoundRectWebView roundRectWebView = new RoundRectWebView(activity);
        if (activity != null) {
            str = activity.getClass().getName();
        } else {
            str = "other";
        }
        C7014c.m14962a(str, roundRectWebView, currentTimeMillis);
        roundRectWebView.setHorizontalScrollBarEnabled(false);
        roundRectWebView.setVerticalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 21) {
            roundRectWebView.getSettings().setMixedContentMode(2);
        }
        C6951b.m14834b().mo13235a(roundRectWebView);
        C6968b bVar = new C6968b(eVar);
        C6967a aVar = new C6967a();
        C7038b a = C7038b.m14991a(activity, roundRectWebView, bVar, aVar);
        aVar.f17434a = a;
        bVar.f43667d = a.f17645c.f43940a;
        C7244b a2 = C7244b.m15159a(activity);
        a2.f18028a = true;
        a2.mo13449a(roundRectWebView);
        AbstractC6956d.C6962f fVar = new AbstractC6956d.C6962f(roundRectWebView, a, aVar, bVar);
        mo13253a((AbstractC7033a) fVar);
        return fVar;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13248a(Context context, AbstractC6956d.C6957a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", aVar.f17379c);
        bundle.putBoolean("hide_status_bar", aVar.f17380d);
        bundle.putString("title", aVar.f17378b);
        bundle.putBoolean("show_progress", aVar.f17381e);
        bundle.putBoolean("bundle_user_webview_title", aVar.f17385i);
        bundle.putString("status_bar_color", aVar.f17382f);
        bundle.putString("status_bar_bg_color", aVar.f17383g);
        bundle.putInt("bundle_web_view_background_color", C3966y.m9663b((int) R.color.v3));
        bundle.putString("original_scheme", aVar.f17384h);
        bundle.putString("soft_input_mode", aVar.f17386j);
        ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveBrowser(aVar.f17377a, bundle, context);
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13251a(AbstractC6956d.C6962f fVar, String str) {
        Map<String, String> hashMap;
        if (fVar != null && fVar.f17423a != null) {
            if (C6935a.m14805a(str)) {
                hashMap = ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18888b(str);
            } else {
                hashMap = new HashMap<>();
            }
            C6935a.m14803a(str, fVar.f17423a, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d
    /* renamed from: a */
    public final void mo13252a(AbstractC6956d.C6962f fVar, String str, JSONObject jSONObject) {
        if (fVar != null && fVar.f17424b != null) {
            fVar.mo13267a(str, jSONObject);
        }
    }
}
