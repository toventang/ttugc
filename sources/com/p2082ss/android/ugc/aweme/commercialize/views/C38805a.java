package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35229g;
import com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35189e;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37588c;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38586f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38628aj;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38751k;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38755m;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.DialogC38841c;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.AbstractC33279b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.a */
public final class C38805a extends FrameLayout {

    /* renamed from: m */
    public static final int f91638m = R.id.ep;

    /* renamed from: n */
    public static final C38809d f91639n = new C38809d((byte) 0);

    /* renamed from: A */
    private final C35189e f91640A;

    /* renamed from: B */
    private C38812f f91641B;

    /* renamed from: C */
    private SparseArray f91642C;

    /* renamed from: a */
    public View f91643a;

    /* renamed from: b */
    public boolean f91644b;

    /* renamed from: c */
    public Bundle f91645c;

    /* renamed from: d */
    public boolean f91646d;

    /* renamed from: e */
    public C38628aj f91647e;

    /* renamed from: f */
    public AbstractC33279b f91648f;

    /* renamed from: g */
    public CommercializeWebViewHelper f91649g;

    /* renamed from: h */
    public String f91650h;

    /* renamed from: i */
    public long f91651i;

    /* renamed from: j */
    public boolean f91652j;

    /* renamed from: k */
    public final C38832z f91653k;

    /* renamed from: l */
    public String f91654l;

    /* renamed from: o */
    private final AbstractC89244h f91655o;

    /* renamed from: p */
    private final AbstractC89244h f91656p;

    /* renamed from: q */
    private final AbstractC89244h f91657q;

    /* renamed from: r */
    private final AbstractC89244h f91658r;

    /* renamed from: s */
    private final AbstractC89244h f91659s;

    /* renamed from: t */
    private final AbstractC89244h f91660t;

    /* renamed from: u */
    private final AbstractC89244h f91661u;

    /* renamed from: v */
    private final AbstractC89244h f91662v;

    /* renamed from: w */
    private C38810e f91663w;

    /* renamed from: x */
    private AbstractC38808c f91664x;

    /* renamed from: y */
    private int f91665y;

    /* renamed from: z */
    private final C38755m f91666z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$c */
    public interface AbstractC38808c {
        static {
            Covode.recordClassIndex(46361);
        }

        /* renamed from: a */
        void mo67433a();

        /* renamed from: b */
        void mo67434b();

        /* renamed from: c */
        void mo67435c();
    }

    /* renamed from: a */
    public static final boolean m78737a(Activity activity, String str) {
        return C38809d.m78764b(f91639n, activity, str);
    }

    /* renamed from: b */
    private View m78738b(int i) {
        if (this.f91642C == null) {
            this.f91642C = new SparseArray();
        }
        View view = (View) this.f91642C.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f91642C.put(i, findViewById);
        return findViewById;
    }

    private final ImageView getMCloseView() {
        return (ImageView) this.f91659s.getValue();
    }

    private final FrameLayout getMLightWebPage() {
        return (FrameLayout) this.f91656p.getValue();
    }

    private final TextView getMRetryView() {
        return (TextView) this.f91661u.getValue();
    }

    public final AdBottomSheetContainer getMBottomSheet() {
        return (AdBottomSheetContainer) this.f91655o.getValue();
    }

    public final CommonBizWebView getMBulletWebView() {
        return (CommonBizWebView) this.f91658r.getValue();
    }

    public final FrameLayout getMErrorView() {
        return (FrameLayout) this.f91660t.getValue();
    }

    public final AdPopUpWebTitleBar getMFlTitleBar() {
        return (AdPopUpWebTitleBar) this.f91662v.getValue();
    }

