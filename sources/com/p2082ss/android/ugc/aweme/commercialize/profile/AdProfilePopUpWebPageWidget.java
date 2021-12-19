package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38605a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3582a.C64485a;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget */
public final class AdProfilePopUpWebPageWidget extends AbsAdFeedWidget implements AbstractC33974au {

    /* renamed from: m */
    public static final Map<String, WeakReference<Runnable>> f90692m = new HashMap();

    /* renamed from: n */
    public static final C38383a f90693n = new C38383a((byte) 0);

    /* renamed from: a */
    AdPopUpWebPageView f90694a;

    /* renamed from: h */
    long f90695h;

    /* renamed from: i */
    public String f90696i;

    /* renamed from: j */
    final C38387c f90697j = new C38387c(this);

    /* renamed from: k */
    final C38389e f90698k = new C38389e(this);

    /* renamed from: l */
    final C38388d f90699l = new C38388d(this);

    /* renamed from: s */
    private final Runnable f90700s = new RunnableC38386b(this);

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$a */
    public static final class C38383a {
        static {
            Covode.recordClassIndex(45886);
        }

        private C38383a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$a$a */
        public static final class C38384a extends AbstractC89220m implements AbstractC89171a<Object> {

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebPageView f90701a;

            /* renamed from: b */
            final /* synthetic */ C37977b f90702b;

            static {
                Covode.recordClassIndex(45887);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38384a(AdPopUpWebPageView adPopUpWebPageView, C37977b bVar) {
                super(0);
                this.f90701a = adPopUpWebPageView;
                this.f90702b = bVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final Object invoke() {
                return Boolean.valueOf(this.f90701a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget.C38383a.C38384a.RunnableC383851 */

                    /* renamed from: a */
                    final /* synthetic */ C38384a f90703a;

                    static {
                        Covode.recordClassIndex(45888);
                    }

                    {
                        this.f90703a = r1;
                    }

                    public final void run() {
                        this.f90703a.f90701a.mo66105a(this.f90703a.f90702b);
                    }
                }));
            }
        }

        public /* synthetic */ C38383a(byte b) {
            this();
        }

