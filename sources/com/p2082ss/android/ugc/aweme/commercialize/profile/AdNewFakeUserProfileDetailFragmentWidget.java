package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.C17031d;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35229g;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35180b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.bullet.p2409a.C34954a;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget */
public final class AdNewFakeUserProfileDetailFragmentWidget extends AbsAdProfileWidget implements AbstractC17046h.AbstractC17048b, AbstractC33974au, AdFakeUserProfileNavigator.AbstractC38347b {

    /* renamed from: j */
    public List<AbstractC18234b> f90659j = new ArrayList();

    /* renamed from: k */
    public C17031d f90660k;

    /* renamed from: l */
    final AbstractC1202k f90661l = C38374x586c0e66.f90677a;

    /* renamed from: m */
    private final AbstractC89244h f90662m = C89250i.m154773a((AbstractC89171a) new C38371d(this));

    /* renamed from: n */
    private final AbstractC89244h f90663n = C89250i.m154773a((AbstractC89171a) new C38370c(this));

    /* renamed from: o */
    private final AbstractC89244h f90664o = C89250i.m154773a((AbstractC89171a) new C38372e(this));

    /* renamed from: p */
    private ScrollView f90665p;

    /* renamed from: q */
    private WebView f90666q;

    /* renamed from: r */
    private C38407f<AbstractC18234b> f90667r;

    /* renamed from: s */
    private C38402e f90668s;

    /* renamed from: t */
    private int f90669t;

    /* renamed from: u */
    private AwemeRawAd f90670u;

    static {
        Covode.recordClassIndex(45868);
    }

    /* renamed from: h */
    private final AdFakeUserProfileNavigator m77775h() {
        return (AdFakeUserProfileNavigator) this.f90663n.getValue();
    }

