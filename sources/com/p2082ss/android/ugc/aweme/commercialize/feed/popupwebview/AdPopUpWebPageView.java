package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.EnumC28856r;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.p2052ui.scroll.C28650a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35229g;
import com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35194i;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37588c;
import com.p2082ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.p2082ss.android.ugc.aweme.commercialize.business.ReportBusiness;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37843a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38584d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38683bj;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40617a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40736b;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.BottomBanner;
import com.p2082ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33130m;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView */
public final class AdPopUpWebPageView extends FrameLayout implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: p */
    public static final C37941b f89628p = new C37941b((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f89629A;

    /* renamed from: B */
    private int f89630B;

    /* renamed from: C */
    private int f89631C;

    /* renamed from: D */
    private final AbstractC34952a f89632D;

    /* renamed from: E */
    private final C37944e f89633E;

    /* renamed from: F */
    private final View.OnTouchListener f89634F;

    /* renamed from: G */
    private final C37965v f89635G;

    /* renamed from: H */
    private final C37956o f89636H;

    /* renamed from: I */
    private HashMap f89637I;

    /* renamed from: a */
    public AbstractC38683bj f89638a;

    /* renamed from: b */
    public AdPopUpWebPageContainer f89639b;

    /* renamed from: c */
    public boolean f89640c;

    /* renamed from: d */
    public boolean f89641d;

    /* renamed from: e */
    public boolean f89642e;

    /* renamed from: f */
    public String f89643f;

    /* renamed from: g */
    public C37977b f89644g;

    /* renamed from: h */
    public boolean f89645h;

    /* renamed from: i */
    public Runnable f89646i;

    /* renamed from: j */
    public Runnable f89647j;

    /* renamed from: k */
    public boolean f89648k;

    /* renamed from: l */
    public boolean f89649l;

    /* renamed from: m */
    public boolean f89650m;

    /* renamed from: n */
    public final C37958q f89651n;

    /* renamed from: o */
    public final C37957p f89652o;

    /* renamed from: q */
    private C38618ac f89653q;

    /* renamed from: r */
    private AbstractC37943d f89654r;

    /* renamed from: s */
    private AbstractC37940a f89655s;

    /* renamed from: t */
    private AbstractC37942c f89656t;

    /* renamed from: u */
    private AbstractC89171a<? extends Object> f89657u;

    /* renamed from: v */
    private boolean f89658v;

    /* renamed from: w */
    private boolean f89659w;

    /* renamed from: x */
    private String f89660x;

    /* renamed from: y */
    private SingleWebChromeClient f89661y;

    /* renamed from: z */
    private final AbstractC89244h f89662z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$a */
    public interface AbstractC37940a {
        static {
            Covode.recordClassIndex(45398);
        }

        /* renamed from: a */
        void mo66143a();

        /* renamed from: a */
        void mo66144a(int i);

        /* renamed from: a */
        void mo66145a(int i, Boolean bool);

        /* renamed from: a */
        void mo66146a(String str);

        /* renamed from: b */
        void mo66147b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$c */
    public interface AbstractC37942c {
        static {
            Covode.recordClassIndex(45400);
        }

        /* renamed from: a */
        void mo66148a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$d */
    public interface AbstractC37943d {
        static {
            Covode.recordClassIndex(45401);
        }

        /* renamed from: a */
        void mo66149a();

        /* renamed from: b */
        void mo66150b();
    }

    static {
        Covode.recordClassIndex(45397);
    }

    /* renamed from: a */
    public final View mo66102a(int i) {
        if (this.f89637I == null) {
            this.f89637I = new HashMap();
        }
        View view = (View) this.f89637I.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89637I.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C35194i getBulletLoadListener() {
        return (C35194i) this.f89629A.getValue();
    }

    public final C38616ab getLoadListener() {
        return (C38616ab) this.f89662z.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(140, new RunnableC90250g(AdPopUpWebPageView.class, "onPopUpPageCloseEvent", C33130m.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$b */
    public static final class C37941b {
        static {
            Covode.recordClassIndex(45399);
        }

        private C37941b() {
        }

        public /* synthetic */ C37941b(byte b) {
            this();
        }
    }

    public final boolean getFromTitleBarClick() {
        return this.f89659w;
    }

    public final AbstractC37942c getKeyDownCallBack() {
        return this.f89656t;
    }

    public final AbstractC37940a getMBehaviorCallback() {
        return this.f89655s;
    }

    public final int getMDownX() {
        return this.f89630B;
    }

    public final int getMDownY() {
        return this.f89631C;
    }

    public final C38618ac getParams() {
        return this.f89653q;
    }

    public final String getRenderType() {
        return this.f89660x;
    }

    public final AbstractC37943d getTitleBarCallback() {
        return this.f89654r;
    }

    /* renamed from: a */
    public final void mo66108a(boolean z) {
        if (this.f89640c) {
            SSWebView webView = ((CommonBizWebView) mo66102a(R.id.d4e)).getWebView();
            if (webView != null) {
                webView.destroy();
            }
        } else {
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo66102a(R.id.d4d);
            C89219l.m154716b(crossPlatformWebView, "");
            WebView webView2 = (WebView) crossPlatformWebView.findViewById(R.id.fii);
            if (webView2 != null) {
                webView2.destroy();
            }
        }
        if (!mo66111d() || z) {
            ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89573d = true;
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45);
            if (adPopUpWebBottomSheetContainer.mo66067d() || adPopUpWebBottomSheetContainer.f89606h.f89575f == 6) {
                adPopUpWebBottomSheetContainer.f89606h.mo66047c(5);
            }
        } else {
            if (((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().mo66044b() != ((int) C13628n.m24520b(getContext(), 64.0f))) {
                AbstractC37940a aVar = this.f89655s;
                if (aVar != null) {
                    aVar.mo66145a(this.f89633E.f89663a, false);
                }
                FrameLayout frameLayout = (FrameLayout) mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
                RelativeLayout relativeLayout = (RelativeLayout) mo66102a(R.id.ays);
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                RelativeLayout relativeLayout2 = (RelativeLayout) mo66102a(R.id.ays);
                C89219l.m154716b(relativeLayout2, "");
                relativeLayout2.setAlpha(1.0f);
            }
            ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().mo66045b((int) C13628n.m24520b(getContext(), 64.0f));
            ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo66066c();
        }
        C38754l.m78608a(getContext());
        ((ImageView) mo66102a(R.id.dg)).removeCallbacks(this.f89646i);
        ((ImageView) mo66102a(R.id.dg)).removeCallbacks(this.f89647j);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$t */
    public static final class C37961t implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89688a;

        /* renamed from: b */
        final /* synthetic */ AnimatorSet f89689b;

        static {
            Covode.recordClassIndex(45419);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$t$a */
        static final class RunnableC37962a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C37961t f89690a;

            static {
                Covode.recordClassIndex(45420);
            }

            RunnableC37962a(C37961t tVar) {
                this.f89690a = tVar;
            }

            public final void run() {
                this.f89690a.f89689b.start();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f89688a.f89646i == null) {
                this.f89688a.f89646i = new RunnableC37962a(this);
            }
            ((ImageView) this.f89688a.mo66102a(R.id.dg)).postDelayed(this.f89688a.f89646i, 400);
        }

        C37961t(AdPopUpWebPageView adPopUpWebPageView, AnimatorSet animatorSet) {
            this.f89688a = adPopUpWebPageView;
            this.f89689b = animatorSet;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$e */
    public static final class C37944e implements AdPopUpWebBottomSheetContainer.AbstractC37931b {

        /* renamed from: a */
        public int f89663a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f89664b;

        /* renamed from: c */
        final /* synthetic */ Context f89665c;

        static {
            Covode.recordClassIndex(45402);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.AbstractC37931b
        /* renamed from: e */
        public final void mo66081e() {
            this.f89663a = 6;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.AbstractC37931b
        /* renamed from: c */
        public final void mo66079c() {
            if (AdPopUpWebBottomSheetContainer.f89604i) {
                C38754l.m78608a(this.f89665c);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.AbstractC37931b
        /* renamed from: a */
        public final void mo66076a() {
            String str;
            if (this.f89664b.mo66111d()) {
                ((AdPopUpWebBottomSheetContainer) this.f89664b.mo66102a(R.id.d45)).getBehavior().mo66045b((int) C13628n.m24520b(this.f89665c, 64.0f));
                if (this.f89664b.f89645h) {
                    AdPopUpWebPageView adPopUpWebPageView = this.f89664b;
                    C37977b bVar = adPopUpWebPageView.f89644g;
                    if (bVar != null) {
                        str = bVar.f89725e;
                    } else {
                        str = null;
                    }
                    adPopUpWebPageView.mo66107a(str);
                    this.f89664b.f89645h = false;
                }
            }
            int i = this.f89663a;
            if (i != 3) {
                this.f89663a = 3;
                AbstractC37940a mBehaviorCallback = this.f89664b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.mo66147b(i);
                }
                FrameLayout frameLayout = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.AbstractC37931b
        /* renamed from: b */
        public final void mo66078b() {
            AbstractC37940a mBehaviorCallback;
            if (this.f89664b.mo66111d()) {
                this.f89664b.mo66109b();
                this.f89664b.f89645h = true;
            }
            int i = this.f89663a;
            if (i != 4) {
                this.f89663a = 4;
                if (this.f89664b.mo66111d() && ((AdPopUpWebBottomSheetContainer) this.f89664b.mo66102a(R.id.d45)).getBehavior().mo66044b() == ((int) C13628n.m24520b(this.f89665c, 64.0f))) {
                    FrameLayout frameLayout = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(8);
                    ((FrameLayout) this.f89664b.mo66102a(R.id.d49)).setOnClickListener(null);
                    FrameLayout frameLayout2 = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                    C89219l.m154716b(frameLayout2, "");
                    frameLayout2.setClickable(false);
                    AbstractC37940a mBehaviorCallback2 = this.f89664b.getMBehaviorCallback();
                    if (mBehaviorCallback2 != null) {
                        mBehaviorCallback2.mo66145a(i, false);
                    }
                }
            } else if (this.f89664b.mo66111d() && (mBehaviorCallback = this.f89664b.getMBehaviorCallback()) != null) {
                mBehaviorCallback.mo66145a(i, true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.AbstractC37931b
        /* renamed from: d */
        public final void mo66080d() {
            AdPopUpWebPageContainer adPopUpWebPageContainer;
            AbstractC40591g crossPlatformBusiness;
            AdWebStatBusiness adWebStatBusiness;
            int i = this.f89663a;
            if (i != 5) {
                this.f89663a = 5;
                if (this.f89664b.f89640c) {
                    this.f89664b.getBulletLoadListener().mo62036a(true);
                } else {
                    this.f89664b.getLoadListener().mo67194a(true);
                }
                AbstractC38683bj bjVar = this.f89664b.f89638a;
                if (bjVar != null) {
                    bjVar.mo59237a(false);
                }
                FrameLayout frameLayout = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
                ((FrameLayout) this.f89664b.mo66102a(R.id.d49)).setOnClickListener(null);
                FrameLayout frameLayout2 = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setClickable(false);
                if (!(this.f89664b.mo66111d() || (adPopUpWebPageContainer = this.f89664b.f89639b) == null || (crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class)) == null)) {
                    adWebStatBusiness.mo69707a(true);
                }
                AbstractC37940a mBehaviorCallback = this.f89664b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.mo66144a(i);
                }
                this.f89664b.f89641d = false;
                if (this.f89664b.f89640c) {
                    this.f89664b.getBulletLoadListener().f83075g = true;
                    AbstractC16208i iVar = (AbstractC16208i) ((BulletContainerView) this.f89664b.mo66102a(R.id.d4e)).getProviderFactory().mo25832c(AbstractC16208i.class);
                    if (iVar != null) {
                        iVar.mo25776k();
                    }
                } else {
                    this.f89664b.getLoadListener().f91258f = true;
                    ((CrossPlatformWebView) this.f89664b.mo66102a(R.id.d4d)).mo69919a("onHide", (JSONObject) null, "");
                }
                this.f89664b.mo66109b();
                this.f89664b.f89645h = true;
            }
        }

        C37944e(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f89664b = adPopUpWebPageView;
            this.f89665c = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.AbstractC37931b
        /* renamed from: a */
        public final void mo66077a(View view, float f) {
            C89219l.m154721d(view, "");
            if (this.f89664b.mo66111d()) {
                float a = (float) (C34723i.m70924a(this.f89665c) - view.getTop());
                if (a > C13628n.m24520b(this.f89665c, 400.0f)) {
                    RelativeLayout relativeLayout = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout, "");
                    relativeLayout.setVisibility(8);
                } else {
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout2, "");
                    relativeLayout2.setVisibility(0);
                }
                if (a > C13628n.m24520b(this.f89665c, 400.0f)) {
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout3, "");
                    relativeLayout3.setAlpha(0.0f);
                    RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.f89664b.mo66102a(R.id.d48);
                    C89219l.m154716b(roundedFrameLayout, "");
                    roundedFrameLayout.setAlpha(1.0f);
                } else if (a >= C13628n.m24520b(this.f89665c, 300.0f) && a <= C13628n.m24520b(this.f89665c, 400.0f)) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout4, "");
                    relativeLayout4.setAlpha(0.0f);
                    RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.f89664b.mo66102a(R.id.d48);
                    C89219l.m154716b(roundedFrameLayout2, "");
                    roundedFrameLayout2.setAlpha(((1.0f - ((C13628n.m24520b(this.f89665c, 400.0f) - a) / C13628n.m24520b(this.f89665c, 100.0f))) * 0.9f) + 0.1f);
                } else if (a < C13628n.m24520b(this.f89665c, 200.0f) || a >= C13628n.m24520b(this.f89665c, 300.0f)) {
                    RoundedFrameLayout roundedFrameLayout3 = (RoundedFrameLayout) this.f89664b.mo66102a(R.id.d48);
                    C89219l.m154716b(roundedFrameLayout3, "");
                    roundedFrameLayout3.setAlpha(0.0f);
                    RelativeLayout relativeLayout5 = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout5, "");
                    relativeLayout5.setAlpha(1.0f);
                } else {
                    RoundedFrameLayout roundedFrameLayout4 = (RoundedFrameLayout) this.f89664b.mo66102a(R.id.d48);
                    C89219l.m154716b(roundedFrameLayout4, "");
                    roundedFrameLayout4.setAlpha(0.0f);
                    RelativeLayout relativeLayout6 = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout6, "");
                    relativeLayout6.setAlpha((C13628n.m24520b(this.f89665c, 300.0f) - a) / C13628n.m24520b(this.f89665c, 100.0f));
                }
                FrameLayout frameLayout = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setAlpha(1.0f - (((float) view.getTop()) / (((float) C34723i.m70924a(this.f89665c)) - C13628n.m24520b(this.f89665c, 64.0f))));
                return;
            }
            RelativeLayout relativeLayout7 = (RelativeLayout) this.f89664b.mo66102a(R.id.ays);
            C89219l.m154716b(relativeLayout7, "");
            relativeLayout7.setVisibility(8);
            if (Float.isNaN(f)) {
                FrameLayout frameLayout3 = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout3, "");
                frameLayout3.setAlpha(1.0f);
            } else if (f < 0.0f) {
                float abs = Math.abs(f);
                FrameLayout frameLayout4 = (FrameLayout) this.f89664b.mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout4, "");
                frameLayout4.setAlpha(1.0f - abs);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$f */
    static final class C37945f extends AbstractC89220m implements AbstractC89171a<C35194i> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89666a;

        static {
            Covode.recordClassIndex(45403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37945f(AdPopUpWebPageView adPopUpWebPageView) {
            super(0);
            this.f89666a = adPopUpWebPageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C35194i invoke() {
            C35194i iVar = new C35194i();
            iVar.f83074f = this.f89666a.f89652o;
            return iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$n */
    static final class C37955n extends AbstractC89220m implements AbstractC89171a<C38616ab> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89680a;

        static {
            Covode.recordClassIndex(45413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37955n(AdPopUpWebPageView adPopUpWebPageView) {
            super(0);
            this.f89680a = adPopUpWebPageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C38616ab invoke() {
            C38616ab abVar = new C38616ab();
            abVar.f91257e = this.f89680a.f89651n;
            return abVar;
        }
    }

    public final C37975a getActionMode() {
        return ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$u */
    public static final class C37963u implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89691a;

        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f89692b;

        static {
            Covode.recordClassIndex(45421);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$u$a */
        static final class RunnableC37964a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C37963u f89693a;

            static {
                Covode.recordClassIndex(45422);
            }

            RunnableC37964a(C37963u uVar) {
                this.f89693a = uVar;
            }

            public final void run() {
                ImageView imageView = (ImageView) this.f89693a.f89691a.mo66102a(R.id.dg);
                C89219l.m154716b(imageView, "");
                imageView.setAlpha(1.0f);
                this.f89693a.f89692b.start();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f89691a.f89647j == null) {
                this.f89691a.f89647j = new RunnableC37964a(this);
            }
            ((ImageView) this.f89691a.mo66102a(R.id.dg)).postDelayed(this.f89691a.f89647j, 400);
        }

        C37963u(AdPopUpWebPageView adPopUpWebPageView, ObjectAnimator objectAnimator) {
            this.f89691a = adPopUpWebPageView;
            this.f89692b = objectAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$v */
    public static final class C37965v implements AdPopUpWebTitleBar.AbstractC37968b {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89694a;

        /* renamed from: b */
        final /* synthetic */ Context f89695b;

        static {
            Covode.recordClassIndex(45423);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: a */
        public final void mo66171a() {
            this.f89694a.f89643f = "button";
            this.f89694a.mo66108a(false);
            AbstractC37943d titleBarCallback = this.f89694a.getTitleBarCallback();
            if (titleBarCallback != null) {
                titleBarCallback.mo66149a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: b */
        public final void mo66172b() {
            if (this.f89694a.f89640c) {
                ((CommonBizWebView) this.f89694a.mo66102a(R.id.d4e)).mo62062g();
            } else {
                ((CrossPlatformWebView) this.f89694a.mo66102a(R.id.d4d)).mo69922a();
            }
            this.f89694a.getTitleBarCallback();
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: d */
        public final void mo66174d() {
            if (!this.f89694a.mo66128h()) {
                return;
            }
            if (this.f89694a.f89642e) {
                ShareH5Service a = ShareH5Service.C68827a.m121397a();
                CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f89694a.mo66102a(R.id.d4d);
                C89219l.m154716b(crossPlatformWebView, "");
                AbstractC40591g crossPlatformBusiness = crossPlatformWebView.getCrossPlatformBusiness();
                SingleWebView a2 = ((AbstractC40746j) ((CrossPlatformWebView) this.f89694a.mo66102a(R.id.d4d)).mo69911a(AbstractC40746j.class)).mo69969a();
                C89219l.m154716b(a2, "");
                a.mo109380a(crossPlatformBusiness, a2, 2);
                return;
            }
            ShareH5Service a3 = ShareH5Service.C68827a.m121397a();
            CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) this.f89694a.mo66102a(R.id.d4d);
            C89219l.m154716b(crossPlatformWebView2, "");
            a3.mo109379a(crossPlatformWebView2.getCrossPlatformBusiness(), 2);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.AbstractC37968b
        /* renamed from: c */
        public final void mo66173c() {
            C40617a aVar;
            ReportBusiness reportBusiness;
            C16721b bVar;
            String f;
            AbstractC35125b bVar2;
            Context context = this.f89695b;
            C35226e eVar = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                if (this.f89694a.f89640c) {
                    C35222b rootContainer = ((CommonBizWebView) this.f89694a.mo66102a(R.id.d4e)).getRootContainer();
                    if (rootContainer == null || (bVar2 = rootContainer.f83165z) == null) {
                        bVar = null;
                    } else {
                        bVar = bVar2.mo61979b();
                    }
                    if (bVar instanceof C35196j) {
                        eVar = bVar;
                    }
                    C35226e eVar2 = eVar;
                    if (eVar2 != null && (f = eVar2.mo62115f()) != null) {
                        C35222b rootContainer2 = ((CommonBizWebView) this.f89694a.mo66102a(R.id.d4e)).getRootContainer();
                        if (!(rootContainer2 == null || rootContainer2.f83165z.mo61972a(com.p2082ss.android.ugc.aweme.bullet.business.ReportBusiness.class) == null)) {
                            com.p2082ss.android.ugc.aweme.bullet.business.ReportBusiness.m71836a(activity, f);
                        }
                    } else {
                        return;
                    }
                } else {
                    CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f89694a.mo66102a(R.id.d4d);
                    C89219l.m154716b(crossPlatformWebView, "");
                    C40618a crossPlatformParams = crossPlatformWebView.getCrossPlatformParams();
                    if (crossPlatformParams != null && (aVar = crossPlatformParams.f95068a) != null && aVar.f95061j != null) {
                        CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) this.f89694a.mo66102a(R.id.d4d);
                        C89219l.m154716b(crossPlatformWebView2, "");
                        AbstractC40591g crossPlatformBusiness = crossPlatformWebView2.getCrossPlatformBusiness();
                        if (!(crossPlatformBusiness == null || (reportBusiness = (ReportBusiness) crossPlatformBusiness.mo69748a(ReportBusiness.class)) == null)) {
                            reportBusiness.mo65535a(activity);
                        }
                    } else {
                        return;
                    }
                }
                AbstractC37943d titleBarCallback = this.f89694a.getTitleBarCallback();
                if (titleBarCallback != null) {
                    titleBarCallback.mo66150b();
                }
            }
        }

        C37965v(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f89694a = adPopUpWebPageView;
            this.f89695b = context;
        }
    }

    /* renamed from: i */
    private final boolean m76918i() {
        C38618ac acVar;
        C58067a aVar = C58067a.f132302a;
        C38618ac acVar2 = this.f89653q;
        AwemeRawAd awemeRawAd = null;
        if (acVar2 != null) {
            awemeRawAd = acVar2.f91264f;
        }
        if ((aVar.mo95568a(awemeRawAd) || ((acVar = this.f89653q) != null && acVar.f91266h != null)) && this.f89640c) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m76919j() {
        if (((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo66113e() {
        if (((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo66114f() {
        if (((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo66115g() {
        AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45);
        if (adPopUpWebBottomSheetContainer == null || !adPopUpWebBottomSheetContainer.mo66067d()) {
            return false;
        }
        return true;
    }

    public final WebView getWebView() {
        return ((AbstractC40746j) ((CrossPlatformWebView) mo66102a(R.id.d4d)).mo69911a(AbstractC40746j.class)).mo69969a();
    }

    /* renamed from: h */
    public final boolean mo66128h() {
        C38618ac acVar;
        AwemeRawAd awemeRawAd;
        C38618ac acVar2 = this.f89653q;
        if ((acVar2 == null || !acVar2.f91265g) && ((acVar = this.f89653q) == null || (awemeRawAd = acVar.f91264f) == null || awemeRawAd.getWebviewPannelStyle() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$o */
    public static final class C37956o implements AdPopUpWebNaviBar.AbstractC37937a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89681a;

        static {
            Covode.recordClassIndex(45414);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.AbstractC37937a
        /* renamed from: a */
        public final void mo66094a() {
            if (this.f89681a.f89640c) {
                ((CommonBizWebView) this.f89681a.mo66102a(R.id.d4e)).mo62062g();
            } else {
                ((CrossPlatformWebView) this.f89681a.mo66102a(R.id.d4d)).mo69922a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.AbstractC37937a
        /* renamed from: b */
        public final void mo66095b() {
            if (this.f89681a.f89640c) {
                SSWebView sSWebView = ((CommonBizWebView) this.f89681a.mo66102a(R.id.d4e)).f83123l;
                if (sSWebView != null && sSWebView.canGoForward()) {
                    sSWebView.goForward();
                    return;
                }
                return;
            }
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f89681a.mo66102a(R.id.d4d);
            if (crossPlatformWebView.f95346c != 2) {
                SingleWebView singleWebView = crossPlatformWebView.f95344a;
                if (singleWebView == null) {
                    C89219l.m154710a("singleWebView");
                }
                if (singleWebView.canGoForward()) {
                    SingleWebView singleWebView2 = crossPlatformWebView.f95344a;
                    if (singleWebView2 == null) {
                        C89219l.m154710a("singleWebView");
                    }
                    singleWebView2.goForward();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37956o(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89681a = adPopUpWebPageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$p */
    public static final class C37957p implements C35194i.AbstractC35195a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89682a;

        /* renamed from: b */
        final /* synthetic */ Context f89683b;

        static {
            Covode.recordClassIndex(45415);
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35194i.AbstractC35195a
        /* renamed from: a */
        public final void mo62041a() {
            FrameLayout frameLayout = (FrameLayout) this.f89682a.mo66102a(R.id.d4c);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f89682a.mo66102a(R.id.d4d)).findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35194i.AbstractC35195a
        /* renamed from: b */
        public final void mo62042b() {
            FrameLayout frameLayout = (FrameLayout) this.f89682a.mo66102a(R.id.d4c);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f89682a.mo66102a(R.id.d4d)).findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35194i.AbstractC35195a
        /* renamed from: c */
        public final void mo62043c() {
            Context context = this.f89683b;
            String str = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isFinishing()) {
                this.f89682a.f89642e = true;
                boolean z = false;
                if (this.f89682a.f89649l) {
                    SSWebView webView = ((CommonBizWebView) this.f89682a.mo66102a(R.id.d4e)).getWebView();
                    if (webView != null) {
                        str = webView.getUrl();
                    }
                    if (!C89219l.m154714a((Object) "about:blank", (Object) str)) {
                        this.f89682a.f89649l = false;
                        this.f89682a.mo66110c();
                    }
                }
                if (this.f89682a.mo66128h()) {
                    ((AdPopUpWebTitleBar) this.f89682a.mo66102a(R.id.d4l)).mo66181c();
                    ((RoundedFrameLayout) this.f89682a.mo66102a(R.id.d4h)).setBackgroundResource(R.drawable.pf);
                    if (!this.f89682a.f89650m && ((CommonBizWebView) this.f89682a.mo66102a(R.id.d4e)).mo62067h()) {
                        AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f89682a.mo66102a(R.id.d4_);
                        C89219l.m154716b(adPopUpWebNaviBar, "");
                        if (adPopUpWebNaviBar.getVisibility() == 8) {
                            AdPopUpWebNaviBar adPopUpWebNaviBar2 = (AdPopUpWebNaviBar) this.f89682a.mo66102a(R.id.d4_);
                            C89219l.m154716b(adPopUpWebNaviBar2, "");
                            adPopUpWebNaviBar2.setVisibility(0);
                        }
                    }
                    ((AdPopUpWebNaviBar) this.f89682a.mo66102a(R.id.d4_)).setGoBackEnable(((CommonBizWebView) this.f89682a.mo66102a(R.id.d4e)).mo62067h());
                    AdPopUpWebNaviBar adPopUpWebNaviBar3 = (AdPopUpWebNaviBar) this.f89682a.mo66102a(R.id.d4_);
                    SSWebView sSWebView = ((CommonBizWebView) this.f89682a.mo66102a(R.id.d4e)).f83123l;
                    if (sSWebView != null) {
                        z = sSWebView.canGoForward();
                    }
                    adPopUpWebNaviBar3.setGoForwardEnable(z);
                    return;
                }
                WebView webView2 = this.f89682a.getWebView();
                if (webView2 == null) {
                    return;
                }
                if (webView2.canGoBack()) {
                    ((AdPopUpWebTitleBar) this.f89682a.mo66102a(R.id.d4l)).mo66179b();
                } else {
                    ((AdPopUpWebTitleBar) this.f89682a.mo66102a(R.id.d4l)).mo66181c();
                }
            }
        }

        C37957p(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f89682a = adPopUpWebPageView;
            this.f89683b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$q */
    public static final class C37958q implements C38616ab.AbstractC38617a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89684a;

        /* renamed from: b */
        final /* synthetic */ Context f89685b;

        static {
            Covode.recordClassIndex(45416);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab.AbstractC38617a
        /* renamed from: a */
        public final void mo66156a() {
            FrameLayout frameLayout = (FrameLayout) this.f89684a.mo66102a(R.id.d4c);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f89684a.mo66102a(R.id.d4d)).findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab.AbstractC38617a
        /* renamed from: b */
        public final void mo66157b() {
            FrameLayout frameLayout = (FrameLayout) this.f89684a.mo66102a(R.id.d4c);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f89684a.mo66102a(R.id.d4d)).findViewById(R.id.awv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
            if (r1.canGoForward() != false) goto L_0x00e8;
         */
        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38616ab.AbstractC38617a
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo66158c() {
            /*
            // Method dump skipped, instructions count: 282
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.C37958q.mo66158c():void");
        }

        C37958q(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f89684a = adPopUpWebPageView;
            this.f89685b = context;
        }
    }

    /* renamed from: c */
    public final void mo66110c() {
        if (this.f89640c) {
            SSWebView webView = ((CommonBizWebView) mo66102a(R.id.d4e)).getWebView();
            if (webView != null) {
                webView.clearHistory();
                return;
            }
            return;
        }
        SingleWebView singleWebView = ((CrossPlatformWebView) mo66102a(R.id.d4d)).f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.clearHistory();
    }

    /* renamed from: d */
    public final boolean mo66111d() {
        if (((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 4 || ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 5 || ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo66109b() {
        this.f89649l = true;
        if (this.f89640c) {
            SSWebView webView = ((CommonBizWebView) mo66102a(R.id.d4e)).getWebView();
            if (webView != null) {
                webView.loadUrl("about:blank");
                return;
            }
            return;
        }
        CrossPlatformWebView.m82144a((CrossPlatformWebView) mo66102a(R.id.d4d), "about:blank", false, null, 6);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AbstractC35125b bVar;
        DownloadBusiness downloadBusiness;
        if (this.f89640c) {
            C35222b rootContainer = ((CommonBizWebView) mo66102a(R.id.d4e)).getRootContainer();
            if (!(rootContainer == null || (bVar = rootContainer.f83165z) == null || (downloadBusiness = (DownloadBusiness) bVar.mo61972a(DownloadBusiness.class)) == null)) {
                downloadBusiness.mo65531a();
            }
            ((BulletContainerView) mo66102a(R.id.d4e)).mo25721a();
        } else {
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f89639b;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.mo66097a();
            }
        }
        C80298cg.m139205b(this);
        super.onDetachedFromWindow();
        AbstractC38683bj bjVar = this.f89638a;
        if (bjVar != null) {
            bjVar.mo59237a(false);
        }
        this.f89638a = null;
    }

    /* renamed from: k */
    private final void m76920k() {
        if (this.f89658v) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo66102a(R.id.dg), "translationY", C13628n.m24520b(getContext(), 6.0f), C13628n.m24520b(getContext(), -4.0f));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mo66102a(R.id.dg), "translationY", C13628n.m24520b(getContext(), -4.0f), C13628n.m24520b(getContext(), -6.0f));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mo66102a(R.id.dg), "translationY", C13628n.m24520b(getContext(), 6.0f), 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(mo66102a(R.id.dg), "translationY", 0.0f, C13628n.m24520b(getContext(), -4.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(mo66102a(R.id.dg), "alpha", 1.0f, 0.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(500L);
            C89219l.m154716b(ofFloat2, "");
            ofFloat2.setDuration(100L);
            C89219l.m154716b(ofFloat3, "");
            ofFloat3.setDuration(300L);
            C89219l.m154716b(ofFloat4, "");
            ofFloat4.setDuration(300L);
            C89219l.m154716b(ofFloat5, "");
            ofFloat5.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet.play(ofFloat4).before(ofFloat2);
            animatorSet.play(ofFloat2).with(ofFloat5);
            animatorSet2.play(ofFloat).before(ofFloat2).with(ofFloat5);
            animatorSet2.play(ofFloat2).with(ofFloat5);
            animatorSet.addListener(new C37961t(this, animatorSet2));
            animatorSet2.addListener(new C37963u(this, ofFloat3));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo66103a() {
        AbstractC40591g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.f89639b;
        if (adPopUpWebPageContainer != null && (crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness()) != null && (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.mo69707a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        Bundle bundle;
        AnchorLynxModel anchorLynxModel;
        int i;
        AbstractC1204m mVar;
        AbstractC1204m mVar2;
        AbstractC35125b bVar;
        DownloadBusiness downloadBusiness;
        String str;
        MethodCollector.m26663i(4917);
        super.onAttachedToWindow();
        C38618ac acVar = this.f89653q;
        if (acVar == null || (bundle = acVar.f91263e) == null) {
            MethodCollector.m26664o(4917);
            return;
        }
        C38618ac acVar2 = this.f89653q;
        if (acVar2 != null) {
            anchorLynxModel = acVar2.f91266h;
        } else {
            anchorLynxModel = null;
        }
        if (anchorLynxModel != null) {
            this.f89640c = true;
        }
        C80298cg.m139204a(this);
        View.inflate(getContext(), R.layout.a91, this);
        FrameLayout frameLayout = (FrameLayout) mo66102a(R.id.cyh);
        C89219l.m154716b(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C38618ac acVar3 = this.f89653q;
            if (acVar3 != null) {
                i = acVar3.f91261c;
            } else {
                i = 0;
            }
            marginLayoutParams.topMargin = i;
            frameLayout.requestLayout();
            int b = C34723i.m70928b(getContext());
            int a = C34723i.m70924a(getContext());
            C38615aa.f91250h = (a - C34723i.m70927b()) / b;
            C38615aa.f91248f = b;
            C38615aa.f91249g = a;
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45);
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) mo66102a(R.id.d4h);
            C89219l.m154716b(roundedFrameLayout, "");
            C89219l.m154721d(roundedFrameLayout, "");
            ViewGroup.LayoutParams layoutParams2 = roundedFrameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                ((CoordinatorLayout.C0560e) layoutParams2).mo2538a(adPopUpWebBottomSheetContainer.f89606h);
                String string = bundle.getString("title");
                if (TextUtils.isEmpty(string)) {
                    string = bundle.getString("bundle_web_title");
                }
                if (TextUtils.isEmpty(string)) {
                    C38618ac acVar4 = this.f89653q;
                    if (acVar4 != null) {
                        str = acVar4.f91259a;
                    } else {
                        str = null;
                    }
                    string = Uri.parse(str).getQueryParameter("title");
                }
                AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) mo66102a(R.id.d4l);
                adPopUpWebTitleBar.mo66178a(string);
                C17235c.m31810a(adPopUpWebTitleBar.mo66176a(R.id.d46), 0.5f);
                C17235c.m31810a(adPopUpWebTitleBar.mo66176a(R.id.d47), 0.5f);
                C17235c.m31810a(adPopUpWebTitleBar.mo66176a(R.id.d4f), 0.5f);
                C17235c.m31810a(adPopUpWebTitleBar.mo66176a(R.id.d4i), 0.5f);
                C17235c.m31810a(adPopUpWebTitleBar.mo66176a(R.id.a3k), 0.5f);
                ((AutoRTLImageView) adPopUpWebTitleBar.mo66176a(R.id.d47)).setOnClickListener(new AdPopUpWebTitleBar.View$OnClickListenerC37969c(adPopUpWebTitleBar));
                ((TuxIconView) adPopUpWebTitleBar.mo66176a(R.id.a3k)).setOnClickListener(new AdPopUpWebTitleBar.View$OnClickListenerC37970d(adPopUpWebTitleBar));
                ((TuxIconView) adPopUpWebTitleBar.mo66176a(R.id.d4f)).setOnClickListener(new AdPopUpWebTitleBar.View$OnClickListenerC37971e(adPopUpWebTitleBar));
                ((TuxIconView) adPopUpWebTitleBar.mo66176a(R.id.d46)).setOnClickListener(new AdPopUpWebTitleBar.View$OnClickListenerC37972f(adPopUpWebTitleBar));
                ((AutoRTLImageView) adPopUpWebTitleBar.mo66176a(R.id.d4i)).setOnClickListener(new AdPopUpWebTitleBar.View$OnClickListenerC37973g(adPopUpWebTitleBar));
                if (bundle.getBoolean("isFromChallenge")) {
                    AdPopUpWebTitleBar adPopUpWebTitleBar2 = (AdPopUpWebTitleBar) mo66102a(R.id.d4l);
                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) adPopUpWebTitleBar2.mo66176a(R.id.d47);
                    C89219l.m154716b(autoRTLImageView, "");
                    autoRTLImageView.setVisibility(8);
                    TuxIconView tuxIconView = (TuxIconView) adPopUpWebTitleBar2.mo66176a(R.id.a3k);
                    C89219l.m154716b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    TuxIconView tuxIconView2 = (TuxIconView) adPopUpWebTitleBar2.mo66176a(R.id.d4f);
                    C89219l.m154716b(tuxIconView2, "");
                    tuxIconView2.setVisibility(8);
                    TuxIconView tuxIconView3 = (TuxIconView) adPopUpWebTitleBar2.mo66176a(R.id.d46);
                    C89219l.m154716b(tuxIconView3, "");
                    tuxIconView3.setVisibility(8);
                    AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) adPopUpWebTitleBar2.mo66176a(R.id.d4i);
                    C89219l.m154716b(autoRTLImageView2, "");
                    autoRTLImageView2.setVisibility(8);
                    TuxTextView tuxTextView = (TuxTextView) adPopUpWebTitleBar2.mo66176a(R.id.d4k);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(8);
                }
                if (this.f89640c) {
                    CommonBizWebView commonBizWebView = (CommonBizWebView) mo66102a(R.id.d4e);
                    C89219l.m154716b(commonBizWebView, "");
                    commonBizWebView.setVisibility(0);
                    CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo66102a(R.id.d4d);
                    C89219l.m154716b(crossPlatformWebView, "");
                    crossPlatformWebView.setVisibility(8);
                    ((CommonBizWebView) mo66102a(R.id.d4e)).setScrollListener(new C37950k(this, bundle));
                } else {
                    ((AbstractC40746j) ((CrossPlatformWebView) mo66102a(R.id.d4d)).mo69911a(AbstractC40746j.class)).mo69969a().setWebScrollListener(new C37951l(this, bundle));
                }
                if (mo66128h()) {
                    ((RoundedFrameLayout) mo66102a(R.id.d4h)).setBackgroundResource(R.drawable.pg);
                    ((RoundedFrameLayout) mo66102a(R.id.d4h)).setRadius(0);
                    ((CrossPlatformWebView) mo66102a(R.id.d4d)).setShouldShowProgressBarBg(true);
                }
                C17235c.m31810a(mo66102a(R.id.d4g), 0.5f);
                TuxTextView tuxTextView2 = (TuxTextView) mo66102a(R.id.ahx);
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                } else if (mo66111d()) {
                    RelativeLayout relativeLayout = (RelativeLayout) mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout, "");
                    relativeLayout.setVisibility(0);
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89589t = true;
                } else {
                    RelativeLayout relativeLayout2 = (RelativeLayout) mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout2, "");
                    relativeLayout2.setVisibility(8);
                }
                Context context = getContext();
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    WebView webView = getWebView();
                    if (webView != null) {
                        C37946g gVar = new C37946g(webView, webView, this);
                        this.f89661y = gVar;
                        webView.setWebChromeClient(gVar);
                    }
                    this.f89638a = new C37947h(this, activity, activity);
                    if (this.f89640c) {
                        C38618ac acVar5 = this.f89653q;
                        if (!(acVar5 == null || (mVar2 = acVar5.f91260b) == null)) {
                            ((CommonBizWebView) mo66102a(R.id.d4e)).mo62060a(C34963b.m71411a().mo61850a(), getBulletLoadListener(), new BulletActivityWrapper(activity), mVar2, "ad_commerce");
                            C35222b rootContainer = ((CommonBizWebView) mo66102a(R.id.d4e)).getRootContainer();
                            if (!(rootContainer == null || (bVar = rootContainer.f83165z) == null || (downloadBusiness = (DownloadBusiness) bVar.mo61972a(DownloadBusiness.class)) == null)) {
                                downloadBusiness.f88960b = R.id.ff;
                                downloadBusiness.f88961c = R.id.fe;
                            }
                        }
                    } else {
                        C38618ac acVar6 = this.f89653q;
                        if (!(acVar6 == null || (mVar = acVar6.f91260b) == null)) {
                            CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) mo66102a(R.id.d4d);
                            C89219l.m154716b(crossPlatformWebView2, "");
                            AdPopUpWebPageContainer a2 = AdPopUpWebPageContainer.C37939a.m76912a(activity, crossPlatformWebView2, getLoadListener(), bundle, mVar);
                            this.f89639b = a2;
                            SingleWebChromeClient singleWebChromeClient = this.f89661y;
                            if (singleWebChromeClient != null) {
                                singleWebChromeClient.f95250f = a2;
                            }
                        }
                    }
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).setCallback(this.f89633E);
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89583n = true;
                    ((TuxTextView) mo66102a(R.id.d4g)).setOnClickListener(new View$OnClickListenerC37948i(this));
                    ((AdPopUpWebTitleBar) mo66102a(R.id.d4l)).setTitleBarListener(this.f89635G);
                    ((AdPopUpWebNaviBar) mo66102a(R.id.d4_)).setNaviBarListener(this.f89636H);
                    ((AdPopUpWebTitleBar) mo66102a(R.id.d4l)).setOnTouchListener(new View$OnTouchListenerC37949j(this));
                    if (this.f89640c) {
                        ((CommonBizWebView) mo66102a(R.id.d4e)).setOutTouchDelegate(this.f89634F);
                    } else {
                        ((CrossPlatformWebView) mo66102a(R.id.d4d)).setWebViewTouchListener(this.f89634F);
                        if (mo66128h()) {
                            ShareH5Service a3 = ShareH5Service.C68827a.m121397a();
                            CrossPlatformWebView crossPlatformWebView3 = (CrossPlatformWebView) mo66102a(R.id.d4d);
                            C89219l.m154716b(crossPlatformWebView3, "");
                            AbstractC40591g crossPlatformBusiness = crossPlatformWebView3.getCrossPlatformBusiness();
                            SingleWebView a4 = ((AbstractC40746j) ((CrossPlatformWebView) mo66102a(R.id.d4d)).mo69911a(AbstractC40746j.class)).mo69969a();
                            C89219l.m154716b(a4, "");
                            a3.mo109389b(crossPlatformBusiness, a4, 2);
                        }
                    }
                    if (mo66128h()) {
                        ((AdPopUpWebTitleBar) mo66102a(R.id.d4l)).mo66177a();
                        int a5 = C34728n.m70946a(52.5d);
                        CrossPlatformWebView crossPlatformWebView4 = (CrossPlatformWebView) mo66102a(R.id.d4d);
                        C89219l.m154716b(crossPlatformWebView4, "");
                        m76915a(crossPlatformWebView4, a5);
                        CommonBizWebView commonBizWebView2 = (CommonBizWebView) mo66102a(R.id.d4e);
                        C89219l.m154716b(commonBizWebView2, "");
                        m76915a(commonBizWebView2, a5);
                        FrameLayout frameLayout2 = (FrameLayout) mo66102a(R.id.d4c);
                        C89219l.m154716b(frameLayout2, "");
                        m76915a(frameLayout2, a5);
                    }
                }
                AbstractC89171a<? extends Object> aVar = this.f89657u;
                if (aVar != null) {
                    aVar.invoke();
                    MethodCollector.m26664o(4917);
                    return;
                }
                MethodCollector.m26664o(4917);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            MethodCollector.m26664o(4917);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.m26664o(4917);
        throw nullPointerException2;
    }

    public final void setFromAdButtonClick(boolean z) {
        this.f89648k = z;
    }

    public final void setFromTitleBarClick(boolean z) {
        this.f89659w = z;
    }

    public final void setKeyDownCallBack(AbstractC37942c cVar) {
        this.f89656t = cVar;
    }

    public final void setMBehaviorCallback(AbstractC37940a aVar) {
        this.f89655s = aVar;
    }

    public final void setMDownX(int i) {
        this.f89630B = i;
    }

    public final void setMDownY(int i) {
        this.f89631C = i;
    }

    public final void setParams(C38618ac acVar) {
        this.f89653q = acVar;
    }

    public final void setShouldStartAnimation(boolean z) {
        this.f89658v = z;
    }

    public final void setTitleBarCallback(AbstractC37943d dVar) {
        this.f89654r = dVar;
    }

    public final void setUseBullet(boolean z) {
        this.f89640c = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$m */
    public static final class C37952m extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89677a;

        static {
            Covode.recordClassIndex(45410);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$m$a */
        public static final class C37953a implements C28650a.AbstractC28654a {

            /* renamed from: a */
            final /* synthetic */ C28650a f89678a;

            static {
                Covode.recordClassIndex(45411);
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: a */
            public final void mo49607a() {
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: a */
            public final void mo49608a(int i) {
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: b */
            public final void mo49610b() {
            }

            C37953a(C28650a aVar) {
                this.f89678a = aVar;
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: a */
            public final void mo49609a(int i, int i2, int i3, int i4) {
                boolean z;
                if (this.f89678a.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AdPopUpWebBottomSheetContainer.f89604i = z;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37952m(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89677a = adPopUpWebPageView;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$m$b */
        static final class View$OnTouchListenerC37954b implements View.OnTouchListener {

            /* renamed from: a */
            final /* synthetic */ C37952m f89679a;

            static {
                Covode.recordClassIndex(45412);
            }

            View$OnTouchListenerC37954b(C37952m mVar) {
                this.f89679a = mVar;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                this.f89679a.f89677a.getActionMode().mo66195a(motionEvent);
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            if (view instanceof LynxView) {
                View findViewByName = ((LynxView) view).findViewByName("lynx-landing-page-scroll-view-container");
                if (!(findViewByName instanceof C28650a)) {
                    findViewByName = null;
                }
                C28650a aVar = (C28650a) findViewByName;
                if (aVar != null) {
                    aVar.setOnScrollListener(new C37953a(aVar));
                }
                view.setOnTouchListener(new View$OnTouchListenerC37954b(this));
            }
        }
    }

    public final void setRenderType(String str) {
        C89219l.m154721d(str, "");
        this.f89660x = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$r */
    public static final class View$OnClickListenerC37959r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89686a;

        static {
            Covode.recordClassIndex(45417);
        }

        View$OnClickListenerC37959r(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89686a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f89686a.mo66108a(false);
        }
    }

    /* renamed from: a */
    public final void mo66106a(AbstractC89171a<? extends Object> aVar) {
        if (mo66102a(R.id.cyh) == null) {
            this.f89657u = aVar;
        } else {
            aVar.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$i */
    static final class View$OnClickListenerC37948i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89671a;

        static {
            Covode.recordClassIndex(45406);
        }

        View$OnClickListenerC37948i(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89671a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AdPopUpWebPageView adPopUpWebPageView = this.f89671a;
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) adPopUpWebPageView.mo66102a(R.id.d4d);
            C89219l.m154716b(crossPlatformWebView, "");
            adPopUpWebPageView.mo66107a(crossPlatformWebView.getCurrentUrl());
        }
    }

    private final void setShouldHideBottomNavBar(String str) {
        this.f89650m = TextUtils.equals(Uri.parse(str).getQueryParameter("hide_bottom_nav_bar"), "1");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onPopUpPageCloseEvent(C33130m mVar) {
        C89219l.m154721d(mVar, "");
        if (mVar.f78722a == ((CommonBizWebView) mo66102a(R.id.d4e)).hashCode()) {
            mo66108a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$s */
    public static final class View$OnClickListenerC37960s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89687a;

        static {
            Covode.recordClassIndex(45418);
        }

        View$OnClickListenerC37960s(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89687a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f89687a.setFromAdButtonClick(true);
            ((AdPopUpWebBottomSheetContainer) this.f89687a.mo66102a(R.id.d45)).mo14580a();
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f89687a.f89639b;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.mo66098b();
            }
        }
    }

    /* renamed from: a */
    private static C20714a m76913a(User user) {
        UrlModel avatarLarger;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarLarger = user.getAvatarMedium();
        } else if (user.getAvatarThumb() != null) {
            avatarLarger = user.getAvatarThumb();
        } else {
            if (user.getAvatarLarger() != null) {
                avatarLarger = user.getAvatarLarger();
            }
            return null;
        }
        if (avatarLarger != null) {
            return new C20714a(avatarLarger.getUrlList());
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m76916b(String str) {
        String str2;
        AnchorLynxModel anchorLynxModel;
        C38618ac acVar = this.f89653q;
        if (acVar == null || (anchorLynxModel = acVar.f91266h) == null) {
            str2 = null;
        } else {
            str2 = anchorLynxModel.lynxSchema;
        }
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebPageView(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5206);
        this.f89640c = C37588c.m75846b();
        this.f89660x = "";
        this.f89662z = C89250i.m154773a((AbstractC89171a) new C37955n(this));
        this.f89629A = C89250i.m154773a((AbstractC89171a) new C37945f(this));
        this.f89632D = new C37952m(this);
        this.f89633E = new C37944e(this, context);
        this.f89651n = new C37958q(this, context);
        this.f89652o = new C37957p(this, context);
        this.f89634F = new View$OnTouchListenerC37966w(this);
        this.f89635G = new C37965v(this, context);
        this.f89636H = new C37956o(this);
        MethodCollector.m26664o(5206);
    }

    /* renamed from: a */
    private final String m76914a(AwemeRawAd awemeRawAd) {
        String str;
        C38220ag nativeSiteConfig;
        String str2 = null;
        if (!C58067a.f132302a.mo95568a(awemeRawAd)) {
            return null;
        }
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || (str = nativeSiteConfig.getLynxScheme()) == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("landPageShowType", String.valueOf(C33391a.m68472a(awemeRawAd)));
        Uri.Builder buildUpon = Uri.parse(C38584d.m78289a(str, bundle)).buildUpon();
        buildUpon.appendQueryParameter("lynx_landing_page_data", C63866a.f144791a.getAdLynxLandPageUtil().mo95567a(awemeRawAd, getContext()));
        if (awemeRawAd != null) {
            str2 = awemeRawAd.getWebTitle();
        }
        buildUpon.appendQueryParameter("lynx_landing_page_title", str2);
        String builder = buildUpon.toString();
        C89219l.m154716b(builder, "");
        return builder;
    }

    /* renamed from: c */
    private final boolean m76917c(String str) {
        AnchorLynxModel anchorLynxModel;
        if (!m76918i()) {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("hide_title_bar"), "1");
        }
        C38618ac acVar = this.f89653q;
        AwemeRawAd awemeRawAd = null;
        r1 = null;
        String a = null;
        if (acVar == null || acVar.f91266h == null) {
            C38618ac acVar2 = this.f89653q;
            if (acVar2 != null) {
                awemeRawAd = acVar2.f91264f;
            }
            a = m76914a(awemeRawAd);
        } else {
            C38618ac acVar3 = this.f89653q;
            if (!(acVar3 == null || (anchorLynxModel = acVar3.f91266h) == null)) {
                a = anchorLynxModel.lynxSchema;
            }
        }
        return TextUtils.equals(Uri.parse(a).getQueryParameter("hide_title_bar"), "1");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getActionMode().f89720i == 3 && ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89575f != 3) {
                getActionMode().mo66195a(motionEvent);
            }
            Integer valueOf = Integer.valueOf(motionEvent.getAction());
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    this.f89630B = (int) motionEvent.getX();
                    this.f89631C = (int) motionEvent.getY();
                    if (mo66111d() && ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89575f != 4) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (Math.abs(motionEvent.getX() - ((float) this.f89630B)) <= Math.abs(motionEvent.getY() - ((float) this.f89631C))) {
                        requestDisallowInterceptTouchEvent(false);
                    } else if (mo66111d() && ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89575f != 4) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo66105a(C37977b bVar) {
        String str;
        User user;
        C38212aa fakeAuthor;
        String str2;
        String str3;
        String str4;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        Aweme aweme;
        C40628b bVar2;
        C89219l.m154721d(bVar, "");
        String str5 = bVar.f89725e;
        String str6 = null;
        User user2 = null;
        str6 = null;
        if (str5 == null) {
            C38618ac acVar = this.f89653q;
            if (acVar != null) {
                str5 = acVar.f91259a;
            } else {
                str5 = null;
            }
        }
        if (m76916b(str5)) {
            this.f89644g = bVar;
            ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo31074b(bVar.f89723c);
            switch (bVar.f89723c) {
                case 1:
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo66065b();
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89573d = true;
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89574e = true;
                    break;
                case 2:
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo14580a();
                    break;
                case 3:
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo66066c();
                    break;
                case 4:
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo66066c();
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89573d = false;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo66065b();
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89573d = false;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).mo14580a();
                    ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).getBehavior().f89573d = false;
                    break;
                default:
                    return;
            }
            if (m76919j()) {
                FrameLayout frameLayout = (FrameLayout) mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
            } else {
                FrameLayout frameLayout2 = (FrameLayout) mo66102a(R.id.d49);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setVisibility(0);
                if (mo66113e()) {
                    FrameLayout frameLayout3 = (FrameLayout) mo66102a(R.id.d49);
                    C89219l.m154716b(frameLayout3, "");
                    frameLayout3.setAlpha(0.7316342f);
                }
            }
            String str7 = bVar.f89725e;
            if (str7 == null) {
                str7 = "";
            }
            if (m76917c(str7)) {
                AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) mo66102a(R.id.d4l);
                C89219l.m154716b(adPopUpWebTitleBar, "");
                adPopUpWebTitleBar.setVisibility(8);
                CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo66102a(R.id.d4d);
                C89219l.m154716b(crossPlatformWebView, "");
                m76915a(crossPlatformWebView, 0);
                CommonBizWebView commonBizWebView = (CommonBizWebView) mo66102a(R.id.d4e);
                C89219l.m154716b(commonBizWebView, "");
                m76915a(commonBizWebView, 0);
            }
            String str8 = bVar.f89725e;
            if (str8 == null) {
                str8 = "";
            }
            setShouldHideBottomNavBar(str8);
            AbstractC38683bj bjVar = this.f89638a;
            if (bjVar != null) {
                bjVar.mo59237a(true);
            }
            ((AdPopUpWebTitleBar) mo66102a(R.id.d4l)).mo66180b(bVar.f89726f);
            ((FrameLayout) mo66102a(R.id.d49)).setOnClickListener(new View$OnClickListenerC37959r(this));
            C38615aa.f91245c = false;
            WebView webView = getWebView();
            if (webView != null) {
                ((AdPopUpWebBottomSheetContainer) mo66102a(R.id.d45)).setWebViewForDragBehavior(webView);
            }
            this.f89641d = true;
            if (m76918i()) {
                str = "lynx";
            } else {
                str = "";
            }
            this.f89660x = str;
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f89639b;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.mo66098b();
            }
            AbstractC37940a aVar = this.f89655s;
            if (aVar != null) {
                aVar.mo66143a();
            }
            if (bVar.f89724d == 25 && (aweme = bVar.f89729i) != null && aweme.isLive()) {
                CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) mo66102a(R.id.d4d);
                C89219l.m154716b(crossPlatformWebView2, "");
                C40618a crossPlatformParams = crossPlatformWebView2.getCrossPlatformParams();
                if (!(crossPlatformParams == null || (bVar2 = crossPlatformParams.f95069b) == null)) {
                    bVar2.f95094H = "live_ad_card";
                }
            }
            if (bVar.f89723c != 4) {
                mo66107a(bVar.f89725e);
            }
            this.f89645h = false;
            if (mo66111d()) {
                RelativeLayout relativeLayout = (RelativeLayout) mo66102a(R.id.ays);
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                if (mo66113e()) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout2, "");
                    relativeLayout2.setAlpha(0.0f);
                    RelativeLayout relativeLayout3 = (RelativeLayout) mo66102a(R.id.ays);
                    C89219l.m154716b(relativeLayout3, "");
                    relativeLayout3.setVisibility(8);
                }
                RelativeLayout relativeLayout4 = (RelativeLayout) mo66102a(R.id.ays);
                if (relativeLayout4 != null) {
                    relativeLayout4.setOnClickListener(new View$OnClickListenerC37960s(this));
                }
                LinearLayout linearLayout = (LinearLayout) mo66102a(R.id.d_);
                C89219l.m154716b(linearLayout, "");
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (C37699a.m76230aB(bVar.f89729i)) {
                    TuxTextView tuxTextView = (TuxTextView) mo66102a(R.id.dc);
                    if (tuxTextView != null) {
                        tuxTextView.setTextSize(14.0f);
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) mo66102a(R.id.dc);
                    if (tuxTextView2 != null) {
                        AwemeRawAd awemeRawAd = bVar.f89722b;
                        if (awemeRawAd == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null) {
                            str4 = null;
                        } else {
                            str4 = bottomBanner.getRecommendText();
                        }
                        tuxTextView2.setText(str4);
                    }
                    TuxTextView tuxTextView3 = (TuxTextView) mo66102a(R.id.d9);
                    if (tuxTextView3 != null) {
                        AwemeRawAd awemeRawAd2 = bVar.f89722b;
                        if (awemeRawAd2 != null) {
                            str3 = awemeRawAd2.getHomepageBottomTextual();
                        } else {
                            str3 = null;
                        }
                        tuxTextView3.setText(str3);
                    }
                    SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) mo66102a(R.id.g_);
                    C89219l.m154716b(smartAvatarImageView, "");
                    smartAvatarImageView.setVisibility(0);
                    SmartRoundImageView smartRoundImageView = (SmartRoundImageView) mo66102a(R.id.de);
                    C89219l.m154716b(smartRoundImageView, "");
                    smartRoundImageView.setVisibility(8);
                    int i = Build.VERSION.SDK_INT;
                    layoutParams2.addRule(17, R.id.g_);
                    LinearLayout linearLayout2 = (LinearLayout) mo66102a(R.id.d_);
                    C89219l.m154716b(linearLayout2, "");
                    linearLayout2.setLayoutParams(layoutParams2);
                    Aweme aweme2 = bVar.f89729i;
                    if (aweme2 != null) {
                        user2 = aweme2.getAuthor();
                    }
                    C20714a a = m76913a(user2);
                    if (a != null) {
                        C20766v a2 = C20761r.m39058a(a);
                        a2.f49092E = (SmartImageView) mo66102a(R.id.g_);
                        a2.mo34186c();
                    }
                    if (this.f89658v) {
                        C18129a.m33746a("homepage_ad", "button_show", bVar.f89722b).mo28901b();
                    }
                    m76920k();
                    return;
                }
                SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) mo66102a(R.id.g_);
                C89219l.m154716b(smartAvatarImageView2, "");
                smartAvatarImageView2.setVisibility(8);
                SmartRoundImageView smartRoundImageView2 = (SmartRoundImageView) mo66102a(R.id.de);
                C89219l.m154716b(smartRoundImageView2, "");
                smartRoundImageView2.setVisibility(0);
                int i2 = Build.VERSION.SDK_INT;
                layoutParams2.addRule(17, R.id.de);
                LinearLayout linearLayout3 = (LinearLayout) mo66102a(R.id.d_);
                C89219l.m154716b(linearLayout3, "");
                linearLayout3.setLayoutParams(layoutParams2);
                Aweme aweme3 = bVar.f89729i;
                if (aweme3 != null) {
                    user = aweme3.getAuthor();
                } else {
                    user = null;
                }
                C20714a a3 = m76913a(user);
                if (a3 != null) {
                    C20766v a4 = C20761r.m39058a(a3);
                    a4.f49092E = (SmartImageView) mo66102a(R.id.de);
                    a4.mo34186c();
                }
                TuxTextView tuxTextView4 = (TuxTextView) mo66102a(R.id.dc);
                if (tuxTextView4 != null) {
                    AwemeRawAd awemeRawAd3 = bVar.f89722b;
                    if (awemeRawAd3 != null) {
                        str2 = awemeRawAd3.getButtonText();
                    } else {
                        str2 = null;
                    }
                    tuxTextView4.setText(str2);
                }
                TuxTextView tuxTextView5 = (TuxTextView) mo66102a(R.id.d9);
                if (tuxTextView5 != null) {
                    AwemeRawAd awemeRawAd4 = bVar.f89722b;
                    if (!(awemeRawAd4 == null || (fakeAuthor = awemeRawAd4.getFakeAuthor()) == null)) {
                        str6 = fakeAuthor.getButtonText();
                    }
                    tuxTextView5.setText(str6);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo66107a(String str) {
        Bundle bundle;
        AwemeRawAd awemeRawAd;
        String str2;
        AwemeRawAd awemeRawAd2;
        String a;
        AnchorLynxModel anchorLynxModel;
        Bundle bundle2;
        AnchorLynxModel anchorLynxModel2;
        String str3;
        Bundle bundle3;
        AbstractC35125b bVar;
        DownloadBusiness downloadBusiness;
        String str4 = null;
        if (m76918i()) {
            ((AdPopUpWebTitleBar) mo66102a(R.id.d4l)).mo66181c();
            C38618ac acVar = this.f89653q;
            if (!(acVar == null || (bundle = acVar.f91263e) == null)) {
                Object clone = bundle.clone();
                if (!(clone instanceof Bundle)) {
                    clone = null;
                }
                Bundle bundle4 = (Bundle) clone;
                if (bundle4 != null) {
                    C38618ac acVar2 = this.f89653q;
                    if (acVar2 == null || acVar2.f91266h == null) {
                        C38618ac acVar3 = this.f89653q;
                        if (acVar3 != null) {
                            awemeRawAd = acVar3.f91264f;
                        } else {
                            awemeRawAd = null;
                        }
                        Context context = getContext();
                        if (C58067a.f132302a.mo95568a(awemeRawAd)) {
                            bundle4.putBoolean("is_lynx_landing_page", true);
                            bundle4.putBoolean("hide_nav_bar", true);
                            bundle4.putBoolean("hide_status_bar", false);
                            bundle4.putBoolean("bundle_nav_bar_status_padding", true);
                            bundle4.putBoolean("need_bottom_out", true);
                            List<String> geckoChannel = awemeRawAd.getNativeSiteConfig().getGeckoChannel();
                            if (!C13603b.m24435a((Collection) geckoChannel)) {
                                str2 = geckoChannel.get(0);
                            } else {
                                str2 = "";
                            }
                            bundle4.putString("lynx_channel_name", str2);
                            bundle4.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                            bundle4.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(context), 1073741824));
                            bundle4.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(context) - C80534hh.m139609b(), 1073741824));
                            Uri parse = Uri.parse(awemeRawAd.getNativeSiteConfig().getLynxScheme());
                            if (parse.isHierarchical()) {
                                bundle4.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                                    bundle4.putBoolean("preset_safe_point", true);
                                    bundle4.putInt("thread_strategy", EnumC28856r.PART_ON_LAYOUT.mo49985id());
                                }
                            }
                        }
                    } else {
                        C38618ac acVar4 = this.f89653q;
                        if (acVar4 == null || (anchorLynxModel2 = acVar4.f91266h) == null) {
                            bundle2 = null;
                        } else {
                            bundle2 = anchorLynxModel2.bundle;
                        }
                        bundle4.putAll(bundle2);
                    }
                    C38618ac acVar5 = this.f89653q;
                    if (acVar5 == null || acVar5.f91266h == null) {
                        C38618ac acVar6 = this.f89653q;
                        if (acVar6 != null) {
                            awemeRawAd2 = acVar6.f91264f;
                        } else {
                            awemeRawAd2 = null;
                        }
                        a = m76914a(awemeRawAd2);
                    } else {
                        C38618ac acVar7 = this.f89653q;
                        if (!(acVar7 == null || (anchorLynxModel = acVar7.f91266h) == null)) {
                            a = anchorLynxModel.lynxSchema;
                        }
                    }
                    if (a != null) {
                        CommonBizWebView commonBizWebView = (CommonBizWebView) mo66102a(R.id.d4e);
                        C89219l.m154716b(commonBizWebView, "");
                        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                        if (f != null) {
                            str4 = f.mo59391g("lynx_feed");
                        }
                        new C37843a(commonBizWebView, str4, this.f89632D).mo61984a(a, bundle4);
                        AbstractC37940a aVar = this.f89655s;
                        if (aVar != null) {
                            aVar.mo66146a("lynx");
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (str == null) {
            C38618ac acVar8 = this.f89653q;
            if (acVar8 == null || (str3 = acVar8.f91259a) == null) {
                return;
            }
        } else {
            str3 = str;
        }
        ((AdPopUpWebTitleBar) mo66102a(R.id.d4l)).mo66181c();
        AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) mo66102a(R.id.d4_);
        C89219l.m154716b(adPopUpWebNaviBar, "");
        adPopUpWebNaviBar.setVisibility(8);
        if (this.f89640c) {
            C38618ac acVar9 = this.f89653q;
            if (acVar9 != null && (bundle3 = acVar9.f91263e) != null) {
                BulletContainerView bulletContainerView = (BulletContainerView) mo66102a(R.id.d4e);
                if (str == null) {
                    C38618ac acVar10 = this.f89653q;
                    if (acVar10 == null) {
                        C89219l.m154715b();
                    }
                    str = acVar10.f91259a;
                }
                AbstractC17046h.C17047a.m31518a(bulletContainerView, C35301c.m72248a(str, C89070n.m154516a("ad_commerce"), bundle3, new C35229g(C17867d.m33078a())), bundle3, null, 4);
                C35222b rootContainer = ((CommonBizWebView) mo66102a(R.id.d4e)).getRootContainer();
                if (rootContainer != null && (bVar = rootContainer.f83165z) != null && (downloadBusiness = (DownloadBusiness) bVar.mo61972a(DownloadBusiness.class)) != null) {
                    downloadBusiness.mo65532a(((CommonBizWebView) mo66102a(R.id.d4e)).getWebView());
                    return;
                }
                return;
            }
            return;
        }
        if (mo66128h()) {
            ShareH5Service a2 = ShareH5Service.C68827a.m121397a();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo66102a(R.id.d4d);
            C89219l.m154716b(crossPlatformWebView, "");
            a2.mo109381a(crossPlatformWebView.getCrossPlatformBusiness(), str3, 2);
        }
        CrossPlatformWebView.m82144a((CrossPlatformWebView) mo66102a(R.id.d4d), str3, false, null, 6);
    }

    public /* synthetic */ AdPopUpWebPageView(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$k */
    public static final class C37950k implements CommonBizWebView.AbstractC35200b {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89673a;

        /* renamed from: b */
        final /* synthetic */ Bundle f89674b;

        static {
            Covode.recordClassIndex(45408);
        }

        C37950k(AdPopUpWebPageView adPopUpWebPageView, Bundle bundle) {
            this.f89673a = adPopUpWebPageView;
            this.f89674b = bundle;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView.AbstractC35200b
        /* renamed from: a */
        public final void mo62078a(int i, int i2) {
            boolean z;
            SSWebView webView = ((CommonBizWebView) this.f89673a.mo66102a(R.id.d4e)).getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AdPopUpWebBottomSheetContainer.f89604i = z;
                ((AdPopUpWebNaviBar) this.f89673a.mo66102a(R.id.d4_)).mo66084a(i, i2);
                this.f89673a.mo66104a(this.f89674b, webView.getScrollY());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$l */
    public static final class C37951l implements AbstractC40736b {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89675a;

        /* renamed from: b */
        final /* synthetic */ Bundle f89676b;

        static {
            Covode.recordClassIndex(45409);
        }

        C37951l(AdPopUpWebPageView adPopUpWebPageView, Bundle bundle) {
            this.f89675a = adPopUpWebPageView;
            this.f89676b = bundle;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40736b
        /* renamed from: a */
        public final void mo66154a(int i, int i2) {
            boolean z;
            WebView webView = this.f89675a.getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AdPopUpWebBottomSheetContainer.f89604i = z;
                ((AdPopUpWebNaviBar) this.f89675a.mo66102a(R.id.d4_)).mo66084a(i, i2);
                this.f89675a.mo66104a(this.f89676b, webView.getScrollY());
            }
        }
    }

    /* renamed from: a */
    private static void m76915a(View view, int i) {
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$g */
    public static final class C37946g extends SingleWebChromeClient {

        /* renamed from: a */
        final /* synthetic */ WebView f89667a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f89668b;

        static {
            Covode.recordClassIndex(45404);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            Bundle bundle;
            C38618ac params = this.f89668b.getParams();
            if (params != null && (bundle = params.f91263e) != null && bundle.getBoolean("isFromChallenge")) {
                ((AdPopUpWebTitleBar) this.f89668b.mo66102a(R.id.d4l)).mo66178a(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37946g(WebView webView, WebView webView2, AdPopUpWebPageView adPopUpWebPageView) {
            super(webView2);
            this.f89667a = webView;
            this.f89668b = adPopUpWebPageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$j */
    static final class View$OnTouchListenerC37949j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89672a;

        static {
            Covode.recordClassIndex(45407);
        }

        View$OnTouchListenerC37949j(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89672a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            WebView webView;
            if (this.f89672a.getActionMode().f89720i == 5) {
                this.f89672a.setFromTitleBarClick(true);
            }
            C37975a actionMode = this.f89672a.getActionMode();
            C89219l.m154716b(motionEvent, "");
            actionMode.mo66195a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                AdPopUpWebBottomSheetContainer.f89604i = true;
            } else if ((action == 1 || action == 3) && (webView = this.f89672a.getWebView()) != null && webView.getScrollY() > 0) {
                AdPopUpWebBottomSheetContainer.f89604i = false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$w */
    static final class View$OnTouchListenerC37966w implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89696a;

        static {
            Covode.recordClassIndex(45424);
        }

        View$OnTouchListenerC37966w(AdPopUpWebPageView adPopUpWebPageView) {
            this.f89696a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            this.f89696a.getActionMode().mo66195a(motionEvent);
            AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f89696a.mo66102a(R.id.d4_);
            C89219l.m154721d(motionEvent, "");
            if (adPopUpWebNaviBar.getVisibility() != 8 && motionEvent.getAction() == 0) {
                adPopUpWebNaviBar.f89614a = false;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView$h */
    public static final class C37947h extends AbstractC38683bj {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f89669a;

        /* renamed from: b */
        final /* synthetic */ Activity f89670b;

        static {
            Covode.recordClassIndex(45405);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || ((!this.f89669a.mo66115g() && !this.f89669a.f89641d) || (this.f89669a.mo66111d() && ((AdPopUpWebBottomSheetContainer) this.f89669a.mo66102a(R.id.d45)).getBehavior().mo66044b() == ((int) C13628n.m24520b(this.f89669a.getContext(), 64.0f)) && ((AdPopUpWebBottomSheetContainer) this.f89669a.mo66102a(R.id.d45)).getBehavior().f89575f == 4))) {
                return false;
            }
            AbstractC37942c keyDownCallBack = this.f89669a.getKeyDownCallBack();
            if (keyDownCallBack != null) {
                keyDownCallBack.mo66148a();
            }
            this.f89669a.mo66108a(false);
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37947h(AdPopUpWebPageView adPopUpWebPageView, Activity activity, Activity activity2) {
            super(activity2);
            this.f89669a = adPopUpWebPageView;
            this.f89670b = activity;
        }
    }

    /* renamed from: a */
    public final void mo66104a(Bundle bundle, int i) {
        if (!bundle.getBoolean("isFromChallenge")) {
            return;
        }
        if (i > C34728n.m70946a(32.0d)) {
            TuxTextView tuxTextView = (TuxTextView) mo66102a(R.id.d4k);
            C89219l.m154716b(tuxTextView, "");
            if (tuxTextView.getVisibility() == 8) {
                TuxTextView tuxTextView2 = (TuxTextView) mo66102a(R.id.d4k);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) mo66102a(R.id.d4k);
        C89219l.m154716b(tuxTextView3, "");
        if (tuxTextView3.getVisibility() == 0) {
            TuxTextView tuxTextView4 = (TuxTextView) mo66102a(R.id.d4k);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
    }
}
