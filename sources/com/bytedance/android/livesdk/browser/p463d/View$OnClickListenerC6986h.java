package com.bytedance.android.livesdk.browser.p463d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.C3959t;
import com.bytedance.android.live.core.p218f.p222c.C3929a;
import com.bytedance.android.live.core.p218f.p222c.C3930b;
import com.bytedance.android.live.p176b.AbstractC2931h;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.android.live.uikit.p410b.C6228a;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.browser.C6952c;
import com.bytedance.android.livesdk.browser.C7015f;
import com.bytedance.android.livesdk.browser.C7026h;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7140bn;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7144bo;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7150br;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7173g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7178j;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7181l;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7050b;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7057g;
import com.bytedance.android.livesdk.browser.p460a.C6938a;
import com.bytedance.android.livesdk.browser.p460a.C6941d;
import com.bytedance.android.livesdk.browser.p461b.AbstractC6950a;
import com.bytedance.android.livesdk.browser.p461b.C6951b;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.C6964f;
import com.bytedance.android.livesdk.browser.p462c.C6966g;
import com.bytedance.android.livesdk.browser.p464e.C7013b;
import com.bytedance.android.livesdk.browser.p464e.C7014c;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.browser.p468i.C7030b;
import com.bytedance.android.livesdk.browser.p468i.C7031c;
import com.bytedance.android.livesdk.browser.p469j.C7032a;
import com.bytedance.android.livesdk.browser.p475k.C7242a;
import com.bytedance.android.livesdk.browser.view.C7243a;
import com.bytedance.android.livesdk.browser.view.C7244b;
import com.bytedance.android.livesdk.livesetting.hybrid.AllowHtmlVideoSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11180y;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11218ah;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.p674b.AbstractC11613c;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.d.h */
public final class View$OnClickListenerC6986h extends AbstractC9376a implements View.OnClickListener, C7050b.AbstractC7051a, C7124bg.AbstractC7125a, C7178j.AbstractC7179a, AbstractC11614d, WeakHandler.IHandler {

    /* renamed from: A */
    public long f17515A;

    /* renamed from: B */
    public long f17516B;

    /* renamed from: C */
    public long f17517C;

    /* renamed from: D */
    public long f17518D;

    /* renamed from: E */
    String f17519E;

    /* renamed from: F */
    public Map<String, Object> f17520F = new HashMap();

    /* renamed from: P */
    private FrameLayout f17521P;

    /* renamed from: Q */
    private View f17522Q;

    /* renamed from: R */
    private ViewGroup f17523R;

    /* renamed from: S */
    private View f17524S;

    /* renamed from: T */
    private View f17525T;

    /* renamed from: U */
    private boolean f17526U;

    /* renamed from: V */
    private boolean f17527V;

    /* renamed from: W */
    private boolean f17528W = true;

    /* renamed from: X */
    private String f17529X;

    /* renamed from: Y */
    private String f17530Y;

    /* renamed from: Z */
    private int f17531Z;

    /* renamed from: a */
    public String f17532a;

    /* renamed from: aa */
    private int f17533aa = -1;

    /* renamed from: ab */
    private C7030b f17534ab;

    /* renamed from: ac */
    private AbstractC6950a f17535ac;

    /* renamed from: ad */
    private boolean f17536ad;

    /* renamed from: ae */
    private boolean f17537ae;

    /* renamed from: af */
    private Handler f17538af;

    /* renamed from: ag */
    private JSONObject f17539ag;

    /* renamed from: ah */
    private boolean f17540ah;

    /* renamed from: ai */
    private String f17541ai;

    /* renamed from: aj */
    private String f17542aj;

    /* renamed from: ak */
    private View.OnClickListener f17543ak = new View$OnClickListenerC6992i(this);

    /* renamed from: b */
    public String f17544b = "";

    /* renamed from: c */
    public AbstractC2931h f17545c;

    /* renamed from: d */
    public boolean f17546d = true;

    /* renamed from: e */
    protected View f17547e;

    /* renamed from: f */
    View f17548f;

    /* renamed from: g */
    public TextView f17549g;

    /* renamed from: h */
    public FullscreenVideoFrame f17550h;

    /* renamed from: i */
    public View f17551i;

    /* renamed from: j */
    public WebChromeClient.CustomViewCallback f17552j;

    /* renamed from: k */
    public WebView f17553k;

    /* renamed from: l */
    boolean f17554l;

    /* renamed from: m */
    public boolean f17555m = true;

    /* renamed from: n */
    C6990b f17556n;

    /* renamed from: o */
    C7140bn f17557o;

