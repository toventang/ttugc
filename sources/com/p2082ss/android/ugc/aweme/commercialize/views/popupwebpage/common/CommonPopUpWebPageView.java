package com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.tux.input.TuxTextView;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40736b;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.AbstractC33279b;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView */
public final class CommonPopUpWebPageView extends FrameLayout implements AbstractC33974au, AbstractC38978d {

    /* renamed from: m */
    public static final C38956b f92016m = new C38956b((byte) 0);

    /* renamed from: a */
    public AbstractC33279b f92017a;

    /* renamed from: b */
    public AdPopUpWebPageContainer f92018b;

    /* renamed from: c */
    public boolean f92019c;

    /* renamed from: d */
    public boolean f92020d;

    /* renamed from: e */
    public C38618ac f92021e;

    /* renamed from: f */
    public AbstractC38955a f92022f;

    /* renamed from: g */
    public String f92023g;

    /* renamed from: h */
    public AbstractC89171a<? extends Object> f92024h;

    /* renamed from: i */
    public C27252o f92025i;

    /* renamed from: j */
    public boolean f92026j;

    /* renamed from: k */
    public C38975c f92027k;

    /* renamed from: l */
    public final C38965k f92028l;

    /* renamed from: n */
    private AbstractC38958d f92029n;

    /* renamed from: o */
    private AbstractC38957c f92030o;

    /* renamed from: p */
    private final AbstractC89244h f92031p;

    /* renamed from: q */
    private final C38959e f92032q;

    /* renamed from: r */
    private final View.OnTouchListener f92033r;

    /* renamed from: s */
    private final C38967m f92034s;

    /* renamed from: t */
    private SparseArray f92035t;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$a */
    public interface AbstractC38955a {
        static {
            Covode.recordClassIndex(46545);
        }

        /* renamed from: a */
        void mo67672a();

