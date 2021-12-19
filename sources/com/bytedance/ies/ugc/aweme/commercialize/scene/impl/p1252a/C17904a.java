package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1252a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.C17901b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17889b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17890c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1255d.C17927a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1258b.C17936b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17983g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18018b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.AbstractC18136c;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18135b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.AbstractC18134b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.C18133a;
import com.google.gson.C27910f;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38580b;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38594h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59104k;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.C80271br;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a */
public final class C17904a implements IMainAdScene, AbstractC90252i, AbstractC90253j {

    /* renamed from: g */
    public static final C17905a f42665g = new C17905a((byte) 0);

    /* renamed from: a */
    public AbstractC17900a f42666a;

    /* renamed from: b */
    public ActivityC0218d f42667b;

    /* renamed from: c */
    public AbstractC18018b f42668c;

    /* renamed from: d */
    public View f42669d;

    /* renamed from: e */
    public HomePageDataViewModel f42670e;

    /* renamed from: f */
    int f42671f = 4;

    /* renamed from: h */
    private C17901b f42672h;

    /* renamed from: i */
    private AbstractC18136c f42673i;

    /* renamed from: j */
    private AbstractC18134b f42674j;

    /* renamed from: k */
    private boolean f42675k;

    /* renamed from: l */
    private boolean f42676l;

    /* renamed from: m */
    private ScrollSwitchStateManager f42677m;

    /* renamed from: n */
    private AdHomePageDataVM f42678n;

    /* renamed from: o */
    private final View.OnTouchListener f42679o = new View$OnTouchListenerC17913i(this);

    /* renamed from: p */
    private final AbstractC1214u<Boolean> f42680p = new C17914j(this);