    /* renamed from: p */
    C7150br f17558p;

    /* renamed from: q */
    C7181l f17559q;

    /* renamed from: r */
    C7144bo f17560r;

    /* renamed from: s */
    C7206t f17561s;

    /* renamed from: t */
    public boolean f17562t = true;

    /* renamed from: u */
    public long f17563u;

    /* renamed from: v */
    public boolean f17564v = true;

    /* renamed from: w */
    public C7038b f17565w;

    /* renamed from: x */
    public String f17566x;

    /* renamed from: y */
    public boolean f17567y;

    /* renamed from: z */
    public C7242a f17568z;

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$a */
    public interface AbstractC6989a {
        static {
            Covode.recordClassIndex(7728);
        }

        /* renamed from: a */
        void mo13275a(AbstractC6953a aVar);
    }

    static {
        Covode.recordClassIndex(7725);
    }

    @Override // com.bytedance.android.livesdkapi.p674b.AbstractC11614d
    /* renamed from: a */
    public final Fragment mo13290a() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg.AbstractC7125a
    /* renamed from: c */
    public final C7030b mo13299c() {
        return this.f17534ab;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7178j.AbstractC7179a
    /* renamed from: d */
    public final void mo13300d() {
        mo13301e();
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a
    /* renamed from: f */
    public final View mo13302f() {
        return this.f17553k;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    /* renamed from: e */
    public final void mo13301e() {
        FrameLayout frameLayout = this.f17521P;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p473d.C7050b.AbstractC7051a
    /* renamed from: h */
    public final void mo13304h() {
        this.f17568z.mo13410a(1, 0, "");
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p473d.C7050b.AbstractC7051a
    /* renamed from: g */
    public final void mo13303g() {
        this.f17520F.put("first_loaded", Long.valueOf((System.currentTimeMillis() - this.f17515A) / 1000));
    }

    public View$OnClickListenerC6986h() {
        this.f22874K = C6952c.m14837a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13296b() {
        WebView webView = this.f17553k;
        if (webView != null) {
            webView.clearCache(false);
            JSONObject jSONObject = this.f17539ag;
            if (jSONObject == null || jSONObject.length() <= 0) {
                C6935a.m14802a(this.f17542aj, this.f17553k, this.f17541ai);
                return;
            }
            HashMap hashMap = new HashMap();
            C6935a.m14804a(hashMap, this.f17539ag);
            C6935a.m14803a(this.f17542aj, this.f17553k, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f17553k;
        if (webView != null) {
            webView.getSettings().setBlockNetworkLoads(false);
            Handler handler = this.f17538af;
            if (handler != null) {
                handler.removeMessages(10011);
            }
        }
        super.onResume();
        WebView webView2 = this.f17553k;
        if (webView2 != null) {
            int i = Build.VERSION.SDK_INT;
            webView2.onResume();
        }
        WebView webView3 = this.f17553k;
        if (!(webView3 == null || this.f17533aa == -1)) {
            webView3.reload();
        }
        mo13294a("container_appear", new JSONObject());
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$b */
    class C6990b extends C6941d {
        static {
            Covode.recordClassIndex(7729);
        }

        public final void onGeolocationPermissionsHidePrompt() {
        }

        public final void onHideCustomView() {
            if (View$OnClickListenerC6986h.this.f17551i == null) {
                View$OnClickListenerC6986h.this.f17552j = null;
                return;
            }
            View$OnClickListenerC6986h hVar = View$OnClickListenerC6986h.this;
            if (hVar.f17548f != null && !hVar.f17554l) {
                hVar.f17548f.setVisibility(0);
            }
            View$OnClickListenerC6986h.this.f17550h.setVisibility(8);
            View$OnClickListenerC6986h.this.f17550h.removeView(View$OnClickListenerC6986h.this.f17551i);
            C13628n.m24505a((Activity) View$OnClickListenerC6986h.this.getActivity(), false);
            View$OnClickListenerC6986h.this.f17551i = null;
            View$OnClickListenerC6986h.this.f17552j.onCustomViewHidden();
        }

        C6990b() {
            super(View$OnClickListenerC6986h.this);
        }

        @Override // com.bytedance.android.livesdk.browser.p460a.C6939b
        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            C12044i.f28862a.mo19237a(webView, i);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (View$OnClickListenerC6986h.this.f17562t && View$OnClickListenerC6986h.this.getActivity() != null && !C13627m.m24498a(str) && !TextUtils.equals("about:blank", str)) {
                View$OnClickListenerC6986h hVar = View$OnClickListenerC6986h.this;
                if (hVar.f17549g != null) {
                    hVar.f17549g.setText(str);
                }
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (View$OnClickListenerC6986h.this.f17564v) {
                if (View$OnClickListenerC6986h.this.f17551i != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                View$OnClickListenerC6986h hVar = View$OnClickListenerC6986h.this;
                if (hVar.f17548f != null) {
                    hVar.f17548f.setVisibility(8);
                }
                View$OnClickListenerC6986h.this.f17552j = customViewCallback;
                View$OnClickListenerC6986h.this.f17550h.addView(view);
                View$OnClickListenerC6986h.this.f17551i = view;
                C13628n.m24505a((Activity) View$OnClickListenerC6986h.this.getActivity(), true);
                View$OnClickListenerC6986h.this.f17550h.setVisibility(0);
                View$OnClickListenerC6986h.this.f17550h.requestFocus();
            }
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            if (Logger.debug()) {
                C3854a.m9453a(3, "LiveBrowserFragment", str + " -- line " + i);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C7242a aVar = this.f17568z;
        if (aVar != null && this.f17563u == 0) {
            aVar.mo13410a(3, 0, "");
        }
        mo13291a(0);
        C6966g.m14875b().mo13257b(this);
        C7031c.m14987a().mo13331a(getActivity());
        C7038b bVar = this.f17565w;
        if (bVar != null) {
            bVar.mo13238b();
        }
        if (this.f17553k != null) {
            try {
                C6966g.m14875b().mo13249a(this.f17553k);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Handler handler = this.f17538af;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        ActivityC0945e a;
        int i;
        MethodCollector.m26663i(6427);
        super.onPause();
        ActivityC0945e activity = getActivity();
        WebView webView = this.f17553k;
        if (webView != null) {
            int i2 = Build.VERSION.SDK_INT;
            webView.onPause();
        }
        ActivityC0945e activity2 = getActivity();
        AbstractC6950a aVar = this.f17535ac;
        WebView webView2 = this.f17553k;
        if (!(activity2 == null || webView2 == null || aVar == null || ((aVar.mo13234a() == 0 && ((i = C7026h.f17623b) >= 0 ? i <= 0 : !C7026h.f17622a)) || (a = C11279p.m20001a((Context) activity2)) == null || !a.isFinishing()))) {
            try {
                C3959t.m9647a(webView2, "about:blank");
                if (C7026h.f17624c > 0) {
                    View rootView = webView2.getRootView();
                    if (rootView instanceof ViewGroup) {
                        View childAt = ((ViewGroup) rootView).getChildAt(0);
                        childAt.setDrawingCacheEnabled(true);
                        Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                        childAt.setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(a);
                        imageView.setImageBitmap(createBitmap);
                        imageView.setVisibility(0);
                        ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            } catch (Exception unused) {
            }
            if (Logger.debug()) {
                C3854a.m9453a(2, "WebViewTweaker", "tweak webview pause when finishing");
            }
        }
        if (!(this.f17538af == null || activity == null || activity.isFinishing())) {
            this.f17538af.sendEmptyMessageDelayed(10011, 120000);
        }
        mo13294a("container_disappear", new JSONObject());
        MethodCollector.m26664o(6427);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p473d.C7050b.AbstractC7051a
    /* renamed from: b */
    public final void mo13297b(String str) {
        this.f17519E = str;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$c */
    class C6991c extends C6938a {

        /* renamed from: a */
        Map<String, Boolean> f17574a = new HashMap();

        static {
            Covode.recordClassIndex(7730);
        }

        C6991c() {
        }

        @Override // com.bytedance.ies.web.p1285a.C18292c
        public final void onLoadResource(WebView webView, String str) {
            if (Logger.debug() && !C6935a.m14806b(str)) {
                C3854a.m9453a(3, "LiveBrowserFragment", "onLoadResource ".concat(String.valueOf(str)));
            }
            super.onLoadResource(webView, str);
        }

        @Override // com.bytedance.android.livesdk.browser.p460a.C6940c, com.bytedance.android.livesdk.browser.p460a.C6938a
        public final void onPageFinished(WebView webView, String str) {
            MethodCollector.m26663i(6593);
            View$OnClickListenerC6986h.this.f17563u = System.currentTimeMillis();
            if (Logger.debug()) {
                C3854a.m9453a(2, "LiveBrowserFragment", "onPageFinished " + str + ", time " + View$OnClickListenerC6986h.this.f17563u);
            }
            if (View$OnClickListenerC6986h.this.f22871H != null) {
                View$OnClickListenerC6986h.this.f22871H.mo13278e();
            }
            if (View$OnClickListenerC6986h.this.f17546d) {
                webView.clearHistory();
                View$OnClickListenerC6986h.this.f17546d = false;
            }
            super.onPageFinished(webView, str);
            if (TextUtils.isEmpty(View$OnClickListenerC6986h.this.f17544b) && View$OnClickListenerC6986h.this.f17553k != null) {
                View$OnClickListenerC6986h hVar = View$OnClickListenerC6986h.this;
                hVar.f17544b = hVar.f17553k.getTitle();
                View$OnClickListenerC6986h.this.f17549g.setText(View$OnClickListenerC6986h.this.f17544b);
            }
            if (View$OnClickListenerC6986h.this.f17567y && View$OnClickListenerC6986h.this.f17553k != null) {
                WebView webView2 = View$OnClickListenerC6986h.this.f17553k;
                String str2 = "about:blank";
                String a = C84357h.f188595a.mo129370a(webView2, str2);
                if (!TextUtils.isEmpty(a)) {
                    str2 = a;
                }
                webView2.loadUrl(str2);
            }
            if (!View$OnClickListenerC6986h.this.f17555m) {
                View$OnClickListenerC6986h.this.mo13301e();
            }
            this.f17574a.clear();
            MethodCollector.m26664o(6593);
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.web.p1285a.C18292c
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Logger.debug()) {
                C3854a.m9453a(3, "LiveBrowserFragment", "shouldOverrideUrlLoading ".concat(String.valueOf(str)));
            }
            if (C6966g.m14875b().mo13256a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                String lowerCase = parse.getScheme().toLowerCase();
                if (!TextUtils.isEmpty(lowerCase) && !"about".equals(lowerCase) && !"http".equals(lowerCase) && !"https".equals(lowerCase)) {
                    return ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(View$OnClickListenerC6986h.this.getContext(), parse);
                }
            } catch (Exception e) {
                C3854a.m9453a(5, "TAG", "view url " + str + " exception: " + e);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            String path;
            C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
            if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
                return n.f139469b;
            }
            if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
                WebView webView2 = n.f139470c;
                Q q = n.f139468a;
                C7014c.f17612a = System.currentTimeMillis();
                if (!TextUtils.isEmpty(q)) {
                    WebResourceResponse a = C7019d.m14971a().mo13327a(q, webView2);
                    if (a != null) {
                        if (TextUtils.equals("text/html", a.getMimeType())) {
                            View$OnClickListenerC6986h.this.f17518D = System.currentTimeMillis();
                            View$OnClickListenerC6986h.this.f17520F.put("intercept_delay", Long.valueOf((View$OnClickListenerC6986h.this.f17518D - View$OnClickListenerC6986h.this.f17517C) / 1000));
                        }
                        if (View$OnClickListenerC6986h.m14920c(q)) {
                            C7014c.m14963a(View$OnClickListenerC6986h.this.f17532a, (String) q, 0);
                        }
                        this.f17574a.put(q, true);
                        C7013b.m14959a(webView2, q, true);
                        Uri parse = Uri.parse(q);
                        if (parse.getPath() == null) {
                            path = "";
                        } else {
                            path = parse.getPath();
                        }
                        if (path.endsWith("jpg") || path.endsWith("jpeg") || path.endsWith("png") || path.endsWith("gif") || path.endsWith("ico")) {
                            View$OnClickListenerC6986h hVar = View$OnClickListenerC6986h.this;
                            Uri parse2 = Uri.parse(q);
                            C24413h e = C24428k.m46551a().mo40247e();
                            if (!e.mo40231b(parse2)) {
                                e.mo40235d(parse2).mo39739a(new AbstractC24156b<Boolean>(webView2, q) {
                                    /* class com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h.C69882 */

                                    /* renamed from: a */
                                    final /* synthetic */ WebView f17570a;

                                    /* renamed from: b */
                                    final /* synthetic */ String f17571b;

                                    static {
                                        Covode.recordClassIndex(7727);
                                    }

                                    @Override // com.facebook.p1844d.AbstractC24156b
                                    public final void onFailureImpl(AbstractC24157c<Boolean> cVar) {
                                    }

                                    @Override // com.facebook.p1844d.AbstractC24156b
                                    public final void onNewResultImpl(AbstractC24157c<Boolean> cVar) {
                                        if (cVar.mo39745b() && cVar.mo39747d() != null) {
                                            cVar.mo39747d().booleanValue();
                                        }
                                    }

                                    {
                                        this.f17570a = r2;
                                        this.f17571b = r3;
                                    }
                                }, AsyncTask.THREAD_POOL_EXECUTOR);
                            }
                        }
                        return a;
                    }
                    if (View$OnClickListenerC6986h.m14920c(q)) {
                        C7014c.m14963a(View$OnClickListenerC6986h.this.f17532a, (String) q, 1);
                    }
                    this.f17574a.put(q, false);
                    C7013b.m14959a(webView2, q, true);
                }
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            throw n.f139472e;
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            if (Logger.debug()) {
                C3854a.m9453a(2, "LiveBrowserFragment", "doUpdateVisitedHistory " + webView.getUrl() + " " + str + " " + z);
            }
            super.doUpdateVisitedHistory(webView, str, z);
        }

        @Override // com.bytedance.android.livesdk.browser.p460a.C6940c, com.bytedance.android.livesdk.browser.p460a.C6938a
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String str2;
            super.onPageStarted(webView, str, bitmap);
            View$OnClickListenerC6986h.this.f17516B = System.currentTimeMillis();
            if (webView != null) {
                int i = Build.VERSION.SDK_INT;
                if (LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && C6935a.m14805a(str)) {
                    boolean equals = Boolean.TRUE.equals(this.f17574a.get(str));
                    Context context = webView.getContext();
                    if (TextUtils.isEmpty(View$OnClickListenerC6986h.this.f17566x)) {
                        str2 = str;
                    } else {
                        str2 = View$OnClickListenerC6986h.this.f17566x;
                    }
                    webView.evaluateJavascript(C1764a.m5928a("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", new Object[]{C7015f.m14967a(context, str2, View$OnClickListenerC6986h.this.f22874K, equals)}), null);
                }
            }
            View$OnClickListenerC6986h.this.f17567y = false;
            if (Logger.debug()) {
                C3854a.m9453a(2, "LiveBrowserFragment", "onPageStarted " + str + ", time " + View$OnClickListenerC6986h.this.f17516B);
            }
            View$OnClickListenerC6986h.this.f17520F.put("constrution_duration", Long.valueOf((View$OnClickListenerC6986h.this.f17516B - View$OnClickListenerC6986h.this.f17515A) / 1000));
            if (View$OnClickListenerC6986h.this.f22871H != null) {
                View$OnClickListenerC6986h.this.f22871H.mo13277d();
            }
        }

        @Override // com.bytedance.android.livesdk.browser.p460a.C6940c, com.bytedance.android.livesdk.browser.p460a.C6938a
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            View$OnClickListenerC6986h.this.f17563u = System.currentTimeMillis();
            if (Logger.debug()) {
                C3854a.m9453a(2, "LiveBrowserFragment", "onReceivedError " + str2 + ", time " + View$OnClickListenerC6986h.this.f17563u);
            }
            View$OnClickListenerC6986h.this.mo13301e();
            View$OnClickListenerC6986h.this.f17567y = true;
            if (View$OnClickListenerC6986h.this.f22871H != null) {
                View$OnClickListenerC6986h.this.f22871H.mo13279f();
            }
            if (View$OnClickListenerC6986h.this.f17568z != null) {
                View$OnClickListenerC6986h.this.f17568z.mo13410a(2, i, str);
            }
            View$OnClickListenerC6986h.this.mo13291a(1);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg.AbstractC7125a
    /* renamed from: a */
    public final void mo13293a(C7030b bVar) {
        this.f17534ab = bVar;
        this.f17522Q.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo13291a(int i) {
        if (!TextUtils.isEmpty(this.f17519E)) {
            C3868c.m9491a(this.f17519E, i, this.f17520F);
            this.f17519E = null;
            this.f17520F = null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        WebView webView;
        if (message.what == 10011 && !this.mStatusActive && (webView = this.f17553k) != null) {
            try {
                webView.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m14920c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            if (path.endsWith(".htm") || path.endsWith(".html") || path.endsWith(".css")) {
                return true;
            }
            if (path.endsWith(".js")) {
                return true;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13292a(View view) {
        int id = view.getId();
        if (id == R.id.pf) {
            mo13295a("nav_bar_back_press");
        } else if (id == R.id.fie) {
            mo13296b();
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.yv || id == R.id.z_) {
            if (this.f17534ab != null) {
                AbstractC6107a share = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
                ActivityC0945e activity = getActivity();
                C11666c.C11667a a = C11666c.m20575a();
                a.f27865l = this.f17534ab.f17631d;
                a.f27867n = this.f17534ab.f17629b;
                a.f27868o = this.f17534ab.f17630c;
                a.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                share.mo11989a(activity, a.mo18437a(), new AbstractC11665b() {
                    /* class com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h.C69871 */

                    static {
                        Covode.recordClassIndex(7726);
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                    /* renamed from: a */
                    public final void mo8903a(String str, String str2, Bundle bundle) {
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                    /* renamed from: a */
                    public final void mo8904a(Throwable th) {
                    }
                });
            }
        } else if (id == R.id.z9) {
            mo13295a("nav_bar_back_press");
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a, com.bytedance.android.livesdkapi.p674b.AbstractC11610a
    /* renamed from: a */
    public final boolean mo13295a(String str) {
        super.mo13295a(str);
        if (this.f22876M != null && this.f22876M.mo13378a()) {
            return true;
        }
        WebView webView = this.f17553k;
        if (webView != null && webView.canGoBack()) {
            this.f17553k.goBack();
            return true;
        } else if (!"nav_bar_back_press".equals(str)) {
            return false;
        } else {
            ActivityC0945e activity = getActivity();
            if (activity instanceof AbstractC11613c) {
                activity.finish();
            }
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a, com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        Window window2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        this.f17535ac = C6951b.m14834b();
        ((AbstractC11181z) C11115u.m19743a().mo17915b().mo13171k().mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C6993j(this));
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.getBoolean("from_notification", false);
        String string = arguments.getString("url");
        if (!TextUtils.isEmpty(string)) {
            Uri parse = Uri.parse(string);
            if (!this.f17527V) {
                this.f17527V = arguments.getBoolean("hide_status_bar", false);
            }
            if (!this.f17554l) {
                this.f17554l = arguments.getBoolean("hide_nav_bar", false);
            }
            if (!this.f17528W) {
                this.f17528W = arguments.getBoolean("hide_more", false);
            }
            this.f17526U = arguments.getBoolean("shouldChangeBgResIntoTransparent", false);
            this.f17531Z = arguments.getInt("bundle_web_view_background_color", Color.parseColor("#ffffff"));
            this.f22875L = arguments.getString("soft_input_mode", "");
            if (parse != null) {
                try {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("web_bg_color"))) {
                        this.f17531Z = Color.parseColor(C7032a.m14989a(parse.getQueryParameter("web_bg_color")));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (parse.getQueryParameter("hide_nav_bar") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_nav_bar")) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.f17554l = z4;
                    }
                    if (parse.getQueryParameter("hide_status_bar") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_status_bar")) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f17527V = z3;
                    }
                    if (parse.getQueryParameter("hide_more") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_more")) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f17528W = z2;
                    }
                    if (parse.getQueryParameter("hide_loading") != null) {
                        if (C11218ah.m19873b(parse.getQueryParameter("hide_loading")) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f17555m = z;
                    }
                    this.f17529X = parse.getQueryParameter("status_bar_color");
                    this.f17530Y = parse.getQueryParameter("status_bar_bg_color");
                } catch (Throwable th) {
                    String message = th.getMessage();
                    HashMap hashMap = new HashMap();
                    hashMap.put("urlString", string);
                    hashMap.put("errorMsg", message);
                    C3868c.m9491a("ttlive_uri_parsing_fail", 1, hashMap);
                }
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            this.f17541ai = arguments2.getString("referer");
            this.f17544b = arguments2.getString("title");
            if (parse != null) {
                if (!TextUtils.isEmpty(parse.getQueryParameter("title"))) {
                    this.f17544b = parse.getQueryParameter("title");
                }
                if (parse.getQueryParameter("bundle_sale_show_status") != null) {
                    this.f17533aa = Integer.parseInt(parse.getQueryParameter("bundle_sale_show_status"));
                }
            }
        }
        if ("black".equals(this.f17529X)) {
            ActivityC0945e activity = getActivity();
            if (!(activity == null || (window2 = activity.getWindow()) == null)) {
                int i = Build.VERSION.SDK_INT;
                if (!C3929a.m9568b(window2, true) && !C3929a.m9567a(window2, true) && Build.VERSION.SDK_INT >= 23) {
                    C3929a.m9569c(window2, true);
                }
            }
        } else if ("white".equals(this.f17529X) && (window = getActivity().getWindow()) != null) {
            String a = C3930b.m9570a();
            if ("MIUI".equals(a)) {
                C3929a.m9568b(window, false);
            } else if ("FLYME".equals(a)) {
                C3929a.m9567a(window, false);
            } else {
                C3929a.m9569c(window, false);
            }
        }
        if (!C13627m.m24498a(this.f17530Y)) {
            try {
                C6228a.m13519a(getActivity(), Color.parseColor(this.f17530Y));
            } catch (Exception unused) {
            }
        }
        if (this.f17527V) {
            C3903ac.m9534a((Activity) getActivity());
        }
        this.f17538af = new WeakHandler(this);
        this.f17564v = AllowHtmlVideoSetting.INSTANCE.getValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            this.f17540ah = arguments3.getBoolean("bundle_no_hw_acceleration", false);
            this.f17537ae = arguments3.getBoolean("bundle_enable_app_cache", false);
            this.f17542aj = arguments3.getString("url");
            this.f17566x = arguments3.getString("original_scheme");
            if (this.f17542aj == null) {
                this.f17542aj = "";
            }
            this.f17541ai = arguments3.getString("referer");
            this.f17562t = arguments3.getBoolean("bundle_user_webview_title", true);
            String string2 = arguments3.getString("wap_headers");
            try {
                if (!C13627m.m24498a(string2)) {
                    this.f17539ag = new JSONObject(string2);
                }
            } catch (JSONException unused2) {
            }
            this.f17536ad = arguments3.getBoolean("bundle_load_no_cache", false);
        }
        if (!this.f17540ah) {
            this.f17540ah = false;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p473d.C7050b.AbstractC7051a
    /* renamed from: b */
    public final void mo13298b(String str, Object obj) {
        this.f17520F.put(str, obj);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a
    /* renamed from: a */
    public final <T> void mo13267a(String str, T t) {
        C7038b bVar = this.f17565w;
        if (bVar != null) {
            bVar.f17644b.mo29404a(str, (Object) t);
        }
    }

    /* renamed from: a */
    public final void mo13294a(String str, JSONObject jSONObject) {
        if (this.f17565w != null) {
            if (!jSONObject.has("code")) {
                try {
                    jSONObject.put("code", 1);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            this.f17565w.f17644b.mo29404a(str, jSONObject);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C6990b bVar = this.f17556n;
        if (bVar != null) {
            bVar.mo13223a(i, i2, intent);
        }
        C7140bn bnVar = this.f17557o;
        if (bnVar != null) {
            bnVar.mo13336a(i, i2, intent);
        }
        C7144bo boVar = this.f17560r;
        if (boVar != null) {
            boVar.mo13336a(i, i2, intent);
        }
        C7181l lVar = this.f17559q;
        if (lVar != null) {
            lVar.mo13380a(i, i2, intent);
        }
        C7150br brVar = this.f17558p;
        if (brVar != null) {
            brVar.mo13336a(i, i2, intent);
        }
        C7206t tVar = this.f17561s;
        if (tVar != null) {
            tVar.mo13336a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebSettings settings;
        MethodCollector.m26663i(6265);
        try {
            View a = C1764a.m5927a(layoutInflater, R.layout.b4t, viewGroup, false);
            this.f17547e = a.findViewById(R.id.dnk);
            this.f17548f = a.findViewById(R.id.eiz);
            View findViewById = a.findViewById(R.id.ej6);
            a.findViewById(R.id.enh).setVisibility(8);
            this.f17548f.findViewById(R.id.pf).setOnClickListener(this.f17543ak);
            TextView textView = (TextView) this.f17548f.findViewById(R.id.title);
            this.f17549g = textView;
            textView.setText(this.f17544b);
            this.f17523R = (ViewGroup) a.findViewById(R.id.fif);
            this.f17524S = a.findViewById(R.id.fig);
            this.f17525T = a.findViewById(R.id.fie);
            this.f17521P = (FrameLayout) a.findViewById(R.id.e5y);
            int i = -1;
            this.f17521P.addView(new C7243a(getActivity()), new FrameLayout.LayoutParams(-2, -1));
            if (this.f17555m) {
                this.f17521P.setVisibility(8);
            }
            FullscreenVideoFrame fullscreenVideoFrame = (FullscreenVideoFrame) a.findViewById(R.id.ah8);
            this.f17550h = fullscreenVideoFrame;
            fullscreenVideoFrame.setListener(new C6997n(this));
            View findViewById2 = a.findViewById(R.id.yv);
            this.f17522Q = findViewById2;
            findViewById2.setOnClickListener(this);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f17549g.getLayoutParams();
            marginLayoutParams.leftMargin = (int) C13628n.m24520b(getContext(), 50.0f);
            marginLayoutParams.rightMargin = (int) C13628n.m24520b(getContext(), 50.0f);
            this.f17549g.setLayoutParams(marginLayoutParams);
            this.f17549g.setSingleLine(true);
            this.f17549g.setEllipsize(TextUtils.TruncateAt.END);
            if (this.f17554l) {
                this.f17548f.setVisibility(8);
                findViewById.setVisibility(8);
                this.f17549g.setVisibility(8);
            }
            ((AbstractC11180y) C11115u.m19743a().mo17915b().mo13168h().mo143206c().mo143199a(C6998o.f17582a).mo143200a(C11152e.m19789a((Fragment) this))).mo17947a(new C6999p(this));
            AbstractC6956d b = C6966g.m14875b();
            b.mo13253a(this);
            C6964f.m14873a();
            this.f17515A = System.currentTimeMillis();
            this.f17520F.put("webview_cache", Integer.valueOf(b.mo13255a() ? 1 : 0));
            try {
                this.f17553k = b.mo13244a(getContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
            WebView webView = this.f17553k;
            if (webView == null) {
                MethodCollector.m26664o(6265);
                return a;
            }
            this.f17523R.addView(webView);
            this.f17553k.setScrollBarStyle(0);
            this.f17553k.setBackgroundColor(this.f17531Z);
            if (!this.f17526U) {
                this.f17523R.setBackgroundColor(this.f17531Z);
            }
            CookieManager.getInstance().setAcceptCookie(true);
            this.f17553k.setVerticalScrollBarEnabled(false);
            C7244b a2 = C7244b.m15159a(getActivity());
            a2.f18028a = !this.f17540ah;
            a2.mo13449a(this.f17553k);
            this.f17556n = new C6990b();
            if (this.f17536ad) {
                settings = this.f17553k.getSettings();
                i = 2;
            } else {
                settings = this.f17553k.getSettings();
                if (this.f17537ae) {
                    i = 1;
                }
            }
            settings.setCacheMode(i);
            this.f17520F.put("page_cache", Integer.valueOf(this.f17553k.getSettings().getCacheMode()));
            this.f17565w = C7038b.m14991a(getActivity(), this.f17553k, new C6991c(), this.f17556n);
            if (this.f22870G != null) {
                this.f22870G.mo13275a(this.f17565w);
            }
            C7038b bVar = this.f17565w;
            if (bVar != null) {
                C7173g gVar = new C7173g();
                this.f22876M = gVar;
                bVar.f17644b.mo29405b("viewController", gVar);
            }
            this.f17565w.f17644b.mo29400a("shareInfo", (AbstractC18334e.AbstractC18336b) new C7000q(this));
            this.f17565w.f17644b.mo29400a("sharePanel", (AbstractC18334e.AbstractC18336b) new C7001r(this));
            this.f17565w.f17644b.mo29400a("cancelLoading", (AbstractC18334e.AbstractC18336b) new C7002s(this));
            this.f17565w.f17644b.mo29400a("uploadPhoto", (AbstractC18334e.AbstractC18336b) new C7003t(this));
            this.f17565w.f17644b.mo29400a("uploadPicture", (AbstractC18334e.AbstractC18336b) new C7004u(this));
            this.f17565w.f17644b.mo29400a("uploadVideo", (AbstractC18334e.AbstractC18336b) new C6994k(this));
            this.f17565w.f17644b.mo29400a("chooseImage", (AbstractC18334e.AbstractC18336b) new C6995l(this));
            this.f17565w.f17644b.mo29400a("upload", (AbstractC18334e.AbstractC18336b) new C6996m(this));
            this.f17565w.f17645c.mo29410a("ttliveMonitorPage", new C7050b(new WeakReference(this))).mo29410a("share", new C7057g(new WeakReference(getContext()), this));
            this.f17517C = System.currentTimeMillis();
            JSONObject jSONObject = this.f17539ag;
            if (jSONObject == null || jSONObject.length() <= 0) {
                C6935a.m14802a(this.f17542aj, this.f17553k, this.f17541ai);
            } else {
                HashMap hashMap = new HashMap();
                C6935a.m14804a(hashMap, this.f17539ag);
                C6935a.m14803a(this.f17542aj, this.f17553k, hashMap);
            }
            C7242a aVar = new C7242a(this.f17532a, this.f17542aj, this.f17545c);
            this.f17568z = aVar;
            aVar.mo13410a(0, 0, "");
            MethodCollector.m26664o(6265);
            return a;
        } catch (Exception e2) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            C6555i.m14021b();
            C3854a.m9455a(6, "ttlive_exception", e2.getStackTrace());
            View view = new View(getContext());
            MethodCollector.m26664o(6265);
            return view;
        }
    }
}
