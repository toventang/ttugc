package com.p2082ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37834c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38887d;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a */
public final class C38934a extends AbstractC18234b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final C38935a f91974j = new C38935a((byte) 0);

    /* renamed from: a */
    public CrossPlatformWebView f91975a;

    /* renamed from: b */
    public Aweme f91976b;

    /* renamed from: c */
    public AbstractC38940b f91977c;

    /* renamed from: d */
    public boolean f91978d;

    /* renamed from: e */
    public boolean f91979e;

    /* renamed from: k */
    private ViewGroup f91980k;

    /* renamed from: l */
    private TextView f91981l;

    /* renamed from: m */
    private TextView f91982m;

    /* renamed from: n */
    private String f91983n = "";

    /* renamed from: o */
    private boolean f91984o;

    /* renamed from: p */
    private boolean f91985p;

    /* renamed from: q */
    private SparseArray f91986q;

    static {
        Covode.recordClassIndex(46522);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(213, new RunnableC90250g(C38934a.class, "onEvent", C37834c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(59, new RunnableC90250g(C38934a.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        hashMap.put(288, new RunnableC90250g(C38934a.class, "onEvent", C38941c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(30, new RunnableC90250g(C38934a.class, "onEvent", C38887d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC90264r
    public final void onEvent(C38941c cVar) {
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$a */
    public static final class C38935a {
        static {
            Covode.recordClassIndex(46523);
        }

        private C38935a() {
        }

        public /* synthetic */ C38935a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C38934a m79076a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            C38934a aVar = new C38934a();
            aVar.setArguments(bundle);
            return aVar;
        }

        /* renamed from: a */
        public static void m79077a(AbstractC0952i iVar, ViewGroup viewGroup, int i, C38934a aVar) {
            MethodCollector.m26663i(8393);
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(i);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(frameLayout);
            AbstractC0976n a = iVar.mo3552a();
            C89219l.m154716b(a, "");
            C81079v.m140776O().mo123908B();
            a.mo3453a(i, aVar);
            a.mo3473c();
            MethodCollector.m26664o(8393);
        }

        /* renamed from: a */
        public static void m79078a(AbstractC0952i iVar, ViewGroup viewGroup, int i, boolean z) {
            MethodCollector.m26663i(8545);
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(viewGroup, "");
            Fragment a = iVar.mo3549a(i);
            if (a != null) {
                AbstractC0976n a2 = iVar.mo3552a();
                C89219l.m154716b(a2, "");
                a2.mo3455a(a);
                a2.mo3473c();
            }
            viewGroup.removeView((FrameLayout) viewGroup.findViewById(i));
            if (z) {
                C81079v.m140776O().mo123950y();
            }
            MethodCollector.m26664o(8545);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$b */
    static final class RunnableC38936b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38934a f91987a;

        static {
            Covode.recordClassIndex(46524);
        }

        RunnableC38936b(C38934a aVar) {
            this.f91987a = aVar;
        }

        public final void run() {
            CrossPlatformWebView crossPlatformWebView = this.f91987a.f91975a;
            if (crossPlatformWebView == null) {
                C89219l.m154710a("mWebView");
            }
            crossPlatformWebView.setVisibility(0);
            this.f91987a.mo67624a();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC38940b bVar = this.f91977c;
        if (bVar != null && !this.f91979e) {
            bVar.mo66026a(this.f91985p);
        }
        C38754l.m78610a(getContext(), false);
        SparseArray sparseArray = this.f91986q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    public final void mo67624a() {
        if (!this.f91979e && !this.f91984o) {
            C38189j.m77508b(getContext(), this.f91976b, C89041ag.m154415a());
            Context context = getContext();
            Aweme aweme = this.f91976b;
            AwemeRawAd awemeRawAd = null;
            C38189j.m77519c(context, "form_show", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
            Aweme aweme2 = this.f91976b;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            }
            C18129a.m33746a("background_ad", "form_show", awemeRawAd).mo28902c();
            this.f91984o = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$e */
    public static final class C38939e implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ C38934a f91990a;

        static {
            Covode.recordClassIndex(46527);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: b */
        public final boolean mo65796b(WebView webView, String str) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: c */
        public final void mo65797c(WebView webView, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38939e(C38934a aVar) {
            this.f91990a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
            AbstractC38940b bVar = this.f91990a.f91977c;
            if (bVar != null && this.f91990a.f91978d) {
                C38934a aVar = this.f91990a;
                CrossPlatformWebView crossPlatformWebView = aVar.f91975a;
                if (crossPlatformWebView == null) {
                    C89219l.m154710a("mWebView");
                }
                SingleWebView a = C38934a.m79074a(crossPlatformWebView);
                String str2 = "javascript:(function extra(){" + "var aa =document.createElement(\"link\");aa.type='text/css'; aa.rel='stylesheet'; aa.href='';document.getElementsByTagName(\"head\")[0].appendChild(aa);" + "})();";
                C89219l.m154716b(str2, "");
                a.loadUrl(str2);
                CrossPlatformWebView crossPlatformWebView2 = aVar.f91975a;
                if (crossPlatformWebView2 == null) {
                    C89219l.m154710a("mWebView");
                }
                crossPlatformWebView2.postDelayed(new RunnableC38936b(aVar), 3000);
                bVar.mo66025a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f91990a.f91979e = true;
            AbstractC38940b bVar = this.f91990a.f91977c;
            if (bVar != null) {
                bVar.mo66027b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            this.f91990a.f91979e = true;
            AbstractC38940b bVar = this.f91990a.f91977c;
            if (bVar != null) {
                bVar.mo66027b();
            }
        }
    }

    @AbstractC90264r
    public final void onEvent(AdCardClose adCardClose) {
        C89219l.m154721d(adCardClose, "");
        AbstractC38940b bVar = this.f91977c;
        if (bVar != null) {
            bVar.mo66028c();
        }
    }

    /* renamed from: a */
    static SingleWebView m79074a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((AbstractC40746j) crossPlatformWebView.mo69911a(AbstractC40746j.class)).mo69969a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$c */
    static final class View$OnClickListenerC38937c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38934a f91988a;

        static {
            Covode.recordClassIndex(46525);
        }

        View$OnClickListenerC38937c(C38934a aVar) {
            this.f91988a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C38189j.m77537l(this.f91988a.getContext(), this.f91988a.f91976b);
            C37438a.m75484d();
            this.f91988a.getContext();
            C37438a.m75483c(this.f91988a.f91976b);
            AbstractC38940b bVar = this.f91988a.f91977c;
            if (bVar != null) {
                bVar.mo66028c();
            }
        }
    }

    @AbstractC90264r
    public final void onEvent(C37834c cVar) {
        C89219l.m154721d(cVar, "");
        new C23144b(this).mo37635a(getString(R.string.g80)).mo37637b();
        this.f91985p = true;
        AbstractC38940b bVar = this.f91977c;
        if (bVar != null) {
            bVar.mo66028c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$d */
    static final class View$OnClickListenerC38938d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38934a f91989a;

        static {
            Covode.recordClassIndex(46526);
        }

        View$OnClickListenerC38938d(C38934a aVar) {
            this.f91989a = aVar;
        }

        public final void onClick(View view) {
            AbstractC17897a c;
            ClickAgent.onClick(view);
            IAdSceneService f = AdSceneServiceImpl.m33210f();
            if (!(f == null || (c = f.mo28466c()) == null)) {
                c.mo28511a(this.f91989a.f91976b, this.f91989a.getContext(), 3);
            }
            if (C37699a.m76242aN(this.f91989a.f91976b) && AbstractC38757n.m78633a(this.f91989a.getContext(), this.f91989a.f91976b)) {
                return;
            }
            if (C38767w.m78661e(this.f91989a.getContext(), this.f91989a.f91976b, 3)) {
                AbstractC38940b bVar = this.f91989a.f91977c;
                if (bVar != null) {
                    bVar.mo66028c();
                    return;
                }
                return;
            }
            AbstractC38757n.m78635a(this.f91989a.getContext(), this.f91989a.f91976b, (String) null, (String) null);
            AbstractC38940b bVar2 = this.f91989a.f91977c;
            if (bVar2 != null) {
                bVar2.mo66028c();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Aweme b;
        Window window;
        super.onCreate(bundle);
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(32);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            C89219l.m154716b(string, "");
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
            this.f91983n = C89361p.m154910b((CharSequence) string).toString();
            this.f91978d = arguments.getBoolean("use_css_injection", false);
            String string2 = arguments.getString("aweme_id", "");
            if (AwemeService.m70060b().mo60690d(string2) != null) {
                b = AwemeService.m70060b().mo60690d(string2);
            } else {
                b = AwemeService.m70060b().mo60684b(string2);
            }
            this.f91976b = b;
        }
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @AbstractC90264r
    public final void onEvent(C38887d dVar) {
        C89219l.m154721d(dVar, "");
        AbstractC38940b bVar = this.f91977c;
        if (bVar != null) {
            int i = dVar.f91831a;
            if (i == 0) {
                bVar.mo66027b();
            } else if (i == 1) {
                bVar.mo66025a();
                CrossPlatformWebView crossPlatformWebView = this.f91975a;
                if (crossPlatformWebView == null) {
                    C89219l.m154710a("mWebView");
                }
                crossPlatformWebView.setVisibility(0);
                mo67624a();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        this.f91980k = viewGroup;
        if (viewGroup == null) {
            C89219l.m154710a("mRootView");
        }
        viewGroup.setOnClickListener(new View$OnClickListenerC38937c(this));
        View findViewById = view.findViewById(R.id.fii);
        C89219l.m154716b(findViewById, "");
        this.f91975a = (CrossPlatformWebView) findViewById;
        C38939e eVar = new C38939e(this);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            CrossPlatformWebView crossPlatformWebView = this.f91975a;
            if (crossPlatformWebView == null) {
                C89219l.m154710a("mWebView");
            }
            CommercializeWebViewHelper.m78329a(crossPlatformWebView, eVar, this, activity, getArguments());
        }
        CrossPlatformWebView crossPlatformWebView2 = this.f91975a;
        if (crossPlatformWebView2 == null) {
            C89219l.m154710a("mWebView");
        }
        m79074a(crossPlatformWebView2).setEnableScrollControl(true);
        CrossPlatformWebView crossPlatformWebView3 = this.f91975a;
        if (crossPlatformWebView3 == null) {
            C89219l.m154710a("mWebView");
        }
        m79074a(crossPlatformWebView3).setCanScrollVertically(false);
        CrossPlatformWebView crossPlatformWebView4 = this.f91975a;
        if (crossPlatformWebView4 == null) {
            C89219l.m154710a("mWebView");
        }
        SingleWebChromeClient singleWebChromeClient = m79074a(crossPlatformWebView4).getSingleWebChromeClient();
        if (singleWebChromeClient != null) {
            singleWebChromeClient.f95285c = false;
        }
        if (this.f91978d) {
            CrossPlatformWebView crossPlatformWebView5 = this.f91975a;
            if (crossPlatformWebView5 == null) {
                C89219l.m154710a("mWebView");
            }
            WebSettings settings = m79074a(crossPlatformWebView5).getSettings();
            C1764a.m5930a(settings, settings.getUserAgentString() + "/RevealType/Dialog");
        }
        View findViewById2 = view.findViewById(R.id.dn);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f91981l = textView;
        if (textView == null) {
            C89219l.m154710a("mAdBtn");
        }
        textView.setOnClickListener(new View$OnClickListenerC38938d(this));
        TextView textView2 = this.f91981l;
        if (textView2 == null) {
            C89219l.m154710a("mAdBtn");
        }
        C80595j.m139739a(textView2);
        View findViewById3 = view.findViewById(R.id.dhw);
        C89219l.m154716b(findViewById3, "");
        TextView textView3 = (TextView) findViewById3;
        this.f91982m = textView3;
        if (textView3 == null) {
            C89219l.m154710a("mReplayBtn");
        }
        C80595j.m139739a(textView3);
        CrossPlatformWebView crossPlatformWebView6 = this.f91975a;
        if (crossPlatformWebView6 == null) {
            C89219l.m154710a("mWebView");
        }
        CrossPlatformWebView.m82144a(crossPlatformWebView6, this.f91983n, false, null, 6);
        C38754l.m78610a(getContext(), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0i, viewGroup, false);
    }
}
