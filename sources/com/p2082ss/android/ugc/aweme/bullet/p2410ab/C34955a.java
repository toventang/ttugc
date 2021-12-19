package com.p2082ss.android.ugc.aweme.bullet.p2410ab;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.C17031d;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35229g;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35180b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.bullet.p2409a.C34954a;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37588c;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40543j;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40685a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.ab.a */
public final class C34955a implements AbstractC63744f {

    /* renamed from: a */
    public static final AbstractC89244h f82460a = C89250i.m154773a((AbstractC89171a) C34957b.f82463a);

    /* renamed from: b */
    public static final C34956a f82461b = new C34956a((byte) 0);

    /* renamed from: c */
    private final AbstractC1202k f82462c;

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$a */
    public static final class C34956a {
        static {
            Covode.recordClassIndex(41984);
        }

        private C34956a() {
        }

        public /* synthetic */ C34956a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$b */
    static final class C34957b extends AbstractC89220m implements AbstractC89171a<C34955a> {

        /* renamed from: a */
        public static final C34957b f82463a = new C34957b();

        static {
            Covode.recordClassIndex(41985);
        }

        C34957b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34955a invoke() {
            return new C34955a((byte) 0);
        }
    }

    private C34955a() {
        this.f82462c = BulletFragmentABHelper$lifecycleEventObserver$1.f82459a;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$c */
    public static final class C34958c extends AbstractC40685a {

        /* renamed from: a */
        final /* synthetic */ String f82464a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18234b f82465b;

        /* renamed from: c */
        final /* synthetic */ SingleWebView f82466c;

        static {
            Covode.recordClassIndex(41986);
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$c$a */
        static final class RunnableC34959a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C34958c f82467a;

            static {
                Covode.recordClassIndex(41987);
            }

            RunnableC34959a(C34958c cVar) {
                this.f82467a = cVar;
            }

            public final void run() {
                this.f82467a.f82466c.removeOnSingleWebViewStatus(this.f82467a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e, com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40685a
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
            super.mo61846a(webView, str);
            if (!(webView == null || str == null || !C89361p.m154908a((CharSequence) str, (CharSequence) this.f82464a, false))) {
                webView.clearHistory();
                MixActivityContainer mixActivityContainer = ((C40543j) this.f82465b).f94864a;
                if (mixActivityContainer != null) {
                    mixActivityContainer.f94823n.mo69897d();
                }
            }
            this.f82466c.post(new RunnableC34959a(this));
        }

        C34958c(String str, AbstractC18234b bVar, SingleWebView singleWebView) {
            this.f82464a = str;
            this.f82465b = bVar;
            this.f82466c = singleWebView;
        }
    }

    static {
        Covode.recordClassIndex(41983);
    }

    public /* synthetic */ C34955a(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: d */
    public final boolean mo61845d(AbstractC18234b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C17031d) {
            return bVar.af_();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: c */
    public final boolean mo61844c(AbstractC18234b bVar) {
        C16721b bVar2;
        AbstractC35125b bVar3;
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C17031d) {
            C17031d dVar = (C17031d) bVar;
            dVar.mo26909b();
            AbstractC17019c b = dVar.mo26909b();
            C35196j jVar = null;
            if (!(b instanceof C35180b)) {
                b = null;
            }
            AbstractC35203a aVar = (AbstractC35203a) b;
            if (aVar == null || (bVar3 = aVar.f83165z) == null) {
                bVar2 = null;
            } else {
                bVar2 = bVar3.mo61979b();
            }
            if (bVar2 instanceof C35196j) {
                jVar = bVar2;
            }
            C35196j jVar2 = jVar;
            if (jVar2 == null || !jVar2.f83082aE) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: a */
    public final void mo61839a(AbstractC18234b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C40543j) {
            MixActivityContainer mixActivityContainer = ((C40543j) bVar).f94864a;
            if (mixActivityContainer != null) {
                mixActivityContainer.mo69649u();
            }
        } else if (bVar instanceof C17031d) {
            C17031d dVar = (C17031d) bVar;
            dVar.mo26909b();
            AbstractC17019c b = dVar.mo26909b();
            if (!(b instanceof C35180b)) {
                b = null;
            }
            AbstractC35203a aVar = (AbstractC35203a) b;
            if (aVar != null) {
                SSWebView sSWebView = aVar.f83148i;
                if (sSWebView != null) {
                    sSWebView.onResume();
                }
                PlayableBusiness playableBusiness = (PlayableBusiness) aVar.f83165z.mo61972a(PlayableBusiness.class);
                if (playableBusiness != null) {
                    playableBusiness.f82894a = false;
                    playableBusiness.mo61964a(false, true);
                }
                PreRenderWebViewBusiness a = PreRenderWebViewBusiness.C35121a.m71835a(aVar.f83165z);
                if (a != null) {
                    a.mo61969a((String) null);
                }
                Activity activity = aVar.f83157r;
                if (activity != null) {
                    C34729o.m70958b(activity);
                }
            }
        } else {
            C51423a.m95784a(3, null, "fragment onShow failed");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: b */
    public final void mo61842b(AbstractC18234b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C40543j) {
            MixActivityContainer mixActivityContainer = ((C40543j) bVar).f94864a;
            if (mixActivityContainer != null) {
                mixActivityContainer.mo69650v();
                return;
            }
            return;
        }
        AbstractC35203a aVar = null;
        if (bVar instanceof C17031d) {
            C17031d dVar = (C17031d) bVar;
            dVar.mo26909b();
            AbstractC17019c b = dVar.mo26909b();
            if (b instanceof C35180b) {
                aVar = b;
            }
            AbstractC35203a aVar2 = aVar;
            if (aVar2 != null) {
                SSWebView sSWebView = aVar2.f83148i;
                if (sSWebView != null) {
                    sSWebView.onPause();
                }
                AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) aVar2.f83165z.mo61972a(AdWebStatBusiness.class);
                if (adWebStatBusiness != null) {
                    adWebStatBusiness.mo61940a(true);
                }
                AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) aVar2.f83165z.mo61972a(AdLynxStatBusiness.class);
                if (adLynxStatBusiness != null) {
                    adLynxStatBusiness.mo61933a(true);
                }
                PlayableBusiness playableBusiness = (PlayableBusiness) aVar2.f83165z.mo61972a(PlayableBusiness.class);
                if (playableBusiness != null) {
                    playableBusiness.f82894a = true;
                    playableBusiness.mo61964a(true, false);
                }
                PreRenderWebViewBusiness a = PreRenderWebViewBusiness.C35121a.m71835a(aVar2.f83165z);
                if (a != null) {
                    a.mo61967a();
                }
                Activity activity = aVar2.f83157r;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    Window window = activity.getWindow();
                    C89219l.m154716b(window, "");
                    View decorView = window.getDecorView();
                    C89219l.m154716b(decorView, "");
                    decorView.setSystemUiVisibility(1024);
                    return;
                }
                return;
            }
            return;
        }
        C51423a.m95784a(3, null, "fragment onHide failed");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: b */
    public final void mo61843b(AbstractC18234b bVar, Runnable runnable) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(runnable, "");
        if (bVar instanceof C17031d) {
            AbstractC17019c b = ((C17031d) bVar).mo26909b();
            if (!(b instanceof C35180b)) {
                b = null;
            }
            C35180b bVar2 = (C35180b) b;
            if (bVar2 != null) {
                bVar2.f83007b = runnable;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: a */
    public final void mo61840a(AbstractC18234b bVar, Runnable runnable) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(runnable, "");
        if (bVar instanceof C40543j) {
            ((C40543j) bVar).mo69667a(runnable);
            return;
        }
        AbstractC35203a aVar = null;
        if (bVar instanceof C17031d) {
            C17031d dVar = (C17031d) bVar;
            dVar.mo26909b();
            AbstractC17019c b = dVar.mo26909b();
            if (b instanceof C35180b) {
                aVar = b;
            }
            AbstractC35203a aVar2 = aVar;
            if (aVar2 != null) {
                C89219l.m154721d(runnable, "");
                aVar2.f83156q = runnable;
                return;
            }
            return;
        }
        C51423a.m95784a(3, null, "fragment setBackListener failed");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: a */
    public final AbstractC18234b mo61838a(Activity activity, Bundle bundle, String str) {
        boolean z;
        if (bundle != null) {
            z = bundle.getBoolean("is_lynx_landing_page", false);
        } else {
            z = false;
        }
        CommerceAdLandpageBulletConfig c = C37588c.m75847c();
        if ((c == null || !c.getTotalEnable() || !c.getAdLandpageFakeEnable()) && !z) {
            return new C40543j();
        }
        if (activity == null) {
            C51423a.m95784a(3, null, "createBulletAdFragment failed caz activity is null");
            return new C40543j();
        }
        C17031d dVar = new C17031d();
        new C17031d.C17032a(dVar).mo26910a(C34963b.m71411a().mo61850a()).mo26911a(new BulletActivityWrapper(activity)).mo26912a("ad_commerce").mo26913a();
        dVar.mo26839a(BulletService.m71938f().mo61849a(activity), 17, 0, 0, 0, 0);
        dVar.setArguments(bundle);
        if (str != null) {
            dVar.mo26908a(C35301c.m72248a(str, C89070n.m154516a("ad_commerce"), bundle, new C35229g(activity)), bundle, new C35196j());
        }
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f
    /* renamed from: a */
    public final void mo61841a(AbstractC18234b bVar, String str, AbstractC18234b bVar2) {
        IResourceLoaderService iResourceLoaderService;
        String g;
        AbstractC40746j jVar;
        SingleWebView a;
        String str2 = "";
        C89219l.m154721d(bVar, str2);
        C89219l.m154721d(bVar2, str2);
        if (str != null) {
            if (bVar instanceof C40543j) {
                C40543j jVar2 = (C40543j) bVar;
                MixActivityContainer mixActivityContainer = jVar2.f94864a;
                if (!(mixActivityContainer == null || (jVar = (AbstractC40746j) mixActivityContainer.f94814e.mo69911a(AbstractC40746j.class)) == null || (a = jVar.mo69969a()) == null)) {
                    a.addOnSingleWebViewStatus(new C34958c(str, bVar, a));
                }
                MixActivityContainer mixActivityContainer2 = jVar2.f94864a;
                if (mixActivityContainer2 != null) {
                    mixActivityContainer2.mo69633b(str);
                }
            } else if (bVar instanceof C17031d) {
                C17031d dVar = (C17031d) bVar;
                Bundle arguments = dVar.getArguments();
                dVar.getActivity();
                if (arguments != null && arguments.getBoolean("is_lynx_landing_page", false)) {
                    IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                    if (!(f == null || (g = f.mo59391g("lynx_feed")) == null)) {
                        str2 = g;
                    }
                    if (C80538hl.m139614a(str2) && (iResourceLoaderService = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class)) != null) {
                        GeckoConfig a2 = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(iResourceLoaderService), str2);
                        if (!C89219l.m154714a((Object) a2.getAccessKey(), (Object) str2)) {
                            iResourceLoaderService.registerConfig(str2, new GeckoConfig(str2, a2.getOfflineDir(), a2.getLoaderDepender(), false, false, 24, null));
                        }
                        AbstractC1196i lifecycle = dVar.getLifecycle();
                        iResourceLoaderService.registerCustomLoader(C34954a.class, EnumC16636e.HIGH);
                        lifecycle.mo4013b(this.f82462c);
                        lifecycle.mo4012a(this.f82462c);
                    }
                }
                List a3 = C89070n.m154516a("ad_commerce");
                Context activity = dVar.getActivity();
                if (activity == null) {
                    activity = C17867d.m33078a();
                }
                dVar.mo26838a(C35301c.m72248a(str, a3, arguments, new C35229g(activity)), arguments, (AbstractC17046h.AbstractC17048b) bVar);
                AbstractC17019c b = dVar.mo26909b();
                if (!(b instanceof C35180b)) {
                    b = null;
                }
                C35180b bVar3 = (C35180b) b;
                if (bVar3 != null) {
                    bVar3.mo62010i();
                }
            } else {
                C51423a.m95784a(3, null, "fragment loadUrl failed");
            }
        }
    }
}
