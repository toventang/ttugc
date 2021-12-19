package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37975a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget */
public final class AdFakePopUpWebPageWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: o */
    public static final C38979a f92085o = new C38979a((byte) 0);

    /* renamed from: j */
    public AdPopUpWebPageView f92086j;

    /* renamed from: k */
    public String f92087k;

    /* renamed from: l */
    long f92088l;

    /* renamed from: m */
    Handler f92089m = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    boolean f92090n;

    /* renamed from: p */
    private final C38983c f92091p = new C38983c(this);

    /* renamed from: q */
    private final C38987g f92092q = new C38987g(this);

    /* renamed from: r */
    private final C38982b f92093r = new C38982b(this);

    static {
        Covode.recordClassIndex(46571);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$a */
    public static final class C38979a {
        static {
            Covode.recordClassIndex(46572);
        }

        private C38979a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$a$a */
        static final class C38980a extends AbstractC89220m implements AbstractC89171a<Object> {

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebPageView f92094a;

            /* renamed from: b */
            final /* synthetic */ C37977b f92095b;

            static {
                Covode.recordClassIndex(46573);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38980a(AdPopUpWebPageView adPopUpWebPageView, C37977b bVar) {
                super(0);
                this.f92094a = adPopUpWebPageView;
                this.f92095b = bVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final Object invoke() {
                return Boolean.valueOf(this.f92094a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget.C38979a.C38980a.RunnableC389811 */

                    /* renamed from: a */
                    final /* synthetic */ C38980a f92096a;

                    static {
                        Covode.recordClassIndex(46574);
                    }

                    {
                        this.f92096a = r1;
                    }

                    public final void run() {
                        this.f92096a.f92094a.mo66105a(this.f92096a.f92095b);
                    }
                }));
            }
        }

        public /* synthetic */ C38979a(byte b) {
            this();
        }

        /* renamed from: b */
        public static AdPopUpWebPageView m79140b(ActivityC0945e eVar) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a = m79139a(eVar);
            if (a != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a.findViewById(R.id.e1);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        /* renamed from: a */
        public static FrameLayout m79139a(ActivityC0945e eVar) {
            View view;
            MethodCollector.m26663i(7534);
            if (eVar != null) {
                ViewStub viewStub = (ViewStub) eVar.findViewById(R.id.e0);
                if (viewStub != null && viewStub.getParent() != null) {
                    view = viewStub.inflate();
                    if (view == null) {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        MethodCollector.m26664o(7534);
                        throw nullPointerException;
                    }
                } else if (eVar != null) {
                    view = eVar.findViewById(R.id.dz);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                MethodCollector.m26664o(7534);
                return frameLayout;
            }
            MethodCollector.m26664o(7534);
            return null;
        }

        /* renamed from: c */
        public static void m79141c(ActivityC0945e eVar) {
            AdPopUpWebPageView b;
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer;
            AdPopUpWebPageView b2 = m79140b(eVar);
            if (b2 != null && b2.mo66115g() && (b = m79140b(eVar)) != null && b.mo66115g() && (adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) b.mo66102a(R.id.d45)) != null) {
                adPopUpWebBottomSheetContainer.mo14580a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$c */
    public static final class C38983c implements AdPopUpWebPageView.AbstractC37942c {

        /* renamed from: a */
        final /* synthetic */ AdFakePopUpWebPageWidget f92098a;

        static {
            Covode.recordClassIndex(46576);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37942c
        /* renamed from: a */
        public final void mo66148a() {
            this.f92098a.f92087k = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38983c(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
            this.f92098a = adFakePopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$g */
    public static final class C38987g implements AdPopUpWebPageView.AbstractC37943d {

        /* renamed from: a */
        final /* synthetic */ AdFakePopUpWebPageWidget f92102a;

        static {
            Covode.recordClassIndex(46580);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: a */
        public final void mo66149a() {
            this.f92102a.f92087k = "button";
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: b */
        public final void mo66150b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f92102a.f92086j;
            if (adPopUpWebPageView != null) {
                C37975a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = ((AbsAdProfileWidget) this.f92102a).f90607a;
                AwemeRawAd awemeRawAd2 = null;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo66197b(awemeRawAd)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this.f92102a).f90607a;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    C18129a.m33746a("homepage_landing_ad", "report", awemeRawAd2).mo28901b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38987g(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
            this.f92102a = adFakePopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$d */
    static final class RunnableC38984d implements Runnable {

        /* renamed from: a */
        public static final RunnableC38984d f92099a = new RunnableC38984d();

        static {
            Covode.recordClassIndex(46577);
        }

        RunnableC38984d() {
        }

        public final void run() {
            AbstractC81915c.m141874a(new AdPopUpWebPageWidget.C39023a(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$e */
    static final class RunnableC38985e implements Runnable {

        /* renamed from: a */
        public static final RunnableC38985e f92100a = new RunnableC38985e();

        static {
            Covode.recordClassIndex(46578);
        }

        RunnableC38985e() {
        }

        public final void run() {
            AbstractC81915c.m141874a(new AdPopUpWebPageWidget.C39023a(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$f */
    static final class RunnableC38986f implements Runnable {

        /* renamed from: a */
        public static final RunnableC38986f f92101a = new RunnableC38986f();

        static {
            Covode.recordClassIndex(46579);
        }

        RunnableC38986f() {
        }

        public final void run() {
            AbstractC81915c.m141874a(new AdPopUpWebPageWidget.C39023a(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$b */
    public static final class C38982b implements AdPopUpWebPageView.AbstractC37940a {

        /* renamed from: a */
        final /* synthetic */ AdFakePopUpWebPageWidget f92097a;

        static {
            Covode.recordClassIndex(46575);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66144a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66146a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66143a() {
            AwemeRawAd awemeRawAd;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.f92097a;
            AdPopUpWebPageView adPopUpWebPageView = adFakePopUpWebPageWidget.f92086j;
            if (adPopUpWebPageView != null && adPopUpWebPageView.mo66113e()) {
                adFakePopUpWebPageWidget.f92089m.post(RunnableC38986f.f92101a);
            }
            adFakePopUpWebPageWidget.f92088l = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView2 = adFakePopUpWebPageWidget.f92086j;
            if (adPopUpWebPageView2 != null && adPopUpWebPageView2.mo66113e()) {
                Aweme aweme = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("homepage_ad", "othershow", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38982b(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
            this.f92097a = adFakePopUpWebPageWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: b */
        public final void mo66147b(int i) {
            AwemeRawAd awemeRawAd;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.f92097a;
            adFakePopUpWebPageWidget.f92089m.post(RunnableC38985e.f92100a);
            AdPopUpWebPageView adPopUpWebPageView = adFakePopUpWebPageWidget.f92086j;
            if (adPopUpWebPageView != null) {
                AwemeRawAd awemeRawAd2 = null;
                if (!adPopUpWebPageView.mo66113e() || adFakePopUpWebPageWidget.f92090n) {
                    String str = "landing_page";
                    if (!adPopUpWebPageView.f89648k) {
                        Aweme aweme = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        C18129a.m33746a("homepage_ad", "othershow", awemeRawAd).mo28900b("refer", str).mo28901b();
                    }
                    Aweme aweme2 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    C18129a.C18130a a = C18129a.m33746a("homepage_ad", "click", awemeRawAd2);
                    if (adPopUpWebPageView.f89648k) {
                        str = "button";
                    }
                    a.mo28900b("refer", str).mo28901b();
                    adFakePopUpWebPageWidget.f92088l = System.currentTimeMillis();
                    adPopUpWebPageView.setFromAdButtonClick(false);
                    return;
                }
                Aweme aweme3 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "click", awemeRawAd2).mo28900b("refer", "halfscreen_page").mo28901b();
                adFakePopUpWebPageWidget.f92090n = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66145a(int i, Boolean bool) {
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.f92097a;
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                Aweme aweme = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C18129a.m33746a("homepage_ad", "othershow_fail", awemeRawAd3).mo28900b("refer", "landing_page").mo28901b();
            } else {
                if (!(i == 5 || i == 0)) {
                    adFakePopUpWebPageWidget.f92089m.post(RunnableC38984d.f92099a);
                }
                AdPopUpWebPageView adPopUpWebPageView = adFakePopUpWebPageWidget.f92086j;
                if (adPopUpWebPageView != null) {
                    if (!adPopUpWebPageView.mo66113e() || adFakePopUpWebPageWidget.f92090n) {
                        if (C38615aa.f91246d == 1) {
                            str = "slide";
                        } else {
                            str = "slide_down";
                        }
                        if (!(i == 5 || i == 0)) {
                            Aweme aweme2 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                            if (aweme2 != null) {
                                awemeRawAd = aweme2.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            C18129a.C18130a a = C18129a.m33746a("landing_ad", "close", awemeRawAd);
                            String str2 = adFakePopUpWebPageWidget.f92087k;
                            if (str2 != null) {
                                str = str2;
                            }
                            a.mo28900b("refer", str).mo28901b();
                        }
                    } else {
                        Aweme aweme3 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f90607a;
                        if (aweme3 != null) {
                            awemeRawAd2 = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        C18129a.m33746a("homepage_ad", "close", awemeRawAd2).mo28900b("refer", "halfscreen_page").mo28901b();
                        adFakePopUpWebPageWidget.f92090n = true;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis() - adFakePopUpWebPageWidget.f92088l;
                if (adFakePopUpWebPageWidget.f92086j != null) {
                    C33744d dVar = new C33744d();
                    dVar.mo59981a("duration", currentTimeMillis);
                    C39162r.m79460a("h5_stay_time", dVar.f79943a);
                }
            }
            this.f92097a.f92087k = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66951a(boolean z) {
        ActivityC0945e eVar;
        ActivityC0945e eVar2;
        Context context;
        AwemeRawAd awemeRawAd;
        int i;
        AdPopUpWebPageView b;
        String aid;
        AwemeRawAd awemeRawAd2;
        C38212aa fakeAuthor;
        Fragment fragment;
        String str;
        String str2;
        AwemeRawAd awemeRawAd3;
        String str3;
        AwemeRawAd awemeRawAd4;
        Context context2;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        AwemeRawAd awemeRawAd7;
        MethodCollector.m26663i(7931);
        ActivityC0945e eVar3 = null;
        r3 = null;
        r3 = null;
        Boolean bool = null;
        if (z) {
            Fragment fragment2 = ((AbsAdProfileWidget) this).f90608h;
            if (fragment2 != null) {
                eVar = fragment2.getActivity();
            } else {
                eVar = null;
            }
            String str4 = "";
            if (!(eVar == null || (fragment = ((AbsAdProfileWidget) this).f90608h) == null || fragment.getContext() == null)) {
                Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
                if (aweme == null || (awemeRawAd7 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd7.getSource();
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
                    if (aweme2 == null || (awemeRawAd6 = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd6.getSource();
                    }
                } else {
                    Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
                    if (aweme3 == null || (awemeRawAd3 = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd3.getWebTitle()) == null) {
                        str2 = str4;
                    }
                }
                C38618ac.C38619a aVar = new C38618ac.C38619a();
                Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme4 == null || (awemeRawAd5 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd5.getWebUrl()) == null) {
                    str3 = str4;
                }
                C38618ac.C38619a a = aVar.mo67199a(str3).mo67197a(((AbsAdProfileWidget) this).f90608h).mo67195a(C80534hh.m139609b());
                if (str2 == null) {
                    str2 = str4;
                }
                C38618ac.C38619a b2 = a.mo67201b(str2);
                Aweme aweme5 = ((AbsAdProfileWidget) this).f90607a;
                Bundle bundle = new Bundle();
                Fragment fragment3 = ((AbsAdProfileWidget) this).f90608h;
                if (!(fragment3 == null || (context2 = fragment3.getContext()) == null)) {
                    C89219l.m154716b(context2, str4);
                    if (!(aweme5 == null || aweme5.getAwemeRawAd() == null)) {
                        C38739d.m78570a(bundle, aweme5, context2);
                        C38739d.m78573b(bundle, aweme5, context2);
                        C38739d.m78575c(bundle, aweme5, context2);
                        C38739d.m78569a(bundle, context2);
                    }
                }
                C38618ac.C38619a a2 = b2.mo67196a(bundle);
                Aweme aweme6 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme6 != null) {
                    awemeRawAd4 = aweme6.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                C38618ac a3 = a2.mo67198a(awemeRawAd4).mo67200a();
                C38982b bVar = this.f92093r;
                C38983c cVar = this.f92091p;
                C89219l.m154721d(eVar, str4);
                C89219l.m154721d(a3, str4);
                AdPopUpWebPageView b3 = C38979a.m79140b(eVar);
                if (b3 == null) {
                    b3 = new AdPopUpWebPageView(eVar, (byte) 0);
                    b3.setId(R.id.e1);
                    b3.setParams(a3);
                    b3.setMBehaviorCallback(bVar);
                    b3.setKeyDownCallBack(cVar);
                    FrameLayout a4 = C38979a.m79139a(eVar);
                    if (a4 != null) {
                        a4.addView(b3);
                    }
                }
                this.f92086j = b3;
                b3.setTitleBarCallback(this.f92092q);
                hashCode();
            }
            this.f92090n = false;
            this.f92088l = 0;
            Fragment fragment4 = ((AbsAdProfileWidget) this).f90608h;
            if (fragment4 != null) {
                eVar2 = fragment4.getActivity();
            } else {
                eVar2 = null;
            }
            C37977b.C37978a aVar2 = new C37977b.C37978a();
            Fragment fragment5 = ((AbsAdProfileWidget) this).f90608h;
            if (fragment5 != null) {
                context = fragment5.getContext();
            } else {
                context = null;
            }
            C37977b.C37978a a5 = aVar2.mo66199a(context).mo66200a(((AbsAdProfileWidget) this).f90607a);
            Aweme aweme7 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme7 != null) {
                awemeRawAd = aweme7.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C37977b.C37978a b4 = a5.mo66201a(awemeRawAd).mo66204b(8);
            Aweme aweme8 = ((AbsAdProfileWidget) this).f90607a;
            if (!(aweme8 == null || (awemeRawAd2 = aweme8.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd2.getFakeAuthor()) == null)) {
                bool = fakeAuthor.getAutoShowWebview();
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                i = 5;
            } else {
                i = 4;
            }
            C37977b.C37978a a6 = b4.mo66198a(i);
            Aweme aweme9 = ((AbsAdProfileWidget) this).f90607a;
            if (!(aweme9 == null || (aid = aweme9.getAid()) == null)) {
                str4 = aid;
            }
            C37977b a7 = a6.mo66206c(str4).mo66203a();
            Context context3 = a7.f89721a;
            if ((context3 instanceof Activity) && context3 != null && (b = C38979a.m79140b(eVar2)) != null && !b.mo66115g()) {
                FrameLayout a8 = C38979a.m79139a(eVar2);
                if (a8 != null) {
                    a8.setVisibility(0);
                }
                b.getActionMode().f89717f = a7.f89724d;
                b.mo66106a(new C38979a.C38980a(b, a7));
            }
            MethodCollector.m26664o(7931);
            return;
        }
        Fragment fragment6 = ((AbsAdProfileWidget) this).f90608h;
        if (fragment6 != null) {
            eVar3 = fragment6.getActivity();
        }
        AdPopUpWebPageView b5 = C38979a.m79140b(eVar3);
        if (b5 != null) {
            if (b5.mo66115g()) {
                b5.mo66108a(true);
                FrameLayout a9 = C38979a.m79139a(eVar3);
                if (a9 != null) {
                    a9.setVisibility(8);
                    MethodCollector.m26664o(7931);
                    return;
                }
            }
            MethodCollector.m26664o(7931);
            return;
        }
        MethodCollector.m26664o(7931);
    }
}