        /* renamed from: b */
        public static AdPopUpWebPageView m77798b(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a = m77797a(activity);
            if (a != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a.findViewById(R.id.fg);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        /* renamed from: a */
        public static FrameLayout m77797a(Activity activity) {
            View inflate;
            MethodCollector.m26663i(4143);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.fk);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.fj);
            } else {
                viewStub.setLayoutResource(R.layout.apc);
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.m26664o(4143);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.m26664o(4143);
            return frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$d */
    public static final class C38388d implements AdPopUpWebPageView.AbstractC37942c {

        /* renamed from: a */
        final /* synthetic */ AdProfilePopUpWebPageWidget f90706a;

        static {
            Covode.recordClassIndex(45891);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37942c
        /* renamed from: a */
        public final void mo66148a() {
            this.f90706a.f90696i = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38388d(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f90706a = adProfilePopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$e */
    public static final class C38389e implements AdPopUpWebPageView.AbstractC37943d {

        /* renamed from: a */
        final /* synthetic */ AdProfilePopUpWebPageWidget f90707a;

        static {
            Covode.recordClassIndex(45892);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: a */
        public final void mo66149a() {
            this.f90707a.f90696i = "button";
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: b */
        public final void mo66150b() {
            AwemeRawAd awemeRawAd;
            Aweme aweme = this.f90707a.f92081o;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("homepage_landing_ad", "report", awemeRawAd).mo28901b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38389e(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f90707a = adProfilePopUpWebPageWidget;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        mo66977a(System.currentTimeMillis() - this.f90695h);
        super.onPause();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.f90695h = System.currentTimeMillis();
        super.onResume();
    }

    static {
        Covode.recordClassIndex(45885);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59238a() {
        super.mo59238a();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$c */
    public static final class C38387c implements AdPopUpWebPageView.AbstractC37940a {

        /* renamed from: a */
        final /* synthetic */ AdProfilePopUpWebPageWidget f90705a;

        static {
            Covode.recordClassIndex(45890);
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
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f90705a;
            adProfilePopUpWebPageWidget.f90695h = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f90694a;
            if (adPopUpWebPageView == null) {
                return;
            }
            if (adPopUpWebPageView.mo66113e() || adPopUpWebPageView.mo66114f()) {
                Aweme aweme = adProfilePopUpWebPageWidget.f92081o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("homepage_ad", "click", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38387c(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f90705a = adProfilePopUpWebPageWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66144a(int i) {
            String str;
            AwemeRawAd awemeRawAd;
            C18129a.C18130a a;
            AwemeRawAd awemeRawAd2;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f90705a;
            AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f90694a;
            if (adPopUpWebPageView != null && adPopUpWebPageView.mo66114f() && i == 6) {
                Aweme aweme = adProfilePopUpWebPageWidget.f92081o;
                if (aweme != null) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                a = C18129a.m33746a("homepage_ad", "close", awemeRawAd2);
                str = "halfscreen_page";
            } else {
                if (C38615aa.f91246d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme2 = adProfilePopUpWebPageWidget.f92081o;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                a = C18129a.m33746a("landing_ad", "close", awemeRawAd);
                String str2 = adProfilePopUpWebPageWidget.f90696i;
                if (str2 != null) {
                    str = str2;
                }
            }
            a.mo28900b("refer", str).mo28901b();
            if (C37699a.m76231aC(adProfilePopUpWebPageWidget.f92081o)) {
                AbstractC81915c.m141874a(new C64485a());
            }
            adProfilePopUpWebPageWidget.mo66977a(System.currentTimeMillis() - adProfilePopUpWebPageWidget.f90695h);
            this.f90705a.f90696i = null;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: b */
        public final void mo66147b(int i) {
            AdPopUpWebPageView adPopUpWebPageView;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f90705a;
            AdPopUpWebPageView adPopUpWebPageView2 = adProfilePopUpWebPageWidget.f90694a;
            AwemeRawAd awemeRawAd = null;
            if (((adPopUpWebPageView2 == null || !adPopUpWebPageView2.mo66113e()) && ((adPopUpWebPageView = adProfilePopUpWebPageWidget.f90694a) == null || !adPopUpWebPageView.mo66114f())) || i != 6) {
                AdPopUpWebPageView adPopUpWebPageView3 = adProfilePopUpWebPageWidget.f90694a;
                if (adPopUpWebPageView3 != null && ((AdPopUpWebBottomSheetContainer) adPopUpWebPageView3.mo66102a(R.id.d45)).getActionMode().f89720i == 6 && (i == 0 || i == 5)) {
                    Aweme aweme = adProfilePopUpWebPageWidget.f92081o;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    C18129a.m33746a("homepage_ad", "click", awemeRawAd).mo28900b("refer", "all_screen_page").mo28901b();
                } else {
                    AdPopUpWebPageView adPopUpWebPageView4 = adProfilePopUpWebPageWidget.f90694a;
                    if (adPopUpWebPageView4 != null && adPopUpWebPageView4.mo66111d()) {
                        Aweme aweme2 = adProfilePopUpWebPageWidget.f92081o;
                        if (aweme2 != null) {
                            awemeRawAd = aweme2.getAwemeRawAd();
                        }
                        C18129a.m33746a("homepage_ad", "click", awemeRawAd).mo28900b("refer", "button").mo28901b();
                    }
                }
            } else {
                Aweme aweme3 = adProfilePopUpWebPageWidget.f92081o;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "otherclick", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
            }
            adProfilePopUpWebPageWidget.f90695h = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView5 = adProfilePopUpWebPageWidget.f90694a;
            if (adPopUpWebPageView5 != null) {
                adPopUpWebPageView5.setFromTitleBarClick(false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66145a(int i, Boolean bool) {
            String str;
            C18129a.C18130a a;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f90705a;
            AwemeRawAd awemeRawAd = null;
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                Aweme aweme = adProfilePopUpWebPageWidget.f92081o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "button").mo28901b();
                return;
            }
            AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f90694a;
            if (adPopUpWebPageView != null && adPopUpWebPageView.mo66113e() && i == 6) {
                Aweme aweme2 = adProfilePopUpWebPageWidget.f92081o;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                a = C18129a.m33746a("homepage_ad", "close", awemeRawAd);
                str = "halfscreen_page";
            } else {
                if (C38615aa.f91246d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                AdPopUpWebPageView adPopUpWebPageView2 = adProfilePopUpWebPageWidget.f90694a;
                if (adPopUpWebPageView2 != null) {
                    adPopUpWebPageView2.mo66103a();
                }
                Aweme aweme3 = adProfilePopUpWebPageWidget.f92081o;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                }
                a = C18129a.m33746a("landing_ad", "close", awemeRawAd);
                String str2 = adProfilePopUpWebPageWidget.f90696i;
                if (str2 != null) {
                    str = str2;
                }
            }
            a.mo28900b("refer", str).mo28901b();
            adProfilePopUpWebPageWidget.mo66977a(System.currentTimeMillis() - adProfilePopUpWebPageWidget.f90695h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$b */
    static final class RunnableC38386b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdProfilePopUpWebPageWidget f90704a;

        static {
            Covode.recordClassIndex(45889);
        }

        RunnableC38386b(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f90704a = adProfilePopUpWebPageWidget;
        }

        public final void run() {
            ActivityC0945e activity;
            Fragment fragment;
            String str;
            String str2;
            AwemeRawAd awemeRawAd;
            String str3;
            Context context;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            MethodCollector.m26663i(4383);
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f90704a;
            Fragment fragment2 = adProfilePopUpWebPageWidget.f92082p;
            AwemeRawAd awemeRawAd5 = null;
            if (!(fragment2 == null || (activity = fragment2.getActivity()) == null || (fragment = adProfilePopUpWebPageWidget.f92082p) == null || fragment.getContext() == null)) {
                Aweme aweme = adProfilePopUpWebPageWidget.f92081o;
                if (aweme == null || (awemeRawAd4 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd4.getSource();
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = adProfilePopUpWebPageWidget.f92081o;
                    if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd3.getSource();
                    }
                } else {
                    Aweme aweme3 = adProfilePopUpWebPageWidget.f92081o;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd.getWebTitle()) == null) {
                        str2 = "";
                    }
                }
                C38618ac.C38619a aVar = new C38618ac.C38619a();
                Aweme aweme4 = adProfilePopUpWebPageWidget.f92081o;
                if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd2.getWebUrl()) == null) {
                    str3 = "";
                }
                C38618ac.C38619a a = aVar.mo67199a(str3).mo67197a(adProfilePopUpWebPageWidget.f92082p).mo67195a(C80534hh.m139609b());
                if (str2 == null) {
                    str2 = "";
                }
                C38618ac.C38619a b = a.mo67201b(str2);
                Aweme aweme5 = adProfilePopUpWebPageWidget.f92081o;
                Bundle bundle = new Bundle();
                Fragment fragment3 = adProfilePopUpWebPageWidget.f92082p;
                if (!(fragment3 == null || (context = fragment3.getContext()) == null)) {
                    C89219l.m154716b(context, "");
                    if (!(aweme5 == null || aweme5.getAwemeRawAd() == null)) {
                        C38605a.m78336a(bundle, aweme5, context);
                        C38605a.m78337b(bundle, aweme5, context);
                        C38605a.m78338c(bundle, aweme5, context);
                        C38605a.m78335a(bundle, context);
                    }
                }
                C38618ac.C38619a a2 = b.mo67196a(bundle);
                Aweme aweme6 = adProfilePopUpWebPageWidget.f92081o;
                if (aweme6 != null) {
                    awemeRawAd5 = aweme6.getAwemeRawAd();
                }
                C38618ac a3 = a2.mo67198a(awemeRawAd5).mo67200a();
                C38387c cVar = adProfilePopUpWebPageWidget.f90697j;
                C38388d dVar = adProfilePopUpWebPageWidget.f90699l;
                C89219l.m154721d(activity, "");
                C89219l.m154721d(a3, "");
                AdPopUpWebPageView b2 = C38383a.m77798b(activity);
                if (b2 == null) {
                    b2 = new AdPopUpWebPageView(activity, (byte) 0);
                    b2.setUseBullet(C58067a.f132302a.mo95568a(a3.f91264f));
                    b2.setId(R.id.fg);
                    b2.setParams(a3);
                    b2.setMBehaviorCallback(cVar);
                    b2.setKeyDownCallBack(dVar);
                    FrameLayout a4 = C38383a.m77797a(activity);
                    if (a4 != null) {
                        a4.addView(b2);
                    }
                }
                adProfilePopUpWebPageWidget.f90694a = b2;
                AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f90694a;
                if (adPopUpWebPageView != null) {
                    adPopUpWebPageView.setTitleBarCallback(adProfilePopUpWebPageWidget.f90698k);
                }
                adProfilePopUpWebPageWidget.hashCode();
            }
            MethodCollector.m26664o(4383);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66977a(long j) {
        if (this.f90694a != null) {
            C33744d dVar = new C33744d();
            dVar.mo59981a("duration", j);
            C39162r.m79460a("h5_stay_time", dVar.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59239a(C33942b bVar) {
        String str;
        ActivityC0945e activity;
        String aid;
        String aid2;
        AwemeRawAd awemeRawAd;
        MethodCollector.m26663i(3357);
        super.onChanged(bVar);
        if (bVar == null || (str = bVar.f80277a) == null) {
            MethodCollector.m26664o(3357);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                Aweme aweme = this.f92081o;
                if (C37699a.m76230aB(aweme) || C37699a.m76279ay(aweme) || !(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewType() != 1)) {
                    Aweme aweme2 = this.f92081o;
                    if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
                        MethodCollector.m26664o(3357);
                        return;
                    }
                    f90692m.put(aid2, new WeakReference<>(this.f90700s));
                    MethodCollector.m26664o(3357);
                    return;
                }
                MethodCollector.m26664o(3357);
                return;
            }
        } else if (str.equals("ad_feed_on_page_unselected")) {
            Aweme aweme3 = this.f92081o;
            if (!(aweme3 == null || (aid = aweme3.getAid()) == null)) {
                f90692m.remove(aid);
            }
            if (this.f90694a == null) {
                MethodCollector.m26664o(3357);
                return;
            }
            Fragment fragment = this.f92082p;
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                MethodCollector.m26664o(3357);
                return;
            }
            C89219l.m154721d(activity, "");
            AdPopUpWebPageView b = C38383a.m77798b(activity);
            if (b != null) {
                b.mo66109b();
                FrameLayout a = C38383a.m77797a(activity);
                if (a != null) {
                    a.removeView(b);
                }
            }
            this.f90694a = null;
            hashCode();
        }
        MethodCollector.m26664o(3357);
    }

    /* renamed from: a */
    public static final boolean m77793a(C37977b bVar, boolean z) {
        WeakReference<Runnable> weakReference;
        Runnable runnable;
        if (bVar == null) {
            return false;
        }
        Context context = bVar.f89721a;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            String str = bVar.f89728h;
            if (!(str == null || (weakReference = f90692m.get(str)) == null || (runnable = weakReference.get()) == null)) {
                runnable.run();
            }
            AdPopUpWebPageView b = C38383a.m77798b(activity);
            if (b != null && !b.mo66115g()) {
                FrameLayout a = C38383a.m77797a(activity);
                if (a != null) {
                    a.setVisibility(0);
                }
                b.setShouldStartAnimation(z);
                b.getActionMode().f89717f = bVar.f89724d;
                b.mo66106a(new C38383a.C38384a(b, bVar));
                return true;
            }
        }
        return false;
    }
}
