package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.jsbridge2.AbstractC18359s;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.example.p1811a.C23833c;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.C28027t;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.newmedia.p2163a.C30123b;
import com.p2082ss.android.newmedia.p2167e.p2168a.C30134a;
import com.p2082ss.android.sdk.webview.AbstractC30261g;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.sdk.webview.C30262h;
import com.p2082ss.android.sdk.webview.C30265i;
import com.p2082ss.android.sdk.webview.p2175a.C30239e;
import com.p2082ss.android.sdk.webview.p2175a.C30243h;
import com.p2082ss.android.sdk.webview.p2176di.C30247a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService;
import com.p2082ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38682bi;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38749j;
import com.p2082ss.android.ugc.aweme.crossplatform.abtest.C40524a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40596a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.C40698j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40736b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2291e.C33197a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34306ae;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2357a.C34294a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.web.AbstractC81548i;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.C81632l;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81621s;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView */
public final class SingleWebView extends C40708n implements AbstractC18359s, AbstractC33974au, AbstractC90252i, AbstractC90253j {
    private SparseArray _$_findViewCache;
    private Map<String, String> additionReportParams;
    private AbstractC81548i baseJsMessageHandler;
    private boolean canScrollVertically;
    private final AbstractC89244h chromeVersion$delegate;
    private C30245c contextProviderFactory;
    private String curUrl;
    private boolean disableIntercept;
    private C40670d[] disableInterceptRegionList;
    private boolean enableScrollControl;
    private final AbstractC89244h gson$delegate;
    public AbstractC40547m iCrossPlatformActivityContainer;
    private C30248e iesJsBridge;
    private boolean isVastAd;
    private final AbstractC89244h lastClickDetector$delegate;
    public long lastClickTime;
    private C40707m mTTNetInterceptorWrapper;
    private C34337k monitorSession;
    private boolean monitorSessionCreatedBySelf;
    private String pageCommitVisibleUrl;
    public String pageStartUrl;
    public List<String> pauseList;
    private AbstractC40736b scrollListener;
    private SingleWebChromeClient singleWebChromeClient;
    private C40698j singleWebViewClient;
    private Set<String> visitedUrls;
    private View.OnTouchListener webviewTouchListener;

    static {
        Covode.recordClassIndex(48509);
    }