    static {
        Covode.recordClassIndex(20514);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(384, new RunnableC90250g(C17904a.class, "onSplashAdEvent", C17936b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new RunnableC90250g(C17904a.class, "onAwesomeSplashEvent", C18017a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onResume() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$a */
    public static final class C17905a {
        static {
            Covode.recordClassIndex(20515);
        }

        private C17905a() {
        }

        public /* synthetic */ C17905a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$f */
    static final class CallableC17910f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C17904a f42685a;

        static {
            Covode.recordClassIndex(20520);
        }

        CallableC17910f(C17904a aVar) {
            this.f42685a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C17904a.m33216a(this.f42685a).mo28546b();
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$e */
    public static final class ViewTreeObserver$OnPreDrawListenerC17909e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C17904a f42684a;

        static {
            Covode.recordClassIndex(20519);
        }

        public final boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            C17904a.m33216a(this.f42684a).mo28550f();
            View view = this.f42684a.f42669d;
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC17909e(C17904a aVar) {
            this.f42684a = aVar;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onDestroy() {
        if (this.f42674j != null) {
            C18133a.f43191a.mo28907b(this.f42674j);
        }
        if (this.f42673i != null) {
            C18135b.f43193a.mo28909b(this.f42673i);
        }
        EventBus.m156962a().mo145395b(this);
        C17975i.f42812l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (((com.p2082ss.android.ugc.aweme.main.AbstractC59105l) r4).mo96548m() != false) goto L_0x0040;
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r5 = this;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a r1 = r5.f42666a
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "mainAdSceneCallBack"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0009:
            androidx.fragment.app.Fragment r4 = r1.mo28547c()
            r3 = 1
            if (r4 != 0) goto L_0x0013
            com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i.f42806f = r3
            return
        L_0x0013:
            androidx.appcompat.app.d r0 = r5.f42667b
            java.lang.String r2 = "mActivity"
            if (r0 != 0) goto L_0x001c
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x001c:
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.aweme.main.AbstractC59104k
            if (r0 == 0) goto L_0x0043
            androidx.appcompat.app.d r1 = r5.f42667b
            if (r1 != 0) goto L_0x0027
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x0027:
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService"
            java.util.Objects.requireNonNull(r1, r0)
            com.ss.android.ugc.aweme.main.k r1 = (com.p2082ss.android.ugc.aweme.main.AbstractC59104k) r1
            boolean r0 = r1.mainPageOnFeed()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4 instanceof com.p2082ss.android.ugc.aweme.main.AbstractC59105l
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.main.l r4 = (com.p2082ss.android.ugc.aweme.main.AbstractC59105l) r4
            boolean r0 = r4.mo96548m()
            if (r0 == 0) goto L_0x0043
        L_0x0040:
            com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i.f42806f = r3
            return
        L_0x0043:
            r3 = 0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1252a.C17904a.onPause():void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onCreate() {
        ISplashAdService i;
        boolean z;
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityC0218d dVar = this.f42667b;
        if (dVar == null) {
            C89219l.m154710a("mActivity");
        }
        this.f42670e = HomePageDataViewModel.C52942a.m97777a(dVar);
        ActivityC0218d dVar2 = this.f42667b;
        if (dVar2 == null) {
            C89219l.m154710a("mActivity");
        }
        this.f42677m = ScrollSwitchStateManager.C52950a.m97811a(dVar2);
        ActivityC0218d dVar3 = this.f42667b;
        if (dVar3 == null) {
            C89219l.m154710a("mActivity");
        }
        AdHomePageDataVM a = AdHomePageDataVM.C17902a.m33208a(dVar3);
        this.f42678n = a;
        if (a == null) {
            C89219l.m154710a("adHomePageDataVM");
        }
        C1213t<Boolean> tVar = a.f42664d;
        ActivityC0218d dVar4 = this.f42667b;
        if (dVar4 == null) {
            C89219l.m154710a("mActivity");
        }
        tVar.observe(dVar4, this.f42680p);
        if (C17975i.f42802b || !SplashSettingServiceImpl.m33419g().mo28727e()) {
            ActivityC0218d dVar5 = this.f42667b;
            if (dVar5 == null) {
                C89219l.m154710a("mActivity");
            }
            C17975i.m33462a(dVar5.getIntent());
            AbstractC17900a aVar = this.f42666a;
            if (aVar == null) {
                C89219l.m154710a("mainAdSceneCallBack");
            }
            aVar.mo28544a(false, "method_main_create_begin_to_splash_ad");
            AbstractC17900a aVar2 = this.f42666a;
            if (aVar2 == null) {
                C89219l.m154710a("mainAdSceneCallBack");
            }
            aVar2.mo28544a(true, "method_splash_try_show_ad_duration");
            AdHomePageDataVM adHomePageDataVM = this.f42678n;
            if (adHomePageDataVM == null) {
                C89219l.m154710a("adHomePageDataVM");
            }
            adHomePageDataVM.f42661a = false;
            AbstractC17900a aVar3 = this.f42666a;
            if (aVar3 == null) {
                C89219l.m154710a("mainAdSceneCallBack");
            }
            if (!aVar3.mo28545a() && ((!C17983g.m33503b() || !C80271br.m139139a()) && (i = SplashAdServiceImpl.m33397i()) != null)) {
                AbstractC17900a aVar4 = this.f42666a;
                if (aVar4 == null) {
                    C89219l.m154710a("mainAdSceneCallBack");
                }
                aVar4.mo28551g();
                AdHomePageDataVM adHomePageDataVM2 = this.f42678n;
                if (adHomePageDataVM2 == null) {
                    C89219l.m154710a("adHomePageDataVM");
                }
                ActivityC0218d dVar6 = this.f42667b;
                if (dVar6 == null) {
                    C89219l.m154710a("mActivity");
                }
                if (i.mo28712a((Context) dVar6) || !TextUtils.isEmpty(C17975i.f42808h)) {
                    z = true;
                } else {
                    z = false;
                }
                adHomePageDataVM2.f42661a = z;
            }
            AbstractC17900a aVar5 = this.f42666a;
            if (aVar5 == null) {
                C89219l.m154710a("mainAdSceneCallBack");
            }
            aVar5.mo28544a(false, "method_splash_try_show_ad_duration");
            AbstractC17900a aVar6 = this.f42666a;
            if (aVar6 == null) {
                C89219l.m154710a("mainAdSceneCallBack");
            }
            aVar6.mo28544a(true, "method_splash_ad_to_main_create_end");
        }
        C1731i.m5640b(new CallableC17910f(this), C40780g.m82246c());
        ScrollSwitchStateManager scrollSwitchStateManager = this.f42677m;
        if (scrollSwitchStateManager == null) {
            C89219l.m154710a("stateManager");
        }
        ActivityC0218d dVar7 = this.f42667b;
        if (dVar7 == null) {
            C89219l.m154710a("mActivity");
        }
        scrollSwitchStateManager.mo89356d(dVar7, new C17911g(this));
        this.f42674j = new C17912h(this);
        C18133a.f43191a.mo28905a(this.f42674j);
        this.f42673i = new C17906b(this);
        C18135b.f43193a.mo28908a(this.f42673i);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$b */
    public static final class C17906b implements AbstractC18136c {

        /* renamed from: a */
        final /* synthetic */ C17904a f42681a;

        static {
            Covode.recordClassIndex(20516);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17906b(C17904a aVar) {
            this.f42681a = aVar;
        }

        @Override // com.bytedance.ies.ugc.aweme.rich.p1268a.AbstractC18136c
        /* renamed from: a */
        public final void mo28558a(AwemeRawAd awemeRawAd, C18129a.C18130a aVar) {
            C89219l.m154721d(awemeRawAd, "");
            C89219l.m154721d(aVar, "");
            if (TextUtils.equals(aVar.f43184c, "click")) {
                C38594h.m78309a(awemeRawAd);
            }
            if (C37699a.m76282b(awemeRawAd)) {
                aVar.mo28897a("anchor_id", awemeRawAd.getSplashInfo().anchorId);
            }
            if (AbstractC37639a.f89001b.contains(aVar.f43184c) && AbstractC37639a.f89000a.contains(aVar.f43183b)) {
                long h = C17904a.m33216a(this.f42681a).mo28552h();
                int i = C17904a.m33216a(this.f42681a).mo28553i();
                if (h < 0) {
                    h = C17904a.m33216a(this.f42681a).mo28554j();
                }
                if (h >= 0) {
                    aVar.mo28897a("duration", Long.valueOf(h));
                    aVar.mo28897a("play_order", Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$h */
    public static final class C17912h implements AbstractC18134b {

        /* renamed from: a */
        final /* synthetic */ C17904a f42687a;

        static {
            Covode.recordClassIndex(20522);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17912h(C17904a aVar) {
            this.f42687a = aVar;
        }

        @Override // com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.AbstractC18134b
        /* renamed from: a */
        public final void mo28563a(String str, String str2, String str3, JSONObject jSONObject) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(jSONObject, "");
            C17904a.m33216a(this.f42687a).mo28543a(str, str2, jSONObject);
            AbstractC17900a a = C17904a.m33216a(this.f42687a);
            ActivityC0218d b = C17904a.m33217b(this.f42687a);
            Objects.requireNonNull(b, "null cannot be cast to non-null type android.content.Context");
            a.mo28539a(b, str, str2);
            C17904a.m33216a(this.f42687a).mo28542a(str2, str3);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC17900a m33216a(C17904a aVar) {
        AbstractC17900a aVar2 = aVar.f42666a;
        if (aVar2 == null) {
            C89219l.m154710a("mainAdSceneCallBack");
        }
        return aVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ ActivityC0218d m33217b(C17904a aVar) {
        ActivityC0218d dVar = aVar.f42667b;
        if (dVar == null) {
            C89219l.m154710a("mActivity");
        }
        return dVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ HomePageDataViewModel m33218c(C17904a aVar) {
        HomePageDataViewModel homePageDataViewModel = aVar.f42670e;
        if (homePageDataViewModel == null) {
            C89219l.m154710a("homeViewModel");
        }
        return homePageDataViewModel;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$g */
    static final class C17911g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C17904a f42686a;

        static {
            Covode.recordClassIndex(20521);
        }

        C17911g(C17904a aVar) {
            this.f42686a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ActivityC0218d b = C17904a.m33217b(this.f42686a);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
            if (((AbstractC59104k) b).mainPageOnFeed()) {
                C17927a aVar = C17927a.f42736a;
                ActivityC0218d b2 = C17904a.m33217b(this.f42686a);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type android.content.Context");
                aVar.mo28502a(b2);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17888a
    /* renamed from: a */
    public final void mo28473a(AbstractC17890c cVar) {
        C89219l.m154721d(cVar, "");
        C17901b bVar = (C17901b) cVar;
        this.f42672h = bVar;
        if (bVar == null) {
            C89219l.m154710a("mainAdDepend");
        }
        AbstractC17889b bVar2 = bVar.f42655b;
        Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdSceneCallBack");
        this.f42666a = (AbstractC17900a) bVar2;
        C17901b bVar3 = this.f42672h;
        if (bVar3 == null) {
            C89219l.m154710a("mainAdDepend");
        }
        ActivityC0218d dVar = bVar3.f42659a;
        if (dVar == null) {
            C89219l.m154715b();
        }
        this.f42667b = dVar;
        ISplashAdService i = SplashAdServiceImpl.m33397i();
        ActivityC0218d dVar2 = this.f42667b;
        if (dVar2 == null) {
            C89219l.m154710a("mActivity");
        }
        this.f42668c = i.mo28706a((Activity) dVar2);
    }

    @AbstractC90264r
    public final void onSplashAdEvent(C17936b bVar) {
        if (bVar != null && bVar.f42756a == 0) {
            AdHomePageDataVM adHomePageDataVM = this.f42678n;
            if (adHomePageDataVM == null) {
                C89219l.m154710a("adHomePageDataVM");
            }
            adHomePageDataVM.f42661a = false;
            ActivityC0218d dVar = this.f42667b;
            if (dVar == null) {
                C89219l.m154710a("mActivity");
            }
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
            ((AbstractC59104k) dVar).splashOverShowMandatoryLoginPage();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$d */
    static final class View$OnClickListenerC17908d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17904a f42683a;

        static {
            Covode.recordClassIndex(20518);
        }

        View$OnClickListenerC17908d(C17904a aVar) {
            this.f42683a = aVar;
        }

        public final void onClick(View view) {
            C17904a aVar = this.f42683a;
            if (aVar.f42671f == 2) {
                HomePageDataViewModel homePageDataViewModel = aVar.f42670e;
                if (homePageDataViewModel == null) {
                    C89219l.m154710a("homeViewModel");
                }
                if (homePageDataViewModel.f121745k != null) {
                    HomePageDataViewModel homePageDataViewModel2 = aVar.f42670e;
                    if (homePageDataViewModel2 == null) {
                        C89219l.m154710a("homeViewModel");
                    }
                    Aweme aweme = homePageDataViewModel2.f121745k;
                    if (aweme == null) {
                        C89219l.m154715b();
                    }
                    if (C37699a.m76204G(aweme)) {
                        AbstractC17900a aVar2 = aVar.f42666a;
                        if (aVar2 == null) {
                            C89219l.m154710a("mainAdSceneCallBack");
                        }
                        new HashMap().put("duration", String.valueOf(aVar2.mo28549e()));
                        AbstractC17900a aVar3 = aVar.f42666a;
                        if (aVar3 == null) {
                            C89219l.m154710a("mainAdSceneCallBack");
                        }
                        aVar3.mo28540a(aweme);
                        C38580b.m78285a(System.currentTimeMillis(), "skip");
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$j */
    static final class C17914j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C17904a f42689a;

        static {
            Covode.recordClassIndex(20524);
        }

        C17914j(C17904a aVar) {
            this.f42689a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            ActivityC0218d b = C17904a.m33217b(this.f42689a);
            if (b != null) {
                if (booleanValue) {
                    if (!C17975i.f42813m) {
                        C17975i.f42813m = true;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) b.findViewById(16908290);
                if (viewGroup != null) {
                    viewGroup.setAlpha(1.0f);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    b.getWindow().addFlags(Integer.MIN_VALUE);
                }
                Window window = b.getWindow();
                C89219l.m154716b(window, "");
                window.getDecorView().setBackgroundResource(R.drawable.q3);
                b.getWindow().clearFlags(1024);
                ALog.m59865d("awesome_splash", "recoveryTheme");
            }
            AbstractC18018b bVar = this.f42689a.f42668c;
            if (bVar == null) {
                C89219l.m154710a("mSplashLoadMaskHelper");
            }
            bVar.mo28745b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @org.greenrobot.eventbus.AbstractC90264r(mo145422a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a r12) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1252a.C17904a.onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a):void");
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$c */
    static final class C17907c extends AbstractC89220m implements AbstractC89183m<ViewGroup, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C17904a f42682a;

        static {
            Covode.recordClassIndex(20517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17907c(C17904a aVar) {
            super(2);
            this.f42682a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ViewGroup viewGroup, Boolean bool) {
            mo28559a(viewGroup, bool.booleanValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo28559a(ViewGroup viewGroup, boolean z) {
            MethodCollector.m26663i(6376);
            C89219l.m154721d(viewGroup, "");
            ALog.m59865d("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
            if (this.f42682a.f42669d != null) {
                if (this.f42682a.f42669d instanceof AbstractC18019c) {
                    View view = this.f42682a.f42669d;
                    if (view != null) {
                        ((AbstractC18019c) view).mo28746a();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.ISplashMask");
                        MethodCollector.m26664o(6376);
                        throw nullPointerException;
                    }
                }
                viewGroup.removeView(this.f42682a.f42669d);
                this.f42682a.f42669d = null;
                if (z) {
                    ActivityC0218d b = C17904a.m33217b(this.f42682a);
                    if (b != null) {
                        ((AbstractC59104k) b).splashOverShowMandatoryLoginPage();
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
                        MethodCollector.m26664o(6376);
                        throw nullPointerException2;
                    }
                }
                ALog.m59865d("AwesomeSplash", "onAwesomeSplashEvent AwesomeSplashEvent.GONE && mAwesomeSplashMask != null");
            }
            MethodCollector.m26664o(6376);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onVideoPageChangeEvent(Aweme aweme, boolean z) {
        C89219l.m154721d(aweme, "");
        C17927a aVar = C17927a.f42736a;
        ActivityC0218d dVar = this.f42667b;
        if (dVar == null) {
            C89219l.m154710a("mActivity");
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type android.content.Context");
        aVar.mo28510a(aweme, (Context) dVar, z, false);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$i */
    static final class View$OnTouchListenerC17913i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C17904a f42688a;

        static {
            Covode.recordClassIndex(20523);
        }

        View$OnTouchListenerC17913i(C17904a aVar) {
            this.f42688a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float rawX;
            if (C17904a.m33218c(this.f42688a).f121745k == null) {
                return false;
            }
            Aweme aweme = C17904a.m33218c(this.f42688a).f121745k;
            if (aweme == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                long e = C17904a.m33216a(this.f42688a).mo28549e();
                if (C37699a.m76204G(aweme)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("duration", String.valueOf(e));
                    HashMap hashMap2 = new HashMap();
                    if (C80471gb.m139483a(C17904a.m33217b(this.f42688a).getBaseContext())) {
                        hashMap2.put("click_x", String.valueOf(((float) C34723i.m70928b(C17904a.m33217b(this.f42688a).getBaseContext())) - motionEvent.getRawX()));
                    } else {
                        hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                    }
                    hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                    String b = new C27910f().mo46674b(hashMap2);
                    C89219l.m154716b(b, "");
                    hashMap.put("ad_extra_data", b);
                    C18129a.C18130a a = C18129a.m33746a("draw_ad", "skip", aweme.getAwemeRawAd());
                    if (C80471gb.m139483a(C17904a.m33217b(this.f42688a).getBaseContext())) {
                        rawX = ((float) C34723i.m70928b(C17904a.m33217b(this.f42688a).getBaseContext())) - motionEvent.getRawX();
                    } else {
                        rawX = motionEvent.getRawX();
                    }
                    a.mo28897a("click_x", Float.valueOf(rawX)).mo28897a("click_y", Float.valueOf(motionEvent.getRawY())).mo28901b();
                    AbstractC17900a a2 = C17904a.m33216a(this.f42688a);
                    Context applicationContext = C17904a.m33217b(this.f42688a).getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C89219l.m154716b(applicationContext, "");
                    a2.mo28541a(aweme, applicationContext);
                }
            }
            return false;
        }
    }
}