        /* renamed from: b */
        void mo67673b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$c */
    public interface AbstractC38957c {
        static {
            Covode.recordClassIndex(46547);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$d */
    public interface AbstractC38958d {
        static {
            Covode.recordClassIndex(46548);
        }

        /* renamed from: a */
        void mo67674a();
    }

    static {
        Covode.recordClassIndex(46544);
    }

    /* renamed from: a */
    public final View mo67655a(int i) {
        if (this.f92035t == null) {
            this.f92035t = new SparseArray();
        }
        View view = (View) this.f92035t.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92035t.put(i, findViewById);
        return findViewById;
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
    /* renamed from: b */
    public final boolean mo65796b(WebView webView, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: c */
    public final void mo65797c(WebView webView, String str) {
    }

    public final C38616ab getLoadListener() {
        return (C38616ab) this.f92031p.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$b */
    public static final class C38956b {
        static {
            Covode.recordClassIndex(46546);
        }

        private C38956b() {
        }

        public /* synthetic */ C38956b(byte b) {
            this();
        }
    }

    public final AbstractC38957c getKeyDownCallBack() {
        return this.f92030o;
    }

    public final AbstractC38955a getMBehaviorCallback() {
        return this.f92022f;
    }

    public final C38618ac getParams() {
        return this.f92021e;
    }

    public final AbstractC38958d getTitleBarCallback() {
        return this.f92029n;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$e */
    public static final class C38959e implements CommonPopUpWebBottomSheetContainer.AbstractC38951b {

        /* renamed from: a */
        public int f92036a;

        /* renamed from: b */
        final /* synthetic */ CommonPopUpWebPageView f92037b;

        /* renamed from: c */
        final /* synthetic */ Context f92038c;

        static {
            Covode.recordClassIndex(46549);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.AbstractC38951b
        /* renamed from: a */
        public final void mo67649a() {
            if (this.f92036a != 3) {
                this.f92036a = 3;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.AbstractC38951b
        /* renamed from: b */
        public final void mo67651b() {
            if (this.f92036a != 4) {
                this.f92036a = 4;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.AbstractC38951b
        /* renamed from: c */
        public final void mo67652c() {
            if (CommonPopUpWebBottomSheetContainer.f92006i) {
                C38754l.m78608a(this.f92038c);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.AbstractC38951b
        /* renamed from: d */
        public final void mo67653d() {
            AbstractC40591g crossPlatformBusiness;
            AdWebStatBusiness adWebStatBusiness;
            if (this.f92036a != 5) {
                this.f92036a = 5;
                this.f92037b.getLoadListener().mo67194a(true);
                AbstractC33279b bVar = this.f92037b.f92017a;
                if (bVar != null) {
                    bVar.mo59237a(false);
                }
                FrameLayout frameLayout = (FrameLayout) this.f92037b.mo67655a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
                ((FrameLayout) this.f92037b.mo67655a(R.id.d49)).setOnClickListener(null);
                FrameLayout frameLayout2 = (FrameLayout) this.f92037b.mo67655a(R.id.d49);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setClickable(false);
                AdPopUpWebPageContainer adPopUpWebPageContainer = this.f92037b.f92018b;
                if (!(adPopUpWebPageContainer == null || (crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class)) == null)) {
                    adWebStatBusiness.mo69707a(true);
                }
                AbstractC38955a mBehaviorCallback = this.f92037b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.mo67673b();
                }
                CrossPlatformWebView.m82144a((CrossPlatformWebView) this.f92037b.mo67655a(R.id.d4d), "about:blank", false, null, 6);
                CommonPopUpWebPageView commonPopUpWebPageView = this.f92037b;
                C38975c cVar = commonPopUpWebPageView.f92027k;
                if (cVar != null) {
                    String str = cVar.f92075c.get("EVENT_NAME_FOR_STAY");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : cVar.f92075c.entrySet()) {
                        if ((!C89219l.m154714a((Object) entry.getKey(), (Object) "EVENT_NAME_WHEN_REQUEST")) && (!C89219l.m154714a((Object) entry.getKey(), (Object) "EVENT_NAME_FOR_STAY"))) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.put("duration", String.valueOf(commonPopUpWebPageView.f92025i.mo45339a(TimeUnit.MILLISECONDS)));
                    if (C80538hl.m139614a(str)) {
                        C39162r.m79460a(str, linkedHashMap);
                    }
                }
                this.f92037b.f92026j = false;
                this.f92037b.f92019c = false;
                this.f92037b.getLoadListener().f91258f = true;
            }
        }

        C38959e(CommonPopUpWebPageView commonPopUpWebPageView, Context context) {
            this.f92037b = commonPopUpWebPageView;
            this.f92038c = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.AbstractC38951b
        /* renamed from: a */
        public final void mo67650a(View view, float f) {
            C89219l.m154721d(view, "");
            if (Float.isNaN(f)) {
                FrameLayout frameLayout = (FrameLayout) this.f92037b.mo67655a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setAlpha(1.0f);
            } else if (f < 0.0f) {
                float abs = Math.abs(f);
                FrameLayout frameLayout2 = (FrameLayout) this.f92037b.mo67655a(R.id.d49);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setAlpha(1.0f - abs);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$j */
    static final class C38964j extends AbstractC89220m implements AbstractC89171a<C38616ab> {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92044a;

        static {
            Covode.recordClassIndex(46554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38964j(CommonPopUpWebPageView commonPopUpWebPageView) {
            super(0);
            this.f92044a = commonPopUpWebPageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C38616ab invoke() {
            C38616ab abVar = new C38616ab();
            abVar.f91257e = this.f92044a.f92028l;
            return abVar;
        }
    }

    public final C38972a getActionMode() {
        return ((CommonPopUpWebBottomSheetContainer) mo67655a(R.id.d45)).getActionMode();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$k */
    public static final class C38965k implements C38616ab.AbstractC38617a {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92045a;

        /* renamed from: b */
        final /* synthetic */ Context f92046b;

        static {
            Covode.recordClassIndex(46555);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab.AbstractC38617a
        /* renamed from: c */
        public final void mo66158c() {
            Context context = this.f92046b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isFinishing()) {
                this.f92045a.f92020d = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab.AbstractC38617a
        /* renamed from: a */
        public final void mo66156a() {
            FrameLayout frameLayout = (FrameLayout) this.f92045a.mo67655a(R.id.d4c);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f92045a.mo67655a(R.id.d4d)).findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab.AbstractC38617a
        /* renamed from: b */
        public final void mo66157b() {
            FrameLayout frameLayout = (FrameLayout) this.f92045a.mo67655a(R.id.d4c);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f92045a.mo67655a(R.id.d4d)).findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        C38965k(CommonPopUpWebPageView commonPopUpWebPageView, Context context) {
            this.f92045a = commonPopUpWebPageView;
            this.f92046b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$m */
    public static final class C38967m implements CommonPopUpWebTitleBar.AbstractC38970b {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92048a;

        static {
            Covode.recordClassIndex(46557);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar.AbstractC38970b
        /* renamed from: a */
        public final void mo67678a() {
            this.f92048a.f92023g = "button";
            this.f92048a.mo67657a(false);
            AbstractC38958d titleBarCallback = this.f92048a.getTitleBarCallback();
            if (titleBarCallback != null) {
                titleBarCallback.mo67674a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38967m(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f92048a = commonPopUpWebPageView;
        }
    }

    public final WebView getWebView() {
        return ((AbstractC40746j) ((CrossPlatformWebView) mo67655a(R.id.d4d)).mo69911a(AbstractC40746j.class)).mo69969a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.f92018b;
        if (adPopUpWebPageContainer != null) {
            adPopUpWebPageContainer.mo66097a();
        }
        super.onDetachedFromWindow();
        AbstractC33279b bVar = this.f92017a;
        if (bVar != null) {
            bVar.mo59237a(false);
        }
        this.f92017a = null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        Bundle bundle;
        int i;
        AbstractC1204m mVar;
        MethodCollector.m26663i(9484);
        super.onAttachedToWindow();
        C38618ac acVar = this.f92021e;
        if (acVar == null || (bundle = acVar.f91263e) == null) {
            MethodCollector.m26664o(9484);
            return;
        }
        bundle.putBoolean("show_load_dialog", false);
        View.inflate(getContext(), R.layout.a9n, this);
        FrameLayout frameLayout = (FrameLayout) mo67655a(R.id.cyh);
        C89219l.m154716b(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C38618ac acVar2 = this.f92021e;
            if (acVar2 != null) {
                i = acVar2.f91261c;
            } else {
                i = 0;
            }
            marginLayoutParams.topMargin = i;
            frameLayout.requestLayout();
            int b = C34723i.m70928b(getContext());
            int a = C34723i.m70924a(getContext());
            C38974b.f92069e = (a - C34723i.m70927b()) / b;
            C38974b.f92067c = b;
            C38974b.f92068d = a;
            CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) mo67655a(R.id.d45);
            FrameLayout frameLayout2 = (FrameLayout) mo67655a(R.id.d4h);
            C89219l.m154716b(frameLayout2, "");
            C89219l.m154721d(frameLayout2, "");
            ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                ((CoordinatorLayout.C0560e) layoutParams2).mo2538a(commonPopUpWebBottomSheetContainer.f92008h);
                ((CrossPlatformWebView) mo67655a(R.id.d4d)).setCustomWebViewStatus(this);
                ((AbstractC40746j) ((CrossPlatformWebView) mo67655a(R.id.d4d)).mo69911a(AbstractC40746j.class)).mo69969a().setWebScrollListener(new C38963i(this));
                ((CrossPlatformWebView) mo67655a(R.id.d4d)).setShouldShowProgressBarBg(false);
                C17235c.m31810a(mo67655a(R.id.d4g), 0.5f);
                TuxTextView tuxTextView = (TuxTextView) mo67655a(R.id.ahx);
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                Context context = getContext();
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    this.f92017a = new C38960f(this, activity, activity);
                    C38618ac acVar3 = this.f92021e;
                    if (!(acVar3 == null || (mVar = acVar3.f91260b) == null)) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo67655a(R.id.d4d);
                        C89219l.m154716b(crossPlatformWebView, "");
                        this.f92018b = AdPopUpWebPageContainer.C37939a.m76912a(activity, crossPlatformWebView, getLoadListener(), bundle, mVar);
                    }
                    ((CommonPopUpWebBottomSheetContainer) mo67655a(R.id.d45)).setCallback(this.f92032q);
                    ((CommonPopUpWebBottomSheetContainer) mo67655a(R.id.d45)).getBehavior().f89583n = true;
                    ((TuxTextView) mo67655a(R.id.d4g)).setOnClickListener(new View$OnClickListenerC38961g(this));
                    ((CommonPopUpWebTitleBar) mo67655a(R.id.d4l)).setTitleBarListener(this.f92034s);
                    ((CommonPopUpWebTitleBar) mo67655a(R.id.d4l)).setOnTouchListener(new View$OnTouchListenerC38962h(this));
                    ((CrossPlatformWebView) mo67655a(R.id.d4d)).setWebViewTouchListener(this.f92033r);
                    int a2 = C34728n.m70946a(52.5d);
                    CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) mo67655a(R.id.d4d);
                    C89219l.m154716b(crossPlatformWebView2, "");
                    m79102a(crossPlatformWebView2, a2);
                    FrameLayout frameLayout3 = (FrameLayout) mo67655a(R.id.d4c);
                    C89219l.m154716b(frameLayout3, "");
                    m79102a(frameLayout3, a2);
                }
                AbstractC89171a<? extends Object> aVar = this.f92024h;
                if (aVar != null) {
                    aVar.invoke();
                    MethodCollector.m26664o(9484);
                    return;
                }
                MethodCollector.m26664o(9484);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            MethodCollector.m26664o(9484);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.m26664o(9484);
        throw nullPointerException2;
    }

    /* renamed from: a */
    public final boolean mo67658a() {
        CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) mo67655a(R.id.d45);
        if (commonPopUpWebBottomSheetContainer == null || !commonPopUpWebBottomSheetContainer.mo66065b()) {
            return false;
        }
        return true;
    }

    public final void setKeyDownCallBack(AbstractC38957c cVar) {
        this.f92030o = cVar;
    }

    public final void setMBehaviorCallback(AbstractC38955a aVar) {
        this.f92022f = aVar;
    }

    public final void setParams(C38618ac acVar) {
        this.f92021e = acVar;
    }

    public final void setTitleBarCallback(AbstractC38958d dVar) {
        this.f92029n = dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$i */
    public static final class C38963i implements AbstractC40736b {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92043a;

        static {
            Covode.recordClassIndex(46553);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38963i(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f92043a = commonPopUpWebPageView;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40736b
        /* renamed from: a */
        public final void mo66154a(int i, int i2) {
            boolean z;
            WebView webView = this.f92043a.getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                CommonPopUpWebBottomSheetContainer.f92006i = z;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$l */
    public static final class View$OnClickListenerC38966l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92047a;

        static {
            Covode.recordClassIndex(46556);
        }

        public View$OnClickListenerC38966l(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f92047a = commonPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92047a.mo67657a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$g */
    static final class View$OnClickListenerC38961g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92041a;

        static {
            Covode.recordClassIndex(46551);
        }

        View$OnClickListenerC38961g(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f92041a = commonPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            CommonPopUpWebPageView commonPopUpWebPageView = this.f92041a;
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) commonPopUpWebPageView.mo67655a(R.id.d4d);
            C89219l.m154716b(crossPlatformWebView, "");
            commonPopUpWebPageView.mo67656a(crossPlatformWebView.getCurrentUrl());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonPopUpWebPageView(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5679);
        this.f92025i = new C27252o();
        this.f92031p = C89250i.m154773a((AbstractC89171a) new C38964j(this));
        this.f92032q = new C38959e(this, context);
        this.f92028l = new C38965k(this, context);
        this.f92033r = new View$OnTouchListenerC38968n(this);
        this.f92034s = new C38967m(this);
        MethodCollector.m26664o(5679);
    }

    /* renamed from: b */
    private final void m79103b(int i) {
        if (!this.f92019c && !this.f92026j) {
            this.f92026j = true;
            C38975c cVar = this.f92027k;
            if (cVar != null) {
                String str = cVar.f92075c.get("EVENT_NAME_WHEN_REQUEST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : cVar.f92075c.entrySet()) {
                    if ((!C89219l.m154714a((Object) entry.getKey(), (Object) "EVENT_NAME_WHEN_REQUEST")) && (!C89219l.m154714a((Object) entry.getKey(), (Object) "EVENT_NAME_FOR_STAY"))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.put("status", String.valueOf(i));
                linkedHashMap.put("duration", String.valueOf(this.f92025i.mo45339a(TimeUnit.MILLISECONDS)));
                if (C80538hl.m139614a(str)) {
                    C39162r.m79460a(str, linkedHashMap);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67656a(String str) {
        C38618ac acVar;
        this.f92026j = false;
        if (str != null || ((acVar = this.f92021e) != null && (str = acVar.f91259a) != null)) {
            String uri = Uri.parse(str).buildUpon().appendQueryParameter("hide_loading", "1").build().toString();
            C89219l.m154716b(uri, "");
            CrossPlatformWebView.m82144a((CrossPlatformWebView) mo67655a(R.id.d4d), uri, false, null, 6);
        }
    }

    /* renamed from: a */
    public final void mo67657a(boolean z) {
        if (!z) {
            CrossPlatformWebView.m82144a((CrossPlatformWebView) mo67655a(R.id.d4d), "about:blank", false, null, 6);
        }
        CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) mo67655a(R.id.d45);
        if (commonPopUpWebBottomSheetContainer.mo66065b()) {
            commonPopUpWebBottomSheetContainer.f92008h.mo66047c(5);
        }
        C38754l.m78608a(getContext());
    }

    public /* synthetic */ CommonPopUpWebPageView(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$n */
    static final class View$OnTouchListenerC38968n implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92049a;

        static {
            Covode.recordClassIndex(46558);
        }

        View$OnTouchListenerC38968n(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f92049a = commonPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            this.f92049a.getActionMode().mo67688a(motionEvent);
            return false;
        }
    }

    /* renamed from: a */
    private static void m79102a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$f */
    public static final class C38960f extends AbstractC33279b {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92039a;

        /* renamed from: b */
        final /* synthetic */ Activity f92040b;

        static {
            Covode.recordClassIndex(46550);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || (!this.f92039a.mo67658a() && !this.f92039a.f92019c)) {
                return false;
            }
            this.f92039a.getKeyDownCallBack();
            if (((CrossPlatformWebView) this.f92039a.mo67655a(R.id.d4d)).mo69924b()) {
                ((CrossPlatformWebView) this.f92039a.mo67655a(R.id.d4d)).mo69922a();
                return true;
            }
            this.f92039a.mo67657a(false);
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38960f(CommonPopUpWebPageView commonPopUpWebPageView, Activity activity, Activity activity2) {
            super(activity2);
            this.f92039a = commonPopUpWebPageView;
            this.f92040b = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView$h */
    static final class View$OnTouchListenerC38962h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebPageView f92042a;

        static {
            Covode.recordClassIndex(46552);
        }

        View$OnTouchListenerC38962h(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f92042a = commonPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            WebView webView;
            C38972a actionMode = this.f92042a.getActionMode();
            C89219l.m154716b(motionEvent, "");
            actionMode.mo67688a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                CommonPopUpWebBottomSheetContainer.f92006i = true;
            } else if ((action == 1 || action == 3) && (webView = this.f92042a.getWebView()) != null && webView.getScrollY() > 0) {
                CommonPopUpWebBottomSheetContainer.f92006i = false;
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo61846a(WebView webView, String str) {
        String str2;
        ProgressBar progressBar = (ProgressBar) mo67655a(R.id.d44);
        C89219l.m154716b(progressBar, "");
        progressBar.setVisibility(8);
        String str3 = null;
        if (webView != null) {
            str2 = webView.getTitle();
        } else {
            str2 = null;
        }
        if (!C80538hl.m139614a(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            C89219l.m154716b(str2, "");
            if (C89361p.m154874b(str2, "about:blank", true)) {
                TuxTextView tuxTextView = (TuxTextView) mo67655a(R.id.d4k);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText("");
                mo67657a(true);
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) mo67655a(R.id.d4k);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(str2);
        }
        if (webView != null) {
            str3 = webView.getUrl();
        }
        if (C80538hl.m139614a(str3) && str3 != null) {
            C89219l.m154716b(str3, "");
            if (C89361p.m154874b(str3, "about:blank", true)) {
                TuxTextView tuxTextView3 = (TuxTextView) mo67655a(R.id.d4j);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setText("");
            } else {
                TuxTextView tuxTextView4 = (TuxTextView) mo67655a(R.id.d4j);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText(str3);
            }
        }
        C27252o oVar = this.f92025i;
        C89219l.m154716b(oVar, "");
        if (oVar.f64413a) {
            m79103b(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C27252o oVar = this.f92025i;
        C89219l.m154716b(oVar, "");
        if (oVar.f64413a) {
            m79103b(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        ProgressBar progressBar = (ProgressBar) mo67655a(R.id.d44);
        C89219l.m154716b(progressBar, "");
        progressBar.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65791a(WebView webView, int i, String str, String str2) {
        C27252o oVar = this.f92025i;
        C89219l.m154716b(oVar, "");
        if (oVar.f64413a) {
            m79103b(0);
        }
    }
}
