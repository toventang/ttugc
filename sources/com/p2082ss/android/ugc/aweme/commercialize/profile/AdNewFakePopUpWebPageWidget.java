package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37975a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget */
public final class AdNewFakePopUpWebPageWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: m */
    public static final C38362a f90646m = new C38362a((byte) 0);

    /* renamed from: j */
    public AdPopUpWebPageView f90647j;

    /* renamed from: k */
    public String f90648k;

    /* renamed from: l */
    long f90649l;

    /* renamed from: n */
    private final C38366c f90650n = new C38366c(this);

    /* renamed from: o */
    private final C38367d f90651o = new C38367d(this);

    /* renamed from: p */
    private final C38365b f90652p = new C38365b(this);

    static {
        Covode.recordClassIndex(45861);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget$a */
    public static final class C38362a {
        static {
            Covode.recordClassIndex(45862);
        }

        private C38362a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget$a$a */
        static final class C38363a extends AbstractC89220m implements AbstractC89171a<Object> {

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebPageView f90653a;

            /* renamed from: b */
            final /* synthetic */ C37977b f90654b;

            static {
                Covode.recordClassIndex(45863);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38363a(AdPopUpWebPageView adPopUpWebPageView, C37977b bVar) {
                super(0);
                this.f90653a = adPopUpWebPageView;
                this.f90654b = bVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final Object invoke() {
                return Boolean.valueOf(this.f90653a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget.C38362a.C38363a.RunnableC383641 */

                    /* renamed from: a */
                    final /* synthetic */ C38363a f90655a;

                    static {
                        Covode.recordClassIndex(45864);
                    }

                    {
                        this.f90655a = r1;
                    }

                    public final void run() {
                        this.f90655a.f90653a.mo66105a(this.f90655a.f90654b);
                    }
                }));
            }
        }

        public /* synthetic */ C38362a(byte b) {
            this();
        }

        /* renamed from: b */
        public static AdPopUpWebPageView m77766b(ActivityC0945e eVar) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a = m77765a(eVar);
            if (a != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a.findViewById(R.id.e2);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        /* renamed from: a */
        public static FrameLayout m77765a(ActivityC0945e eVar) {
            View view;
            MethodCollector.m26663i(3521);
            if (eVar != null) {
                ViewStub viewStub = (ViewStub) eVar.findViewById(R.id.f1);
                if (viewStub != null && viewStub.getParent() != null) {
                    view = viewStub.inflate();
                    if (view == null) {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        MethodCollector.m26664o(3521);
                        throw nullPointerException;
                    }
                } else if (eVar != null) {
                    view = eVar.findViewById(R.id.f0);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                MethodCollector.m26664o(3521);
                return frameLayout;
            }
            MethodCollector.m26664o(3521);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget$c */
    public static final class C38366c implements AdPopUpWebPageView.AbstractC37942c {

        /* renamed from: a */
        final /* synthetic */ AdNewFakePopUpWebPageWidget f90657a;

        static {
            Covode.recordClassIndex(45866);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37942c
        /* renamed from: a */
        public final void mo66148a() {
            this.f90657a.f90648k = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38366c(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
            this.f90657a = adNewFakePopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget$d */
    public static final class C38367d implements AdPopUpWebPageView.AbstractC37943d {

        /* renamed from: a */
        final /* synthetic */ AdNewFakePopUpWebPageWidget f90658a;

        static {
            Covode.recordClassIndex(45867);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: a */
        public final void mo66149a() {
            this.f90658a.f90648k = "button";
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: b */
        public final void mo66150b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f90658a.f90647j;
            if (adPopUpWebPageView != null) {
                C37975a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = ((AbsAdProfileWidget) this.f90658a).f90607a;
                AwemeRawAd awemeRawAd2 = null;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo66197b(awemeRawAd)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this.f90658a).f90607a;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    C18129a.m33746a("landing_ad", "report", awemeRawAd2).mo28901b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38367d(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
            this.f90658a = adNewFakePopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget$b */
    public static final class C38365b implements AdPopUpWebPageView.AbstractC37940a {

        /* renamed from: a */
        final /* synthetic */ AdNewFakePopUpWebPageWidget f90656a;

        static {
            Covode.recordClassIndex(45865);
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
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f90656a;
            adNewFakePopUpWebPageWidget.f90649l = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView = adNewFakePopUpWebPageWidget.f90647j;
            if (adPopUpWebPageView == null) {
                return;
            }
            if (adPopUpWebPageView.mo66113e() || adPopUpWebPageView.mo66114f()) {
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("homepage_ad", "click", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38365b(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
            this.f90656a = adNewFakePopUpWebPageWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66144a(int i) {
            AwemeRawAd awemeRawAd;
            String str;
            AwemeRawAd awemeRawAd2;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f90656a;
            AdPopUpWebPageView adPopUpWebPageView = adNewFakePopUpWebPageWidget.f90647j;
            if (adPopUpWebPageView != null && adPopUpWebPageView.mo66114f() && i == 3) {
                if (C38615aa.f91246d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                if (aweme != null) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C18129a.C18130a a = C18129a.m33746a("landing_ad", "close", awemeRawAd2);
                String str2 = adNewFakePopUpWebPageWidget.f90648k;
                if (str2 != null) {
                    str = str2;
                }
                a.mo28900b("refer", str).mo28901b();
            }
            AdPopUpWebPageView adPopUpWebPageView2 = adNewFakePopUpWebPageWidget.f90647j;
            if (adPopUpWebPageView2 != null && adPopUpWebPageView2.mo66114f() && i == 6) {
                Aweme aweme2 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("homepage_ad", "close", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
            }
            adNewFakePopUpWebPageWidget.mo66967a(System.currentTimeMillis() - adNewFakePopUpWebPageWidget.f90649l);
            DataCenter dataCenter = this.f90656a.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("AD_PROFILE_GP_WEBVIEW_HIDDEN", (Object) null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: b */
        public final void mo66147b(int i) {
            AdPopUpWebPageView adPopUpWebPageView;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f90656a;
            AdPopUpWebPageView adPopUpWebPageView2 = adNewFakePopUpWebPageWidget.f90647j;
            AwemeRawAd awemeRawAd = null;
            if (((adPopUpWebPageView2 != null && adPopUpWebPageView2.mo66113e()) || ((adPopUpWebPageView = adNewFakePopUpWebPageWidget.f90647j) != null && adPopUpWebPageView.mo66114f())) && i == 6) {
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "otherclick", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
            } else if (adNewFakePopUpWebPageWidget.f90647j != null) {
                Aweme aweme2 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "click", awemeRawAd).mo28900b("refer", "button").mo28901b();
            }
            adNewFakePopUpWebPageWidget.f90649l = System.currentTimeMillis();
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66145a(int i, Boolean bool) {
            String str;
            AwemeRawAd awemeRawAd;
            C18129a.C18130a a;
            String str2;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f90656a;
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C18129a.m33746a("homepage_ad", "othershow_fail", awemeRawAd3).mo28900b("refer", "button").mo28901b();
            } else {
                AdPopUpWebPageView adPopUpWebPageView = adNewFakePopUpWebPageWidget.f90647j;
                if (adPopUpWebPageView != null) {
                    if (!adPopUpWebPageView.mo66113e() || i != 6) {
                        if (C38615aa.f91246d == 1) {
                            str = "slide";
                        } else {
                            str = "slide_down";
                        }
                        if (!(i == 5 || i == 0)) {
                            adPopUpWebPageView.mo66103a();
                            Aweme aweme2 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                            if (aweme2 != null) {
                                awemeRawAd = aweme2.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            a = C18129a.m33746a("landing_ad", "close", awemeRawAd);
                            str2 = adNewFakePopUpWebPageWidget.f90648k;
                            if (str2 == null) {
                                str2 = str;
                            }
                        }
                    } else {
                        Aweme aweme3 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f90607a;
                        if (aweme3 != null) {
                            awemeRawAd2 = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        a = C18129a.m33746a("homepage_ad", "close", awemeRawAd2);
                        str2 = "halfscreen_page";
                    }
                    a.mo28900b("refer", str2).mo28901b();
                }
                adNewFakePopUpWebPageWidget.mo66967a(System.currentTimeMillis() - adNewFakePopUpWebPageWidget.f90649l);
            }
            this.f90656a.f90648k = null;
        }
    }

    /* renamed from: f */
    private final boolean m77762f() {
        AwemeRawAd awemeRawAd;
        String str;
        AwemeRawAd awemeRawAd2;
        C38212aa fakeAuthor;
        AwemeRawAd awemeRawAd3;
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        Boolean bool = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (C37699a.m76298g(awemeRawAd)) {
            return false;
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd3.getOpenUrl();
        }
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
        if (!(aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd2.getFakeAuthor()) == null)) {
            bool = fakeAuthor.getAutoShowWebview();
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66967a(long j) {
        if (this.f90647j != null) {
            C33744d dVar = new C33744d();
            dVar.mo59981a("duration", j);
            C39162r.m79460a("h5_stay_time", dVar.f79943a);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d4, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r5, (java.lang.Object) "app") != false) goto L_0x01d6;
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66951a(boolean r13) {
        /*
        // Method dump skipped, instructions count: 673
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget.mo66951a(boolean):void");
    }
}