    /* renamed from: i */
    private final ViewPager m77776i() {
        return (ViewPager) this.f90664o.getValue();
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    /* renamed from: f */
    public final DampScrollableLayout mo66970f() {
        return (DampScrollableLayout) this.f90662m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$c */
    static final class C38370c extends AbstractC89220m implements AbstractC89171a<AdFakeUserProfileNavigator> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f90673a;

        static {
            Covode.recordClassIndex(45871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38370c(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            super(0);
            this.f90673a = adNewFakeUserProfileDetailFragmentWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AdFakeUserProfileNavigator invoke() {
            return this.f90673a.mo66948a(R.id.ayt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$d */
    static final class C38371d extends AbstractC89220m implements AbstractC89171a<DampScrollableLayout> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f90674a;

        static {
            Covode.recordClassIndex(45872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38371d(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            super(0);
            this.f90674a = adNewFakeUserProfileDetailFragmentWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DampScrollableLayout invoke() {
            return this.f90674a.mo66948a(R.id.dqd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$e */
    static final class C38372e extends AbstractC89220m implements AbstractC89171a<ViewPager> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f90675a;

        static {
            Covode.recordClassIndex(45873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38372e(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            super(0);
            this.f90675a = adNewFakeUserProfileDetailFragmentWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewPager invoke() {
            return this.f90675a.mo66948a(R.id.b8h);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator.AbstractC38347b
    /* renamed from: a */
    public final void mo66956a() {
        C18129a.m33746a("homepage_ad", "otherclick", this.f90670u).mo28900b("refer", "swipe").mo28901b();
    }

    /* renamed from: g */
    public final String mo66971g() {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        C38220ag nativeSiteConfig;
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) == null) {
            str = null;
        } else {
            str = nativeSiteConfig.getLynxScheme();
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
        if (!(aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null)) {
            buildUpon.appendQueryParameter("lynx_landing_page_data", C63866a.f144791a.getAdLynxLandPageUtil().mo95567a(awemeRawAd, this.f80270b));
            C89219l.m154716b(awemeRawAd, "");
            buildUpon.appendQueryParameter("lynx_landing_page_title", awemeRawAd.getWebTitle());
        }
        return buildUpon.toString();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$f */
    static final class RunnableC38373f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f90676a;

        static {
            Covode.recordClassIndex(45874);
        }

        RunnableC38373f(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            this.f90676a = adNewFakeUserProfileDetailFragmentWidget;
        }

        public final void run() {
            String str;
            IResourceLoaderService iResourceLoaderService;
            C17031d dVar = this.f90676a.f90660k;
            if (dVar != null) {
                AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = this.f90676a;
                Bundle arguments = dVar.getArguments();
                if (arguments != null && arguments.getBoolean("is_lynx_landing_page", false)) {
                    IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                    if (f == null || (str = f.mo59391g("lynx_feed")) == null) {
                        str = "";
                    }
                    if (C80538hl.m139614a(str) && (iResourceLoaderService = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class)) != null) {
                        GeckoConfig a = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(iResourceLoaderService), str);
                        if (!C89219l.m154714a((Object) a.getAccessKey(), (Object) str)) {
                            iResourceLoaderService.registerConfig(str, new GeckoConfig(str, a.getOfflineDir(), a.getLoaderDepender(), false, false, 24, null));
                        }
                        AbstractC1196i lifecycle = dVar.getLifecycle();
                        iResourceLoaderService.registerCustomLoader(C34954a.class, EnumC16636e.HIGH);
                        lifecycle.mo4013b(adNewFakeUserProfileDetailFragmentWidget.f90661l);
                        lifecycle.mo4012a(adNewFakeUserProfileDetailFragmentWidget.f90661l);
                    }
                }
                String g = this.f90676a.mo66971g();
                List a2 = C89070n.m154516a("ad_commerce");
                Bundle arguments2 = dVar.getArguments();
                Context activity = dVar.getActivity();
                if (activity == null) {
                    activity = C17867d.m33078a();
                }
                dVar.mo26838a(C35301c.m72248a(g, a2, arguments2, new C35229g(activity)), dVar.getArguments(), this.f90676a);
                AbstractC17019c b = dVar.mo26909b();
                if (!(b instanceof C35180b)) {
                    b = null;
                }
                C35180b bVar = (C35180b) b;
                if (bVar != null) {
                    bVar.mo62010i();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$a */
    public static final class C38368a implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f90671a;

        static {
            Covode.recordClassIndex(45869);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38368a(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            this.f90671a = adNewFakeUserProfileDetailFragmentWidget;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f90671a.mo66969b(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$b */
    public static final class C38369b implements ScrollableLayout.AbstractC39210b {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f90672a;

        static {
            Covode.recordClassIndex(45870);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        public final boolean av_() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38369b(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            this.f90672a = adNewFakeUserProfileDetailFragmentWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: a */
        public final void mo62628a(float f, float f2) {
            List<AbstractC18234b> list;
            DampScrollableLayout f3;
            if (this.f90672a.ai_() && (list = this.f90672a.f90659j) != null && !list.isEmpty() && this.f90672a.mo66970f() != null && (f3 = this.f90672a.mo66970f()) != null) {
                f3.setCanScrollUp(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: b */
        public final void mo62635b(int i, int i2) {
            DampScrollableLayout f;
            List<AbstractC18234b> list = this.f90672a.f90659j;
            if (list != null && !list.isEmpty() && this.f90672a.mo66970f() != null && (f = this.f90672a.mo66970f()) != null) {
                f.setCanScrollUp(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo66969b(int i) {
        DampScrollableLayout f;
        C39211a helper;
        DampScrollableLayout f2;
        C39211a helper2;
        C39211a helper3;
        C39211a helper4;
        if (i >= 0 && i < this.f90659j.size() && mo66970f() != null) {
            AbstractC18234b bVar = this.f90659j.get(i);
            int i2 = this.f90669t;
            if (i != i2 && i2 >= 0 && i2 < this.f90659j.size()) {
                this.f90659j.get(this.f90669t).setUserVisibleHint(false);
            }
            this.f90669t = i;
            if (bVar instanceof C38402e) {
                DampScrollableLayout f3 = mo66970f();
                if (!(f3 == null || (helper4 = f3.getHelper()) == null)) {
                    helper4.f92631b = (C39211a.AbstractC39212a) bVar;
                }
            } else if (bVar instanceof C17031d) {
                DampScrollableLayout f4 = mo66970f();
                if (!(f4 == null || (helper3 = f4.getHelper()) == null)) {
                    helper3.f92631b = null;
                }
                ScrollView scrollView = this.f90665p;
                if (!(scrollView == null || (f2 = mo66970f()) == null || (helper2 = f2.getHelper()) == null)) {
                    helper2.f92630a = scrollView;
                }
                WebView webView = this.f90666q;
                if (!(webView == null || (f = mo66970f()) == null || (helper = f.getHelper()) == null)) {
                    helper.f92630a = webView;
                }
            }
            DampScrollableLayout f5 = mo66970f();
            if (f5 != null) {
                f5.setCanScrollUp(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66950a(C38426i iVar) {
        AwemeRawAd awemeRawAd;
        AbstractC0952i childFragmentManager;
        String str;
        String str2;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AbstractC0952i childFragmentManager2;
        AwemeRawAd awemeRawAd4;
        User author;
        User author2;
        C89219l.m154721d(iVar, "");
        super.mo66950a(iVar);
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        Bundle bundle = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f90670u = awemeRawAd;
        Fragment fragment = ((AbsAdProfileWidget) this).f90608h;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            C89219l.m154716b(childFragmentManager, "");
            Bundle bundle2 = new Bundle();
            Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme2 == null || (author2 = aweme2.getAuthor()) == null) {
                str = null;
            } else {
                str = author2.getUid();
            }
            bundle2.putString("user_id", str);
            Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme3 == null || (author = aweme3.getAuthor()) == null) {
                str2 = null;
            } else {
                str2 = author.getSecUid();
            }
            bundle2.putString("sec_user_id", str2);
            Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            } else {
                str3 = null;
            }
            bundle2.putString("aweme_id", str3);
            Aweme aweme5 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme5 == null || (awemeRawAd4 = aweme5.getAwemeRawAd()) == null) {
                str4 = null;
            } else {
                str4 = awemeRawAd4.getAdvId();
            }
            bundle2.putString("adv_id", str4);
            Aweme aweme6 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme6 != null) {
                awemeRawAd2 = aweme6.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C89219l.m154721d(bundle2, "");
            C38402e eVar = new C38402e();
            eVar.f90736c = awemeRawAd2;
            eVar.setArguments(bundle2);
            this.f90668s = eVar;
            this.f90659j.add(eVar);
            Aweme aweme7 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme7 != null) {
                awemeRawAd3 = aweme7.getAwemeRawAd();
            } else {
                awemeRawAd3 = null;
            }
            if (!C37699a.m76296f(awemeRawAd3) || !C37699a.m76298g(awemeRawAd3)) {
                AdFakeUserProfileNavigator h = m77775h();
                if (h != null) {
                    h.setVisibility(8);
                }
                ViewPager i = m77776i();
                if (i != null) {
                    i.setVisibility(8);
                }
                AbstractC0976n a = childFragmentManager.mo3552a();
                C89219l.m154716b(a, "");
                C38402e eVar2 = this.f90668s;
                if (eVar2 != null) {
                    a.mo3469b(R.id.ayv, eVar2).mo3467b();
                }
                FrameLayout frameLayout = (FrameLayout) mo66948a(R.id.ayv);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                AdFakeUserProfileNavigator h2 = m77775h();
                if (h2 != null) {
                    h2.setVisibility(0);
                }
                ViewPager i2 = m77776i();
                if (i2 != null) {
                    i2.setVisibility(0);
                }
                Fragment fragment2 = ((AbsAdProfileWidget) this).f90608h;
                if (fragment2 != null) {
                    bundle = fragment2.getArguments();
                }
                C17031d dVar = new C17031d();
                C17031d.C17032a a2 = new C17031d.C17032a(dVar).mo26910a(BulletService.m71938f().mo61850a());
                Context context = this.f80270b;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                a2.mo26911a(new BulletActivityWrapper((Activity) context)).mo26913a();
                IBulletService f = BulletService.m71938f();
                Context context2 = this.f80270b;
                C89219l.m154716b(context2, "");
                dVar.mo26839a(f.mo61849a(context2), 17, 0, 0, 0, 0);
                dVar.setArguments(bundle);
                String g = mo66971g();
                List a3 = C89070n.m154516a("ad_commerce");
                Context context3 = this.f80270b;
                C89219l.m154716b(context3, "");
                dVar.mo26908a(C35301c.m72248a(g, a3, bundle, new C35229g(context3)), bundle, new C35196j());
                this.f90660k = dVar;
                this.f90659j.add(0, dVar);
                Fragment fragment3 = ((AbsAdProfileWidget) this).f90608h;
                if (!(fragment3 == null || (childFragmentManager2 = fragment3.getChildFragmentManager()) == null)) {
                    C89219l.m154716b(childFragmentManager2, "");
                    this.f90667r = new C38407f<>(childFragmentManager2, this.f90659j);
                }
                ViewPager i3 = m77776i();
                if (i3 != null) {
                    i3.setAdapter(this.f90667r);
                }
                AdFakeUserProfileNavigator h3 = m77775h();
                if (h3 != null) {
                    h3.mo66954a(m77776i(), this);
                }
                ViewPager i4 = m77776i();
                if (i4 != null) {
                    i4.addOnPageChangeListener(new C38368a(this));
                }
            }
            DampScrollableLayout f2 = mo66970f();
            if (f2 != null) {
                f2.setOnScrollListener(new C38369b(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66951a(boolean z) {
        if (z) {
            this.f80272d.postDelayed(new RunnableC38373f(this), 500);
            if (this.f90660k == null) {
                mo66969b(0);
                C38402e eVar = this.f90668s;
                if (eVar != null) {
                    eVar.setUserVisibleHint(true);
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C39211a helper;
        C39211a helper2;
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        if (view instanceof SSWebView) {
            DampScrollableLayout f = mo66970f();
            if (!(f == null || (helper2 = f.getHelper()) == null)) {
                helper2.f92630a = view;
            }
            this.f90666q = (WebView) view;
        } else if (view instanceof LynxView) {
            LynxView lynxView = (LynxView) view;
            int childCount = lynxView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (lynxView.getChildAt(i) instanceof ScrollView) {
                    View childAt = lynxView.getChildAt(i);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.ScrollView");
                    this.f90665p = (ScrollView) childAt;
                    DampScrollableLayout f2 = mo66970f();
                    if (!(f2 == null || (helper = f2.getHelper()) == null)) {
                        helper.f92630a = this.f90665p;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