    public SingleWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m82041xe17e4a56(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m82042xe17e4a56(String str, String str2, Throwable th) {
        return 0;
    }

    private final C27910f getGson() {
        return (C27910f) this.gson$delegate.getValue();
    }

    private final GestureDetector getLastClickDetector() {
        return (GestureDetector) this.lastClickDetector$delegate.getValue();
    }

    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d
    public final boolean canGoBack() {
        return m82043xc5c812f(this);
    }

    public final String getChromeVersion() {
        return (String) this.chromeVersion$delegate.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(339, new RunnableC90250g(SingleWebView.class, "onJsBroadcast", C47959j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d
    public final void goBack() {
        m82044x4d59349f(this);
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d
    public final void loadUrl(String str) {
        m82045x680289f9(this, str);
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d, android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        m82046x680289f9(this, str, map);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    public final Map<String, String> getAdditionReportParams() {
        return this.additionReportParams;
    }

    public final AbstractC81548i getBaseJsMessageHandler() {
        return this.baseJsMessageHandler;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final boolean getEnableScrollControl() {
        return this.enableScrollControl;
    }

    public final long getLastClickTime() {
        return this.lastClickTime;
    }

    public final C34337k getMonitorSession() {
        return this.monitorSession;
    }

    public final boolean getMonitorSessionCreatedBySelf() {
        return this.monitorSessionCreatedBySelf;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18359s
    public final String getSafeUrl() {
        return this.pageStartUrl;
    }

    public final SingleWebChromeClient getSingleWebChromeClient() {
        return this.singleWebChromeClient;
    }

    public final View.OnTouchListener getWebviewTouchListener() {
        return this.webviewTouchListener;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c */
    public static final class C40669c implements AbstractC30261g<C34337k> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95260a;

        static {
            Covode.recordClassIndex(48515);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* synthetic */ C34337k mo53714a() {
            return this.f95260a.getMonitorSession();
        }

        C40669c(SingleWebView singleWebView) {
            this.f95260a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$g */
    static final class C40673g extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C40673g f95267a = new C40673g();

        static {
            Covode.recordClassIndex(48519);
        }

        C40673g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$k */
    public static final class C40677k implements AbstractC30261g<C34337k> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95271a;

        static {
            Covode.recordClassIndex(48523);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* synthetic */ C34337k mo53714a() {
            return this.f95271a.getMonitorSession();
        }

        C40677k(SingleWebView singleWebView) {
            this.f95271a = singleWebView;
        }
    }

    public final boolean SingleWebView__canGoBack$___twin___() {
        return super.canGoBack();
    }

    public final void transparentBackground() {
        setBackgroundColor(0);
    }

    private final void addPageStartListener() {
        addOnSingleWebViewStatus(new C40671e(this));
    }

    public final void SingleWebView__goBack$___twin___() {
        C40596a.m81947a().mo19249p(this);
        super.goBack();
    }

    public final void destroy() {
        C40596a.m81947a().mo19247l(this);
        super.destroy();
    }

    public final C18364w getJsBridge2() {
        C30248e eVar = this.iesJsBridge;
        if (eVar != null) {
            return eVar.f72168d;
        }
        return null;
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d
    public final void reload() {
        C40596a.m81947a().mo19248n(this);
        super.reload();
    }

    public final void setLoadNoCache() {
        WebSettings settings = getSettings();
        C89219l.m154716b(settings, "");
        settings.setCacheMode(2);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$a */
    public static final class C40667a implements AbstractC30261g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95258a;

        static {
            Covode.recordClassIndex(48513);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* synthetic */ AbsActivityContainer mo53714a() {
            AbstractC40547m mVar = this.f95258a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof AbsActivityContainer)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
            return mVar;
        }

        C40667a(SingleWebView singleWebView) {
            this.f95258a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$b */
    public static final class C40668b implements AbstractC30261g<C38682bi> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95259a;

        static {
            Covode.recordClassIndex(48514);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* synthetic */ C38682bi mo53714a() {
            AbstractC40547m mVar = this.f95259a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof C38682bi)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.utils.NoTitleBarWebViewContainer");
            return mVar;
        }

        C40668b(SingleWebView singleWebView) {
            this.f95259a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$d */
    public static final class C40670d {
        @AbstractC27891c(mo46611a = "x")

        /* renamed from: a */
        public final double f95261a = Double.MIN_VALUE;
        @AbstractC27891c(mo46611a = "y")

        /* renamed from: b */
        public final double f95262b = Double.MIN_VALUE;
        @AbstractC27891c(mo46611a = "width")

        /* renamed from: c */
        public final double f95263c = Double.MAX_VALUE;
        @AbstractC27891c(mo46611a = "height")

        /* renamed from: d */
        public final double f95264d = Double.MAX_VALUE;

        static {
            Covode.recordClassIndex(48516);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C40670d)) {
                return false;
            }
            C40670d dVar = (C40670d) obj;
            return Double.compare(this.f95261a, dVar.f95261a) == 0 && Double.compare(this.f95262b, dVar.f95262b) == 0 && Double.compare(this.f95263c, dVar.f95263c) == 0 && Double.compare(this.f95264d, dVar.f95264d) == 0;
        }

        public final int hashCode() {
            return (((((m82051a(this.f95261a) * 31) + m82051a(this.f95262b)) * 31) + m82051a(this.f95263c)) * 31) + m82051a(this.f95264d);
        }

        public final String toString() {
            return "DisableInterceptRegion(x=" + this.f95261a + ", y=" + this.f95262b + ", width=" + this.f95263c + ", height=" + this.f95264d + ")";
        }

        private C40670d() {
        }

        /* renamed from: a */
        private static int m82051a(double d) {
            long doubleToLongBits = Double.doubleToLongBits(d);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$i */
    public static final class C40675i implements AbstractC30261g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95269a;

        static {
            Covode.recordClassIndex(48521);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* synthetic */ AbsActivityContainer mo53714a() {
            AbstractC40547m mVar = this.f95269a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof AbsActivityContainer)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
            return mVar;
        }

        C40675i(SingleWebView singleWebView) {
            this.f95269a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$j */
    public static final class C40676j implements AbstractC30261g<C38682bi> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95270a;

        static {
            Covode.recordClassIndex(48522);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* synthetic */ C38682bi mo53714a() {
            AbstractC40547m mVar = this.f95270a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof C38682bi)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.utils.NoTitleBarWebViewContainer");
            return mVar;
        }

        C40676j(SingleWebView singleWebView) {
            this.f95270a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$o */
    static final class C40681o extends AbstractC89220m implements AbstractC89171a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95275a;

        /* renamed from: b */
        final /* synthetic */ Context f95276b;

        static {
            Covode.recordClassIndex(48527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40681o(SingleWebView singleWebView, Context context) {
            super(0);
            this.f95275a = singleWebView;
            this.f95276b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GestureDetector invoke() {
            GestureDetector gestureDetector = new GestureDetector(this.f95276b, new GestureDetector.SimpleOnGestureListener(this) {
                /* class com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C40681o.C406821 */

                /* renamed from: a */
                final /* synthetic */ C40681o f95277a;

                static {
                    Covode.recordClassIndex(48528);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f95277a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f95277a.f95275a.lastClickTime = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    private final void enableTTWebViewFullProcessLog() {
        C40618a crossPlatformParams;
        C40628b bVar;
        AbstractC40547m mVar = this.iCrossPlatformActivityContainer;
        if (mVar != null && (crossPlatformParams = mVar.getCrossPlatformParams()) != null && (bVar = crossPlatformParams.f95069b) != null && bVar.f95124s) {
            int i = Build.VERSION.SDK_INT;
            evaluateJavascript("ttwebview:/*enableTTLogEvent*/;", null);
        }
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final void contextDestroy() {
        this.baseJsMessageHandler.mo53692e();
        C30123b.m60933a(this);
        C40698j jVar = this.singleWebViewClient;
        if (jVar != null) {
            C40780g.m82246c().execute(new C40698j.RunnableC40700b(jVar));
        }
    }

    public final void contextPause() {
        onPause();
        C30123b.m60932a(getContext(), this);
        if (getInPauseList() || this.isVastAd) {
            pauseTimers();
        }
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d
    public final boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastClickTime < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        C40596a.m81947a().mo19250r(this);
        super.onAttachedToWindow();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$f */
    static final class C40672f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95266a;

        static {
            Covode.recordClassIndex(48518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40672f(SingleWebView singleWebView) {
            super(0);
            this.f95266a = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            C40603d a = C40603d.C40604a.m81964a();
            SingleWebView singleWebView = this.f95266a;
            C89219l.m154721d(singleWebView, "");
            WebSettings settings = singleWebView.getSettings();
            C89219l.m154716b(settings, "");
            String userAgentString = settings.getUserAgentString();
            C89350l lVar = a.f95025e;
            C89219l.m154716b(userAgentString, "");
            AbstractC89345j find$default = C89350l.find$default(lVar, userAgentString, 0, 2, null);
            if (find$default == null || find$default.mo143722d().size() < 2 || (str = find$default.mo143722d().get(1)) == null) {
                return "not_found";
            }
            return str;
        }
    }

    private final boolean getInPauseList() {
        AbstractC89306h e;
        List<String> list = this.pauseList;
        if (!(list == null || (e = C89309k.m154809e(C89070n.m154598r(list))) == null)) {
            Iterator a = e.mo2926a();
            while (a.hasNext()) {
                String str = (String) a.next();
                String url = getUrl();
                if (url != null && C89361p.m154874b(url, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void initConfig() {
        C30134a a = C30134a.m60958a(getContext());
        a.f71890a = true;
        a.mo53511a(this);
        setFocusableInTouchMode(true);
        setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
        WebSettings settings = getSettings();
        C89219l.m154716b(settings, "");
        settings.setCacheMode(getCacheMode());
        C33391a.m68475a(new C40674h(this));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        C34337k kVar;
        super.onDetachedFromWindow();
        EventBus.m156962a().mo145395b(this);
        if (this.monitorSessionCreatedBySelf && (kVar = this.monitorSession) != null && kVar.f81084c) {
            C40603d.C40604a.m81964a().mo69761b(kVar.bF_());
        }
    }

    private final int getCacheMode() {
        Intent intent;
        Activity activity = getActivity();
        List<String> list = null;
        String valueOf = String.valueOf((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData());
        m82041xe17e4a56("WebViewCache", "uriString:".concat(String.valueOf(valueOf)));
        String decode = Uri.decode(valueOf);
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            list = iESSettingsProxy.getWebviewCacheUrls();
        } catch (Throwable unused) {
        }
        if (!(list == null || decode == null)) {
            for (String str : list) {
                if (C89361p.m154908a((CharSequence) decode, (CharSequence) str, false)) {
                    m82041xe17e4a56("WebViewCache", "settings.cache mode:WebSettings.LOAD_NO_CACHE");
                    return 2;
                }
            }
        }
        m82041xe17e4a56("WebViewCache", "cache mode:WebSettings.LOAD_DEFAULT");
        return -1;
    }

    private final boolean isAllowJsbMonitor() {
        Uri parse;
        String host;
        try {
            String str = this.curUrl;
            if (!(str == null || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
                C40603d.C40604a.m81964a();
                HybridMonitorConfig a = C40603d.m81955a();
                if (a != null) {
                    if (a.getJsbHostAllowList().isEmpty()) {
                        return true;
                    }
                    for (String str2 : a.getJsbHostAllowList()) {
                        C89219l.m154716b(host, "");
                        C89219l.m154716b(str2, "");
                        if (C89361p.m154908a((CharSequence) host, (CharSequence) str2, false)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void contextResume() {
        C30239e eVar = this.baseJsMessageHandler.f72146z;
        if (!TextUtils.isEmpty(eVar.f72152b)) {
            int i = 0;
            if (!TextUtils.isEmpty(eVar.f72151a) ? C30247a.m61216a().f72163a.isPlatformBinded(eVar.f72151a) : !(!C30247a.m61216a().f72163a.hasPlatformBinded() && !C30247a.m61216a().f72163a.isPlatformBinded(C30247a.m61216a().f72163a.getPlayNameMobile()))) {
                i = 1;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                if (eVar.f72153c != null) {
                    eVar.f72153c.mo29249a(eVar.f72152b, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        eVar.f72152b = null;
        eVar.f72151a = null;
        onResume();
        resumeTimers();
    }

    public final void setAdditionReportParams(Map<String, String> map) {
        this.additionReportParams = map;
    }

    public final void setAdditionalReportParams(Map<String, String> map) {
        this.additionReportParams = map;
    }

    public final void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    public final void setEnableScrollControl(boolean z) {
        this.enableScrollControl = z;
    }

    public final void setMonitorSession(C34337k kVar) {
        this.monitorSession = kVar;
    }

    public final void setMonitorSessionCreatedBySelf(boolean z) {
        this.monitorSessionCreatedBySelf = z;
    }

    public final void setSingleWebChromeClient(SingleWebChromeClient singleWebChromeClient2) {
        this.singleWebChromeClient = singleWebChromeClient2;
    }

    public final void setWebScrollListener(AbstractC40736b bVar) {
        this.scrollListener = bVar;
    }

    public final void setWebviewTouchListener(View.OnTouchListener onTouchListener) {
        this.webviewTouchListener = onTouchListener;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$e */
    public static final class C40671e implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95265a;

        static {
            Covode.recordClassIndex(48517);
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
        public final void mo61846a(WebView webView, String str) {
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
        C40671e(SingleWebView singleWebView) {
            this.f95265a = singleWebView;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (Build.VERSION.SDK_INT >= 21 && C40524a.m81745a() && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f95265a.pageStartUrl = "about:blank";
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
            this.f95265a.pageStartUrl = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            if (C40524a.m81745a()) {
                this.f95265a.pageStartUrl = "about:blank";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$n */
    public static final class View$OnAttachStateChangeListenerC40680n implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95274a;

        static {
            Covode.recordClassIndex(48526);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC40680n(SingleWebView singleWebView) {
            this.f95274a = singleWebView;
        }

        public final void onViewAttachedToWindow(View view) {
            AbstractC34340m mVar;
            C89219l.m154721d(view, "");
            C34337k monitorSession = this.f95274a.getMonitorSession();
            if (monitorSession != null && (mVar = (AbstractC34340m) monitorSession.mo60793a(AbstractC34340m.class)) != null) {
                mVar.mo60791j();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            AbstractC34340m mVar;
            C89219l.m154721d(view, "");
            C34337k monitorSession = this.f95274a.getMonitorSession();
            if (!(monitorSession == null || (mVar = (AbstractC34340m) monitorSession.mo60793a(AbstractC34340m.class)) == null)) {
                mVar.mo60792k();
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public final void setBaseJsMessageHandler(AbstractC81548i iVar) {
        C89219l.m154721d(iVar, "");
        this.baseJsMessageHandler = iVar;
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack */
    public static boolean m82043xc5c812f(SingleWebView singleWebView) {
        if (!singleWebView.SingleWebView__canGoBack$___twin___() || !C84365i.m145120a(singleWebView)) {
            return false;
        }
        return true;
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack */
    public static void m82044x4d59349f(SingleWebView singleWebView) {
        if (!C84365i.m145121b(singleWebView)) {
            singleWebView.SingleWebView__goBack$___twin___();
        }
    }

    public final void addOnSingleWebViewStatus(AbstractC40691e eVar) {
        C89219l.m154721d(eVar, "");
        C40698j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f95294a.add(eVar);
        }
    }

    public final void addOnWebChromeStatus(AbstractC40692f fVar) {
        C89219l.m154721d(fVar, "");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f95251g.add(fVar);
        }
    }

    public final void controlGeolocationPermissions(boolean z) {
        this.baseJsMessageHandler.f72145y = Boolean.valueOf(z);
    }

    public final boolean isVisited(String str) {
        C89219l.m154721d(str, "");
        return this.visitedUrls.contains(str);
    }

    public final void removeOnSingleWebViewStatus(AbstractC40691e eVar) {
        C89219l.m154721d(eVar, "");
        C40698j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f95294a.remove(eVar);
        }
    }

    public final void removeOnWebChromeStatus(AbstractC40692f fVar) {
        C89219l.m154721d(fVar, "");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f95251g.remove(fVar);
        }
    }

    public final void setShouldOverrideInterceptor(AbstractC89183m<? super WebView, ? super String, Boolean> mVar) {
        C89219l.m154721d(mVar, "");
        C40698j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f95295b = mVar;
        }
    }

    public final void setShouldOverrideUrlLoadingListener(AbstractC40696h hVar) {
        C89219l.m154721d(hVar, "");
        C40698j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f95296c = hVar;
        }
    }

    public final void visit(String str) {
        C89219l.m154721d(str, "");
        this.visitedUrls.add(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$h */
    public static final class C40674h extends AbstractC89220m implements AbstractC89172b<C33197a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95268a;

        static {
            Covode.recordClassIndex(48520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40674h(SingleWebView singleWebView) {
            super(1);
            this.f95268a = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C33197a aVar) {
            C33197a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f95268a.setTimeInterval(aVar2.getAutoJumpInterval());
            this.f95268a.pauseList = aVar2.getPauseList();
            return C89391z.f203057a;
        }
    }

    public final boolean canScrollVertically(int i) {
        if (!this.enableScrollControl) {
            return super.canScrollVertically(i);
        }
        if (!this.canScrollVertically || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    public SingleWebView(Context context) {
        this(context, null, 0, 6, null);
        if (C84367b.m145126a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C1764a.m5930a(settings, sb.toString());
            }
        }
    }

    private final String appendStatusBarHeightIfNeeded(String str) {
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("__status_bar");
            if (queryParameter == null || !C89219l.m154714a((Object) queryParameter, (Object) "true")) {
                return str;
            }
            String builder = parse.buildUpon().appendQueryParameter("status_bar_height", String.valueOf(C13628n.m24522c(C17867d.m33078a(), ((float) C13628n.m24525e(C17867d.m33078a())) + 0.0f))).toString();
            C89219l.m154716b(builder, "");
            return builder;
        } catch (Exception e) {
            m82041xe17e4a56("SingleWebView", "Append status_bar_height exception [" + e.getMessage() + "] for url " + str);
            return str;
        }
    }

    public final void SingleWebView__loadUrl$___twin___(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            C40596a.m81947a().mo19245g(this, str);
            if (C40714q.m82129a(String.valueOf(str))) {
                C40707m mVar = new C40707m(String.valueOf(str));
                this.mTTNetInterceptorWrapper = mVar;
                C40698j jVar = this.singleWebViewClient;
                if (jVar != null) {
                    jVar.f95299g = mVar;
                }
            }
            String beforeLoadUrl = beforeLoadUrl(str);
            AbstractC89188r<? super WebView, ? super String, ? super Map<String, String>, ? super AbstractC89183m<? super String, ? super Map<String, String>, C89391z>, C89391z> rVar = C40714q.f95322b.f95326a;
            if (rVar != null) {
                rVar.mo8774a(this, beforeLoadUrl, null, new C40683p(this, beforeLoadUrl));
            } else {
                super.loadUrl(beforeLoadUrl);
            }
        }
    }

    @AbstractC90264r
    public final void onJsBroadcast(C47959j jVar) {
        String str;
        C89219l.m154721d(jVar, "");
        AbstractC28019l a = C28024q.m56139a(jVar.f111077b.toString());
        C89219l.m154716b(a, "");
        C28022o j = a.mo46789j();
        AbstractC28019l c = j.mo46803c("eventName");
        if (c != null) {
            str = c.mo46689c();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "disableIntercept")) {
            m82041xe17e4a56("afpro", "got disableIntercept event");
            AbstractC28019l c2 = j.mo46803c("data");
            if (c2 != null) {
                try {
                    this.disableInterceptRegionList = (C40670d[]) getGson().mo46667a(c2, C40670d[].class);
                    return;
                } catch (C28027t e) {
                    m82042xe17e4a56("afpro", "parse region failed", e);
                }
            }
            this.disableInterceptRegionList = null;
        }
    }

    @Override // com.p2082ss.android.newmedia.p2167e.p2168a.C30140d
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C89219l.m154721d(motionEvent, "");
        m82041xe17e4a56("afpro", "webview touch ".concat(String.valueOf(motionEvent)));
        if (motionEvent.getActionMasked() == 0) {
            this.disableIntercept = false;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int b = C34728n.m70948b((double) (motionEvent.getRawX() - ((float) iArr[0])));
            int b2 = C34728n.m70948b((double) (motionEvent.getRawY() - ((float) iArr[1])));
            C40670d[] dVarArr = this.disableInterceptRegionList;
            if (dVarArr != null) {
                int length = dVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C40670d dVar = dVarArr[i];
                    double d = (double) b;
                    if (d >= dVar.f95261a && d <= dVar.f95261a + dVar.f95263c) {
                        double d2 = (double) b2;
                        if (d2 >= dVar.f95262b && d2 <= dVar.f95262b + dVar.f95264d) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.disableIntercept = z;
            }
            z = false;
            this.disableIntercept = z;
        }
        if (this.disableIntercept) {
            requestDisallowInterceptTouchEvent(true);
            m82041xe17e4a56("afpro", "webview touch disable intercept");
        }
        if (this.canTouch) {
            getLastClickDetector().onTouchEvent(motionEvent);
            View.OnTouchListener onTouchListener = this.webviewTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
        if (!this.enableScrollControl) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.canScrollVertically) {
            requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 2) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void initWeb(Activity activity) {
        C89219l.m154721d(activity, "");
        C34294a.f81086m = SystemClock.uptimeMillis();
        this.lastClickTime = 0;
        this.contextProviderFactory = new C30245c();
        this.baseJsMessageHandler = C81621s.m141472a(activity);
        this.iCrossPlatformActivityContainer = null;
        this.singleWebChromeClient = null;
        this.disableInterceptRegionList = null;
        this.pauseList = null;
        this.mTTNetInterceptorWrapper = null;
        this.visitedUrls = new LinkedHashSet();
        C30245c cVar = this.contextProviderFactory;
        cVar.mo53699a(AbsActivityContainer.class, new C40675i(this));
        cVar.mo53699a(C38682bi.class, new C40676j(this));
        cVar.mo53699a(C34337k.class, new C40677k(this));
        this.singleWebViewClient = new C40698j();
        addPageStartListener();
        C40698j jVar = this.singleWebViewClient;
        if (jVar == null) {
            C89219l.m154715b();
        }
        m82047xca8881a0(this, jVar);
        SingleWebChromeClient singleWebChromeClient2 = new SingleWebChromeClient(this);
        this.singleWebChromeClient = singleWebChromeClient2;
        singleWebChromeClient2.f95249e = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        boolean z = true;
        if (C16048b.m29633a().mo25412a(false, "use_injection_jsb", 1) != 1) {
            z = false;
        }
        C30248e a = C30248e.C30250b.m61225a(this);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            C89219l.m154715b();
        }
        C30248e a2 = a.mo53708a(singleWebChromeClient3);
        C40698j jVar2 = this.singleWebViewClient;
        if (jVar2 == null) {
            C89219l.m154715b();
        }
        C30248e a3 = a2.mo53709a(jVar2);
        a3.f72172h = this.contextProviderFactory;
        C30248e a4 = a3.mo53710a(this.baseJsMessageHandler);
        a4.f72169e = false;
        a4.f72170f = new C40693g();
        a4.f72167c = z;
        C30248e a5 = C30248e.m61218a(a4, null, false, new C40678l(this), new C40679m(this), 3);
        this.iesJsBridge = a5;
        this.baseJsMessageHandler.mo53680a(a5, this.contextProviderFactory);
        if (SettingsManager.m29616a().mo25400a("jsb_open_third_app", false)) {
            this.iesJsBridge.mo53711a("openThirdApp", new C30243h(new WeakReference(activity)));
        }
        C40698j jVar3 = this.singleWebViewClient;
        if (jVar3 == null) {
            C89219l.m154715b();
        }
        jVar3.f43667d = this.iesJsBridge.f72166b;
        initConfig();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC40680n(this));
    }

    public final void setCrossPlatformActivityContainer(AbstractC40547m mVar) {
        String str;
        Long g;
        boolean z;
        C40618a crossPlatformParams;
        C40628b bVar;
        C40628b bVar2;
        C40618a crossPlatformParams2;
        AbstractC40591g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        AbstractC40591g crossPlatformBusiness2;
        AdWebStatBusiness adWebStatBusiness2;
        AbstractC40591g crossPlatformBusiness3;
        AdWebStatBusiness adWebStatBusiness3;
        C40618a crossPlatformParams3;
        C40628b bVar3;
        boolean z2 = false;
        long j = 0;
        if (mVar != null) {
            this.iCrossPlatformActivityContainer = mVar;
            ILegacyCommercializeService l = LegacyCommercializeServiceImpl.m75830l();
            C89219l.m154716b(l, "");
            AbstractC38677bd h = l.mo65454h();
            IAwemeService b = AwemeService.m70060b();
            AbstractC40547m mVar2 = this.iCrossPlatformActivityContainer;
            if (mVar2 == null || (crossPlatformParams3 = mVar2.getCrossPlatformParams()) == null || (bVar3 = crossPlatformParams3.f95069b) == null) {
                str = null;
            } else {
                str = String.valueOf(bVar3.f95106a);
            }
            this.isVastAd = h.mo67249a(b.mo60691e(str));
            SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
            if (singleWebChromeClient2 != null) {
                singleWebChromeClient2.f95250f = mVar;
            }
            C40698j jVar = this.singleWebViewClient;
            if (jVar != null) {
                jVar.f95302j = mVar;
                C81631k kVar = C81631k.f182525a;
                if (kVar != null) {
                    C30265i a = jVar.mo69880a();
                    if (a != null) {
                        a.mo53721b();
                    }
                    AbstractC40547m mVar3 = jVar.f95302j;
                    if (!(mVar3 == null || (crossPlatformBusiness3 = mVar3.getCrossPlatformBusiness()) == null || (adWebStatBusiness3 = (AdWebStatBusiness) crossPlatformBusiness3.mo69748a(AdWebStatBusiness.class)) == null)) {
                        adWebStatBusiness3.mo69704a(jVar.mo69880a(), kVar);
                    }
                    AbstractC40547m mVar4 = jVar.f95302j;
                    if (!(mVar4 == null || (crossPlatformBusiness2 = mVar4.getCrossPlatformBusiness()) == null || (adWebStatBusiness2 = (AdWebStatBusiness) crossPlatformBusiness2.mo69748a(AdWebStatBusiness.class)) == null)) {
                        adWebStatBusiness2.mo69710b(jVar.mo69880a(), kVar);
                    }
                    List<Pattern> b2 = C81632l.m141482b();
                    AbstractC40547m mVar5 = jVar.f95302j;
                    if (!(mVar5 == null || (crossPlatformBusiness = mVar5.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class)) == null)) {
                        adWebStatBusiness.mo69706a(b2);
                    }
                    C30262h hVar = jVar.f95298f;
                    if (hVar != null) {
                        hVar.mo53716a(b2);
                    }
                }
                PassBackWebInfoBusiness b3 = jVar.mo69881b();
                if (b3 != null) {
                    AbstractC40547m mVar6 = jVar.f95302j;
                    if (mVar6 == null || (crossPlatformParams2 = mVar6.getCrossPlatformParams()) == null) {
                        bVar2 = null;
                    } else {
                        bVar2 = crossPlatformParams2.f95069b;
                    }
                    b3.f94949m = bVar2;
                    try {
                        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                        C89219l.m154716b(iESSettingsProxy, "");
                        b3.f94941a = iESSettingsProxy.getAdLandingPageConfig();
                        AdLandingPageConfig adLandingPageConfig = b3.f94941a;
                        if (adLandingPageConfig != null) {
                            Boolean adLandingPageReportWifiOnlyEnable = adLandingPageConfig.getAdLandingPageReportWifiOnlyEnable();
                            C89219l.m154716b(adLandingPageReportWifiOnlyEnable, "");
                            b3.f94942b = adLandingPageReportWifiOnlyEnable.booleanValue();
                            Integer adLandingPageReportPageCount = adLandingPageConfig.getAdLandingPageReportPageCount();
                            C89219l.m154716b(adLandingPageReportPageCount, "");
                            b3.f94943c = adLandingPageReportPageCount.intValue();
                            Integer adLandingPageReportLimitTimes = adLandingPageConfig.getAdLandingPageReportLimitTimes();
                            C89219l.m154716b(adLandingPageReportLimitTimes, "");
                            b3.f94944d = adLandingPageReportLimitTimes.intValue();
                            b3.f94945e = adLandingPageConfig.getAdLandingPageReportDelay();
                            String adLandingPageReportUrl = adLandingPageConfig.getAdLandingPageReportUrl();
                            if (adLandingPageReportUrl != null) {
                                b3.f94946f = adLandingPageReportUrl;
                            }
                            b3.f94947g = adLandingPageConfig.getAdLandingPageReportPacketKey();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                AbstractC40547m mVar7 = jVar.f95302j;
                if (mVar7 == null || (crossPlatformParams = mVar7.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f95069b) == null || bVar.f95099M <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                jVar.f95301i = z;
            }
            this.baseJsMessageHandler.mo125256a(mVar);
            C40618a crossPlatformParams4 = mVar.getCrossPlatformParams();
            if (crossPlatformParams4 != null) {
                boolean z3 = crossPlatformParams4.f95068a.f95058g;
                int i = Build.VERSION.SDK_INT;
                try {
                    if (C16048b.m29633a().mo25421a(true, "enable_audio_auto_play_experiment", false)) {
                        WebSettings settings = getSettings();
                        C89219l.m154716b(settings, "");
                        if (!z3) {
                            z2 = true;
                        }
                        settings.setMediaPlaybackRequiresUserGesture(z2);
                    } else {
                        WebSettings settings2 = getSettings();
                        C89219l.m154716b(settings2, "");
                        settings2.setMediaPlaybackRequiresUserGesture(true);
                    }
                } catch (Exception unused) {
                    WebSettings settings3 = getSettings();
                    C89219l.m154716b(settings3, "");
                    settings3.setMediaPlaybackRequiresUserGesture(true);
                }
                this.baseJsMessageHandler.mo53679a(crossPlatformParams4.f95069b.f95106a, crossPlatformParams4.f95069b.f95107b, crossPlatformParams4.f95069b.f95108c, crossPlatformParams4.f95069b.f95114i, crossPlatformParams4.f95069b.f95110e, crossPlatformParams4.f95069b.f95092F, crossPlatformParams4.f95069b.f95093G, crossPlatformParams4.f95069b.f95104R);
                this.baseJsMessageHandler.mo53682a(crossPlatformParams4.f95073f.f95132a, crossPlatformParams4.f95073f.f95133b, crossPlatformParams4.f95073f.f95134c, crossPlatformParams4.f95073f.f95135d, crossPlatformParams4.f95073f.f95136e, crossPlatformParams4.f95073f.f95137f, crossPlatformParams4.f95073f.f95138g);
                AbstractC81548i iVar = this.baseJsMessageHandler;
                String str2 = crossPlatformParams4.f95068a.f95056e;
                if (!(str2 == null || (g = C89361p.m154865g(str2)) == null)) {
                    j = g.longValue();
                }
                iVar.f72134n = j;
                this.baseJsMessageHandler.f72132l = crossPlatformParams4.f95069b.f95112g;
                this.baseJsMessageHandler.f72133m = crossPlatformParams4.f95069b.f95111f;
                if (crossPlatformParams4.f95068a.f95063l) {
                    setLayerType(1, null);
                }
            }
        }
    }

    private final String beforeLoadUrl(String str) {
        C40628b bVar;
        long j;
        int i;
        String str2;
        C40618a aVar;
        String str3;
        C40618a aVar2;
        String str4;
        C40618a aVar3;
        String str5;
        AbstractC40547m mVar;
        C40618a crossPlatformParams;
        C40628b bVar2;
        boolean z;
        boolean z2;
        long j2;
        C40628b bVar3;
        C40628b bVar4;
        C40628b bVar5;
        C40618a crossPlatformParams2;
        AbstractC34340m mVar2;
        boolean z3;
        enableTTWebViewFullProcessLog();
        this.curUrl = str;
        C34337k kVar = this.monitorSession;
        boolean z4 = true;
        int i2 = 0;
        if (kVar == null || !kVar.f81084c) {
            C40603d a = C40603d.C40604a.m81964a();
            this.monitorSession = a.mo69759a(a.mo69760a(str));
            this.monitorSessionCreatedBySelf = true;
        } else {
            this.monitorSessionCreatedBySelf = false;
        }
        C34337k kVar2 = this.monitorSession;
        if (!(kVar2 == null || (mVar2 = (AbstractC34340m) kVar2.mo60793a(AbstractC34340m.class)) == null)) {
            C40603d.C40604a.m81964a();
            HybridMonitorConfig a2 = C40603d.m81955a();
            if (a2 != null) {
                try {
                    Boolean h5StaticResourceReportEnabled = a2.getH5StaticResourceReportEnabled();
                    C89219l.m154716b(h5StaticResourceReportEnabled, "");
                    z3 = h5StaticResourceReportEnabled.booleanValue();
                } catch (C16041a unused) {
                    z3 = false;
                }
                mVar2.mo60781a(z3);
                List<String> h5StaticResourceReportAllowList = a2.getH5StaticResourceReportAllowList();
                if (h5StaticResourceReportAllowList == null) {
                    h5StaticResourceReportAllowList = Collections.emptyList();
                    C89219l.m154716b(h5StaticResourceReportAllowList, "");
                }
                mVar2.mo60780a(h5StaticResourceReportAllowList);
            }
        }
        C34337k kVar3 = this.monitorSession;
        if (kVar3 != null) {
            String str6 = null;
            if (!kVar3.f81084c) {
                kVar3 = null;
            }
            if (kVar3 != null) {
                C40603d.C40604a.m81964a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map = this.additionReportParams;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                AbstractC40547m mVar3 = this.iCrossPlatformActivityContainer;
                if (mVar3 == null || (crossPlatformParams2 = mVar3.getCrossPlatformParams()) == null) {
                    bVar = null;
                } else {
                    bVar = crossPlatformParams2.f95069b;
                }
                if (bVar != null) {
                    j = bVar.f95106a;
                } else {
                    j = 0;
                }
                if (bVar != null) {
                    i = bVar.f95130y;
                } else {
                    i = 0;
                }
                if (j <= 0) {
                    str2 = null;
                } else if (i == 1) {
                    str2 = "ad_floor_page";
                } else {
                    str2 = "ad";
                }
                if (str2 != null) {
                    linkedHashMap.put("package", str2);
                }
                AbstractC40547m mVar4 = this.iCrossPlatformActivityContainer;
                if (mVar4 != null) {
                    aVar = mVar4.getCrossPlatformParams();
                } else {
                    aVar = null;
                }
                if (aVar == null || (bVar5 = aVar.f95069b) == null) {
                    str3 = null;
                } else {
                    str3 = bVar5.f95094H;
                }
                if (str3 != null) {
                    linkedHashMap.put("enter_from", str3);
                }
                AbstractC40547m mVar5 = this.iCrossPlatformActivityContainer;
                if (mVar5 != null) {
                    aVar2 = mVar5.getCrossPlatformParams();
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null || (bVar4 = aVar2.f95069b) == null) {
                    str4 = null;
                } else {
                    str4 = bVar4.f95097K;
                }
                if (str4 != null) {
                    linkedHashMap.put("challenge_id", str4);
                }
                AbstractC40547m mVar6 = this.iCrossPlatformActivityContainer;
                if (mVar6 != null) {
                    aVar3 = mVar6.getCrossPlatformParams();
                } else {
                    aVar3 = null;
                }
                if (aVar3 == null || (bVar3 = aVar3.f95069b) == null) {
                    str5 = null;
                } else {
                    str5 = bVar3.f95098L;
                }
                if (str5 != null) {
                    linkedHashMap.put("sticker_id", str5);
                }
                linkedHashMap.put("chrome_version", getChromeVersion());
                C89219l.m154716b("SystemWebView", "");
                linkedHashMap.put("webview_type", "SystemWebView");
                kVar3.mo60794a(C34306ae.m70189a(str), this, linkedHashMap);
                AbstractC34340m mVar7 = (AbstractC34340m) kVar3.mo60793a(AbstractC34340m.class);
                if (!(mVar7 == null || (mVar = this.iCrossPlatformActivityContainer) == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (bVar2 = crossPlatformParams.f95069b) == null)) {
                    String str7 = bVar2.f95118m;
                    if (str7 == null || str7.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(!z)) {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        String str8 = bVar2.f95118m;
                        String str9 = bVar2.f95114i;
                        String str10 = bVar2.f95126u;
                        int i3 = bVar2.f95129x;
                        C89219l.m154721d(mVar7, "");
                        if (str8 == null || str8.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            mVar7.mo60777a("creative_id", str8);
                            mVar7.mo60777a("log_extra", str9);
                            mVar7.mo60777a("channel_name", str10);
                            if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                                AbstractC33115c a3 = C33113b.m67826a();
                                if (a3 != null) {
                                    str6 = a3.mo58936b(str10, "feed");
                                }
                            }
                            if (!(str6 == null || str6.length() == 0)) {
                                z4 = false;
                            }
                            long j3 = -1;
                            if (!z4 && new File(str6).exists()) {
                                if (i3 != 0) {
                                    IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                                    Long g = C89361p.m154865g(str8);
                                    if (g != null) {
                                        j2 = g.longValue();
                                    } else {
                                        j2 = 0;
                                    }
                                    j3 = f.mo59375a(j2, System.currentTimeMillis());
                                }
                                i2 = j3 > 0 ? 3 : 2;
                            }
                            mVar7.mo60777a("preload_status", String.valueOf(i2));
                            mVar7.mo60777a("preload_webview_time", String.valueOf(j3));
                        }
                        mVar7.mo60774a(C38749j.f91505a);
                    }
                }
                C40698j jVar = this.singleWebViewClient;
                if (jVar != null) {
                    jVar.f95300h = kVar3;
                }
                SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
                if (singleWebChromeClient2 != null) {
                    singleWebChromeClient2.f95252h = kVar3;
                }
            }
        }
        this.baseJsMessageHandler.mo53726a(this.monitorSession);
        String appendStatusBarHeightIfNeeded = appendStatusBarHeightIfNeeded(str);
        String a4 = CrossPlatformLegacyServiceImpl.m65225f().mo57033a(appendStatusBarHeightIfNeeded);
        return a4 == null ? appendStatusBarHeightIfNeeded : a4;
    }

    public final void sendEventToWebView(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        this.baseJsMessageHandler.mo53683a(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$l */
    public static final class C40678l extends AbstractC89220m implements AbstractC89183m<String, C30248e.EnumC30249a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95272a;

        static {
            Covode.recordClassIndex(48524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40678l(SingleWebView singleWebView) {
            super(2);
            this.f95272a = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, C30248e.EnumC30249a aVar) {
            String str2 = str;
            C30248e.EnumC30249a aVar2 = aVar;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(aVar2, "");
            this.f95272a.reportOnJsbInvoke(str2, aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$p */
    public static final class C40683p extends AbstractC89220m implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95278a;

        /* renamed from: b */
        final /* synthetic */ String f95279b;

        static {
            Covode.recordClassIndex(48529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40683p(SingleWebView singleWebView, String str) {
            super(2);
            this.f95278a = singleWebView;
            this.f95279b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            if (!TextUtils.isEmpty(str2) && map2 != null) {
                SingleWebView singleWebView = this.f95278a;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                SingleWebView.super.loadUrl(str2, map2);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$q */
    public static final class C40684q extends AbstractC89220m implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95280a;

        /* renamed from: b */
        final /* synthetic */ String f95281b;

        /* renamed from: c */
        final /* synthetic */ Map f95282c;

        static {
            Covode.recordClassIndex(48530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40684q(SingleWebView singleWebView, String str, Map map) {
            super(2);
            this.f95280a = singleWebView;
            this.f95281b = str;
            this.f95282c = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            if (!TextUtils.isEmpty(str2) && map2 != null) {
                SingleWebView singleWebView = this.f95280a;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                SingleWebView.super.loadUrl(str2, map2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl */
    public static void m82045x680289f9(SingleWebView singleWebView, String str) {
        String a = C84365i.f188614a.mo129370a(singleWebView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        singleWebView.SingleWebView__loadUrl$___twin___(str);
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient */
    public static void m82047xca8881a0(SingleWebView singleWebView, WebViewClient webViewClient) {
        if (C84367b.m145126a() && webViewClient != null) {
            WebSettings settings = singleWebView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        singleWebView.setWebViewClient(C23833c.m45038a(webViewClient));
    }

    public final void reportOnJsbInvoke(String str, C30248e.EnumC30249a aVar) {
        C34337k kVar;
        AbstractC34340m mVar;
        if (isAllowJsbMonitor() && (kVar = this.monitorSession) != null && (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bridge_name", str);
            int i = C40697i.f95291a[aVar.ordinal()];
            if (i == 1) {
                jSONObject.put("bridge_access", "public");
            } else if (i == 2) {
                jSONObject.put("bridge_access", "private");
            }
            AbstractC34346s.C34347a.m70288a(mVar, "hybrid_app_monitor_bridge_invoke_event", "bridge_invoke", jSONObject);
        }
    }

    public final void SingleWebView__loadUrl$___twin___(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        if (!TextUtils.isEmpty(str)) {
            C40596a.m81947a().mo19245g(this, str);
            if (C40714q.m82129a(String.valueOf(str))) {
                C40707m mVar = new C40707m(String.valueOf(str));
                this.mTTNetInterceptorWrapper = mVar;
                C40698j jVar = this.singleWebViewClient;
                if (jVar != null) {
                    jVar.f95299g = mVar;
                }
            }
            String beforeLoadUrl = beforeLoadUrl(str);
            AbstractC89188r<? super WebView, ? super String, ? super Map<String, String>, ? super AbstractC89183m<? super String, ? super Map<String, String>, C89391z>, C89391z> rVar = C40714q.f95322b.f95326a;
            if (rVar != null) {
                rVar.mo8774a(this, beforeLoadUrl, map, new C40684q(this, beforeLoadUrl, map));
            } else {
                super.loadUrl(beforeLoadUrl, map);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$m */
    public static final class C40679m extends AbstractC89220m implements AbstractC89187q<String, C30248e.EnumC30249a, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f95273a;

        static {
            Covode.recordClassIndex(48525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40679m(SingleWebView singleWebView) {
            super(3);
            this.f95273a = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, C30248e.EnumC30249a aVar, Integer num) {
            String str2 = str;
            C30248e.EnumC30249a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(str2, "");
            C89219l.m154721d(aVar2, "");
            this.f95273a.reportOnJsbReject(str2, aVar2, intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl */
    public static void m82046x680289f9(SingleWebView singleWebView, String str, Map map) {
        String a = C84365i.f188614a.mo129370a(singleWebView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        singleWebView.SingleWebView__loadUrl$___twin___(str, map);
    }

    public final void reportOnJsbReject(String str, C30248e.EnumC30249a aVar, int i) {
        C34337k kVar;
        AbstractC34340m mVar;
        if (isAllowJsbMonitor() && (kVar = this.monitorSession) != null && (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bridge_name", str);
            int i2 = C40697i.f95292b[aVar.ordinal()];
            if (i2 == 1) {
                jSONObject.put("bridge_access", "public");
            } else if (i2 == 2) {
                jSONObject.put("bridge_access", "private");
            }
            jSONObject.put("reason", String.valueOf(i));
            AbstractC34346s.C34347a.m70288a(mVar, "hybrid_app_monitor_bridge_invoke_event", "bridge_reject", jSONObject);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        C89219l.m154721d(context, "");
        this.contextProviderFactory = new C30245c();
        this.baseJsMessageHandler = C81621s.m141472a(context);
        this.gson$delegate = C89250i.m154773a((AbstractC89171a) C40673g.f95267a);
        this.visitedUrls = new LinkedHashSet();
        this.chromeVersion$delegate = C89250i.m154774a(EnumC89331m.NONE, new C40672f(this));
        this.lastClickDetector$delegate = C89250i.m154773a((AbstractC89171a) new C40681o(this, context));
        C40596a.m81947a().mo19246j(this);
        C34294a.f81086m = SystemClock.uptimeMillis();
        C30245c cVar = this.contextProviderFactory;
        cVar.mo53699a(AbsActivityContainer.class, new C40667a(this));
        cVar.mo53699a(C38682bi.class, new C40668b(this));
        cVar.mo53699a(C34337k.class, new C40669c(this));
        this.singleWebViewClient = new C40698j();
        addPageStartListener();
        C40698j jVar = this.singleWebViewClient;
        if (jVar == null) {
            C89219l.m154715b();
        }
        m82047xca8881a0(this, jVar);
        SingleWebChromeClient singleWebChromeClient2 = new SingleWebChromeClient(this);
        this.singleWebChromeClient = singleWebChromeClient2;
        singleWebChromeClient2.f95249e = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        if (C16048b.m29633a().mo25412a(false, "use_injection_jsb", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        C30248e a = C30248e.C30250b.m61225a(this);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            C89219l.m154715b();
        }
        C30248e a2 = a.mo53708a(singleWebChromeClient3);
        C40698j jVar2 = this.singleWebViewClient;
        if (jVar2 == null) {
            C89219l.m154715b();
        }
        C30248e a3 = a2.mo53709a(jVar2).mo53710a(this.baseJsMessageHandler);
        a3.f72172h = this.contextProviderFactory;
        a3.f72169e = false;
        a3.f72170f = new C40693g();
        a3.f72167c = z;
        C30248e a4 = C30248e.m61218a(a3, null, false, new AbstractC89183m<String, C30248e.EnumC30249a, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C406641 */

            /* renamed from: a */
            final /* synthetic */ SingleWebView f95255a;

            static {
                Covode.recordClassIndex(48510);
            }

            {
                this.f95255a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(String str, C30248e.EnumC30249a aVar) {
                String str2 = str;
                C30248e.EnumC30249a aVar2 = aVar;
                C89219l.m154721d(str2, "");
                C89219l.m154721d(aVar2, "");
                this.f95255a.reportOnJsbInvoke(str2, aVar2);
                return C89391z.f203057a;
            }
        }, new AbstractC89187q<String, C30248e.EnumC30249a, Integer, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C406652 */

            /* renamed from: a */
            final /* synthetic */ SingleWebView f95256a;

            static {
                Covode.recordClassIndex(48511);
            }

            {
                this.f95256a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(String str, C30248e.EnumC30249a aVar, Integer num) {
                String str2 = str;
                C30248e.EnumC30249a aVar2 = aVar;
                int intValue = num.intValue();
                C89219l.m154721d(str2, "");
                C89219l.m154721d(aVar2, "");
                this.f95256a.reportOnJsbReject(str2, aVar2, intValue);
                return C89391z.f203057a;
            }
        }, 3);
        this.iesJsBridge = a4;
        this.baseJsMessageHandler.mo53680a(a4, this.contextProviderFactory);
        C40698j jVar3 = this.singleWebViewClient;
        if (jVar3 == null) {
            C89219l.m154715b();
        }
        jVar3.f43667d = this.iesJsBridge.f72166b;
        initConfig();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.View$OnAttachStateChangeListenerC406663 */

            /* renamed from: a */
            final /* synthetic */ SingleWebView f95257a;

            static {
                Covode.recordClassIndex(48512);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f95257a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                AbstractC34340m mVar;
                C89219l.m154721d(view, "");
                C34337k monitorSession = this.f95257a.getMonitorSession();
                if (monitorSession != null && (mVar = (AbstractC34340m) monitorSession.mo60793a(AbstractC34340m.class)) != null) {
                    mVar.mo60791j();
                }
            }

            public final void onViewDetachedFromWindow(View view) {
                AbstractC34340m mVar;
                C89219l.m154721d(view, "");
                C34337k monitorSession = this.f95257a.getMonitorSession();
                if (!(monitorSession == null || (mVar = (AbstractC34340m) monitorSession.mo60793a(AbstractC34340m.class)) == null)) {
                    mVar.mo60792k();
                }
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.canScrollVertically = true;
        if (C84367b.m145126a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C1764a.m5930a(settings, sb.toString());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAdditionalReportParams$default(SingleWebView singleWebView, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        singleWebView.setAdditionalReportParams(map);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m82041xe17e4a56("onScrollChanged", "l = " + i + "; t = " + i2 + "; oldl = " + i3 + ";oldt = " + i4);
        AbstractC40736b bVar = this.scrollListener;
        if (bVar != null) {
            bVar.mo66154a(i2, i4);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleWebView(Context context, AttributeSet attributeSet, int i, int i2, C89214g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
