package com.p2082ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37834c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2 */
public final class BottomFormDialogV2 extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C38928a f91959c = new C38928a((byte) 0);

    /* renamed from: a */
    public Aweme f91960a;

    /* renamed from: b */
    public boolean f91961b;

    /* renamed from: d */
    private CrossPlatformWebView f91962d;

    /* renamed from: e */
    private ImageView f91963e;

    /* renamed from: f */
    private final AbstractC89244h f91964f = RouteArgExtension.INSTANCE.optionalArg(this, C38933f.f91973a, "url", String.class);

    /* renamed from: g */
    private final AbstractC89244h f91965g = RouteArgExtension.INSTANCE.optionalArg(this, C38930c.f91970a, "click_from", Integer.class);

    /* renamed from: h */
    private final AbstractC89244h f91966h = RouteArgExtension.INSTANCE.optionalArg(this, C38929b.f91969a, "aweme_id", String.class);

    /* renamed from: i */
    private boolean f91967i;

    /* renamed from: j */
    private SparseArray f91968j;

    static {
        Covode.recordClassIndex(46515);
    }

    /* renamed from: b */
    private final String m79064b() {
        return (String) this.f91966h.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f91968j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f91968j == null) {
            this.f91968j = new SparseArray();
        }
        View view = (View) this.f91968j.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f91968j.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final Integer mo67620a() {
        return (Integer) this.f91965g.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(213, new RunnableC90250g(BottomFormDialogV2.class, "onEvent", C37834c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$a */
    public static final class C38928a {
        static {
            Covode.recordClassIndex(46516);
        }

        private C38928a() {
        }

        public /* synthetic */ C38928a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            C39115e.m79412a(this, currentFocus);
            currentFocus.clearFocus();
        }
        super.finish();
        overridePendingTransition(R.anim.bh, R.anim.bi);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        Integer a;
        C15477a.m28479e(this);
        super.onDestroy();
        if (!this.f91967i) {
            Integer a2 = mo67620a();
            AwemeRawAd awemeRawAd = null;
            if (a2 != null && a2.intValue() == 8) {
                Aweme aweme = this.f91960a;
                C38189j.m77524d(this, "click_cancel", aweme, C38189j.m77468a((Context) this, aweme, false, (Map<String, String>) null));
                Aweme aweme2 = this.f91960a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "click_call", awemeRawAd).mo28902c();
            } else {
                Integer a3 = mo67620a();
                if ((a3 != null && a3.intValue() == 2) || ((a = mo67620a()) != null && a.intValue() == 10)) {
                    C38189j.m77549x(this, this.f91960a);
                    Aweme aweme3 = this.f91960a;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    }
                    C18129a.m33746a("feed_form", "click_cancel", awemeRawAd).mo28902c();
                }
            }
        }
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$b */
    static final class C38929b extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C38929b f91969a = new C38929b();

        static {
            Covode.recordClassIndex(46517);
        }

        C38929b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$e */
    public static final class C38932e implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ BottomFormDialogV2 f91972a;

        static {
            Covode.recordClassIndex(46520);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
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
        C38932e(BottomFormDialogV2 bottomFormDialogV2) {
            this.f91972a = bottomFormDialogV2;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Integer a;
            Integer a2 = this.f91972a.mo67620a();
            AwemeRawAd awemeRawAd = null;
            if (a2 != null && a2.intValue() == 8) {
                BottomFormDialogV2 bottomFormDialogV2 = this.f91972a;
                C38189j.m77546u(bottomFormDialogV2, bottomFormDialogV2.f91960a);
                Aweme aweme = this.f91972a.f91960a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "load_fail", awemeRawAd).mo28902c();
                return;
            }
            Integer a3 = this.f91972a.mo67620a();
            if ((a3 != null && a3.intValue() == 2) || ((a = this.f91972a.mo67620a()) != null && a.intValue() == 10)) {
                BottomFormDialogV2 bottomFormDialogV22 = this.f91972a;
                C38189j.m77550y(bottomFormDialogV22, bottomFormDialogV22.f91960a);
                Aweme aweme2 = this.f91972a.f91960a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C18129a.m33746a("feed_form", "load_fail", awemeRawAd).mo28902c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Integer a;
            if (!this.f91972a.f91961b) {
                Integer a2 = this.f91972a.mo67620a();
                AwemeRawAd awemeRawAd = null;
                if (a2 != null && a2.intValue() == 8) {
                    BottomFormDialogV2 bottomFormDialogV2 = this.f91972a;
                    C38189j.m77546u(bottomFormDialogV2, bottomFormDialogV2.f91960a);
                    Aweme aweme = this.f91972a.f91960a;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    C18129a.m33746a("homepage_ad", "load_fail", awemeRawAd).mo28902c();
                    this.f91972a.f91961b = true;
                    return;
                }
                Integer a3 = this.f91972a.mo67620a();
                if ((a3 != null && a3.intValue() == 2) || ((a = this.f91972a.mo67620a()) != null && a.intValue() == 10)) {
                    BottomFormDialogV2 bottomFormDialogV22 = this.f91972a;
                    C38189j.m77550y(bottomFormDialogV22, bottomFormDialogV22.f91960a);
                    Aweme aweme2 = this.f91972a.f91960a;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    C18129a.m33746a("feed_form", "load_fail", awemeRawAd).mo28902c();
                    this.f91972a.f91961b = true;
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            Integer a;
            Integer a2 = this.f91972a.mo67620a();
            AwemeRawAd awemeRawAd = null;
            if (a2 != null && a2.intValue() == 8) {
                BottomFormDialogV2 bottomFormDialogV2 = this.f91972a;
                C38189j.m77546u(bottomFormDialogV2, bottomFormDialogV2.f91960a);
                Aweme aweme = this.f91972a.f91960a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "load_fail", awemeRawAd).mo28902c();
                return;
            }
            Integer a3 = this.f91972a.mo67620a();
            if ((a3 != null && a3.intValue() == 2) || ((a = this.f91972a.mo67620a()) != null && a.intValue() == 10)) {
                BottomFormDialogV2 bottomFormDialogV22 = this.f91972a;
                C38189j.m77550y(bottomFormDialogV22, bottomFormDialogV22.f91960a);
                Aweme aweme2 = this.f91972a.f91960a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C18129a.m33746a("feed_form", "load_fail", awemeRawAd).mo28902c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$f */
    static final class C38933f extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C38933f f91973a = new C38933f();

        static {
            Covode.recordClassIndex(46521);
        }

        C38933f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: a */
    private static Bundle m79063a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$c */
    static final class C38930c extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C38930c f91970a = new C38930c();

        static {
            Covode.recordClassIndex(46518);
        }

        C38930c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$d */
    static final class View$OnClickListenerC38931d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomFormDialogV2 f91971a;

        static {
            Covode.recordClassIndex(46519);
        }

        View$OnClickListenerC38931d(BottomFormDialogV2 bottomFormDialogV2) {
            this.f91971a = bottomFormDialogV2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91971a.finish();
        }
    }

    public final void dismiss(View view) {
        C89219l.m154721d(view, "");
        finish();
    }

    @AbstractC90264r
    public final void onEvent(C37834c cVar) {
        C89219l.m154721d(cVar, "");
        new C23144b(this).mo37632a().mo37635a(getString(R.string.g80)).mo37637b();
        this.f91967i = true;
        finish();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Aweme b;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b2);
        getWindow().setSoftInputMode(19);
        EventBus.m156966a(EventBus.m156962a(), this);
        if (m79063a(getIntent()) != null) {
            if (AwemeService.m70060b().mo60690d(m79064b()) != null) {
                b = AwemeService.m70060b().mo60690d(m79064b());
            } else {
                b = AwemeService.m70060b().mo60684b(m79064b());
            }
            this.f91960a = b;
        }
        View findViewById = findViewById(R.id.fii);
        String str = "";
        C89219l.m154716b(findViewById, str);
        this.f91962d = (CrossPlatformWebView) findViewById;
        View findViewById2 = findViewById(R.id.a6q);
        C89219l.m154716b(findViewById2, str);
        ImageView imageView = (ImageView) findViewById2;
        this.f91963e = imageView;
        if (imageView == null) {
            C89219l.m154710a("mCloseBtn");
        }
        imageView.setOnClickListener(new View$OnClickListenerC38931d(this));
        C38932e eVar = new C38932e(this);
        CrossPlatformWebView crossPlatformWebView = this.f91962d;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("mWebView");
        }
        CommercializeWebViewHelper.m78329a(crossPlatformWebView, eVar, this, this, m79063a(getIntent()));
        CrossPlatformWebView crossPlatformWebView2 = this.f91962d;
        if (crossPlatformWebView2 == null) {
            C89219l.m154710a("mWebView");
        }
        SingleWebView a = ((AbstractC40746j) crossPlatformWebView2.mo69911a(AbstractC40746j.class)).mo69969a();
        C89219l.m154716b(a, str);
        WebSettings settings = a.getSettings();
        C89219l.m154716b(settings, str);
        C1764a.m5930a(settings, settings.getUserAgentString() + "/RevealType/Dialog");
        a.setLayerType(1, null);
        CrossPlatformWebView crossPlatformWebView3 = this.f91962d;
        if (crossPlatformWebView3 == null) {
            C89219l.m154710a("mWebView");
        }
        String str2 = (String) this.f91964f.getValue();
        if (str2 != null) {
            str = str2;
        }
        CrossPlatformWebView.m82144a(crossPlatformWebView3, str, false, null, 6);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", false);
    }
}