    public final CrossPlatformWebView getMWebView() {
        return (CrossPlatformWebView) this.f91657q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$d */
    public static final class C38809d {
        static {
            Covode.recordClassIndex(46362);
        }

        private C38809d() {
        }

        public /* synthetic */ C38809d(byte b) {
            this();
        }

        /* renamed from: a */
        public static FrameLayout m78758a(Activity activity) {
            MethodCollector.m26663i(8038);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.e8);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                if (inflate != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    MethodCollector.m26664o(8038);
                    return frameLayout;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.m26664o(8038);
                throw nullPointerException;
            }
            FrameLayout frameLayout2 = (FrameLayout) activity.findViewById(R.id.e7);
            MethodCollector.m26664o(8038);
            return frameLayout2;
        }

        /* renamed from: b */
        public static C38805a m78762b(Activity activity, int i) {
            C38805a aVar;
            FrameLayout a = m78758a(activity);
            if (a != null) {
                aVar = (C38805a) a.findViewById(i);
            } else {
                aVar = null;
            }
            if (!(aVar instanceof C38805a)) {
                return null;
            }
            return aVar;
        }

        /* renamed from: a */
        public static boolean m78759a(Activity activity, int i) {
            C89219l.m154721d(activity, "");
            C38805a b = m78762b(activity, i);
            if (b == null || !b.getMBottomSheet().mo14580a()) {
                return false;
            }
            b.mo67418b();
            FrameLayout a = m78758a(activity);
            if (a != null) {
                a.setVisibility(8);
            }
            return true;
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m78764b(C38809d dVar, Activity activity, String str) {
            return m78763b(activity, str, C38805a.f91638m);
        }

        /* renamed from: b */
        private static boolean m78763b(Activity activity, String str, int i) {
            C89219l.m154721d(activity, "");
            C38805a b = m78762b(activity, i);
            if (b == null || b.getMBottomSheet().mo14580a()) {
                return false;
            }
            FrameLayout a = m78758a(activity);
            if (a != null) {
                a.setVisibility(0);
            }
            b.mo67417a(str);
            return true;
        }

        /* renamed from: a */
        public static boolean m78760a(Activity activity, String str, int i) {
            C38810e params;
            C89219l.m154721d(activity, "");
            C38805a b = m78762b(activity, i);
            if (b == null || b.getMBottomSheet().mo14580a()) {
                return false;
            }
            FrameLayout a = m78758a(activity);
            if (a != null) {
                a.setVisibility(0);
            }
            if (!(str == null || (params = b.getParams()) == null)) {
                params.mo67436a(str);
            }
            b.mo67417a((String) null);
            return true;
        }
    }

    public final AbstractC38808c getCallback() {
        return this.f91664x;
    }

    public final C38810e getParams() {
        return this.f91663w;
    }

    public final int getTitleBarState() {
        return this.f91665y;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$a */
    public static final class C38806a implements C38755m.AbstractC38756a {

        /* renamed from: a */
        final /* synthetic */ C38805a f91667a;

        static {
            Covode.recordClassIndex(46359);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38755m.AbstractC38756a
        /* renamed from: c */
        public final void mo67295c() {
            m78745a("preload_break", null);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38755m.AbstractC38756a
        /* renamed from: a */
        public final void mo67292a() {
            this.f91667a.getMErrorView().setVisibility(8);
            View findViewById = this.f91667a.getMWebView().findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            m78745a("preload_start", null);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38755m.AbstractC38756a
        /* renamed from: b */
        public final void mo67294b() {
            this.f91667a.getMErrorView().setVisibility(0);
            View findViewById = this.f91667a.getMWebView().findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            m78745a("preload_fail", null);
        }

        C38806a(C38805a aVar) {
            this.f91667a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38755m.AbstractC38756a
        /* renamed from: a */
        public final void mo67293a(long j) {
            m78745a("preload_success", Long.valueOf(j));
            this.f91667a.f91646d = true;
        }

        /* renamed from: a */
        private final void m78745a(String str, Long l) {
            Aweme aweme;
            if (this.f91667a.mo67419c()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("light_page", 1);
                if (l != null) {
                    linkedHashMap.put("duration", l);
                }
                C38182f.C38184b a = C38182f.m77418a();
                a.f90211a = "ad_wap_stat";
                a.f90212b = str;
                C38182f.C38184b a2 = a.mo66493a(new JSONObject(linkedHashMap));
                C38810e params = this.f91667a.getParams();
                AwemeRawAd awemeRawAd = null;
                a2.mo66497b(params != null ? params.f91671c : null).mo66495a((Context) null);
                C38810e params2 = this.f91667a.getParams();
                if (!(params2 == null || (aweme = params2.f91671c) == null)) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.C18130a a3 = C18129a.m33746a("ad_wap_stat", str, awemeRawAd);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    a3.mo28897a((String) entry.getKey(), entry.getValue());
                }
                a3.mo28902c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$b */
    public static final class C38807b implements C35189e.AbstractC35190a {

        /* renamed from: a */
        final /* synthetic */ C38805a f91668a;

        static {
            Covode.recordClassIndex(46360);
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35189e.AbstractC35190a
        /* renamed from: c */
        public final void mo62034c() {
            m78750a("preload_break", null);
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35189e.AbstractC35190a
        /* renamed from: a */
        public final void mo62031a() {
            this.f91668a.getMErrorView().setVisibility(8);
            m78750a("preload_start", null);
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35189e.AbstractC35190a
        /* renamed from: b */
        public final void mo62033b() {
            this.f91668a.getMErrorView().setVisibility(0);
            m78750a("preload_fail", null);
        }

        C38807b(C38805a aVar) {
            this.f91668a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35189e.AbstractC35190a
        /* renamed from: a */
        public final void mo62032a(long j) {
            m78750a("preload_success", Long.valueOf(j));
        }

        /* renamed from: a */
        private final void m78750a(String str, Long l) {
            Aweme aweme;
            if (this.f91668a.mo67419c()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("light_page", 1);
                if (l != null) {
                    linkedHashMap.put("duration", l);
                }
                C38182f.C38184b a = C38182f.m77418a();
                a.f90211a = "ad_wap_stat";
                a.f90212b = str;
                C38182f.C38184b a2 = a.mo66493a(new JSONObject(linkedHashMap));
                C38810e params = this.f91668a.getParams();
                AwemeRawAd awemeRawAd = null;
                a2.mo66497b(params != null ? params.f91671c : null).mo66495a((Context) null);
                C38810e params2 = this.f91668a.getParams();
                if (!(params2 == null || (aweme = params2.f91671c) == null)) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.C18130a a3 = C18129a.m33746a("ad_wap_stat", str, awemeRawAd);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    a3.mo28897a((String) entry.getKey(), entry.getValue());
                }
                a3.mo28902c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$e */
    public static final class C38810e {

        /* renamed from: a */
        public String f91669a;

        /* renamed from: b */
        public AbstractC1204m f91670b;

        /* renamed from: c */
        public Aweme f91671c;

        /* renamed from: d */
        public Integer f91672d;

        /* renamed from: e */
        public boolean f91673e;

        /* renamed from: f */
        public Bundle f91674f;

        static {
            Covode.recordClassIndex(46363);
        }

        public /* synthetic */ C38810e() {
            this("");
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$e$a */
        public static final class C38811a extends C38586f<C38810e> {
            static {
                Covode.recordClassIndex(46364);
            }

            public C38811a() {
                super(new C38810e());
            }
        }

        /* renamed from: a */
        public final void mo67436a(String str) {
            C89219l.m154721d(str, "");
            this.f91669a = str;
        }

        private C38810e(String str) {
            C89219l.m154721d(str, "");
            this.f91669a = str;
            this.f91670b = null;
            this.f91671c = null;
            this.f91672d = null;
            this.f91673e = true;
            this.f91674f = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$j */
    public static final class C38816j implements AdBottomSheetContainer.AbstractC38772b {

        /* renamed from: a */
        final /* synthetic */ C38805a f91681a;

        /* renamed from: b */
        private boolean f91682b;

        static {
            Covode.recordClassIndex(46369);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.AbstractC38772b
        /* renamed from: d */
        public final void mo67311d() {
            this.f91681a.mo67416a(7);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.AbstractC38772b
        /* renamed from: c */
        public final void mo67310c() {
            if (this.f91681a.getMBottomSheet().getHideable() && this.f91681a.f91652j) {
                this.f91681a.f91652j = false;
                C38754l.m78608a(this.f91681a.getContext());
            }
            this.f91681a.mo67416a(1);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.AbstractC38772b
        /* renamed from: a */
        public final void mo67308a() {
            PreRenderWebViewBusiness a;
            Aweme aweme;
            Aweme aweme2;
            AbstractC35125b bVar;
            com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a2;
            this.f91681a.mo67416a(3);
            if (!this.f91682b) {
                this.f91682b = true;
                this.f91681a.f91651i = System.currentTimeMillis();
                C38628aj ajVar = this.f91681a.f91647e;
                if (ajVar != null) {
                    ajVar.f91285b = ajVar.mo67211c();
                    ajVar.f91284a = ajVar.f91285b;
                    ajVar.mo67209a().getViewTreeObserver().addOnGlobalLayoutListener(ajVar.f91286c);
                }
                if (this.f91681a.f91644b) {
                    this.f91681a.getMBulletWebView().setVisibility(0);
                    this.f91681a.getMWebView().setVisibility(8);
                    SSWebView webView = this.f91681a.getMBulletWebView().getWebView();
                    if (webView != null) {
                        webView.loadUrl("javascript:window.dialogPopUp()");
                    }
                    C35222b rootContainer = this.f91681a.getMBulletWebView().getRootContainer();
                    if (!(rootContainer == null || (bVar = rootContainer.f83165z) == null || (a2 = PreRenderWebViewBusiness.C35121a.m71835a(bVar)) == null)) {
                        a2.mo61969a(this.f91681a.f91654l);
                    }
                } else {
                    ((AbstractC40746j) this.f91681a.getMWebView().mo69911a(AbstractC40746j.class)).mo69969a().loadUrl("javascript:window.dialogPopUp()");
                    CommercializeWebViewHelper commercializeWebViewHelper = this.f91681a.f91649g;
                    if (!(commercializeWebViewHelper == null || (a = PreRenderWebViewBusiness.C40581a.m81921a(commercializeWebViewHelper)) == null)) {
                        a.mo69738a(this.f91681a.f91654l);
                    }
                }
                if (this.f91681a.mo67419c()) {
                    C38182f.C38184b a3 = C38182f.m77418a();
                    a3.f90211a = "light_ad";
                    a3.f90212b = "detail_show";
                    C38810e params = this.f91681a.getParams();
                    AwemeRawAd awemeRawAd = null;
                    if (params != null) {
                        aweme = params.f91671c;
                    } else {
                        aweme = null;
                    }
                    a3.mo66497b(aweme).mo66495a((Context) null);
                    C38810e params2 = this.f91681a.getParams();
                    if (!(params2 == null || (aweme2 = params2.f91671c) == null)) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    C18129a.m33746a("light_ad", "detail_show", awemeRawAd).mo28902c();
                }
                AbstractC38808c callback = this.f91681a.getCallback();
                if (callback != null) {
                    callback.mo67433a();
                }
                AbstractC33279b bVar2 = this.f91681a.f91648f;
                if (bVar2 != null) {
                    bVar2.mo59237a(true);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.AbstractC38772b
        /* renamed from: b */
        public final void mo67309b() {
            com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness a;
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            Aweme aweme2;
            Long l;
            String str;
            Aweme aweme3;
            AwemeRawAd awemeRawAd2;
            Aweme aweme4;
            AwemeRawAd awemeRawAd3;
            Aweme aweme5;
            AbstractC35125b bVar;
            com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a2;
            if (this.f91682b) {
                this.f91682b = false;
                C38628aj ajVar = this.f91681a.f91647e;
                if (ajVar != null) {
                    ajVar.mo67210b();
                }
                if (this.f91681a.f91644b) {
                    C35222b rootContainer = this.f91681a.getMBulletWebView().getRootContainer();
                    if (!(rootContainer == null || (bVar = rootContainer.f83165z) == null || (a2 = PreRenderWebViewBusiness.C35121a.m71835a(bVar)) == null)) {
                        a2.mo61967a();
                    }
                } else {
                    CommercializeWebViewHelper commercializeWebViewHelper = this.f91681a.f91649g;
                    if (!(commercializeWebViewHelper == null || (a = PreRenderWebViewBusiness.C40581a.m81921a(commercializeWebViewHelper)) == null)) {
                        a.mo69736a();
                    }
                }
                if (this.f91681a.mo67419c()) {
                    C38182f.C38184b a3 = C38182f.m77418a();
                    a3.f90211a = "light_ad";
                    a3.f90212b = "landing_page";
                    String str2 = this.f91681a.f91650h;
                    String str3 = "slide";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    C38182f.C38184b c = a3.mo66504c(str2);
                    C38810e params = this.f91681a.getParams();
                    if (params != null) {
                        aweme = params.f91671c;
                    } else {
                        aweme = null;
                    }
                    c.mo66497b(aweme).mo66495a((Context) null);
                    C38810e params2 = this.f91681a.getParams();
                    if (params2 == null || (aweme5 = params2.f91671c) == null) {
                        awemeRawAd = null;
                    } else {
                        awemeRawAd = aweme5.getAwemeRawAd();
                    }
                    C18129a.C18130a a4 = C18129a.m33746a("light_ad", "landing_page", awemeRawAd);
                    String str4 = this.f91681a.f91650h;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    a4.mo28900b("refer", str3).mo28902c();
                    C38182f.C38184b a5 = C38182f.m77418a();
                    a5.f90211a = "ad_wap_stat";
                    a5.f90212b = "stay_page";
                    C38810e params3 = this.f91681a.getParams();
                    if (params3 != null) {
                        aweme2 = params3.f91671c;
                    } else {
                        aweme2 = null;
                    }
                    a5.mo66497b(aweme2).mo66499b(Long.valueOf(System.currentTimeMillis() - this.f91681a.f91651i)).mo66491a(C89041ag.m154427b(new C89378p("light_page", 1))).mo66495a((Context) null);
                    C38810e params4 = this.f91681a.getParams();
                    if (params4 == null || (aweme4 = params4.f91671c) == null || (awemeRawAd3 = aweme4.getAwemeRawAd()) == null) {
                        l = null;
                    } else {
                        l = awemeRawAd3.getCreativeId();
                    }
                    String valueOf = String.valueOf(l);
                    C38810e params5 = this.f91681a.getParams();
                    if (params5 == null || (aweme3 = params5.f91671c) == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd2.getLogExtra();
                    }
                    C18129a.m33747a("ad_wap_stat", "stay_page", valueOf, str, String.valueOf(System.currentTimeMillis() - this.f91681a.f91651i)).mo28897a("light_page", 1).mo28902c();
                }
                this.f91681a.f91650h = null;
                AbstractC38808c callback = this.f91681a.getCallback();
                if (callback != null) {
                    callback.mo67434b();
                }
                AbstractC33279b bVar2 = this.f91681a.f91648f;
                if (bVar2 != null) {
                    bVar2.mo59237a(false);
                }
                this.f91681a.mo67416a(4);
            }
        }

        C38816j(C38805a aVar) {
            this.f91681a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$z */
    public static final class C38832z implements AdPopUpWebTitleBar.AbstractC37968b {

        /* renamed from: a */
        final /* synthetic */ C38805a f91700a;

        static {
            Covode.recordClassIndex(46385);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: b */
        public final void mo66172b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: c */
        public final void mo66173c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: a */
        public final void mo66171a() {
            this.f91700a.mo67418b();
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: d */
        public final void mo66174d() {
            if (this.f91700a.f91646d) {
                ShareH5Service a = ShareH5Service.C68827a.m121397a();
                AbstractC40591g crossPlatformBusiness = this.f91700a.getMWebView().getCrossPlatformBusiness();
                SingleWebView a2 = ((AbstractC40746j) this.f91700a.getMWebView().mo69911a(AbstractC40746j.class)).mo69969a();
                C89219l.m154716b(a2, "");
                a.mo109380a(crossPlatformBusiness, a2, 2);
                return;
            }
            ShareH5Service.C68827a.m121397a().mo109379a(this.f91700a.getMWebView().getCrossPlatformBusiness(), 2);
        }

        C38832z(C38805a aVar) {
            this.f91700a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$q */
    public static final class C38823q extends AbstractC89220m implements AbstractC89171a<AdBottomSheetContainer> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91689a;

        static {
            Covode.recordClassIndex(46376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38823q(C38805a aVar) {
            super(0);
            this.f91689a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91689a
                android.view.View r1 = r0.f91643a
                r0 = 2131362607(0x7f0a032f, float:1.8345E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38823q.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$r */
    public static final class C38824r extends AbstractC89220m implements AbstractC89171a<CommonBizWebView> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91690a;

        static {
            Covode.recordClassIndex(46377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38824r(C38805a aVar) {
            super(0);
            this.f91690a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91690a
                android.view.View r1 = r0.f91643a
                r0 = 2131362776(0x7f0a03d8, float:1.8345342E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38824r.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$s */
    public static final class C38825s extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91691a;

        static {
            Covode.recordClassIndex(46378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38825s(C38805a aVar) {
            super(0);
            this.f91691a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.ImageView, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.ImageView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91691a
                android.view.View r1 = r0.f91643a
                r0 = 2131363031(0x7f0a04d7, float:1.834586E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38825s.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$t */
    public static final class C38826t extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91692a;

        static {
            Covode.recordClassIndex(46379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38826t(C38805a aVar) {
            super(0);
            this.f91692a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.FrameLayout invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91692a
                android.view.View r1 = r0.f91643a
                r0 = 2131366579(0x7f0a12b3, float:1.8353056E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38826t.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$u */
    public static final class C38827u extends AbstractC89220m implements AbstractC89171a<AdPopUpWebTitleBar> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91693a;

        static {
            Covode.recordClassIndex(46380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38827u(C38805a aVar) {
            super(0);
            this.f91693a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91693a
                android.view.View r1 = r0.f91643a
                r0 = 2131364358(0x7f0a0a06, float:1.834855E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38827u.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$v */
    public static final class C38828v extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91694a;

        static {
            Covode.recordClassIndex(46381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38828v(C38805a aVar) {
            super(0);
            this.f91694a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.FrameLayout invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91694a
                android.view.View r1 = r0.f91643a
                r0 = 2131365839(0x7f0a0fcf, float:1.8351555E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38828v.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$w */
    public static final class C38829w extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91695a;

        static {
            Covode.recordClassIndex(46382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38829w(C38805a aVar) {
            super(0);
            this.f91695a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.TextView, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.TextView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91695a
                android.view.View r1 = r0.f91643a
                r0 = 2131367647(0x7f0a16df, float:1.8355222E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38829w.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$x */
    public static final class C38830x extends AbstractC89220m implements AbstractC89171a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ C38805a f91696a;

        static {
            Covode.recordClassIndex(46383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38830x(C38805a aVar) {
            super(0);
            this.f91696a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.f91696a
                android.view.View r1 = r0.f91643a
                r0 = 2131370358(0x7f0a2176, float:1.836072E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.C38830x.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$y */
    public static final class C38831y implements DialogC38841c.AbstractC38842a {

        /* renamed from: a */
        final /* synthetic */ C38805a f91697a;

        /* renamed from: b */
        final /* synthetic */ C18288a f91698b;

        /* renamed from: c */
        final /* synthetic */ String f91699c;

        static {
            Covode.recordClassIndex(46384);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.DialogC38841c.AbstractC38842a
        /* renamed from: a */
        public final void mo67445a() {
            C38805a.m78736a(this.f91698b, this.f91699c, false, new LinkedHashMap());
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.DialogC38841c.AbstractC38842a
        /* renamed from: a */
        public final void mo67446a(List<Integer> list) {
            C89219l.m154721d(list, "");
            C38805a.m78736a(this.f91698b, this.f91699c, true, C89041ag.m154427b(new C89378p("selected", list)));
        }

        public C38831y(C38805a aVar, C18288a aVar2, String str) {
            this.f91697a = aVar;
            this.f91698b = aVar2;
            this.f91699c = str;
        }
    }

    /* renamed from: c */
    public final boolean mo67419c() {
        C38810e eVar = this.f91663w;
        if (eVar != null) {
            return eVar.f91673e;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(46358);
    }

    private final boolean getNeedPreload() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        C38810e eVar = this.f91663w;
        if (eVar == null || (aweme = eVar.f91671c) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isPreloadExtraWeb()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo67415a() {
        if (this.f91644b) {
            SSWebView webView = getMBulletWebView().getWebView();
            if (webView != null) {
                webView.loadUrl("about:blank");
                return;
            }
            return;
        }
        CrossPlatformWebView.m82144a(getMWebView(), "about:blank", false, null, 6);
    }

    /* renamed from: b */
    public final void mo67418b() {
        if (this.f91652j) {
            this.f91652j = false;
            C38754l.m78608a(getContext());
            return;
        }
        AdBottomSheetContainer mBottomSheet = getMBottomSheet();
        if (mBottomSheet.mo14580a()) {
            mBottomSheet.f91555h.mo43978c(4);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.m156962a().mo145395b(this.f91641B);
        C38628aj ajVar = this.f91647e;
        if (ajVar != null) {
            ajVar.mo67210b();
        }
        this.f91647e = null;
        AbstractC33279b bVar = this.f91648f;
        if (bVar != null) {
            bVar.mo59237a(false);
        }
        this.f91648f = null;
        if (this.f91644b) {
            this.f91640A.mo62026a(true);
            getMBulletWebView().mo25721a();
            return;
        }
        this.f91666z.mo67291a(true);
        CommercializeWebViewHelper commercializeWebViewHelper = this.f91649g;
        if (commercializeWebViewHelper != null) {
            commercializeWebViewHelper.onPause();
            commercializeWebViewHelper.onDestroy();
        }
        this.f91649g = null;
    }

    /* renamed from: d */
    private final void m78739d() {
        String str;
        C38810e eVar;
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Aweme aweme2;
        C37437a commerceVideoAuthInfo;
        Aweme aweme3;
        C37437a commerceVideoAuthInfo2;
        Aweme aweme4;
        C37437a commerceVideoAuthInfo3;
        Aweme aweme5;
        C37437a commerceVideoAuthInfo4;
        getMFlTitleBar().mo66181c();
        C38810e eVar2 = this.f91663w;
        if (eVar2 != null && (str = eVar2.f91669a) != null && str.length() > 0) {
            String str7 = null;
            if (!(!(getContext() instanceof Activity) || (eVar = this.f91663w) == null || eVar.f91670b == null)) {
                C38751k.C38752a aVar = new C38751k.C38752a();
                C38810e eVar3 = this.f91663w;
                if (eVar3 != null) {
                    aweme = eVar3.f91671c;
                } else {
                    aweme = null;
                }
                Bundle a = C38739d.m78571a((C38751k) aVar.mo67290a(aweme).f91182a);
                C38810e eVar4 = this.f91663w;
                if (eVar4 != null) {
                    str2 = eVar4.f91669a;
                } else {
                    str2 = null;
                }
                a.putString("url", str2);
                a.putInt("preload_web_status", 7);
                C38810e eVar5 = this.f91663w;
                if (eVar5 == null || (aweme5 = eVar5.f91671c) == null || (commerceVideoAuthInfo4 = aweme5.getCommerceVideoAuthInfo()) == null) {
                    str3 = null;
                } else {
                    str3 = commerceVideoAuthInfo4.getAdId();
                }
                a.putString("bundle_ad_id_from_aweme", str3);
                C38810e eVar6 = this.f91663w;
                if (eVar6 == null || (aweme4 = eVar6.f91671c) == null || (commerceVideoAuthInfo3 = aweme4.getCommerceVideoAuthInfo()) == null) {
                    str4 = null;
                } else {
                    str4 = commerceVideoAuthInfo3.getCreativeId();
                }
                a.putString("bundle_creative_id_from_aweme", str4);
                C38810e eVar7 = this.f91663w;
                if (eVar7 == null || (aweme3 = eVar7.f91671c) == null || (commerceVideoAuthInfo2 = aweme3.getCommerceVideoAuthInfo()) == null) {
                    str5 = null;
                } else {
                    str5 = commerceVideoAuthInfo2.getAdvId();
                }
                a.putString("bundle_advertiser_id_from_aweme", str5);
                C38810e eVar8 = this.f91663w;
                if (eVar8 == null || (aweme2 = eVar8.f91671c) == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null) {
                    str6 = null;
                } else {
                    str6 = commerceVideoAuthInfo.getItemId();
                }
                a.putString("bundle_item_id_from_aweme", str6);
                C38810e eVar9 = this.f91663w;
                if (eVar9 != null) {
                    bundle = eVar9.f91674f;
                } else {
                    bundle = null;
                }
                a.putAll(bundle);
                if (this.f91644b) {
                    this.f91645c = a;
                    CommonBizWebView mBulletWebView = getMBulletWebView();
                    AbstractC16239d.AbstractC16241b a2 = C34963b.m71411a().mo61850a();
                    C35189e eVar10 = this.f91640A;
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper((Activity) context);
                    C38810e eVar11 = this.f91663w;
                    if (eVar11 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC1204m mVar = eVar11.f91670b;
                    if (mVar == null) {
                        C89219l.m154715b();
                    }
                    mBulletWebView.mo62060a(a2, eVar10, bulletActivityWrapper, mVar, "ad_commerce");
                } else {
                    CrossPlatformWebView mWebView = getMWebView();
                    C38755m mVar2 = this.f91666z;
                    C38810e eVar12 = this.f91663w;
                    if (eVar12 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC1204m mVar3 = eVar12.f91670b;
                    if (mVar3 == null) {
                        C89219l.m154715b();
                    }
                    Context context2 = getContext();
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    this.f91649g = CommercializeWebViewHelper.m78329a(mWebView, mVar2, mVar3, (Activity) context2, a);
                }
            }
            ShareH5Service a3 = ShareH5Service.C68827a.m121397a();
            AbstractC40591g crossPlatformBusiness = getMWebView().getCrossPlatformBusiness();
            SingleWebView a4 = ((AbstractC40746j) getMWebView().mo69911a(AbstractC40746j.class)).mo69969a();
            C89219l.m154716b(a4, "");
            a3.mo109389b(crossPlatformBusiness, a4, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("source", "light_landing_page");
            linkedHashMap2.put("preload", Integer.valueOf(getNeedPreload() ? 1 : 0));
            String jSONObject = new JSONObject(C89041ag.m154429c(linkedHashMap2)).toString();
            C89219l.m154716b(jSONObject, "");
            linkedHashMap.put("X-Extra-Data", jSONObject);
            if (this.f91644b) {
                CommonBizWebView mBulletWebView2 = getMBulletWebView();
                C38810e eVar13 = this.f91663w;
                if (eVar13 == null) {
                    C89219l.m154715b();
                }
                CommonBizWebView.m72054a(mBulletWebView2, C35301c.m72248a(eVar13.f91669a, C89070n.m154516a("ad_commerce"), this.f91645c, new C35229g(C17867d.m33078a())), linkedHashMap, this.f91645c);
                return;
            }
            CrossPlatformWebView mWebView2 = getMWebView();
            C38810e eVar14 = this.f91663w;
            if (eVar14 == null) {
                C89219l.m154715b();
            }
            CrossPlatformWebView.m82144a(mWebView2, eVar14.f91669a, false, linkedHashMap, 2);
            ShareH5Service a5 = ShareH5Service.C68827a.m121397a();
            AbstractC40591g crossPlatformBusiness2 = getMWebView().getCrossPlatformBusiness();
            C38810e eVar15 = this.f91663w;
            if (eVar15 != null) {
                str7 = eVar15.f91669a;
            }
            a5.mo109381a(crossPlatformBusiness2, str7, 2);
        }
    }

    public final void onAttachedToWindow() {
        Aweme aweme;
        super.onAttachedToWindow();
        EventBus.m156966a(EventBus.m156962a(), this.f91641B);
        AdBottomSheetContainer mBottomSheet = getMBottomSheet();
        FrameLayout mLightWebPage = getMLightWebPage();
        C89219l.m154721d(mLightWebPage, "");
        ViewGroup.LayoutParams layoutParams = mLightWebPage.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.C0560e) layoutParams).mo2538a(mBottomSheet.f91555h);
        C38810e eVar = this.f91663w;
        Activity activity = null;
        if (eVar != null) {
            aweme = eVar.f91671c;
        } else {
            aweme = null;
        }
        if (C37699a.m76210M(aweme)) {
            AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) m78738b(R.id.b5m);
            C89219l.m154716b(adPopUpWebTitleBar, "");
            adPopUpWebTitleBar.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) m78738b(R.id.fii);
            C89219l.m154716b(crossPlatformWebView, "");
            ViewGroup.LayoutParams layoutParams2 = crossPlatformWebView.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.topMargin = 0;
            CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) m78738b(R.id.fii);
            C89219l.m154716b(crossPlatformWebView2, "");
            crossPlatformWebView2.setLayoutParams(layoutParams3);
        }
        getMBottomSheet().setCallback(new C38816j(this));
        getMLightWebPage().setOnClickListener(new View$OnClickListenerC38817k(this));
        getMFlTitleBar().mo66177a();
        getMFlTitleBar().setOnClickListener(null);
        ((ImageView) getMFlTitleBar().findViewById(R.id.d46)).setOnClickListener(new View$OnClickListenerC38818l(this));
        ((ImageView) getMFlTitleBar().findViewById(R.id.d4i)).setOnClickListener(new View$OnClickListenerC38819m(this));
        FrameLayout mLightWebPage2 = getMLightWebPage();
        int paddingLeft = getPaddingLeft();
        double a = (double) C34723i.m70924a(getContext());
        Double.isNaN(a);
        mLightWebPage2.setPadding(paddingLeft, (int) (a * 0.26836581709145424d), getPaddingRight(), getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f91644b) {
                SSWebView webView = getMBulletWebView().getWebView();
                if (webView != null) {
                    webView.setOnScrollChangeListener(new View$OnScrollChangeListenerC38820n(this));
                }
            } else {
                ((AbstractC40746j) getMWebView().mo69911a(AbstractC40746j.class)).mo69969a().setOnScrollChangeListener(new View$OnScrollChangeListenerC38821o(this));
            }
        }
        getMRetryView().setOnClickListener(new View$OnClickListenerC38822p(this));
        Context context = getContext();
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            C38628aj ajVar = new C38628aj(activity2);
            ajVar.f91287d = new C38813g(this);
            this.f91647e = ajVar;
            this.f91648f = new C38815i(this, activity2, activity2);
            SingleWebView a2 = ((AbstractC40746j) getMWebView().mo69911a(AbstractC40746j.class)).mo69969a();
            if (a2 != null) {
                a2.setWebChromeClient(new C38814h(a2, a2, this));
            }
        }
        if (getNeedPreload()) {
            m78739d();
        }
    }

    public final void setCallback(AbstractC38808c cVar) {
        this.f91664x = cVar;
    }

    public final void setParams(C38810e eVar) {
        this.f91663w = eVar;
    }

    public final void setTitleBarState(int i) {
        this.f91665y = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$f */
    public static final class C38812f implements AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        final /* synthetic */ C38805a f91675a;

        static {
            Covode.recordClassIndex(46365);
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(200, new RunnableC90250g(C38812f.class, "onEvent", GetWebViewInfo.C47833b.class, ThreadMode.POSTING, 0, false));
            hashMap.put(255, new RunnableC90250g(C38812f.class, "onEvent", GetWebViewInfo.C34974a.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        C38812f(C38805a aVar) {
            this.f91675a = aVar;
        }

        public final void onEvent(GetWebViewInfo.C47833b bVar) {
            CommercializeWebViewHelper commercializeWebViewHelper;
            com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness a;
            if (bVar != null && (commercializeWebViewHelper = this.f91675a.f91649g) != null && (a = PreRenderWebViewBusiness.C40581a.m81921a(commercializeWebViewHelper)) != null) {
                a.mo69737a(this.f91675a.getMWebView(), bVar);
            }
        }

        public final void onEvent(GetWebViewInfo.C34974a aVar) {
            C35222b rootContainer;
            AbstractC35125b bVar;
            com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a;
            if (aVar != null && this.f91675a.f91644b && (rootContainer = this.f91675a.getMBulletWebView().getRootContainer()) != null && (bVar = rootContainer.f83165z) != null && (a = PreRenderWebViewBusiness.C35121a.m71835a(bVar)) != null) {
                a.mo61968a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$g */
    public static final class C38813g implements C38628aj.AbstractC38629a {

        /* renamed from: a */
        final /* synthetic */ C38805a f91676a;

        static {
            Covode.recordClassIndex(46366);
        }

        C38813g(C38805a aVar) {
            this.f91676a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38628aj.AbstractC38629a
        /* renamed from: a */
        public final void mo67212a(int i, int i2, int i3) {
            boolean z;
            String str;
            C38805a aVar = this.f91676a;
            if (i2 < i) {
                z = true;
            } else {
                z = false;
            }
            aVar.f91652j = z;
            if (this.f91676a.f91652j) {
                str = "keyboardDidShow";
            } else {
                str = "keyboardDidHide";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("height", Integer.valueOf(C34728n.m70948b((double) (i3 - i2))));
            if (this.f91676a.f91644b) {
                this.f91676a.getMBulletWebView().mo62061a(str, new JSONObject(C89041ag.m154429c(linkedHashMap)));
            } else {
                this.f91676a.getMWebView().mo69918a(str, new JSONObject(C89041ag.m154429c(linkedHashMap)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$k */
    static final class View$OnClickListenerC38817k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38805a f91683a;

        static {
            Covode.recordClassIndex(46370);
        }

        View$OnClickListenerC38817k(C38805a aVar) {
            this.f91683a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91683a.f91650h = "blank";
            this.f91683a.mo67418b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$l */
    static final class View$OnClickListenerC38818l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38805a f91684a;

        static {
            Covode.recordClassIndex(46371);
        }

        View$OnClickListenerC38818l(C38805a aVar) {
            this.f91684a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91684a.f91653k.f91700a.mo67418b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$m */
    static final class View$OnClickListenerC38819m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38805a f91685a;

        static {
            Covode.recordClassIndex(46372);
        }

        View$OnClickListenerC38819m(C38805a aVar) {
            this.f91685a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91685a.f91653k.mo66174d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$p */
    static final class View$OnClickListenerC38822p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38805a f91688a;

        static {
            Covode.recordClassIndex(46375);
        }

        View$OnClickListenerC38822p(C38805a aVar) {
            this.f91688a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C38810e params = this.f91688a.getParams();
            if (params != null && (str = params.f91669a) != null && str.length() > 0 && 1 != 0) {
                if (this.f91688a.f91644b) {
                    AbstractC17046h.C17047a.m31518a(this.f91688a.getMBulletWebView(), C35301c.m72248a(str, C89070n.m154516a("ad_commerce"), this.f91688a.f91645c, new C35229g(C17867d.m33078a())), this.f91688a.f91645c, null, 4);
                } else {
                    CrossPlatformWebView.m82144a(this.f91688a.getMWebView(), str, false, null, 6);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67416a(int i) {
        if (i == 1) {
            this.f91665y = 1;
        } else if (i == 7) {
            int i2 = this.f91665y;
            if (i2 != 7 && i2 != 4) {
                this.f91665y = 7;
            }
        } else if (i == 3) {
            this.f91665y = 3;
        } else if (i == 4) {
            this.f91665y = 4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C38805a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8549);
        View inflate = View.inflate(context, R.layout.a90, this);
        C89219l.m154716b(inflate, "");
        this.f91643a = inflate;
        this.f91655o = C89250i.m154773a((AbstractC89171a) new C38823q(this));
        this.f91656p = C89250i.m154773a((AbstractC89171a) new C38828v(this));
        this.f91657q = C89250i.m154773a((AbstractC89171a) new C38830x(this));
        this.f91658r = C89250i.m154773a((AbstractC89171a) new C38824r(this));
        this.f91659s = C89250i.m154773a((AbstractC89171a) new C38825s(this));
        this.f91660t = C89250i.m154773a((AbstractC89171a) new C38826t(this));
        this.f91661u = C89250i.m154773a((AbstractC89171a) new C38829w(this));
        this.f91644b = C37588c.m75846b();
        this.f91662v = C89250i.m154773a((AbstractC89171a) new C38827u(this));
        this.f91665y = 4;
        C38755m mVar = new C38755m();
        mVar.f91529e = new C38806a(this);
        this.f91666z = mVar;
        C35189e eVar = new C35189e();
        eVar.f83061f = new C38807b(this);
        this.f91640A = eVar;
        this.f91641B = new C38812f(this);
        this.f91653k = new C38832z(this);
        MethodCollector.m26664o(8549);
    }

    /* renamed from: a */
    public final void mo67417a(String str) {
        AbstractC38808c cVar;
        getMBottomSheet().f91555h.mo43978c(3);
        getMFlTitleBar().mo66180b("");
        if (!getNeedPreload()) {
            m78739d();
        }
        this.f91654l = str;
        if (C89219l.m154714a((Object) PreRenderWebViewBusiness.C40581a.m81922a(3), (Object) str) && (cVar = this.f91664x) != null) {
            cVar.mo67435c();
        }
    }

    public /* synthetic */ C38805a(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$h */
    public static final class C38814h extends SingleWebChromeClient {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f91677a;

        /* renamed from: b */
        final /* synthetic */ C38805a f91678b;

        static {
            Covode.recordClassIndex(46367);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            this.f91678b.getMFlTitleBar().mo66178a(str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38814h(SingleWebView singleWebView, WebView webView, C38805a aVar) {
            super(webView);
            this.f91677a = singleWebView;
            this.f91678b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$i */
    public static final class C38815i extends AbstractC33279b {

        /* renamed from: a */
        final /* synthetic */ C38805a f91679a;

        /* renamed from: b */
        final /* synthetic */ Activity f91680b;

        static {
            Covode.recordClassIndex(46368);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f91679a.getMBottomSheet().mo14580a()) {
                return false;
            }
            this.f91679a.f91650h = "back";
            this.f91679a.mo67418b();
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38815i(C38805a aVar, Activity activity, Activity activity2) {
            super(activity2);
            this.f91679a = aVar;
            this.f91680b = activity;
        }
    }

    /* renamed from: a */
    public static void m78736a(C18288a aVar, String str, boolean z, Map<String, Object> map) {
        map.put("code", Integer.valueOf(z ? 1 : 0));
        if (aVar != null) {
            aVar.mo29249a(str, new JSONObject(map));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$n */
    static final class View$OnScrollChangeListenerC38820n implements View.OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ C38805a f91686a;

        static {
            Covode.recordClassIndex(46373);
        }

        View$OnScrollChangeListenerC38820n(C38805a aVar) {
            this.f91686a = aVar;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f91686a.getMBottomSheet();
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$o */
    static final class View$OnScrollChangeListenerC38821o implements View.OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ C38805a f91687a;

        static {
            Covode.recordClassIndex(46374);
        }

        View$OnScrollChangeListenerC38821o(C38805a aVar) {
            this.f91687a = aVar;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f91687a.getMBottomSheet();
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }
}
